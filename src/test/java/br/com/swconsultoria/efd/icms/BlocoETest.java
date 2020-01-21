/**
 *
 */
package br.com.swconsultoria.efd.icms;

import br.com.swconsultoria.efd.icms.registros.blocoE.BlocoE;
import br.com.swconsultoria.efd.icms.registros.blocoE.RegistroE001;
import br.com.swconsultoria.efd.icms.registros.blocoE.RegistroE100;
import br.com.swconsultoria.efd.icms.registros.blocoE.RegistroE110;

/**
 * @author Samuel Oliveira
 *
 */
public class BlocoETest {

    public static BlocoE preencheBlocoE() {
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
        RegistroE100 registroE100 = new RegistroE100();
        registroE100.setDt_ini("01022017");
        registroE100.setDt_fin("02022017");

        RegistroE110 registroE110 = new RegistroE110();
        registroE110.setDeb_esp("0");
        registroE110.setVl_aj_creditos("0");
        registroE110.setVl_aj_debitos("0");
        registroE110.setVl_estornos_cred("0");
        registroE110.setVl_estornos_deb("0");
        registroE110.setVl_icms_recolher("0");
        registroE110.setVl_sld_apurado("0");
        registroE110.setVl_sld_credor_ant("0");
        registroE110.setVl_sld_credor_transportar("0");
        registroE110.setVl_tot_aj_creditos("0");
        registroE110.setVl_tot_aj_debitos("0");
        registroE110.setVl_tot_creditos("0");
        registroE110.setVl_tot_debitos("0");
        registroE110.setVl_tot_ded("0");

        registroE100.setRegistroE110(registroE110);

        blocoE.getRegistroE100().add(registroE100);
        return blocoE;
    }
}
