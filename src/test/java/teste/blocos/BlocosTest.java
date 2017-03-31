/**
 * 
 */
package teste.blocos;

import org.junit.Assert;
import org.junit.Test;

import br.com.samuelweb.efd.icms.bo.GerarEfdIcms;
import br.com.samuelweb.efd.icms.registros.EfdIcms;

/**
 * @author Yuri Lemes
 *
 */
public class BlocosTest {

	@Test
	public void testaBlocos(){
		StringBuilder sb = new StringBuilder();
		EfdIcms efdIcms = new EfdIcms();
		efdIcms.setBloco0(Bloco0Test.preencheBloco0());
		efdIcms.setBlocoC(BlocoCTest.preencheBlocoC());
		efdIcms.setBlocoD(BlocoDTest.preencheBlocoD());
		efdIcms.setBlocoE(BlocoETest.preencheBlocoE());
		sb = GerarEfdIcms.gerar(efdIcms, sb);
		System.out.println(sb.toString());
		Assert.assertEquals(Resultados.resultadoBlocos(),sb.toString());
	}
}
