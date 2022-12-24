/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoB;

import br.com.swconsultoria.efd.icms.registros.EfdIcms;
import br.com.swconsultoria.efd.icms.registros.bloco9.Bloco9;
import br.com.swconsultoria.efd.icms.registros.bloco9.Registro9900;
import br.com.swconsultoria.efd.icms.registros.blocoB.BlocoB;

/**
 * @author Sidnei Klein
 *
 */
public class GerarContadoresBlocoB {

    public static EfdIcms gerar(EfdIcms efdIcms) {

        BlocoB blocoB = efdIcms.getBlocoB();
        Bloco9 bloco9 = efdIcms.getBloco9();
        Registro9900 registro9900 = new Registro9900();

        int cont = 0;
        cont = efdIcms.getContadoresBlocoB().getContRegistroB001();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("B001");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoB().getContRegistroB020();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("B020");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoB().getContRegistroB025();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("B025");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoB().getContRegistroB030();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("B030");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoB().getContRegistroB035();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("B035");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoB().getContRegistroB350();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("B350");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoB().getContRegistroB420();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("B420");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoB().getContRegistroB440();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("B440");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoB().getContRegistroB460();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("B460");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoB().getContRegistroB470();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("B470");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoB().getContRegistroB500();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("B500");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoB().getContRegistroB510();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("B510");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoB().getContRegistroB990();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("B990");
            registro9900.setQtd_reg_blc("1");
            bloco9.getRegistro9900().add(registro9900);
        }

        int somatorio = Integer.parseInt(bloco9.getRegistro9999().getQtd_lin())
                + Integer.parseInt(blocoB.getRegistroB990().getQtd_lin_b());
        bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

        efdIcms.setBloco9(bloco9);

        return efdIcms;
    }
}
