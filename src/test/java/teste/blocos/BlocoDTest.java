/**
 * 
 */
package teste.blocos;

import br.com.samuelweb.efd.icms.registros.blocoD.BlocoD;
import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD001;

/**
 * @author Yuri Lemes
 *
 */
public class BlocoDTest {

	public static BlocoD preencheBlocoD(){
		BlocoD blocoD = new BlocoD();
		blocoD = preencheRegistroD001(blocoD);
		
		return blocoD;
	}

	private static BlocoD preencheRegistroD001(BlocoD blocoD) {
		RegistroD001 registroD001 = new RegistroD001();
		registroD001.setInd_mov("0");
		blocoD.setRegistroD001(registroD001);
		return blocoD;
	}
}
