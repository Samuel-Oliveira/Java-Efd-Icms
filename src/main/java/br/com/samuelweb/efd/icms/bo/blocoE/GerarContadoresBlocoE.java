/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoE;

import br.com.samuelweb.efd.icms.registros.EfdIcms;
import br.com.samuelweb.efd.icms.registros.bloco9.Bloco9;
import br.com.samuelweb.efd.icms.registros.bloco9.Registro9900;
import br.com.samuelweb.efd.icms.registros.blocoE.BlocoE;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarContadoresBlocoE {

	public static EfdIcms gerar(EfdIcms efdIcms) {

		BlocoE blocoE = efdIcms.getBlocoE();
		Bloco9 bloco9 = efdIcms.getBloco9();
		Registro9900 registro9900 = new Registro9900();

		// Qnt Registros RegistroE001
		if (!Util.isEmpty(blocoE.getRegistroE001())) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("E001");
			registro9900.setQtd_reg_blc("1");
			bloco9.getRegistro9900().add(registro9900);
			
		}

//		// Qnt Registros Registro
//		if (!Util.isEmpty(blocoE.getRegistro())) {
//			registro9900 = new Registro9900();
//			registro9900.setReg_blc("");
//			registro9900.setQtd_reg_blc(String.valueOf(blocoE.getRegistro().get(blocoE.getRegistro().size() - 1).getQnt()));
//			bloco9.getRegistro9900().add(registro9900);
//			
//		}
//
//		// Qnt Registros Registro
//		if (!Util.isEmpty(blocoE.getRegistro())) {
//			registro9900 = new Registro9900();
//			registro9900.setReg_blc("");
//			registro9900.setQtd_reg_blc(String.valueOf(blocoE.getRegistro().get(blocoE.getRegistro().size() - 1).getQnt()));
//			bloco9.getRegistro9900().add(registro9900);
//			
//
//			// Qnt Registros Registro
//			int cont = 0
//			for (Registro registro : blocoE.getRegistro()) {
//				if (!Util.isEmpty(registro.getRegistro())) {
//					cont += registro.getRegistro().get(registro.getRegistro().size() - 1).getQnt();
//				}
//			}
//			if(cont >0){
//				registro9900 = new Registro9900();
//				registro9900.setReg_blc("");
//				registro9900.setQtd_reg_blc(String.valueOf(cont));
//				bloco9.getRegistro9900().add(registro9900);
//				
//			}
//		}
		
		// Qnt Registros RegistroE990
		if (!Util.isEmpty(blocoE.getRegistroE990())) {
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
