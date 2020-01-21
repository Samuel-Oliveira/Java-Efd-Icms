/**
 *
 */
package br.com.swconsultoria.efd.icms;

import br.com.swconsultoria.efd.icms.registros.bloco1.Bloco1;
import br.com.swconsultoria.efd.icms.registros.bloco1.Registro1001;
import br.com.swconsultoria.efd.icms.registros.bloco1.Registro1010;

/**
 * @author Samuel OLiveira
 *
 */
public class Bloco1Test {

    public static Bloco1 preencheBloco1() {
        Bloco1 bloco1 = new Bloco1();
        bloco1 = preencheRegistro1001(bloco1);
        bloco1 = preencheRegistro1010(bloco1);

        return bloco1;
    }

    private static Bloco1 preencheRegistro1001(Bloco1 bloco1) {
        Registro1001 registro1001 = new Registro1001();
        registro1001.setInd_mov("0");
        bloco1.setRegistro1001(registro1001);
        return bloco1;
    }

    private static Bloco1 preencheRegistro1010(Bloco1 bloco1) {
        Registro1010 registro1010 = new Registro1010();
        registro1010.setInd_aer("N");
        registro1010.setInd_cart("N");
        registro1010.setInd_ccrf("N");
        registro1010.setInd_comb("N");
        registro1010.setInd_ee("N");
        registro1010.setInd_exp("N");
        registro1010.setInd_form("N");
        registro1010.setInd_usina("N");
        registro1010.setInd_va("N");
        bloco1.setRegistro1010(registro1010);
        return bloco1;
    }
}
