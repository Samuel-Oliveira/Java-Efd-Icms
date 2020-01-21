/**
 *
 */
package br.com.swconsultoria.efd.icms;

import br.com.swconsultoria.efd.icms.registros.blocoH.BlocoH;
import br.com.swconsultoria.efd.icms.registros.blocoH.RegistroH001;
import br.com.swconsultoria.efd.icms.registros.blocoH.RegistroH005;
import br.com.swconsultoria.efd.icms.registros.blocoH.RegistroH010;

/**
 * @author Samuel Oliveira
 *
 */
public class BlocoHTest {

    public static BlocoH preencheBlocoH() {
        BlocoH blocoH = new BlocoH();
        blocoH = preencheRegistroH001(blocoH);
        blocoH = preencheRegistroH005(blocoH);
        return blocoH;
    }

    /**
     * @param blocoH
     * @return
     */
    private static BlocoH preencheRegistroH001(BlocoH blocoH) {
        RegistroH001 registroH001 = new RegistroH001();
        registroH001.setInd_mov("0");
        blocoH.setRegistroH001(registroH001);
        return blocoH;
    }

    /**
     * @param blocoH
     * @return
     */
    private static BlocoH preencheRegistroH005(BlocoH blocoH) {
        RegistroH005 registroH005 = new RegistroH005();
        registroH005.setDt_inv("31122016");
        registroH005.setVl_inv("29383,47");
        registroH005.setMot_inv("01");

        RegistroH010 registroH010 = new RegistroH010();
        registroH010.setCod_item("320102001");
        registroH010.setUnid("LT");
        registroH010.setQtd("8736,5");
        registroH010.setVl_unit("3,3633");
        registroH010.setVl_item("29383,47");
        registroH010.setInd_prop("0");
        registroH010.setCod_cta("259");
        registroH010.setVl_item_ir("29383,47");

        registroH005.getRegistroH010().add(registroH010);

        blocoH.getRegistroH005().add(registroH005);

        return blocoH;
    }
}
