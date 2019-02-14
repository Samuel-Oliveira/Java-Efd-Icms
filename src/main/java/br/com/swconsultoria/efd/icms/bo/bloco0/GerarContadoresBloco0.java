/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.bloco0;

import br.com.swconsultoria.efd.icms.registros.EfdIcms_v3_0_1;
import br.com.swconsultoria.efd.icms.registros.bloco0.Bloco0;
import br.com.swconsultoria.efd.icms.registros.bloco9.Bloco9;
import br.com.swconsultoria.efd.icms.registros.bloco9.Registro9900;
import br.com.swconsultoria.efd.icms.registros.bloco9.Registro9999;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarContadoresBloco0 {

    public static EfdIcms_v3_0_1 gerar(EfdIcms_v3_0_1 efdIcms) {

        Bloco0 bloco0 = efdIcms.getBloco0();
        Bloco9 bloco9 = new Bloco9();
        Registro9999 registro9999 = new Registro9999();
        registro9999.setQtd_lin("0");
        bloco9.setRegistro9999(registro9999);
        Registro9900 registro9900 = new Registro9900();

        int cont = 0;

        // Qnt Registros Registro0000
        cont = efdIcms.getContadoresBloco0().getContRegistro0000();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0000");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }

        // Qnt Registros Registro0001
        cont = efdIcms.getContadoresBloco0().getContRegistro0001();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0001");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }

        // Qnt Registros Registro0005
        cont = efdIcms.getContadoresBloco0().getContRegistro0005();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0005");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }

        // Qnt Registros Registro0015
        cont = efdIcms.getContadoresBloco0().getContRegistro0015();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0015");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }

        // Qnt Registros Registro0100
        cont = efdIcms.getContadoresBloco0().getContRegistro0100();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0100");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }

        // Qnt Registros Registro0150
        cont = efdIcms.getContadoresBloco0().getContRegistro0150();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0150");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        // Qnt Registros Registro0175
        cont = efdIcms.getContadoresBloco0().getContRegistro0175();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0175");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }

        // Qnt Registros Registro0190
        cont = efdIcms.getContadoresBloco0().getContRegistro0190();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0190");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }

        // Qnt Registros Registro0200
        cont = efdIcms.getContadoresBloco0().getContRegistro0200();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0200");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);

        }

        // Quantidade de Registros 0205
        cont = efdIcms.getContadoresBloco0().getContRegistro0205();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0205");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);

        }

        // Quantidade de Registros 0206
        cont = efdIcms.getContadoresBloco0().getContRegistro0206();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0206");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);

        }

        // Quantidade de Registros 0210
        cont = efdIcms.getContadoresBloco0().getContRegistro0210();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0210");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);

        }

        // Quantidade de Registros 0220
        cont = efdIcms.getContadoresBloco0().getContRegistro0220();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0220");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);

        }

        // Qnt Registros Registro0300
        cont = efdIcms.getContadoresBloco0().getContRegistro0300();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0300");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        // Qnt Registros Registro0305
        cont = efdIcms.getContadoresBloco0().getContRegistro0305();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0305");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);

        }

        // Qnt Registros Registro0400
        cont = efdIcms.getContadoresBloco0().getContRegistro0400();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0400");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);

        }

        // Qnt Registros Registro0450
        cont = efdIcms.getContadoresBloco0().getContRegistro0450();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0450");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);

        }

        // Qnt Registros Registro0460
        cont = efdIcms.getContadoresBloco0().getContRegistro0460();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0460");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);

        }

        // Qnt Registros Registro0500
        cont = efdIcms.getContadoresBloco0().getContRegistro0500();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0500");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);

        }

        // Qnt Registros Registro0600
        cont = efdIcms.getContadoresBloco0().getContRegistro0600();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0600");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);

        }

        // Qnt Registros Registro0990
        cont = efdIcms.getContadoresBloco0().getContRegistro0990();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0990");
            registro9900.setQtd_reg_blc("1");
            bloco9.getRegistro9900().add(registro9900);

        }

        int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin()) + Integer.valueOf(bloco0.getRegistro0990().getQtd_lin_0());
        bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

        efdIcms.setBloco9(bloco9);
        return efdIcms;
    }
}
