/**
 *
 */
package br.com.swconsultoria.efd.icms;

import br.com.swconsultoria.efd.icms.registros.blocoG.BlocoG;
import br.com.swconsultoria.efd.icms.registros.blocoG.RegistroG001;

/**
 * @author Samuel OLiveira
 *
 */
public class BlocoGTest {

    public static BlocoG preencheBlocoG() {
        BlocoG blocoG = new BlocoG();
        blocoG = preencheRegistroG001(blocoG);

        return blocoG;
    }

    private static BlocoG preencheRegistroG001(BlocoG blocoG) {
        RegistroG001 registroG001 = new RegistroG001();
        registroG001.setInd_mov("1");
        blocoG.setRegistroG001(registroG001);
        return blocoG;
    }
}
