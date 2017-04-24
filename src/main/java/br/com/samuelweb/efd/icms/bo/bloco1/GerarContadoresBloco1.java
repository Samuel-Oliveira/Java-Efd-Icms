/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.bloco1;

import br.com.samuelweb.efd.icms.registros.EfdIcms;
import br.com.samuelweb.efd.icms.registros.bloco1.Bloco1;
import br.com.samuelweb.efd.icms.registros.bloco9.Bloco9;
import br.com.samuelweb.efd.icms.registros.bloco9.Registro9900;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarContadoresBloco1 {

	public static EfdIcms gerar(EfdIcms efdIcms) {

		Bloco1 bloco1 = efdIcms.getBloco1();
		Bloco9 bloco9 = efdIcms.getBloco9();
		Registro9900 registro9900 = new Registro9900();

		int cont = 0;
		cont = efdIcms.getContadoresBloco1().getContRegistro1001();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1001");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1010();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1010");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1100();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1100");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1105();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1105");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1110();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1110");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1200();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1200");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1210();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1210");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1300();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1300");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1310();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1310");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1320();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1320");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1350();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1350");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1360();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1360");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1370();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1370");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1390();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1390");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1391();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1391");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1400();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1400");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1500();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1500");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1600();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1600");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1700();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1700");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1710();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1710");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1800();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1800");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1900();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1900");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1910();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1910");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1920();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1920");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1921();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1921");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1922();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1922");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1923();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1923");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1925();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1925");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBloco1().getContRegistro1926();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1926");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}

		// Qnt Registros Registro1990
		if (!Util.isEmpty(bloco1.getRegistro1990())) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1990");
			registro9900.setQtd_reg_blc("1");
			bloco9.getRegistro9900().add(registro9900);
			
		}
				
		int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
				+ Integer.valueOf(bloco1.getRegistro1990().getQtd_lin_1());
		bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

		efdIcms.setBloco9(bloco9);

		return efdIcms;
	}
}
