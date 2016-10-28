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

		// Qnt Registros Registro1001
		if (!Util.isEmpty(bloco1.getRegistro1001())) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("1001");
			registro9900.setQtd_reg_blc("1");
			bloco9.getRegistro9900().add(registro9900);
			
		}

		// Qnt Registros Registro
//		if (!Util.isEmpty(bloco1.getRegistro())) {
//			registro9900 = new Registro9900();
//			registro9900.setReg_blc("");
//			registro9900.setQtd_reg_blc(String.valueOf(bloco1.getRegistro().get(bloco1.getRegistro().size() - 1).getQnt()));
//			bloco9.getRegistro9900().add(registro9900);
//			
//		}
//
//		// Qnt Registros Registro
//		if (!Util.isEmpty(bloco1.getRegistro())) {
//			registro9900 = new Registro9900();
//			registro9900.setReg_blc("");
//			registro9900.setQtd_reg_blc(String.valueOf(bloco1.getRegistro().get(bloco1.getRegistro().size() - 1).getQnt()));
//			bloco9.getRegistro9900().add(registro9900);
//			
//
//			// Qnt Registros Registro
//			int cont = 0
//			for (Registro registro : bloco1.getRegistro()) {
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
