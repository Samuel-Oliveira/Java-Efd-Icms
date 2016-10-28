/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoH;

import br.com.samuelweb.efd.icms.registros.EfdIcms;
import br.com.samuelweb.efd.icms.registros.bloco9.Bloco9;
import br.com.samuelweb.efd.icms.registros.bloco9.Registro9900;
import br.com.samuelweb.efd.icms.registros.blocoH.BlocoH;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarContadoresBlocoH {

	public static EfdIcms gerar(EfdIcms efdIcms) {

		BlocoH blocoH = efdIcms.getBlocoH();
		Bloco9 bloco9 = efdIcms.getBloco9();
		Registro9900 registro9900 = new Registro9900();

		// Qnt Registros RegistroH001
		if (!Util.isEmpty(blocoH.getRegistroH001())) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("H001");
			registro9900.setQtd_reg_blc("1");
			bloco9.getRegistro9900().add(registro9900);
			
		}

//		// Qnt Registros Registro
//		if (!Util.isEmpty(blocoH.getRegistro())) {
//			registro9900 = new Registro9900();
//			registro9900.setReg_blc("");
//			registro9900.setQtd_reg_blc(String.valueOf(blocoH.getRegistro().get(blocoH.getRegistro().size() - 1).getQnt()));
//			bloco9.getRegistro9900().add(registro9900);
//			
//		}
//
//		// Qnt Registros Registro
//		if (!Util.isEmpty(blocoH.getRegistro())) {
//			registro9900 = new Registro9900();
//			registro9900.setReg_blc("");
//			registro9900.setQtd_reg_blc(String.valueOf(blocoH.getRegistro().get(blocoH.getRegistro().size() - 1).getQnt()));
//			bloco9.getRegistro9900().add(registro9900);
//			
//
//			// Qnt Registros Registro
//			int cont = 0
//			for (Registro registro : blocoH.getRegistro()) {
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
		
		// Qnt Registros RegistroH990
		if (!Util.isEmpty(blocoH.getRegistroH990())) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("H990");
			registro9900.setQtd_reg_blc("1");
			bloco9.getRegistro9900().add(registro9900);
			
		}

		int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
				+ Integer.valueOf(blocoH.getRegistroH990().getQtd_lin_h());
		bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

		efdIcms.setBloco9(bloco9);

		return efdIcms;
	}
}
