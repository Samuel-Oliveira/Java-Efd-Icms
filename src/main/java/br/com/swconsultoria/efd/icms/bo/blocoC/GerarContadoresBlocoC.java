/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.EfdIcms;
import br.com.swconsultoria.efd.icms.registros.bloco9.Bloco9;
import br.com.swconsultoria.efd.icms.registros.bloco9.Registro9900;
import br.com.swconsultoria.efd.icms.registros.blocoC.BlocoC;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Sidnei Klein
 *
 */
public class GerarContadoresBlocoC {

    public static EfdIcms gerar(EfdIcms efdIcms) {

        BlocoC blocoC = efdIcms.getBlocoC();
        Bloco9 bloco9 = efdIcms.getBloco9();
        Registro9900 registro9900;

        int cont;
        cont = efdIcms.getContadoresBlocoC().getContRegistroC001();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C001");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC100();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C100");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC101();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C101");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC105();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C105");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC110();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C110");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC111();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C111");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC112();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C112");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC113();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C113");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC114();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C114");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC115();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C115");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC116();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C116");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC120();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C120");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC130();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C130");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC140();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C140");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC141();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C141");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC160();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C160");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC165();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C165");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC170();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C170");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC171();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C171");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC172();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C172");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC173();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C173");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC174();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C174");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC175();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C175");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC176();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C176");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC177();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C177");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC178();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C178");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC179();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C179");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
            cont = efdIcms.getContadoresBlocoC().getContRegistroC180();
            if (cont > 0) {
                registro9900 = new Registro9900();
                registro9900.setReg_blc("C180");
                registro9900.setQtd_reg_blc(String.valueOf(cont));
                bloco9.getRegistro9900().add(registro9900);
            }
            cont = efdIcms.getContadoresBlocoC().getContRegistroC185();
            if (cont > 0) {
                registro9900 = new Registro9900();
                registro9900.setReg_blc("C185");
                registro9900.setQtd_reg_blc(String.valueOf(cont));
                bloco9.getRegistro9900().add(registro9900);
            }
            if (Util.versao2021(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
                cont = efdIcms.getContadoresBlocoC().getContRegistroC181();
                if (cont > 0) {
                    registro9900 = new Registro9900();
                    registro9900.setReg_blc("C181");
                    registro9900.setQtd_reg_blc(String.valueOf(cont));
                    bloco9.getRegistro9900().add(registro9900);
                }
                cont = efdIcms.getContadoresBlocoC().getContRegistroC186();
                if (cont > 0) {
                    registro9900 = new Registro9900();
                    registro9900.setReg_blc("C186");
                    registro9900.setQtd_reg_blc(String.valueOf(cont));
                    bloco9.getRegistro9900().add(registro9900);
                }
            }

        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC190();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C190");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC191(); //add v3_0_1
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C191");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC195();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C195");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC198();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C198");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC197();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C197");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC300();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C300");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC310();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C310");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC320();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C320");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC321();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C321");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
            cont = efdIcms.getContadoresBlocoC().getContRegistroC330();
            if (cont > 0) {
                registro9900 = new Registro9900();
                registro9900.setReg_blc("C330");
                registro9900.setQtd_reg_blc(String.valueOf(cont));
                bloco9.getRegistro9900().add(registro9900);
            }
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC350();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C350");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC370();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C370");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
            cont = efdIcms.getContadoresBlocoC().getContRegistroC380();
            if (cont > 0) {
                registro9900 = new Registro9900();
                registro9900.setReg_blc("C380");
                registro9900.setQtd_reg_blc(String.valueOf(cont));
                bloco9.getRegistro9900().add(registro9900);
            }
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC390();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C390");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC400();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C400");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC405();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C405");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC410();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C410");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC420();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C420");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
            cont = efdIcms.getContadoresBlocoC().getContRegistroC430();
            if (cont > 0) {
                registro9900 = new Registro9900();
                registro9900.setReg_blc("C430");
                registro9900.setQtd_reg_blc(String.valueOf(cont));
                bloco9.getRegistro9900().add(registro9900);
            }
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC425();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C425");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC460();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C460");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
            cont = efdIcms.getContadoresBlocoC().getContRegistroC480();
            if (cont > 0) {
                registro9900 = new Registro9900();
                registro9900.setReg_blc("C480");
                registro9900.setQtd_reg_blc(String.valueOf(cont));
                bloco9.getRegistro9900().add(registro9900);
            }
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC465();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C465");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC470();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C470");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC490();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C490");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC495();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C495");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC500();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C500");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC510();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C510");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC590();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C590");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
            cont = efdIcms.getContadoresBlocoC().getContRegistroC591();
            if (cont > 0) {
                registro9900 = new Registro9900();
                registro9900.setReg_blc("C591");
                registro9900.setQtd_reg_blc(String.valueOf(cont));
                bloco9.getRegistro9900().add(registro9900);
            }
            cont = efdIcms.getContadoresBlocoC().getContRegistroC595();
            if (cont > 0) {
                registro9900 = new Registro9900();
                registro9900.setReg_blc("C595");
                registro9900.setQtd_reg_blc(String.valueOf(cont));
                bloco9.getRegistro9900().add(registro9900);
            }
            cont = efdIcms.getContadoresBlocoC().getContRegistroC597();
            if (cont > 0) {
                registro9900 = new Registro9900();
                registro9900.setReg_blc("C597");
                registro9900.setQtd_reg_blc(String.valueOf(cont));
                bloco9.getRegistro9900().add(registro9900);
            }
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC600();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C600");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC601();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C601");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC610();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C610");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC690();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C690");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC700();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C700");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC790();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C790");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC791();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C791");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC800();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C800");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
            cont = efdIcms.getContadoresBlocoC().getContRegistroC810();
            if (cont > 0) {
                registro9900 = new Registro9900();
                registro9900.setReg_blc("C810");
                registro9900.setQtd_reg_blc(String.valueOf(cont));
                bloco9.getRegistro9900().add(registro9900);
            }
            cont = efdIcms.getContadoresBlocoC().getContRegistroC815();
            if (cont > 0) {
                registro9900 = new Registro9900();
                registro9900.setReg_blc("C815");
                registro9900.setQtd_reg_blc(String.valueOf(cont));
                bloco9.getRegistro9900().add(registro9900);
            }
            cont = efdIcms.getContadoresBlocoC().getContRegistroC870();
            if (cont > 0) {
                registro9900 = new Registro9900();
                registro9900.setReg_blc("C870");
                registro9900.setQtd_reg_blc(String.valueOf(cont));
                bloco9.getRegistro9900().add(registro9900);
            }
            cont = efdIcms.getContadoresBlocoC().getContRegistroC880();
            if (cont > 0) {
                registro9900 = new Registro9900();
                registro9900.setReg_blc("C880");
                registro9900.setQtd_reg_blc(String.valueOf(cont));
                bloco9.getRegistro9900().add(registro9900);
            }
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC850();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C850");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        if (Util.versao2023(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
            cont = efdIcms.getContadoresBlocoC().getContRegistroC855();
            if (cont > 0) {
                registro9900 = new Registro9900();
                registro9900.setReg_blc("C855");
                registro9900.setQtd_reg_blc(String.valueOf(cont));
                bloco9.getRegistro9900().add(registro9900);
            }
            cont = efdIcms.getContadoresBlocoC().getContRegistroC857();
            if (cont > 0) {
                registro9900 = new Registro9900();
                registro9900.setReg_blc("C857");
                registro9900.setQtd_reg_blc(String.valueOf(cont));
                bloco9.getRegistro9900().add(registro9900);
            }
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC860();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C860");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        cont = efdIcms.getContadoresBlocoC().getContRegistroC890();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C890");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }

        if (Util.versao2023(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
            cont = efdIcms.getContadoresBlocoC().getContRegistroC895();
            if (cont > 0) {
                registro9900 = new Registro9900();
                registro9900.setReg_blc("C895");
                registro9900.setQtd_reg_blc(String.valueOf(cont));
                bloco9.getRegistro9900().add(registro9900);
            }
            cont = efdIcms.getContadoresBlocoC().getContRegistroC897();
            if (cont > 0) {
                registro9900 = new Registro9900();
                registro9900.setReg_blc("C897");
                registro9900.setQtd_reg_blc(String.valueOf(cont));
                bloco9.getRegistro9900().add(registro9900);
            }
        }

        cont = efdIcms.getContadoresBlocoC().getContRegistroC990();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("C990");
            registro9900.setQtd_reg_blc("1");
            bloco9.getRegistro9900().add(registro9900);
        }

        int somatorio = Integer.parseInt(bloco9.getRegistro9999().getQtd_lin()) + Integer.parseInt(blocoC.getRegistroC990().getQtd_lin_c());
        bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

        efdIcms.setBloco9(bloco9);

        return efdIcms;
    }
}
