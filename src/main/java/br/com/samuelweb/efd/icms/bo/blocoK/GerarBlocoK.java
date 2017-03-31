/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoK;

import br.com.samuelweb.efd.icms.registros.blocoK.BlocoK;
import br.com.samuelweb.efd.icms.registros.blocoK.RegistroK990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Yuri Lemes
 *
 */
public class GerarBlocoK {

	private static int qtdRegistros = 0;

	private static StringBuilder sb = null;

	public static StringBuilder gerar(BlocoK blocoK, StringBuilder sbr) {
		sb = sbr;
		// REGISTROK001
		if (!Util.isEmpty(blocoK.getRegistroK001())) {
			sb = GerarRegistroK001.gerar(blocoK.getRegistroK001(), sb);
			qtdRegistros++;
		}

		// REGISTROK001
		if (!Util.isEmpty(blocoK.getRegistroK100())) {
			blocoK.getRegistroK100().stream().forEach(registroK100 -> {
				sb = GerarRegistroK100.gerar(registroK100, sb);

				// REGISTROK200
				if (!Util.isEmpty(registroK100.getRegistroK200())) {
					qtdRegistros += registroK100.getRegistroK200().stream().peek(registroK200 -> {
						sb = GerarRegistroK200.gerar(registroK200, sb);
					}).count();
				}

				// REGISTROK210
				if (!Util.isEmpty(registroK100.getRegistroK210())) {
					registroK100.getRegistroK210().stream().forEach(registroK210 -> {
						sb = GerarRegistroK210.gerar(registroK210, sb);

						// REGISTROK215
						if (!Util.isEmpty(registroK210.getRegistroK215())) {
							qtdRegistros += registroK210.getRegistroK215().stream().peek(registroK215 -> {
								sb = GerarRegistroK215.gerar(registroK215, sb);
							}).count();
						}
						qtdRegistros++;
					});
				}

				// REGISTROK220
				if (!Util.isEmpty(registroK100.getRegistroK220())) {
					qtdRegistros += registroK100.getRegistroK220().stream().peek(registroK220 -> {
						sb = GerarRegistroK220.gerar(registroK220, sb);
					}).count();
				}

				// REGISTROK230
				if (!Util.isEmpty(registroK100.getRegistroK230())) {
					registroK100.getRegistroK230().stream().forEach(registroK230 -> {
						sb = GerarRegistroK230.gerar(registroK230, sb);

						// REGISTROK235
						if (!Util.isEmpty(registroK230.getRegistroK235())) {
							qtdRegistros += registroK230.getRegistroK235().stream().peek(registroK235 -> {
								sb = GerarRegistroK235.gerar(registroK235, sb);
							}).count();
						}
						qtdRegistros++;
					});
				}
				
				// REGISTROK250
				if (!Util.isEmpty(registroK100.getRegistroK250())) {
					registroK100.getRegistroK250().stream().forEach(registroK250 -> {
						sb = GerarRegistroK250.gerar(registroK250, sb);

						// REGISTROK255
						if (!Util.isEmpty(registroK250.getRegistroK255())) {
							qtdRegistros += registroK250.getRegistroK255().stream().peek(registroK255 -> {
								sb = GerarRegistroK255.gerar(registroK255, sb);
							}).count();
						}
						qtdRegistros++;
					});
				}
				
				// REGISTROK260
				if (!Util.isEmpty(registroK100.getRegistroK260())) {
					registroK100.getRegistroK260().stream().forEach(registroK260 -> {
						sb = GerarRegistroK260.gerar(registroK260, sb);

						// REGISTROK265
						if (!Util.isEmpty(registroK260.getRegistroK265())) {
							qtdRegistros += registroK260.getRegistroK265().stream().peek(registroK265 -> {
								sb = GerarRegistroK265.gerar(registroK265, sb);
							}).count();
						}
						qtdRegistros++;
					});
				}
				
				// REGISTROK270
				if (!Util.isEmpty(registroK100.getRegistroK270())) {
					registroK100.getRegistroK270().stream().forEach(registroK270 -> {
						sb = GerarRegistroK270.gerar(registroK270, sb);

						// REGISTROK235
						if (!Util.isEmpty(registroK270.getRegistroK275())) {
							qtdRegistros += registroK270.getRegistroK275().stream().peek(registroK275 -> {
								sb = GerarRegistroK275.gerar(registroK275, sb);
							}).count();
						}
						qtdRegistros++;
					});
				}
				
				// REGISTROK280
				if (!Util.isEmpty(registroK100.getRegistroK280())) {
					qtdRegistros += registroK100.getRegistroK280().stream().peek(registroK280 -> {
						sb = GerarRegistroK280.gerar(registroK280, sb);
					}).count();
				}
				qtdRegistros++;
			});
		}
		// //REGISTRO
		// if(!Util.isEmpty(blocoK.getRegistr())){
		// for (Registro5 registro5 : blocoK.getRegistro()) {
		// sb = GerarRegistro.gerar(registr, sb);
		// qtdRegistros++;
		// }
		// blocoK.getRegistro().get(blocoK.getRegistro().size()-1).setQnt(blocoK.getRegistro().size());
		// }
		//
		//
		// //REGISTRO
		// if(!Util.isEmpty(blocoK.getRegistro())){
		// for (Registro registro : blocoK.getRegistro()) {
		// sb = GerarRegistro.gerar(registro, sb);
		// qtdRegistros++;
		//
		// //REGISTRO
		// if(!Util.isEmpty(registro.getRegistro())){
		// for (Registro registro : registro.getRegistro()) {
		// sb = GerarRegistro.gerar(registro, sb);
		// qtdRegistros++;
		// }
		// registro.getRegistro().get(registro.getRegistro().size()-1).setQnt(registro.getRegistro().size());
		// }
		// }
		// blocoK.getRegistro().get(blocoK.getRegistro().size()-1).setQnt(blocoK.getRegistro().size());
		// }

		// REGISTROK990
		if (qtdRegistros > 0) {
			qtdRegistros++;
			RegistroK990 registroK990 = new RegistroK990();
			registroK990.setQtd_lin_k(String.valueOf(qtdRegistros));

			blocoK.setRegistroK990(registroK990);
			sb = GerarRegistroK990.gerar(blocoK.getRegistroK990(), sb);
		}

		return sb;
	}
}
