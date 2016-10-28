/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.EfdIcms;
import br.com.samuelweb.efd.icms.registros.bloco9.Bloco9;
import br.com.samuelweb.efd.icms.registros.bloco9.Registro9900;
import br.com.samuelweb.efd.icms.registros.blocoC.BlocoC;
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

		// Qnt Registros RegistroC001
		if (!Util.isEmpty(blocoC.getRegistroC001())) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C001");
			registro9900.setQtd_reg_blc("1");
			bloco9.getRegistro9900().add(registro9900);
			
		}

//		// Qnt Registros Registro
//		if (!Util.isEmpty(blocoC.getRegistro())) {
//			registro9900 = new Registro9900();
//			registro9900.setReg_blc("");
//			registro9900.setQtd_reg_blc(String.valueOf(blocoC.getRegistro().get(blocoC.getRegistro().size() - 1).getQnt()));
//			bloco9.getRegistro9900().add(registro9900);
//			
//		}
//
//		// Qnt Registros Registro
//		if (!Util.isEmpty(blocoC.getRegistro())) {
//			registro9900 = new Registro9900();
//			registro9900.setReg_blc("");
//			registro9900.setQtd_reg_blc(String.valueOf(blocoC.getRegistro().get(blocoC.getRegistro().size() - 1).getQnt()));
//			bloco9.getRegistro9900().add(registro9900);
//			
//
//			// Qnt Registros Registro
//			for (Registro registro : blocoC.getRegistro()) {
//				if (!Util.isEmpty(registro.getRegistro())) {
//					cont += registro.getRegistro().get(registro.getRegistro().size() - 1).getQnt();
//				}
//			}
//			registro9900 = new Registro9900();
//			registro9900.setReg_blc("");
//			registro9900.setQtd_reg_blc(String.valueOf(cont));
//			bloco9.getRegistro9900().add(registro9900);
//			
//			cont = 0;
//		}

		// Qnt Registros RegistroC990
		if (!Util.isEmpty(blocoC.getRegistroC990())) {
			registro9900 = new Registro9900();
			registro9900.setReg_blc("C990");
			registro9900.setQtd_reg_blc("1");
			bloco9.getRegistro9900().add(registro9900);
			
		}
		
		int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
				+ Integer.valueOf(blocoC.getRegistroC990().getQtd_lin_c());
		bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

		efdIcms.setBloco9(bloco9);

		return efdIcms;
	}
}
