/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoE;

import br.com.samuelweb.efd.icms.registros.EfdIcms;
import br.com.samuelweb.efd.icms.registros.bloco9.Bloco9;
import br.com.samuelweb.efd.icms.registros.bloco9.Registro9900;
import br.com.samuelweb.efd.icms.registros.blocoE.BlocoE;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarContadoresBlocoE {

	public static EfdIcms gerar(EfdIcms efdIcms) {

		BlocoE blocoE = efdIcms.getBlocoE();
		Bloco9 bloco9 = efdIcms.getBloco9();
		Registro9900 registro9900 = new Registro9900();

		int cont = 0;
		cont = efdIcms.getContadoresBlocoE().getContRegistroE001();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E001");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE100();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E100");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE110();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E110");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE111();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E111");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE112();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E112");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE113();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E113");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE115();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E115");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE116();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E116");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE200();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E200");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE210();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E210");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE220();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E220");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE230();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E230");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE240();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E240");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE250();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E250");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE300();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E300");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE310();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E310");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE311();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E311");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE312();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E312");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE313();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E313");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE316();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E316");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE500();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E500");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE510();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E510");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE520();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E520");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE530();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E530");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoE().getContRegistroE990();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E990");
			registro9900.setQtd_reg_blc("1");
			bloco9.getRegistro9900().add(registro9900);
		}
		int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
				+ Integer.valueOf(blocoE.getRegistroE990().getQtd_lin_e());
		bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

		efdIcms.setBloco9(bloco9);

		return efdIcms;
	}
}
