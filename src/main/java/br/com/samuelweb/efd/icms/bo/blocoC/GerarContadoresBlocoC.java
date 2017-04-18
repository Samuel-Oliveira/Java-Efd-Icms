/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoC;

import java.util.stream.Collectors;

import br.com.samuelweb.efd.icms.registros.EfdIcms;
import br.com.samuelweb.efd.icms.registros.bloco9.Bloco9;
import br.com.samuelweb.efd.icms.registros.bloco9.Registro9900;
import br.com.samuelweb.efd.icms.registros.blocoC.BlocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.BlocoCEnum;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarContadoresBlocoC {

	public static EfdIcms gerar(EfdIcms efdIcms) {

		BlocoC blocoC = efdIcms.getBlocoC();
		Bloco9 bloco9 = efdIcms.getBloco9();
		Registro9900 registro9900 = new Registro9900();

		int cont = 0;
		cont = efdIcms.getContadoresBlocoC().getContRegistroC001();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C001");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC001()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC100();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C100");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC100()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC101();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C101");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC101()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC105();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C105");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC105()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC110();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C110");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC110()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC111();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C111");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC111()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC112();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C112");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC112()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC113();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C113");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC113()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC114();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C114");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC114()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC115();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C115");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC115()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC116();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C116");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC116()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC120();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C120");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC120()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC130();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C130");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC130()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC140();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C140");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC140()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC141();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C141");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC141()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC160();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C160");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC160()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC165();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C165");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC165()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC170();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C170");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC170()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC171();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C171");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC171()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC172();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C172");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC172()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC173();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C173");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC173()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC174();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C174");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC174()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC175();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C175");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC175()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC176();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C176");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC176()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC177();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C177");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC177()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC178();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C178");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC178()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC179();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C179");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC179()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC190();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC195();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC198();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC197();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC300();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC310();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC320();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC321();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC350();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC370();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC390();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC400();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC405();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC410();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC420();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC425();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC460();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC465();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC470();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC490();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC495();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC500();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC510();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC590();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC600();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC601();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC610();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC690();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC700();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC790();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC791();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC800();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC850();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC860();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC890();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoC().getContRegistroC990();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C");
			registro9900.setQtd_reg_blc(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC()));
			bloco9.getRegistro9900().add(registro9900);
		}

		int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin()) + Integer.valueOf(blocoC.getRegistroC990().getQtd_lin_c()));
		bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

		efdIcms.setBloco9(bloco9);

		return efdIcms;
	}
}
