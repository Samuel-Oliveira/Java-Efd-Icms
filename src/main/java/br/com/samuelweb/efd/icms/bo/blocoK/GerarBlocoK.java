/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoK;

import br.com.samuelweb.efd.icms.registros.EfdIcms;
import br.com.samuelweb.efd.icms.registros.blocoK.BlocoK;
import br.com.samuelweb.efd.icms.registros.blocoK.BlocoKEnum;
import br.com.samuelweb.efd.icms.registros.blocoK.RegistroK990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Yuri Lemes
 *
 */
public class GerarBlocoK {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EfdIcms efdIcms, StringBuilder sbr) {
		BlocoK blocoK  = efdIcms.getBlocoK();
		sb = sbr;
		// REGISTROK001
		if (!Util.isEmpty(blocoK.getRegistroK001())) {
			sb = GerarRegistroK001.gerar(blocoK.getRegistroK001(), sb);
			efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK001);
		}

		// REGISTROK001
		if (!Util.isEmpty(blocoK.getRegistroK100())) {
			blocoK.getRegistroK100().stream().forEach(registroK100 -> {
				sb = GerarRegistroK100.gerar(registroK100, sb);
				efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK100);

				// REGISTROK200
				if (!Util.isEmpty(registroK100.getRegistroK200())) {
					registroK100.getRegistroK200().stream().forEach(registroK200 -> {
						sb = GerarRegistroK200.gerar(registroK200, sb);
						efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK200);
					});
				}

				// REGISTROK210
				if (!Util.isEmpty(registroK100.getRegistroK210())) {
					registroK100.getRegistroK210().stream().forEach(registroK210 -> {
						sb = GerarRegistroK210.gerar(registroK210, sb);
						efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK210);

						// REGISTROK215
						if (!Util.isEmpty(registroK210.getRegistroK215())) {
							registroK210.getRegistroK215().stream().forEach(registroK215 -> {
								sb = GerarRegistroK215.gerar(registroK215, sb);
								efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK215);
							});
						}
					});
				}

				// REGISTROK220
				if (!Util.isEmpty(registroK100.getRegistroK220())) {
					registroK100.getRegistroK220().stream().forEach(registroK220 -> {
						sb = GerarRegistroK220.gerar(registroK220, sb);
						efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK220);
					});
				}

				// REGISTROK230
				if (!Util.isEmpty(registroK100.getRegistroK230())) {
					registroK100.getRegistroK230().stream().forEach(registroK230 -> {
						sb = GerarRegistroK230.gerar(registroK230, sb);
						efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK230);

						// REGISTROK235
						if (!Util.isEmpty(registroK230.getRegistroK235())) {
							registroK230.getRegistroK235().stream().forEach(registroK235 -> {
								sb = GerarRegistroK235.gerar(registroK235, sb);
								efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK235);
							});
						}
					});
				}
				
				// REGISTROK250
				if (!Util.isEmpty(registroK100.getRegistroK250())) {
					registroK100.getRegistroK250().stream().forEach(registroK250 -> {
						sb = GerarRegistroK250.gerar(registroK250, sb);
						efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK250);

						// REGISTROK255
						if (!Util.isEmpty(registroK250.getRegistroK255())) {
							registroK250.getRegistroK255().stream().forEach(registroK255 -> {
								sb = GerarRegistroK255.gerar(registroK255, sb);
								efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK255);
							});
						}
					});
				}
				
				// REGISTROK260
				if (!Util.isEmpty(registroK100.getRegistroK260())) {
					registroK100.getRegistroK260().stream().forEach(registroK260 -> {
						sb = GerarRegistroK260.gerar(registroK260, sb);
						efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK260);

						// REGISTROK265
						if (!Util.isEmpty(registroK260.getRegistroK265())) {
							registroK260.getRegistroK265().stream().forEach(registroK265 -> {
								sb = GerarRegistroK265.gerar(registroK265, sb);
								efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK265);
							});
						}
					});
				}
				
				// REGISTROK270
				if (!Util.isEmpty(registroK100.getRegistroK270())) {
					registroK100.getRegistroK270().stream().forEach(registroK270 -> {
						sb = GerarRegistroK270.gerar(registroK270, sb);
						efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK270);

						// REGISTROK235
						if (!Util.isEmpty(registroK270.getRegistroK275())) {
							registroK270.getRegistroK275().stream().forEach(registroK275 -> {
								sb = GerarRegistroK275.gerar(registroK275, sb);
								efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK275);
							});
						}
					});
				}
				
				// REGISTROK280
				if (!Util.isEmpty(registroK100.getRegistroK280())) {
					registroK100.getRegistroK280().stream().forEach(registroK280 -> {
						sb = GerarRegistroK280.gerar(registroK280, sb);
						efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK280);
					});
				}
			});
		}

		// REGISTROK990
		if (efdIcms.getContadoresBlocoK().getContRegistroK990() > 0) {
			RegistroK990 registroK990 = new RegistroK990();
			registroK990.setQtd_lin_k(String.valueOf(efdIcms.getContadoresBlocoK().getContRegistroK990()+1));

			blocoK.setRegistroK990(registroK990);
			sb = GerarRegistroK990.gerar(blocoK.getRegistroK990(), sb);
		}

		return sb;
	}
}
