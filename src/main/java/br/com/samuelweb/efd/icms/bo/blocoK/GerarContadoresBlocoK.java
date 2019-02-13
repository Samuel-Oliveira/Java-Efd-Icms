/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoK;

import br.com.samuelweb.efd.icms.registros.EfdIcms;
import br.com.samuelweb.efd.icms.registros.bloco9.Bloco9;
import br.com.samuelweb.efd.icms.registros.bloco9.Registro9900;
import br.com.samuelweb.efd.icms.registros.blocoK.BlocoK;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarContadoresBlocoK {

	public static EfdIcms gerar(EfdIcms efdIcms) {

		BlocoK blocoK = efdIcms.getBlocoK();
		Bloco9 bloco9 = efdIcms.getBloco9();
		Registro9900 registro9900 = new Registro9900();

		int cont = 0;
		cont = efdIcms.getContadoresBlocoK().getContRegistroK001();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("K001");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoK().getContRegistroK100();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("K100");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoK().getContRegistroK200();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("K200");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoK().getContRegistroK210();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("K210");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoK().getContRegistroK215();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("K215");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoK().getContRegistroK220();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("K220");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoK().getContRegistroK230();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("K230");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoK().getContRegistroK235();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("K235");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoK().getContRegistroK250();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("K250");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoK().getContRegistroK255();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("K255");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoK().getContRegistroK260();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("K260");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoK().getContRegistroK265();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("K265");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoK().getContRegistroK270();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("K270");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoK().getContRegistroK275();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("K275");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		cont = efdIcms.getContadoresBlocoK().getContRegistroK280();
		if (cont > 0) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("K280");
			registro9900.setQtd_reg_blc(String.valueOf(cont));
			bloco9.getRegistro9900().add(registro9900);
		}
		
		// Qnt Registros RegistroK001
		if (!Util.isEmpty(blocoK.getRegistroK990())) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("K990");
			registro9900.setQtd_reg_blc("1");
			bloco9.getRegistro9900().add(registro9900);
			
		}

		int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
				+ Integer.valueOf(blocoK.getRegistroK990().getQtd_lin_k());
		bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

		efdIcms.setBloco9(bloco9);

		return efdIcms;
	}
}
