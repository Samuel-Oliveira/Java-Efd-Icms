/**
 *
 */
package br.com.samuelweb.efd.icms.bo.bloco1;

import br.com.samuelweb.efd.icms.registros.EfdIcms_v3_0_1;
import br.com.samuelweb.efd.icms.registros.bloco1.Bloco1;
import br.com.samuelweb.efd.icms.registros.bloco9.Bloco9;
import br.com.samuelweb.efd.icms.registros.bloco9.Registro9900;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Sidnei Klein
 *
 */
public class GerarContadoresBloco1 {

    public static EfdIcms_v3_0_1 gerar(EfdIcms_v3_0_1 efdIcms) {

        Bloco1 bloco1 = efdIcms.getBloco1();
        Bloco9 bloco9 = efdIcms.getBloco9();

        int cont = 0;
        cont = efdIcms.getContadoresBloco1().getContRegistro1001();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1001", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1010();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1010", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1100();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1100", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1105();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1105", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1110();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1110", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1200();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1200", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1210();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1210", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1300();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1300", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1310();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1310", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1320();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1320", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1350();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1350", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1360();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1360", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1370();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1370", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1390();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1390", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1391();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1391", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1400();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1400", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1500();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1500", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1600();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1600", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1700();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1700", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1710();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1710", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1800();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1800", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1900();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1900", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1910();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1910", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1920();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1920", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1921();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1921", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1922();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1922", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1923();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1923", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1925();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1925", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1926();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1926", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1960();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1960", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1970();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1970", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1975();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1975", cont));
        }
        cont = efdIcms.getContadoresBloco1().getContRegistro1980();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1980", cont));
        }

        // Qnt Registros Registro1990
        if (!Util.isEmpty(bloco1.getRegistro1990())) {
            bloco9.getRegistro9900().add(New9900("1990", 1));
        }

        int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
                + Integer.valueOf(bloco1.getRegistro1990().getQtd_lin_1());
        bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

        efdIcms.setBloco9(bloco9);

        return efdIcms;
    }

    private static Registro9900 New9900(String Reg_blc, int Qtd_reg_blc) {
        Registro9900 vRet = new Registro9900();
        vRet.setReg_blc(Reg_blc);
        vRet.setQtd_reg_blc(String.valueOf(Qtd_reg_blc));
        return vRet;
    }
}
