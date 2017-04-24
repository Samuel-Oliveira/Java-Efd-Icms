/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoE;

import br.com.samuelweb.efd.icms.registros.EfdIcms;
import br.com.samuelweb.efd.icms.registros.blocoE.BlocoE;
import br.com.samuelweb.efd.icms.registros.blocoE.BlocoEEnum;
import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE110;
import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE210;
import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE310;
import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE520;
import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Yuri Lemes
 *
 */
public class GerarBlocoE {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EfdIcms efdIcms, StringBuilder sbr) {
		sb = sbr;
		BlocoE blocoE = efdIcms.getBlocoE();

		// REGISTROE001
		if (!Util.isEmpty(blocoE.getRegistroE001())) {
			sb = GerarRegistroE001.gerar(blocoE.getRegistroE001(), sb);
			efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE001);
		}

		// REGISTROE100
		if (!Util.isEmpty(blocoE.getRegistroE100())) {
			blocoE.getRegistroE100().stream().forEach(registroE100 -> {
				sb = GerarRegistroE100.gerar(registroE100, sb);
				efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE100);

				// REGISTROE110
				if (!Util.isEmpty(registroE100.getRegistroE110())) {
					RegistroE110 registroE110 = registroE100.getRegistroE110();
					sb = GerarRegistroE110.gerar(registroE110, sb);
					efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE110);

					// REGISTROE111
					if (!Util.isEmpty(registroE110.getRegistroE111())) {
						registroE110.getRegistroE111().stream().forEach(registroE111 -> {
							sb = GerarRegistroE111.gerar(registroE111, sb);
							efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE111);

							// REGISTROE112
							if (!Util.isEmpty(registroE111.getRegistroE112())) {
								registroE111.getRegistroE112().stream().forEach(registroE112 -> {
									sb = GerarRegistroE112.gerar(registroE112, sb);
									efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE112);
								});
							}

							// REGISTROE113
							if (!Util.isEmpty(registroE111.getRegistroE113())) {
								registroE111.getRegistroE113().stream().forEach(registroE113 -> {
									sb = GerarRegistroE113.gerar(registroE113, sb);
									efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE113);
								});
							}
						});
					}

					// REGISTROE115
					if (!Util.isEmpty(registroE110.getRegistroE115())) {
						registroE110.getRegistroE115().stream().forEach(registroE115 -> {
							sb = GerarRegistroE115.gerar(registroE115, sb);
							efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE115);
						});
					}

					// REGISTROE116
					if (!Util.isEmpty(registroE110.getRegistroE116())) {
						registroE110.getRegistroE116().stream().forEach(registroE116 -> {
							sb = GerarRegistroE116.gerar(registroE116, sb);
							efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE116);
						});
					}
				}
			});
		}

		// REGISTROE200
		if (!Util.isEmpty(blocoE.getRegistroE200())) {
			blocoE.getRegistroE200().stream().forEach(registroE200 -> {
				sb = GerarRegistroE200.gerar(registroE200, sb);
				efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE200);

				// REGISTROE210
				if (!Util.isEmpty(registroE200.getRegistroE210())) {
					RegistroE210 registroE210 = registroE200.getRegistroE210();

					sb = GerarRegistroE210.gerar(registroE210, sb);
					efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE210);

					// REGISTROE220
					if (!Util.isEmpty(registroE210.getRegistroE220())) {
						registroE210.getRegistroE220().stream().forEach(registroE220 -> {
							sb = GerarRegistroE220.gerar(registroE220, sb);
							efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE220);

							// REGISTROE230
							if (!Util.isEmpty(registroE220.getRegistroE230())) {
								registroE220.getRegistroE230().stream().forEach(registroE230 -> {
									sb = GerarRegistroE230.gerar(registroE230, sb);
									efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE230);
								});
							}

							// REGISTROE240
							if (!Util.isEmpty(registroE220.getRegistroE240())) {
								registroE220.getRegistroE240().stream().forEach(registroE240 -> {
									sb = GerarRegistroE240.gerar(registroE240, sb);
									efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE240);
								});
							}
						});
					}

					// REGISTROE250
					if (!Util.isEmpty(registroE210.getRegistroE250())) {
						registroE210.getRegistroE250().stream().forEach(registroE250 -> {
							sb = GerarRegistroE250.gerar(registroE250, sb);
							efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE250);
						});
					}
				}
			});
		}

		// REGISTROE300
		if (!Util.isEmpty(blocoE.getRegistroE300())) {
			blocoE.getRegistroE300().stream().forEach(registroE300 -> {
				sb = GerarRegistroE300.gerar(registroE300, sb);
				efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE300);

				// REGISTROE310
				if (!Util.isEmpty(registroE300.getRegistroE310())) {
					RegistroE310 registroE310 = registroE300.getRegistroE310();

					sb = GerarRegistroE310.gerar(registroE310, sb);
					efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE310);

					// REGISTROE311
					if (!Util.isEmpty(registroE310.getRegistroE311())) {
						registroE310.getRegistroE311().stream().forEach(registroE311 -> {
							sb = GerarRegistroE311.gerar(registroE311, sb);
							efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE311);

							// REGISTROE312
							if (!Util.isEmpty(registroE311.getRegistroE312())) {
								registroE311.getRegistroE312().stream().forEach(registroE312 -> {
									sb = GerarRegistroE312.gerar(registroE312, sb);
									efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE312);
								});
							}

							// REGISTROE313
							if (!Util.isEmpty(registroE311.getRegistroE313())) {
								registroE311.getRegistroE313().stream().forEach(registroE313 -> {
									sb = GerarRegistroE313.gerar(registroE313, sb);
									efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE313);
								});
							}
						});
					}

					// REGISTROE316
					if (!Util.isEmpty(registroE310.getRegistroE316())) {
						registroE310.getRegistroE316().stream().forEach(registroE316 -> {
							sb = GerarRegistroE316.gerar(registroE316, sb);
							efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE316);
						});
					}
				}
			});
		}

		// REGISTROE500
		if (!Util.isEmpty(blocoE.getRegistroE500())) {
			blocoE.getRegistroE500().stream().forEach(registroE500 -> {
				sb = GerarRegistroE500.gerar(registroE500, sb);
				efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE500);

				// REGISTROE510
				if (!Util.isEmpty(registroE500.getRegistroE510())) {
					registroE500.getRegistroE510().stream().forEach(registroE510 -> {
						sb = GerarRegistroE510.gerar(registroE510, sb);
						efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE510);
					});
				}

				// REGISTROE520
				if (!Util.isEmpty(registroE500.getRegistroE520())) {
					RegistroE520 registroE520 = registroE500.getRegistroE520();
					sb = GerarRegistroE520.gerar(registroE520, sb);
					efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE520);

					// REGISTROE530
					if (!Util.isEmpty(registroE520.getRegistroE530())) {
						registroE520.getRegistroE530().stream().forEach(registroE530 -> {
							sb = GerarRegistroE530.gerar(registroE530, sb);
							efdIcms.getContadoresBlocoE().incrementar(BlocoEEnum.RegistroE530);
						});
					}
				}
			});
		}

		// REGISTROE990
		if (efdIcms.getContadoresBlocoE().getContRegistroE990() > 0) {
			RegistroE990 registroE990 = new RegistroE990();
			registroE990.setQtd_lin_e(String.valueOf(efdIcms.getContadoresBlocoE().getContRegistroE990() + 1));

			blocoE.setRegistroE990(registroE990);
			sb = GerarRegistroE990.gerar(blocoE.getRegistroE990(), sb);
		}

		return sb;
	}
}
