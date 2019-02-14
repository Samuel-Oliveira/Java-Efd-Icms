/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.EfdIcms_v3_0_1;
import br.com.swconsultoria.efd.icms.registros.bloco9.Bloco9;
import br.com.swconsultoria.efd.icms.registros.bloco9.Registro9900;
import br.com.swconsultoria.efd.icms.registros.blocoD.BlocoD;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarContadoresBlocoD {

    public static EfdIcms_v3_0_1 gerar(EfdIcms_v3_0_1 efdIcms) {

        BlocoD blocoD = efdIcms.getBlocoD();
        Bloco9 bloco9 = efdIcms.getBloco9();
        Registro9900 registro9900 = new Registro9900();

        int cont = 0;
        cont = efdIcms.getContadoresBlocoD().getContRegistroD001();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D001");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD100();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D100");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD101();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D101");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD110();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D110");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD120();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D120");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD130();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D130");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD140();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D140");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD150();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D150");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD160();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D160");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD161();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D161");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD162();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D162");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD170();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D170");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD180();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D180");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD190();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D190");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD195();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D195");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD197();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D197");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD300();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D300");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD301();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D301");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD310();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D310");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD350();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D350");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD360();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D360");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD365();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D365");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD370();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D370");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD390();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D390");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD400();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D400");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD410();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D410");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD411();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D411");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD420();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D420");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD500();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D500");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD510();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D510");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD530();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D530");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD590();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D590");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD600();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D600");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD610();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D610");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD690();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D690");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD695();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D695");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD696();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D696");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD697();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D697");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoD().getContRegistroD990();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("D990");
            registro9900.setQtd_reg_blc("1");
            bloco9.getRegistro9900().add(registro9900);
        }

        int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
                + Integer.valueOf(blocoD.getRegistroD990().getQtd_lin_d());
        bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

        efdIcms.setBloco9(bloco9);

        return efdIcms;
    }
}
