/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoG;

import br.com.swconsultoria.efd.icms.registros.EfdIcms_v3_0_1;
import br.com.swconsultoria.efd.icms.registros.bloco9.Bloco9;
import br.com.swconsultoria.efd.icms.registros.bloco9.Registro9900;
import br.com.swconsultoria.efd.icms.registros.blocoG.BlocoG;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarContadoresBlocoG {

    public static EfdIcms_v3_0_1 gerar(EfdIcms_v3_0_1 efdIcms) {

        BlocoG blocoG = efdIcms.getBlocoG();
        Bloco9 bloco9 = efdIcms.getBloco9();
        Registro9900 registro9900 = new Registro9900();

        int cont = 0;
        cont = efdIcms.getContadoresBlocoG().getContRegistroG001();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("G001");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoG().getContRegistroG110();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("G110");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoG().getContRegistroG125();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("G125");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoG().getContRegistroG126();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("G126");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoG().getContRegistroG130();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("G130");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoG().getContRegistroG140();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("G140");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }

        // Qnt Registros RegistroG990
        if (!Util.isEmpty(blocoG.getRegistroG990())) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("G990");
            registro9900.setQtd_reg_blc("1");
            bloco9.getRegistro9900().add(registro9900);

        }

        int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
                + Integer.valueOf(blocoG.getRegistroG990().getQtd_lin_g());
        bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

        efdIcms.setBloco9(bloco9);

        return efdIcms;
    }
}
