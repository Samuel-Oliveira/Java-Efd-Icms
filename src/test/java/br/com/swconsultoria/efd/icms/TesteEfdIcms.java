/**
 *
 */
package br.com.swconsultoria.efd.icms;

import br.com.swconsultoria.efd.icms.bo.GerarEfdIcms;
import br.com.swconsultoria.efd.icms.registros.EfdIcms;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author Samuel Oliveira
 */
public class TesteEfdIcms {

    @Test
    public void testaBlocos() {
        StringBuilder sb = new StringBuilder();
        EfdIcms efdIcms = new EfdIcms();

        efdIcms.setBloco0(Bloco0Test.preencheBloco0());
        efdIcms.setBloco1(Bloco1Test.preencheBloco1());
        efdIcms.setBlocoC(BlocoCTest.preencheBlocoC());
        efdIcms.setBlocoD(BlocoDTest.preencheBlocoD());
        efdIcms.setBlocoE(BlocoETest.preencheBlocoE());
        efdIcms.setBlocoG(BlocoGTest.preencheBlocoG());
        efdIcms.setBlocoH(BlocoHTest.preencheBlocoH());
        efdIcms.setBlocoK(BlocoKTest.preencheBlocoK());
        GerarEfdIcms.gerar(efdIcms, sb);
        System.out.println(sb.toString());

        InputStream resourceAsStream = TesteEfdIcms.class.getResourceAsStream("/efd.txt");
        String spedEsperado;
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(Objects.requireNonNull(resourceAsStream), StandardCharsets.UTF_8))) {
            spedEsperado = reader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String actual = sb.toString().replace("\r\n", "\n");
        String expected = spedEsperado.replace("\r\n", "\n");

        Assert.assertEquals(expected, actual);
    }
}
