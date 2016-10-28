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

		// Qnt Registros RegistroK001
		if (!Util.isEmpty(blocoK.getRegistroK001())) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("K001");
			registro9900.setQtd_reg_blc("1");
			bloco9.getRegistro9900().add(registro9900);
			
		}

//		// Qnt Registros Registro
//		if (!Util.isEmpty(blocoK.getRegistro())) {
//			registro9900 = new Registro9900();
//			registro9900.setReg_blc("");
//			registro9900.setQtd_reg_blc(String.valueOf(blocoK.getRegistro().get(blocoK.getRegistro().size() - 1).getQnt()));
//			bloco9.getRegistro9900().add(registro9900);
//			
//		}
//
//		// Qnt Registros Registro
//		if (!Util.isEmpty(blocoK.getRegistro())) {
//			registro9900 = new Registro9900();
//			registro9900.setReg_blc("");
//			registro9900.setQtd_reg_blc(String.valueOf(blocoK.getRegistro().get(blocoK.getRegistro().size() - 1).getQnt()));
//			bloco9.getRegistro9900().add(registro9900);
//			
//
//			// Qnt Registros Registro
//			int cont = 0
//			for (Registro registro : blocoK.getRegistro()) {
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
