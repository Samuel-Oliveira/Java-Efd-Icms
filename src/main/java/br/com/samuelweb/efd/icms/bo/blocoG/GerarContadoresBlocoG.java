/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoG;

import br.com.samuelweb.efd.icms.registros.EfdIcms;
import br.com.samuelweb.efd.icms.registros.bloco9.Bloco9;
import br.com.samuelweb.efd.icms.registros.bloco9.Registro9900;
import br.com.samuelweb.efd.icms.registros.blocoG.BlocoG;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarContadoresBlocoG {

	public static EfdIcms gerar(EfdIcms efdIcms) {

		BlocoG blocoG = efdIcms.getBlocoG();
		Bloco9 bloco9 = efdIcms.getBloco9();
		Registro9900 registro9900 = new Registro9900();

		// Qnt Registros RegistroG001
		if (!Util.isEmpty(blocoG.getRegistroG001())) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("G001");
			registro9900.setQtd_reg_blc("1");
			bloco9.getRegistro9900().add(registro9900);
			
		}

//		// Qnt Registros Registro
//		if (!Util.isEmpty(blocoG.getRegistro())) {
//			registro9900 = new Registro9900();
//			registro9900.setReg_blc("");
//			registro9900.setQtd_reg_blc(String.valueOf(blocoG.getRegistro().get(blocoG.getRegistro().size() - 1).getQnt()));
//			bloco9.getRegistro9900().add(registro9900);
//			
//		}
//
//		// Qnt Registros Registro
//		if (!Util.isEmpty(blocoG.getRegistro())) {
//			registro9900 = new Registro9900();
//			registro9900.setReg_blc("");
//			registro9900.setQtd_reg_blc(String.valueOf(blocoG.getRegistro().get(blocoG.getRegistro().size() - 1).getQnt()));
//			bloco9.getRegistro9900().add(registro9900);
//			
//
//			// Qnt Registros Registro
//			int cont = 0
//			for (Registro registro : blocoG.getRegistro()) {
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

		// Qnt Registros RegistroG990
		if (!Util.isEmpty(blocoG.getRegistroG990())) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("G990");
			registro9900.setQtd_reg_blc("1");
			bloco9.getRegistro9900().add(registro9900);
			
		}
		
		int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
				+ Integer.valueOf(blocoG.getRegistroG990().getQtd_lin_g());
		bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

		efdIcms.setBloco9(bloco9);

		return efdIcms;
	}
}
