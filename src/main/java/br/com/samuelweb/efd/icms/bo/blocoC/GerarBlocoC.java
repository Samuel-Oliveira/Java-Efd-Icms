/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.BlocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Yuri Lemes
 *
 */
public class GerarBlocoC {

	private static int qtdRegistros = 0;

	private static StringBuilder sb = null;

	public static StringBuilder gerar(BlocoC blocoC, StringBuilder sbr) {

		sb = sbr;

		// REGISTROC001
		if (!Util.isEmpty(blocoC.getRegistroC001())) {
			sb = GerarRegistroC001.gerar(blocoC.getRegistroC001(), sb);
			qtdRegistros++;
		}

		// REGISTROC100
		if (!Util.isEmpty(blocoC.getRegistroC100())) {
			blocoC.getRegistroC100().stream().forEach(registroC100 -> {
				sb = GerarRegistroC100.gerar(registroC100, sb);

				// REGISTROC101
				if (!Util.isEmpty(registroC100.getRegistroC101())) {
					sb = GerarRegistroC101.gerar(registroC100.getRegistroC101(), sb);
					qtdRegistros++;
				}

				// REGISTROC105
				if (!Util.isEmpty(registroC100.getRegistroC105())) {
					sb = GerarRegistroC105.gerar(registroC100.getRegistroC105(), sb);
					qtdRegistros++;
				}

				// REGISTROC110
				if (!Util.isEmpty(registroC100.getRegistroC110())) {
					registroC100.getRegistroC110().stream().forEach(registroC110 -> {
						sb = GerarRegistroC110.gerar(registroC110, sb);

						// REGISTROC111
						if (!Util.isEmpty(registroC110.getRegistroC111())) {
							qtdRegistros += registroC110.getRegistroC111().stream().peek(registroC111 -> {
								sb = GerarRegistroC111.gerar(registroC111, sb);
							}).count();
						}

						// REGISTROC112
						if (!Util.isEmpty(registroC110.getRegistroC112())) {
							qtdRegistros += registroC110.getRegistroC112().stream().peek(registroC112 -> {
								sb = GerarRegistroC112.gerar(registroC112, sb);
							}).count();
						}

						// REGISTROC113
						if (!Util.isEmpty(registroC110.getRegistroC113())) {
							qtdRegistros += registroC110.getRegistroC113().stream().peek(registroC113 -> {
								sb = GerarRegistroC113.gerar(registroC113, sb);
							}).count();
						}

						// REGISTROC114
						if (!Util.isEmpty(registroC110.getRegistroC114())) {
							qtdRegistros += registroC110.getRegistroC114().stream().peek(registroC114 -> {
								sb = GerarRegistroC114.gerar(registroC114, sb);
							}).count();
						}

						// REGISTROC115
						if (!Util.isEmpty(registroC110.getRegistroC115())) {
							qtdRegistros += registroC110.getRegistroC115().stream().peek(registroC115 -> {
								sb = GerarRegistroC115.gerar(registroC115, sb);
							}).count();
						}

						// REGISTROC116
						if (!Util.isEmpty(registroC110.getRegistroC116())) {
							qtdRegistros += registroC110.getRegistroC116().stream().peek(registroC116 -> {
								sb = GerarRegistroC116.gerar(registroC116, sb);
							}).count();
						}
						qtdRegistros++;
					});
				}

				// REGISTROC120
				if (!Util.isEmpty(registroC100.getRegistroC120())) {
					qtdRegistros += registroC100.getRegistroC120().stream().peek(registroC120 -> {
						sb = GerarRegistroC120.gerar(registroC120, sb);
					}).count();
				}

				// REGISTROC130
				if (!Util.isEmpty(registroC100.getRegistroC130())) {
					sb = GerarRegistroC130.gerar(registroC100.getRegistroC130(), sb);
					qtdRegistros++;
				}

				// REGISTROC140
				if (!Util.isEmpty(registroC100.getRegistroC140())) {
					sb = GerarRegistroC140.gerar(registroC100.getRegistroC140(), sb);

					// REGISTRO141
					if (!Util.isEmpty(registroC100.getRegistroC140().getRegistroC141())) {
						qtdRegistros += registroC100.getRegistroC140().getRegistroC141().stream().peek(registroC141 -> {
							sb = GerarRegistroC141.gerar(registroC141, sb);
						}).count();
					}
					qtdRegistros++;
				}

				// REGISTROC160
				if (!Util.isEmpty(registroC100.getRegistroC160())) {
					sb = GerarRegistroC160.gerar(registroC100.getRegistroC160(), sb);
					qtdRegistros++;
				}

				// REGISTROC165
				if (!Util.isEmpty(registroC100.getRegistroC165())) {
					qtdRegistros += registroC100.getRegistroC165().stream().peek(registroC165 -> {
						sb = GerarRegistroC165.gerar(registroC165, sb);
					}).count();
				}

				// REGISTROC170
				if (!Util.isEmpty(registroC100.getRegistroC170())) {
					registroC100.getRegistroC170().stream().forEach(registroC170 -> {
						sb = GerarRegistroC170.gerar(registroC170, sb);

						// REGISTROC171
						if (!Util.isEmpty(registroC170.getRegistroC171())) {
							qtdRegistros += registroC170.getRegistroC171().stream().peek(registroC171 -> {
								sb = GerarRegistroC171.gerar(registroC171, sb);
							}).count();
						}

						// REGISTROC172
						if (!Util.isEmpty(registroC170.getRegistroC172())) {
							sb = GerarRegistroC172.gerar(registroC170.getRegistroC172(), sb);
							qtdRegistros++;
						}

						// REGISTROC173
						if (!Util.isEmpty(registroC170.getRegistroC173())) {
							qtdRegistros += registroC170.getRegistroC173().stream().peek(registroC173 -> {
								sb = GerarRegistroC173.gerar(registroC173, sb);
							}).count();
						}

						// REGISTROC174
						if (!Util.isEmpty(registroC170.getRegistroC174())) {
							qtdRegistros += registroC170.getRegistroC174().stream().peek(registroC174 -> {
								sb = GerarRegistroC174.gerar(registroC174, sb);
							}).count();
						}

						// REGISTROC175
						if (!Util.isEmpty(registroC170.getRegistroC175())) {
							qtdRegistros += registroC170.getRegistroC175().stream().peek(registroC175 -> {
								sb = GerarRegistroC175.gerar(registroC175, sb);
							}).count();
						}

						// REGISTROC176
						if (!Util.isEmpty(registroC170.getRegistroC176())) {
							qtdRegistros += registroC170.getRegistroC176().stream().peek(registroC176 -> {
								sb = GerarRegistroC176.gerar(registroC176, sb);
							}).count();
						}

						// REGISTROC177
						if (!Util.isEmpty(registroC170.getRegistroC177())) {
							sb = GerarRegistroC177.gerar(registroC170.getRegistroC177(), sb);
							qtdRegistros++;
						}

						// REGISTROC178
						if (!Util.isEmpty(registroC170.getRegistroC178())) {
							sb = GerarRegistroC178.gerar(registroC170.getRegistroC178(), sb);
							qtdRegistros++;
						}

						// REGISTROC179
						if (!Util.isEmpty(registroC170.getRegistroC179())) {
							sb = GerarRegistroC179.gerar(registroC170.getRegistroC179(), sb);
							qtdRegistros++;
						}
						qtdRegistros++;
					});
				}

				// REGISTROC190
				if (!Util.isEmpty(registroC100.getRegistroC190())) {
					qtdRegistros += registroC100.getRegistroC190().stream().peek(registroC190 -> {
						sb = GerarRegistroC190.gerar(registroC190, sb);
					}).count();
				}

				// REGISTROC195
				if (!Util.isEmpty(registroC100.getRegistroC195())) {
					registroC100.getRegistroC195().stream().forEach(registroC195 -> {
						sb = GerarRegistroC195.gerar(registroC195, sb);

						// REGISTROC197
						if (!Util.isEmpty(registroC195.getRegistroC197())) {
							qtdRegistros += registroC195.getRegistroC197().stream().peek(registroC197 -> {
								sb = GerarRegistroC197.gerar(registroC197, sb);
							}).count();
						}
						qtdRegistros++;
					});
				}
				qtdRegistros++;
			});
		}

		// REGISTROC300
		if (!Util.isEmpty(blocoC.getRegistroC300())) {
			blocoC.getRegistroC300().stream().forEach(registroC300 -> {
				sb = GerarRegistroC300.gerar(registroC300, sb);

				// REGISTROC310
				if (!Util.isEmpty(registroC300.getRegistroC310())) {
					qtdRegistros += registroC300.getRegistroC310().stream().peek(registroC310 -> {
						sb = GerarRegistroC310.gerar(registroC310, sb);
					}).count();
				}

				// REGISTROC320
				if (!Util.isEmpty(registroC300.getRegistroC320())) {
					registroC300.getRegistroC320().stream().forEach(registroC320 -> {
						sb = GerarRegistroC320.gerar(registroC320, sb);

						// REGISTROC321
						if (!Util.isEmpty(registroC320.getRegistroC321())) {
							qtdRegistros += registroC320.getRegistroC321().stream().peek(registroC321 -> {
								sb = GerarRegistroC321.gerar(registroC321, sb);
							}).count();
						}
						qtdRegistros++;
					});
				}
				qtdRegistros++;
			});
		}

		// REGISTROC350
		if (!Util.isEmpty(blocoC.getRegistroC350())) {
			blocoC.getRegistroC350().stream().forEach(registroC350 -> {
				sb = GerarRegistroC350.gerar(registroC350, sb);

				// REGISTROC370
				if (!Util.isEmpty(registroC350.getRegistroC370())) {
					qtdRegistros += registroC350.getRegistroC370().stream().peek(registroC370 -> {
						sb = GerarRegistroC370.gerar(registroC370, sb);
					}).count();
				}

				// REGISTROC390
				if (!Util.isEmpty(registroC350.getRegistroC390())) {
					qtdRegistros += registroC350.getRegistroC390().stream().peek(registroC390 -> {
						sb = GerarRegistroC390.gerar(registroC390, sb);
					}).count();
				}

				qtdRegistros++;
			});
		}

		// REGISTROC400
		if (!Util.isEmpty(blocoC.getRegistroC400())) {
			blocoC.getRegistroC400().stream().forEach(registroC400 -> {
				sb = GerarRegistroC400.gerar(registroC400, sb);

				// REGISTROC405
				if (!Util.isEmpty(registroC400.getRegistroC405())) {
					registroC400.getRegistroC405().stream().forEach(registroC405 -> {
						sb = GerarRegistroC405.gerar(registroC405, sb);

						// REGISTROC410
						if (!Util.isEmpty(registroC405.getRegistroC410())) {
							sb = GerarRegistroC410.gerar(registroC405.getRegistroC410(), sb);
							qtdRegistros++;
						}

						// REGISTROC420
						if (!Util.isEmpty(registroC405.getRegistroC420())) {
							registroC405.getRegistroC420().stream().forEach(registroC420 -> {
								sb = GerarRegistroC420.gerar(registroC420, sb);

								// REGISTROC425
								if (!Util.isEmpty(registroC420.getRegistroC425())) {
									qtdRegistros += registroC420.getRegistroC425().stream().peek(registroC425 -> {
										sb = GerarRegistroC425.gerar(registroC425, sb);
									}).count();
								}

								qtdRegistros++;
							});
						}

						// REGISTROC460
						if (!Util.isEmpty(registroC405.getRegistroC460())) {
							registroC405.getRegistroC460().stream().forEach(registroC460 -> {
								sb = GerarRegistroC460.gerar(registroC460, sb);

								// REGISTROC465
								if (!Util.isEmpty(registroC460.getRegistroC465())) {
									sb = GerarRegistroC465.gerar(registroC460.getRegistroC465(), sb);
									qtdRegistros++;
								}

								// REGISTROC470
								if (!Util.isEmpty(registroC460.getRegistroC470())) {
									qtdRegistros += registroC460.getRegistroC470().stream().peek(registroC470 -> {
										sb = GerarRegistroC470.gerar(registroC470, sb);
									}).count();
								}

								qtdRegistros++;
							});
						}

						// REGISTROC490
						if (!Util.isEmpty(registroC405.getRegistroC490())) {
							qtdRegistros += registroC405.getRegistroC490().stream().peek(registroC490 -> {
								sb = GerarRegistroC490.gerar(registroC490, sb);
							}).count();
						}

						qtdRegistros++;
					});
				}

				qtdRegistros++;
			});
		}

		// REGISTROC495
		if (!Util.isEmpty(blocoC.getRegistroC495())) {
			qtdRegistros += blocoC.getRegistroC495().stream().peek(registroC495 -> {
				sb = GerarRegistroC495.gerar(registroC495, sb);
			}).count();
		}

		// REGISTROC500
		if (!Util.isEmpty(blocoC.getRegistroC500())) {
			blocoC.getRegistroC500().stream().forEach(registroC500 -> {
				sb = GerarRegistroC500.gerar(registroC500, sb);

				// REGISTROC510
				if (!Util.isEmpty(registroC500.getRegistroC510())) {
					qtdRegistros += registroC500.getRegistroC510().stream().peek(registroC510 -> {
						sb = GerarRegistroC510.gerar(registroC510, sb);
					}).count();
				}

				// REGISTROC590
				if (!Util.isEmpty(registroC500.getRegistroC590())) {
					qtdRegistros += registroC500.getRegistroC590().stream().peek(registroC590 -> {
						sb = GerarRegistroC590.gerar(registroC590, sb);
					}).count();
				}

				qtdRegistros++;
			});
		}

		// REGISTROC600
		if (!Util.isEmpty(blocoC.getRegistroC600())) {
			blocoC.getRegistroC600().stream().forEach(registroC600 -> {
				sb = GerarRegistroC600.gerar(registroC600, sb);

				// REGISTROC601
				if (!Util.isEmpty(registroC600.getRegistroC601())) {
					qtdRegistros += registroC600.getRegistroC601().stream().peek(registroC601 -> {
						sb = GerarRegistroC601.gerar(registroC601, sb);
					}).count();
				}

				// REGISTROC610
				if (!Util.isEmpty(registroC600.getRegistroC610())) {
					qtdRegistros += registroC600.getRegistroC610().stream().peek(registroC610 -> {
						sb = GerarRegistroC610.gerar(registroC610, sb);
					}).count();
				}

				// REGISTROC690
				if (!Util.isEmpty(registroC600.getRegistroC690())) {
					qtdRegistros += registroC600.getRegistroC690().stream().peek(registroC690 -> {
						sb = GerarRegistroC690.gerar(registroC690, sb);
					}).count();
				}

				qtdRegistros++;
			});
		}

		// REGISTROC700
		if (!Util.isEmpty(blocoC.getRegistroC700())) {
			blocoC.getRegistroC700().stream().forEach(registroC700 -> {
				sb = GerarRegistroC700.gerar(registroC700, sb);

				// REGISTROC790
				if (!Util.isEmpty(registroC700.getRegistroC790())) {
					registroC700.getRegistroC790().stream().forEach(registroC790 -> {
						sb = GerarRegistroC790.gerar(registroC790, sb);

						// REGISTROC791
						if (!Util.isEmpty(registroC790.getRegistroC791())) {
							qtdRegistros += registroC790.getRegistroC791().stream().peek(registroC791 -> {
								sb = GerarRegistroC791.gerar(registroC791, sb);
							}).count();
						}

						qtdRegistros++;
					});
				}
				qtdRegistros++;
			});
		}

		// REGISTROC800
		if (!Util.isEmpty(blocoC.getRegistroC800())) {
			blocoC.getRegistroC800().stream().forEach(registroC800 -> {
				sb = GerarRegistroC800.gerar(registroC800, sb);

				// REGISTROC850
				if (!Util.isEmpty(registroC800.getRegistroC850())) {
					qtdRegistros += registroC800.getRegistroC850().stream().peek(registroC850 -> {
						sb = GerarRegistroC850.gerar(registroC850, sb);
					}).count();
				}

				qtdRegistros++;
			});
		}

		// REGISTROC860
		if (!Util.isEmpty(blocoC.getRegistroC860())) {
			blocoC.getRegistroC860().stream().forEach(registroC860 -> {
				sb = GerarRegistroC860.gerar(registroC860, sb);

				// REGISTROC890
				if (!Util.isEmpty(registroC860.getRegistroC890())) {
					qtdRegistros += registroC860.getRegistroC890().stream().peek(registroC890 -> {
						sb = GerarRegistroC890.gerar(registroC890, sb);
					}).count();
				}

				qtdRegistros++;
			});
		}

		// REGISTROC990
		if (qtdRegistros > 0) {
			qtdRegistros++;
			RegistroC990 registroC990 = new RegistroC990();
			registroC990.setQtd_lin_c(String.valueOf(qtdRegistros));

			blocoC.setRegistroC990(registroC990);
			sb = GerarRegistroC990.gerar(blocoC.getRegistroC990(), sb);
		}

		return sb;
	}
}
