/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.bloco0;

import java.util.stream.Collectors;

import br.com.samuelweb.efd.icms.registros.EfdIcms;
import br.com.samuelweb.efd.icms.registros.bloco0.Bloco0;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0300;
import br.com.samuelweb.efd.icms.registros.bloco9.Bloco9;
import br.com.samuelweb.efd.icms.registros.bloco9.Registro9900;
import br.com.samuelweb.efd.icms.registros.bloco9.Registro9999;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarContadoresBloco0 {

	public static EfdIcms gerar(EfdIcms efdIcms) {

		Bloco0 bloco0 = efdIcms.getBloco0();
		Bloco9 bloco9 = new Bloco9();
		Registro9999 registro9999 = new Registro9999();
		registro9999.setQtd_lin("0");
		bloco9.setRegistro9999(registro9999);
		Registro9900 registro9900 = new Registro9900();

		// Qnt Registros Bloco0
		if (!Util.isEmpty(bloco0)) {

			// Qnt Registros Registro0000
			if (!Util.isEmpty(bloco0.getRegistro0000())) {
				registro9900 = new Registro9900();
				registro9900.setReg_blc("0000");
				registro9900.setQtd_reg_blc("1");
				bloco9.getRegistro9900().add(registro9900);
			}

			// Qnt Registros Registro0001
			if (!Util.isEmpty(bloco0.getRegistro0001())) {
				registro9900 = new Registro9900();
				registro9900.setReg_blc("0001");
				registro9900.setQtd_reg_blc("1");
				bloco9.getRegistro9900().add(registro9900);
			}

			// Qnt Registros Registro0005
			if (!Util.isEmpty(bloco0.getRegistro0005())) {
				registro9900 = new Registro9900();
				registro9900.setReg_blc("0005");
				registro9900.setQtd_reg_blc("1");
				bloco9.getRegistro9900().add(registro9900);
			}

			// Qnt Registros Registro0015
			if (!Util.isEmpty(bloco0.getRegistro0015())) {
				registro9900 = new Registro9900();
				registro9900.setReg_blc("0015");
				registro9900.setQtd_reg_blc(String.valueOf(bloco0.getRegistro0015().size()));
				bloco9.getRegistro9900().add(registro9900);
			}

			// Qnt Registros Registro0100
			if (!Util.isEmpty(bloco0.getRegistro0100())) {
				registro9900 = new Registro9900();
				registro9900.setReg_blc("0100");
				registro9900.setQtd_reg_blc("1");
				bloco9.getRegistro9900().add(registro9900);
			}

			// Qnt Registros Registro0150
			if (!Util.isEmpty(bloco0.getRegistro0150())) {
				registro9900 = new Registro9900();
				registro9900.setReg_blc("0150");
				registro9900.setQtd_reg_blc(String.valueOf(bloco0.getRegistro0150().size()));
				bloco9.getRegistro9900().add(registro9900);

				// Qnt Registros Registro0175
				int cont0175 = bloco0.getRegistro0150()
									 .stream()
									 .filter( r -> !r.getRegistro0175().isEmpty())
									 .map(t -> t.getRegistro0175().size())
									 .collect(Collectors.toList()).size();
				
				if (cont0175 > 0) {
					registro9900 = new Registro9900();
					registro9900.setReg_blc("0175");
					registro9900.setQtd_reg_blc(String.valueOf(cont0175));
					bloco9.getRegistro9900().add(registro9900);
				}
			}

			// Qnt Registros Registro0190
			if (!Util.isEmpty(bloco0.getRegistro0190())) {
				registro9900 = new Registro9900();
				registro9900.setReg_blc("0190");
				registro9900.setQtd_reg_blc(String.valueOf(bloco0.getRegistro0190().size()));
				bloco9.getRegistro9900().add(registro9900);
			}

			// Qnt Registros Registro0200
			if (!Util.isEmpty(bloco0.getRegistro0200())) {
				registro9900 = new Registro9900();
				registro9900.setReg_blc("0200");
				registro9900.setQtd_reg_blc(String.valueOf(bloco0.getRegistro0200().size()));
				bloco9.getRegistro9900().add(registro9900);

				//Quantidade de Registros 0205
				int cont0205 = bloco0.getRegistro0200()
									 .stream()
									 .filter(r -> !r.getRegistro0205().isEmpty())
									 .map(t -> t.getRegistro0205())
									 .collect(Collectors.toList()).size();
				
				//Quantidade de Registros 0206
				int cont0206 = bloco0.getRegistro0200()
									 .stream()
									 .filter(r -> r.getRegistro0206() != null)
									 .map(t -> t.getRegistro0206())
									 .collect(Collectors.toList()).size();
				
				//Quantidade de Registros 0210
				int cont0210 = bloco0.getRegistro0200()
									 .stream()
									 .filter(r -> !r.getRegistro0210().isEmpty())
									 .map(t -> t.getRegistro0210())
									 .collect(Collectors.toList()).size();
				
				//Quantidade de Registros 0220
				int cont0220 = bloco0.getRegistro0200()
									 .stream()
									 .filter( r -> !r.getRegistro0220().isEmpty())
									 .map(t -> t.getRegistro0220())
									 .collect(Collectors.toList()).size();

				if (cont0205 > 0) {
					registro9900 = new Registro9900();
					registro9900.setReg_blc("0205");
					registro9900.setQtd_reg_blc(String.valueOf(cont0205));
					bloco9.getRegistro9900().add(registro9900);

				}

				if (cont0206 > 0) {
					registro9900 = new Registro9900();
					registro9900.setReg_blc("0206");
					registro9900.setQtd_reg_blc(String.valueOf(cont0206));
					bloco9.getRegistro9900().add(registro9900);

				}

				if (cont0210 > 0) {
					registro9900 = new Registro9900();
					registro9900.setReg_blc("0210");
					registro9900.setQtd_reg_blc(String.valueOf(cont0210));
					bloco9.getRegistro9900().add(registro9900);

				}

				if (cont0220 > 0) {
					registro9900 = new Registro9900();
					registro9900.setReg_blc("0220");
					registro9900.setQtd_reg_blc(String.valueOf(cont0220));
					bloco9.getRegistro9900().add(registro9900);

				}
			}

			// Qnt Registros Registro0300
			if (!Util.isEmpty(bloco0.getRegistro0300())) {
				registro9900 = new Registro9900();
				registro9900.setReg_blc("0300");
				registro9900.setQtd_reg_blc(String.valueOf(bloco0.getRegistro0300().size()));
				bloco9.getRegistro9900().add(registro9900);

				// Qnt Registros Registro0305
				int cont0305 = 0;
				for (Registro0300 registro0300 : bloco0.getRegistro0300()) {
					if (!Util.isEmpty(registro0300.getRegistro0305())) {
						cont0305++;
					}
				}

				if (cont0305 > 0) {
					registro9900 = new Registro9900();
					registro9900.setReg_blc("0305");
					registro9900.setQtd_reg_blc(String.valueOf(cont0305));
					bloco9.getRegistro9900().add(registro9900);

				}
			}

			// Qnt Registros Registro0400
			if (!Util.isEmpty(bloco0.getRegistro0400())) {
				registro9900 = new Registro9900();
				registro9900.setReg_blc("0400");
				registro9900.setQtd_reg_blc(String.valueOf(bloco0.getRegistro0400().size()));
				bloco9.getRegistro9900().add(registro9900);

			}

			// Qnt Registros Registro0450
			if (!Util.isEmpty(bloco0.getRegistro0450())) {
				registro9900 = new Registro9900();
				registro9900.setReg_blc("0450");
				registro9900.setQtd_reg_blc(String.valueOf(bloco0.getRegistro0450().size()));
				bloco9.getRegistro9900().add(registro9900);

			}

			// Qnt Registros Registro0460
			if (!Util.isEmpty(bloco0.getRegistro0460())) {
				registro9900 = new Registro9900();
				registro9900.setReg_blc("0460");
				registro9900.setQtd_reg_blc(String.valueOf(bloco0.getRegistro0460().size()));
				bloco9.getRegistro9900().add(registro9900);

			}

			// Qnt Registros Registro0500
			if (!Util.isEmpty(bloco0.getRegistro0500())) {
				registro9900 = new Registro9900();
				registro9900.setReg_blc("0500");
				registro9900.setQtd_reg_blc(String.valueOf(bloco0.getRegistro0500().size()));
				bloco9.getRegistro9900().add(registro9900);

			}

			// Qnt Registros Registro0600
			if (!Util.isEmpty(bloco0.getRegistro0600())) {
				registro9900 = new Registro9900();
				registro9900.setReg_blc("0600");
				registro9900.setQtd_reg_blc(String.valueOf(bloco0.getRegistro0600().size()));
				bloco9.getRegistro9900().add(registro9900);

			}

			// Qnt Registros Registro0990
			if (!Util.isEmpty(bloco0.getRegistro0990())) {
				registro9900 = new Registro9900();
				registro9900.setReg_blc("0990");
				registro9900.setQtd_reg_blc("1");
				bloco9.getRegistro9900().add(registro9900);

			}

			int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
					+ Integer.valueOf(bloco0.getRegistro0990().getQtd_lin_0());
			bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

			efdIcms.setBloco9(bloco9);
		}
		return efdIcms;
	}
}
