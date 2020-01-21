/**
 *
 */
package br.com.swconsultoria.efd.icms;

import br.com.swconsultoria.efd.icms.registros.blocoK.BlocoK;
import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK001;
import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK100;
import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK200;

/**
 * @author Samuel Oliveira
 *
 */
public class BlocoKTest {

    public static BlocoK preencheBlocoK() {
        BlocoK blocoK = new BlocoK();
        blocoK = preencheRegistroK001(blocoK);
        blocoK = preencheRegistroK100(blocoK);
        return blocoK;
    }

    /**
     * @param blocoK
     * @return
     */
    private static BlocoK preencheRegistroK001(BlocoK blocoK) {
        RegistroK001 registroK001 = new RegistroK001();
        registroK001.setInd_mov("0");
        blocoK.setRegistroK001(registroK001);
        return blocoK;
    }

    /**
     * @param blocoK
     * @return
     */
    private static BlocoK preencheRegistroK100(BlocoK blocoK) {
        RegistroK100 registroK100 = new RegistroK100();
        registroK100.setDt_ini("01032017");
        registroK100.setDt_fin("31032017");

        RegistroK200 registroK200 = new RegistroK200();
        registroK200.setDt_est("02022017");
        registroK200.setCod_item("810101001");
        registroK200.setQtd("11041,5");
        registroK200.setInd_est("0");

        registroK100.getRegistroK200().add(registroK200);
        blocoK.getRegistroK100().add(registroK100);
        return blocoK;
    }
}
