/**
 *
 */
package br.com.swconsultoria.efd.icms;

import br.com.swconsultoria.efd.icms.bo.GerarEfdIcms;
import br.com.swconsultoria.efd.icms.registros.EfdIcms;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Prova de que o pipeline inteiro ({@link GerarEfdIcms#gerar}) nao mistura o
 * texto de duas geracoes concorrentes na mesma JVM.
 * <p>
 * Cobre o aliasing do campo {@code sb} nos 8 blocos que o golden
 * {@link TesteEfdIcms} exercita ({@code GerarBloco0/1/C/D/E/G/H/K}), que o
 * {@link GerarBloco9ConcorrenciaTest} nao alcanca.
 * <p>
 * Cada iteracao monta um {@link EfdIcms} novo por thread (OBS-1/OBS-4:
 * reusar o mesmo {@code EfdIcms}/{@code Bloco9} entre geracoes duplica os
 * {@code Registro9900} e infla {@code QTD_LIN_9} por reuso, nao por corrida).
 *
 * @author Samuel Oliveira
 */
public class EfdIcmsConcorrenciaTest {

    private static final int ITERACOES = 200;

    private static EfdIcms novoEfdIcms() {
        EfdIcms efdIcms = new EfdIcms();
        efdIcms.setBloco0(Bloco0Test.preencheBloco0());
        efdIcms.setBloco1(Bloco1Test.preencheBloco1());
        efdIcms.setBlocoC(BlocoCTest.preencheBlocoC());
        efdIcms.setBlocoD(BlocoDTest.preencheBlocoD());
        efdIcms.setBlocoE(BlocoETest.preencheBlocoE());
        efdIcms.setBlocoG(BlocoGTest.preencheBlocoG());
        efdIcms.setBlocoH(BlocoHTest.preencheBlocoH());
        efdIcms.setBlocoK(BlocoKTest.preencheBlocoK());
        return efdIcms;
    }

    private static String lerGolden() {
        InputStream resourceAsStream = TesteEfdIcms.class.getResourceAsStream("/efd.txt");
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(Objects.requireNonNull(resourceAsStream), StandardCharsets.UTF_8))) {
            return reader.lines().collect(Collectors.joining("\n")).replace("\r\n", "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void duasThreadsGerandoEfdIcmsNaoMisturamOTextoDosBlocos() throws InterruptedException {
        String golden = lerGolden();

        List<Throwable> excecoes = new ArrayList<Throwable>();
        int divergenciasTexto = 0;

        ExecutorService executor = Executors.newFixedThreadPool(2);
        try {
            for (int i = 0; i < ITERACOES; i++) {
                CountDownLatch start = new CountDownLatch(1);
                CountDownLatch done = new CountDownLatch(2);

                EfdIcms efdA = novoEfdIcms();
                EfdIcms efdB = novoEfdIcms();
                StringBuilder sbA = new StringBuilder();
                StringBuilder sbB = new StringBuilder();

                Resultado resultadoA = new Resultado();
                Resultado resultadoB = new Resultado();

                executor.submit(new Tarefa(start, done, efdA, sbA, resultadoA));
                executor.submit(new Tarefa(start, done, efdB, sbB, resultadoB));

                start.countDown();
                assertTrue(done.await(30, TimeUnit.SECONDS), "timeout esperando as duas threads");

                if (resultadoA.erro != null) {
                    excecoes.add(resultadoA.erro);
                } else if (!golden.equals(resultadoA.texto)) {
                    divergenciasTexto++;
                }

                if (resultadoB.erro != null) {
                    excecoes.add(resultadoB.erro);
                } else if (!golden.equals(resultadoB.texto)) {
                    divergenciasTexto++;
                }
            }
        } finally {
            executor.shutdown();
        }

        assertEquals(0, excecoes.size(), "excecoes durante a geracao concorrente: " + excecoes);
        assertEquals(0, divergenciasTexto, "texto divergente do golden efd.txt");
    }

    private static final class Resultado {
        volatile String texto;
        volatile Throwable erro;
    }

    private static final class Tarefa implements Runnable {
        private final CountDownLatch start;
        private final CountDownLatch done;
        private final EfdIcms efdIcms;
        private final StringBuilder sb;
        private final Resultado resultado;

        private Tarefa(CountDownLatch start, CountDownLatch done, EfdIcms efdIcms, StringBuilder sb, Resultado resultado) {
            this.start = start;
            this.done = done;
            this.efdIcms = efdIcms;
            this.sb = sb;
            this.resultado = resultado;
        }

        @Override
        public void run() {
            try {
                start.await();
                GerarEfdIcms.gerar(efdIcms, sb);
                // toString() em cima do StringBuilder corrompido pode lancar
                // StringIndexOutOfBoundsException: capturar para nao perder a contagem.
                resultado.texto = sb.toString().replace("\r\n", "\n");
            } catch (Throwable t) {
                resultado.erro = t;
            } finally {
                done.countDown();
            }
        }
    }
}
