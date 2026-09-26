/**
 *
 */
package br.com.swconsultoria.efd.icms;

import br.com.swconsultoria.efd.icms.bo.bloco9.GerarBloco9;
import br.com.swconsultoria.efd.icms.registros.bloco9.Bloco9;
import br.com.swconsultoria.efd.icms.registros.bloco9.Registro9001;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Prova de que {@link GerarBloco9#gerar} deixa de compartilhar estado entre
 * chamadas concorrentes na mesma JVM.
 * <p>
 * Antes do conserto, {@code sb} e {@code qtdRegistros} eram campos
 * {@code static}: duas threads gerando ao mesmo tempo escreviam no mesmo
 * {@link StringBuilder} e no mesmo contador, produzindo {@code qtd_lin_9}
 * trocado, texto misturado ou {@link StringIndexOutOfBoundsException}.
 *
 * @author Samuel Oliveira
 */
public class GerarBloco9ConcorrenciaTest {

    private static final int ITERACOES = 2000;

    private static Bloco9 novoBloco9() {
        Bloco9 bloco9 = new Bloco9();
        Registro9001 registro9001 = new Registro9001();
        registro9001.setInd_mov("0");
        bloco9.setRegistro9001(registro9001);
        return bloco9;
    }

    @Test
    public void duasThreadsGerandoBloco9NaoTrocamContadorNemTexto() throws InterruptedException {
        // referencia sequencial
        Bloco9 bloco9Referencia = novoBloco9();
        StringBuilder sbReferencia = new StringBuilder();
        GerarBloco9.gerar(bloco9Referencia, sbReferencia);
        String qtdLin9Referencia = bloco9Referencia.getRegistro9990().getQtd_lin_9();
        String textoReferencia = sbReferencia.toString();

        assertEquals("7", qtdLin9Referencia);

        int divergenciasQtdLin9 = 0;
        int divergenciasTexto = 0;
        List<Throwable> excecoes = new ArrayList<Throwable>();

        ExecutorService executor = Executors.newFixedThreadPool(2);
        try {
            for (int i = 0; i < ITERACOES; i++) {
                CountDownLatch start = new CountDownLatch(1);
                CountDownLatch done = new CountDownLatch(2);

                Bloco9 bloco9A = novoBloco9();
                Bloco9 bloco9B = novoBloco9();
                StringBuilder sbA = new StringBuilder();
                StringBuilder sbB = new StringBuilder();

                Resultado resultadoA = new Resultado();
                Resultado resultadoB = new Resultado();

                executor.submit(new Tarefa(start, done, bloco9A, sbA, resultadoA));
                executor.submit(new Tarefa(start, done, bloco9B, sbB, resultadoB));

                start.countDown();
                assertTrue(done.await(10, TimeUnit.SECONDS), "timeout esperando as duas threads");

                if (resultadoA.erro != null) {
                    excecoes.add(resultadoA.erro);
                } else {
                    if (!qtdLin9Referencia.equals(resultadoA.qtdLin9)) {
                        divergenciasQtdLin9++;
                    }
                    if (!textoReferencia.equals(resultadoA.texto)) {
                        divergenciasTexto++;
                    }
                }

                if (resultadoB.erro != null) {
                    excecoes.add(resultadoB.erro);
                } else {
                    if (!qtdLin9Referencia.equals(resultadoB.qtdLin9)) {
                        divergenciasQtdLin9++;
                    }
                    if (!textoReferencia.equals(resultadoB.texto)) {
                        divergenciasTexto++;
                    }
                }
            }
        } finally {
            executor.shutdown();
        }

        assertEquals(0, excecoes.size(), "excecoes durante a geracao concorrente: " + excecoes);
        assertEquals(0, divergenciasQtdLin9, "qtd_lin_9 divergente da referencia sequencial");
        assertEquals(0, divergenciasTexto, "texto divergente da referencia sequencial");
    }

    private static final class Resultado {
        volatile String qtdLin9;
        volatile String texto;
        volatile Throwable erro;
    }

    private static final class Tarefa implements Runnable {
        private final CountDownLatch start;
        private final CountDownLatch done;
        private final Bloco9 bloco9;
        private final StringBuilder sb;
        private final Resultado resultado;

        private Tarefa(CountDownLatch start, CountDownLatch done, Bloco9 bloco9, StringBuilder sb, Resultado resultado) {
            this.start = start;
            this.done = done;
            this.bloco9 = bloco9;
            this.sb = sb;
            this.resultado = resultado;
        }

        @Override
        public void run() {
            try {
                start.await();
                GerarBloco9.gerar(bloco9, sb);
                resultado.qtdLin9 = bloco9.getRegistro9990().getQtd_lin_9();
                // toString() em cima do StringBuilder corrompido pode lancar
                // StringIndexOutOfBoundsException: capturar para nao perder a contagem.
                resultado.texto = sb.toString();
            } catch (Throwable t) {
                resultado.erro = t;
            } finally {
                done.countDown();
            }
        }
    }
}
