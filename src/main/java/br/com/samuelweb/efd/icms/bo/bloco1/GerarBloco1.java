/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.bloco1;

import br.com.samuelweb.efd.icms.registros.EfdIcms;
import br.com.samuelweb.efd.icms.registros.bloco1.Bloco1;
import br.com.samuelweb.efd.icms.registros.bloco1.Registro1920;
import br.com.samuelweb.efd.icms.registros.bloco1.Registro1990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Yuri Lemes
 *
 */
public class GerarBloco1 {

	private static int qtdRegistros = 0;

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EfdIcms efdIcms, StringBuilder sbr) {
		Bloco1 bloco1 = efdIcms.getBloco1();
		sb = sbr;
		// REGISTRO1001
		if (!Util.isEmpty(bloco1.getRegistro1001())) {
			sb = GerarRegistro1001.gerar(bloco1.getRegistro1001(), sb);
			qtdRegistros++;
		}

		// REGISTRO1010
		if (!Util.isEmpty(bloco1.getRegistro1010())) {
			sb = GerarRegistro1010.gerar(bloco1.getRegistro1010(), sb);
			qtdRegistros++;
		}

		// REGISTRO1100
		if (!Util.isEmpty(bloco1.getRegistro1100())) {
			bloco1.getRegistro1100().stream().forEach(registro1100 -> {
				sb = GerarRegistro1100.gerar(registro1100, sb);

				// REGISTRO1105
				if (!Util.isEmpty(registro1100.getRegistro1105())) {
					registro1100.getRegistro1105().stream().forEach(registro1105 -> {
						sb = GerarRegistro1105.gerar(registro1105, sb);

						// REGISTRO1110
						if (!Util.isEmpty(registro1105.getRegistro1110())) {
							qtdRegistros += registro1105.getRegistro1110().stream().peek(registro1110 -> {
								sb = GerarRegistro1110.gerar(registro1110, sb);
							}).count();
						}
						qtdRegistros++;
					});
				}
				qtdRegistros++;
			});
		}

		// REGISTRO1200
		if (!Util.isEmpty(bloco1.getRegistro1200())) {
			bloco1.getRegistro1200().stream().forEach(registro1200 -> {
				sb = GerarRegistro1200.gerar(registro1200, sb);

				// REGISTRO1210
				if (!Util.isEmpty(registro1200.getRegistro1210())) {
					qtdRegistros += registro1200.getRegistro1210().stream().peek(registro1210 -> {
						sb = GerarRegistro1210.gerar(registro1210, sb);
					}).count();
				}
				qtdRegistros++;
			});
		}

		// REGISTRO1300
		if (!Util.isEmpty(bloco1.getRegistro1300())) {
			bloco1.getRegistro1300().stream().forEach(registro1300 -> {
				sb = GerarRegistro1300.gerar(registro1300, sb);

				// REGISTRO1310
				if (!Util.isEmpty(registro1300.getRegistro1310())) {
					registro1300.getRegistro1310().stream().forEach(registro1310 -> {
						sb = GerarRegistro1310.gerar(registro1310, sb);

						// REGISTRO1320
						if (!Util.isEmpty(registro1310.getRegistro1320())) {
							qtdRegistros += registro1310.getRegistro1320().stream().peek(registro1320 -> {
								sb = GerarRegistro1320.gerar(registro1320, sb);
							}).count();
						}
						qtdRegistros++;
					});
				}
				qtdRegistros++;
			});
		}

		// REGISTRO1350
		if (!Util.isEmpty(bloco1.getRegistro1350())) {
			bloco1.getRegistro1350().stream().forEach(registro1350 -> {
				sb = GerarRegistro1350.gerar(registro1350, sb);

				// REGISTRO1360
				if (!Util.isEmpty(registro1350.getRegistro1360())) {
					qtdRegistros += registro1350.getRegistro1360().stream().peek(registro1360 -> {
						sb = GerarRegistro1360.gerar(registro1360, sb);
					}).count();
				}

				// REGISTRO1370
				if (!Util.isEmpty(registro1350.getRegistro1370())) {
					qtdRegistros += registro1350.getRegistro1370().stream().peek(registro1370 -> {
						sb = GerarRegistro1370.gerar(registro1370, sb);
					}).count();
				}

				qtdRegistros++;
			});
		}

		// REGISTRO1390
		if (!Util.isEmpty(bloco1.getRegistro1390())) {
			bloco1.getRegistro1390().stream().forEach(registro1390 -> {
				sb = GerarRegistro1390.gerar(registro1390, sb);

				// REGISTRO1391
				if (!Util.isEmpty(registro1390.getRegistro1391())) {
					qtdRegistros += registro1390.getRegistro1391().stream().peek(registro1391 -> {
						sb = GerarRegistro1391.gerar(registro1391, sb);
					}).count();
				}
				qtdRegistros++;
			});
		}

		// REGISTRO1400
		if (!Util.isEmpty(bloco1.getRegistro1400())) {
			qtdRegistros += bloco1.getRegistro1400().stream().peek(registro1400 -> {
				sb = GerarRegistro1400.gerar(registro1400, sb);
			}).count();
		}

		// REGISTRO1500
		if (!Util.isEmpty(bloco1.getRegistro1500())) {
			bloco1.getRegistro1500().stream().forEach(registro1500 -> {
				sb = GerarRegistro1500.gerar(registro1500, sb);

				// REGISTRO1510
				if (!Util.isEmpty(registro1500.getRegistro1510())) {
					qtdRegistros += registro1500.getRegistro1510().stream().peek(registro1510 -> {
						sb = GerarRegistro1510.gerar(registro1510, sb);
					}).count();
				}
				qtdRegistros++;
			});
		}

		// REGISTRO1600
		if (!Util.isEmpty(bloco1.getRegistro1600())) {
			qtdRegistros += bloco1.getRegistro1600().stream().peek(registro1600 -> {
				sb = GerarRegistro1600.gerar(registro1600, sb);
			}).count();
		}

		// REGISTRO1700
		if (!Util.isEmpty(bloco1.getRegistro1700())) {
			bloco1.getRegistro1700().stream().forEach(registro1700 -> {
				sb = GerarRegistro1700.gerar(registro1700, sb);

				// REGISTRO1710
				if (!Util.isEmpty(registro1700.getRegistro1710())) {
					qtdRegistros += registro1700.getRegistro1710().stream().peek(registro1710 -> {
						sb = GerarRegistro1710.gerar(registro1710, sb);
					}).count();
				}
				qtdRegistros++;
			});
		}

		// REGISTRO1800
		if (!Util.isEmpty(bloco1.getRegistro1800())) {
			sb = GerarRegistro1800.gerar(bloco1.getRegistro1800(), sb);
			qtdRegistros++;
		}

		// REGISTRO1900
		if (!Util.isEmpty(bloco1.getRegistro1900())) {
			bloco1.getRegistro1900().stream().forEach(registro1900 -> {
				sb = GerarRegistro1900.gerar(registro1900, sb);

				// REGISTRO1910
				if (!Util.isEmpty(registro1900.getRegistro1910())) {
					registro1900.getRegistro1910().stream().forEach(registro1910 -> {
						sb = GerarRegistro1910.gerar(registro1910, sb);

						// REGISTRO1920
						if (!Util.isEmpty(registro1910.getRegistro1920())) {
							Registro1920 registro1920 = registro1910.getRegistro1920();
							sb = GerarRegistro1920.gerar(registro1920, sb);

							// REGISTRO1921
							if (!Util.isEmpty(registro1920.getRegistro1921())) {
								registro1920.getRegistro1921().stream().forEach(registro1921 -> {
									sb = GerarRegistro1921.gerar(registro1921, sb);

									// REGISTRO1922
									if (!Util.isEmpty(registro1921.getRegistro1922())) {
										qtdRegistros += registro1921.getRegistro1922().stream().peek(registro1922 -> {
											sb = GerarRegistro1922.gerar(registro1922, sb);
										}).count();
									}

									// REGISTRO1923
									if (!Util.isEmpty(registro1921.getRegistro1923())) {
										qtdRegistros += registro1921.getRegistro1923().stream().peek(registro1923 -> {
											sb = GerarRegistro1923.gerar(registro1923, sb);
										}).count();
									}

									qtdRegistros++;
								});
							}

							// REGISTRO1925
							if (!Util.isEmpty(registro1920.getRegistro1925())) {
								qtdRegistros += registro1920.getRegistro1925().stream().peek(registro1925 -> {
									sb = GerarRegistro1925.gerar(registro1925, sb);
								}).count();
							}

							// REGISTRO1926
							if (!Util.isEmpty(registro1920.getRegistro1926())) {
								qtdRegistros += registro1920.getRegistro1926().stream().peek(registro1926 -> {
									sb = GerarRegistro1926.gerar(registro1926, sb);
								}).count();
							}
							qtdRegistros++;
						}
						qtdRegistros++;
					});
				}
				qtdRegistros++;
			});
		}

		// //REGISTRO
		// if(!Util.isEmpty(bloco1.getRegistr())){
		// for (Registro5 registro5 : bloco1.getRegistro()) {
		// sb = GerarRegistro.gerar(registr, sb);
		// qtdRegistros++;
		// }
		// bloco1.getRegistro().get(bloco1.getRegistro().size()-1).setQnt(bloco1.getRegistro().size());
		// }
		//
		//
		// //REGISTRO
		// if(!Util.isEmpty(bloco1.getRegistro())){
		// for (Registro registro : bloco1.getRegistro()) {
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
		// bloco1.getRegistro().get(bloco1.getRegistro().size()-1).setQnt(bloco1.getRegistro().size());
		// }

		// REGISTRO1990
		if (qtdRegistros > 0) {
			qtdRegistros++;
			Registro1990 registro1990 = new Registro1990();
			registro1990.setQtd_lin_1(String.valueOf(qtdRegistros));

			bloco1.setRegistro1990(registro1990);
			sb = GerarRegistro1990.gerar(bloco1.getRegistro1990(), sb);
		}

		return sb;
	}
}
