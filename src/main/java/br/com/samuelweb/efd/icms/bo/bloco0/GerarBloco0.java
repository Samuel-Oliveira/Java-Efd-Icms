/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.bloco0;

import br.com.samuelweb.efd.icms.registros.bloco0.Bloco0;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Yuri Lemes
 *
 */
public class GerarBloco0 {

	private static int qtdRegistros = 0;

	private static StringBuilder sb = null;

	public static StringBuilder gerar(Bloco0 bloco0, StringBuilder sbr) {

		sb = sbr;

		// REGISTRO0000
		if (!Util.isEmpty(bloco0.getRegistro0000())) {
			sb = GerarRegistro0000.gerar(bloco0.getRegistro0000(), sb);
			qtdRegistros++;
		}

		// REGISTRO0001
		if (!Util.isEmpty(bloco0.getRegistro0001())) {
			sb = GerarRegistro0001.gerar(bloco0.getRegistro0001(), sb);
			qtdRegistros++;
		}

		// REGISTRO0005
		if (!Util.isEmpty(bloco0.getRegistro0005())) {
			sb = GerarRegistro0005.gerar(bloco0.getRegistro0005(), sb);
			qtdRegistros++;
		}

		// REGISTRO0015
		if (!Util.isEmpty(bloco0.getRegistro0015())) {

			qtdRegistros += bloco0.getRegistro0015().stream().peek(registro0015 -> {
				sb = GerarRegistro0015.gerar(registro0015, sb);
			}).count();

		}

		// REGISTRO0100
		if (!Util.isEmpty(bloco0.getRegistro0100())) {
			sb = GerarRegistro0100.gerar(bloco0.getRegistro0100(), sb);
			qtdRegistros++;
		}

		// REGISTRO0150
		if (!Util.isEmpty(bloco0.getRegistro0150())) {

			bloco0.getRegistro0150().stream().forEach(registro0150 -> {
				sb = GerarRegistro0150.gerar(registro0150, sb);
				//REGISTRO0175
				if (!Util.isEmpty(registro0150.getRegistro0175())) {
					qtdRegistros += registro0150.getRegistro0175().stream().peek(registro0175 -> {
						sb = GerarRegistro0175.gerar(registro0175, sb);
					}).count();
				}
				qtdRegistros++;
			});
		}

		// REGISTRO0190
		if (!Util.isEmpty(bloco0.getRegistro0190())) {
			qtdRegistros += bloco0.getRegistro0190().stream().peek(registro0190 -> {
				sb = GerarRegistro0190.gerar(registro0190, sb);
			}).count();
		}

		// REGISTRO0200
		if (!Util.isEmpty(bloco0.getRegistro0200())) {
			bloco0.getRegistro0200().stream().forEach(registro0200 -> {
				sb = GerarRegistro0200.gerar(registro0200, sb);

				// REGISTRO0205
				if (!Util.isEmpty(registro0200.getRegistro0205())) {
					qtdRegistros += registro0200.getRegistro0205().stream().peek(registro0205 -> {
						sb = GerarRegistro0205.gerar(registro0205, sb);
					}).count();
				}

				// REGISTRO0206
				if (!Util.isEmpty(registro0200.getRegistro0206())) {
					sb = GerarRegistro0206.gerar(registro0200.getRegistro0206(), sb);
					qtdRegistros++;
				}

				// REGISTRO0210
				if (!Util.isEmpty(registro0200.getRegistro0210())) {
					qtdRegistros += registro0200.getRegistro0210().stream().peek(registro0210 -> {
						sb = GerarRegistro0210.gerar(registro0210, sb);
					}).count();
				}

				// REGISTRO0220
				if (!Util.isEmpty(registro0200.getRegistro0220())) {
					qtdRegistros += registro0200.getRegistro0220().stream().peek(registro0220 -> {
						sb = GerarRegistro0220.gerar(registro0220, sb);
					}).count();
				}
				qtdRegistros++;
			});

		}

		// REGISTRO0300
		if (!Util.isEmpty(bloco0.getRegistro0300())) {
			bloco0.getRegistro0300().forEach(registro0300 -> {
				sb = GerarRegistro0300.gerar(registro0300, sb);
				// REGISTRO0305
				if (!Util.isEmpty(registro0300.getRegistro0305())) {
					sb = GerarRegistro0305.gerar(registro0300.getRegistro0305(), sb);
					qtdRegistros++;
				}
				qtdRegistros++;
			});
		}

		// REGISTRO0400
		if (!Util.isEmpty(bloco0.getRegistro0400())) {
			qtdRegistros += bloco0.getRegistro0400().stream().peek(registro0400 ->{
				sb = GerarRegistro0400.gerar(registro0400, sb);
			}).count();
		}

		// REGISTRO0450
		if (!Util.isEmpty(bloco0.getRegistro0450())) {
			qtdRegistros += bloco0.getRegistro0450().stream().peek(registro0450 ->{
				sb = GerarRegistro0450.gerar(registro0450, sb);
			}).count();
		}

		// REGISTRO0460
		if (!Util.isEmpty(bloco0.getRegistro0460())) {
			qtdRegistros += bloco0.getRegistro0460().stream().peek(registro0460 ->{
				sb = GerarRegistro0460.gerar(registro0460, sb);
			}).count();
		}

		// REGISTRO0500
		if (!Util.isEmpty(bloco0.getRegistro0500())) {
			qtdRegistros += bloco0.getRegistro0500().stream().peek(registro0500 ->{
				sb = GerarRegistro0500.gerar(registro0500, sb);
			}).count();
		}

		// REGISTRO0600
		if (!Util.isEmpty(bloco0.getRegistro0600())) {
			qtdRegistros += bloco0.getRegistro0600().stream().peek(registro0600 ->{
				sb = GerarRegistro0600.gerar(registro0600, sb);
			}).count();
		}

		// REGISTRO0990
		if (qtdRegistros > 0) {
			qtdRegistros++;
			Registro0990 registro0990 = new Registro0990();
			registro0990.setQtd_lin_0(String.valueOf(qtdRegistros));

			bloco0.setRegistro0990(registro0990);
			sb = GerarRegistro0990.gerar(bloco0.getRegistro0990(), sb);
		}

		return sb;
	}
}
