/**
 * 
 */
package teste.blocos;

import br.com.samuelweb.efd.icms.registros.blocoE.BlocoE;
import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE001;

/**
 * @author Yuri Lemes
 *
 */
public class BlocoETest {

	public static BlocoE preencheBlocoE(){
		BlocoE blocoE = new BlocoE();
		blocoE = preencheRegistroE001(blocoE);
		blocoE = preencheRegistroE100(blocoE);
		return blocoE;
	}

	/**
	 * @param blocoE
	 * @return
	 */
	private static BlocoE preencheRegistroE001(BlocoE blocoE) {
		RegistroE001 registroE001 = new RegistroE001();
		registroE001.setInd_mov("0");
		blocoE.setRegistroE001(registroE001);
		return blocoE;
	}

	/**
	 * @param blocoE
	 * @return
	 */
	private static BlocoE preencheRegistroE100(BlocoE blocoE) {
		// TODO Auto-generated method stub
		return null;
	}
}
