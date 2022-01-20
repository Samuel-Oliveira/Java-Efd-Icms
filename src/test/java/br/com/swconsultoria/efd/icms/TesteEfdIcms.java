/**
 *
 */
package br.com.swconsultoria.efd.icms;

import br.com.swconsultoria.efd.icms.bo.GerarEfdIcms;
import br.com.swconsultoria.efd.icms.exception.EfdException;
import br.com.swconsultoria.efd.icms.registros.EfdIcms;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class TesteEfdIcms {

	public static void main(String[] args) {
		try {
			testaBlocos();
		} catch (EfdException e) {
			e.printStackTrace();
		}
	}

	private static void testaBlocos() throws EfdException {
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
        sb = GerarEfdIcms.gerar(efdIcms, sb);
        System.out.println(sb.toString());
        Util.criarPastaArquivo("d:/Teste", "efd.txt", sb.toString());
    }
}
