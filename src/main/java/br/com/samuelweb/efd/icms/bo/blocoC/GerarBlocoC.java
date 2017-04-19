/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.EfdIcms;
import br.com.samuelweb.efd.icms.registros.blocoC.BlocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.BlocoCEnum;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Yuri Lemes
 *
 */
public class GerarBlocoC {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EfdIcms efdIcms, StringBuilder sbr) {

		BlocoC blocoC = efdIcms.getBlocoC();
		sb = sbr;

		// REGISTROC001
		if (!Util.isEmpty(blocoC.getRegistroC001())) {
			sb = GerarRegistroC001.gerar(blocoC.getRegistroC001(), sb);
			efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC001);
		}

		// REGISTROC100
		if (!Util.isEmpty(blocoC.getRegistroC100())) {
			blocoC.getRegistroC100().stream().forEach(registroC100 -> {
				sb = GerarRegistroC100.gerar(registroC100, sb);
				efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC100);
				
				// REGISTROC101
				if (!Util.isEmpty(registroC100.getRegistroC101())) {
					sb = GerarRegistroC101.gerar(registroC100.getRegistroC101(), sb);
					efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC101);
				}

				// REGISTROC105
				if (!Util.isEmpty(registroC100.getRegistroC105())) {
					sb = GerarRegistroC105.gerar(registroC100.getRegistroC105(), sb);
					efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC105);
				}

				// REGISTROC110
				if (!Util.isEmpty(registroC100.getRegistroC110())) {
					registroC100.getRegistroC110().stream().forEach(registroC110 -> {
						sb = GerarRegistroC110.gerar(registroC110, sb);
						efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC110);

						// REGISTROC111
						if (!Util.isEmpty(registroC110.getRegistroC111())) {
							registroC110.getRegistroC111().stream().forEach(registroC111 -> {
								sb = GerarRegistroC111.gerar(registroC111, sb);
								efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC111);
							});
						}

						// REGISTROC112
						if (!Util.isEmpty(registroC110.getRegistroC112())) {
							registroC110.getRegistroC112().stream().forEach(registroC112 -> {
								sb = GerarRegistroC112.gerar(registroC112, sb);
								efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC112);
							});
						}

						// REGISTROC113
						if (!Util.isEmpty(registroC110.getRegistroC113())) {
							registroC110.getRegistroC113().stream().forEach(registroC113 -> {
								sb = GerarRegistroC113.gerar(registroC113, sb);
								efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC113);
							});
						}

						// REGISTROC114
						if (!Util.isEmpty(registroC110.getRegistroC114())) {
							registroC110.getRegistroC114().stream().forEach(registroC114 -> {
								sb = GerarRegistroC114.gerar(registroC114, sb);
								efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC114);
							});
						}

						// REGISTROC115
						if (!Util.isEmpty(registroC110.getRegistroC115())) {
							registroC110.getRegistroC115().stream().forEach(registroC115 -> {
								sb = GerarRegistroC115.gerar(registroC115, sb);
								efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC115);
							});
						}

						// REGISTROC116
						if (!Util.isEmpty(registroC110.getRegistroC116())) {
							registroC110.getRegistroC116().stream().forEach(registroC116 -> {
								sb = GerarRegistroC116.gerar(registroC116, sb);
								efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC116);
							});
						}
					});
				}

				// REGISTROC120
				if (!Util.isEmpty(registroC100.getRegistroC120())) {
					registroC100.getRegistroC120().stream().forEach(registroC120 -> {
						sb = GerarRegistroC120.gerar(registroC120, sb);
						efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC120);
					});
				}

				// REGISTROC130
				if (!Util.isEmpty(registroC100.getRegistroC130())) {
					sb = GerarRegistroC130.gerar(registroC100.getRegistroC130(), sb);
					efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC130);
				}

				// REGISTROC140
				if (!Util.isEmpty(registroC100.getRegistroC140())) {
					sb = GerarRegistroC140.gerar(registroC100.getRegistroC140(), sb);
					efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC140);

					// REGISTRO141
					if (!Util.isEmpty(registroC100.getRegistroC140().getRegistroC141())) {
						registroC100.getRegistroC140().getRegistroC141().stream().forEach(registroC141 -> {
							sb = GerarRegistroC141.gerar(registroC141, sb);
							efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC141);
						});
					}
				}

				// REGISTROC160
				if (!Util.isEmpty(registroC100.getRegistroC160())) {
					sb = GerarRegistroC160.gerar(registroC100.getRegistroC160(), sb);
					efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC160);
				}

				// REGISTROC165
				if (!Util.isEmpty(registroC100.getRegistroC165())) {
					registroC100.getRegistroC165().stream().forEach(registroC165 -> {
						sb = GerarRegistroC165.gerar(registroC165, sb);
						efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC165);
					});
				}

				// REGISTROC170
				if (!Util.isEmpty(registroC100.getRegistroC170())) {
					registroC100.getRegistroC170().stream().forEach(registroC170 -> {
						sb = GerarRegistroC170.gerar(registroC170, sb);
						efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC170);

						// REGISTROC171
						if (!Util.isEmpty(registroC170.getRegistroC171())) {
							registroC170.getRegistroC171().stream().forEach(registroC171 -> {
								sb = GerarRegistroC171.gerar(registroC171, sb);
								efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC171);
							});
						}

						// REGISTROC172
						if (!Util.isEmpty(registroC170.getRegistroC172())) {
							sb = GerarRegistroC172.gerar(registroC170.getRegistroC172(), sb);
							efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC172);
						}

						// REGISTROC173
						if (!Util.isEmpty(registroC170.getRegistroC173())) {
							registroC170.getRegistroC173().stream().forEach(registroC173 -> {
								sb = GerarRegistroC173.gerar(registroC173, sb);
								efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC173);
							});
						}

						// REGISTROC174
						if (!Util.isEmpty(registroC170.getRegistroC174())) {
							registroC170.getRegistroC174().stream().forEach(registroC174 -> {
								sb = GerarRegistroC174.gerar(registroC174, sb);
								efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC174);
							});
						}

						// REGISTROC175
						if (!Util.isEmpty(registroC170.getRegistroC175())) {
							registroC170.getRegistroC175().stream().forEach(registroC175 -> {
								sb = GerarRegistroC175.gerar(registroC175, sb);
								efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC175);
							});
						}

						// REGISTROC176
						if (!Util.isEmpty(registroC170.getRegistroC176())) {
							registroC170.getRegistroC176().stream().forEach(registroC176 -> {
								sb = GerarRegistroC176.gerar(registroC176, sb);
								efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC176);
							});
						}

						// REGISTROC177
						if (!Util.isEmpty(registroC170.getRegistroC177())) {
							sb = GerarRegistroC177.gerar(registroC170.getRegistroC177(), sb);
							efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC177);
						}

						// REGISTROC178
						if (!Util.isEmpty(registroC170.getRegistroC178())) {
							sb = GerarRegistroC178.gerar(registroC170.getRegistroC178(), sb);
							efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC178);
						}

						// REGISTROC179
						if (!Util.isEmpty(registroC170.getRegistroC179())) {
							sb = GerarRegistroC179.gerar(registroC170.getRegistroC179(), sb);
							efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC179);
						}
					});
				}

				// REGISTROC190
				if (!Util.isEmpty(registroC100.getRegistroC190())) {
					registroC100.getRegistroC190().stream().forEach(registroC190 -> {
						sb = GerarRegistroC190.gerar(registroC190, sb);
						efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC190);
					});
				}

				// REGISTROC195
				if (!Util.isEmpty(registroC100.getRegistroC195())) {
					registroC100.getRegistroC195().stream().forEach(registroC195 -> {
						sb = GerarRegistroC195.gerar(registroC195, sb);
						efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC195);

						// REGISTROC197
						if (!Util.isEmpty(registroC195.getRegistroC197())) {
							registroC195.getRegistroC197().stream().forEach(registroC197 -> {
								sb = GerarRegistroC197.gerar(registroC197, sb);
								efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC197);
							});
						}
					});
				}
			});
		}

		// REGISTROC300
		if (!Util.isEmpty(blocoC.getRegistroC300())) {
			blocoC.getRegistroC300().stream().forEach(registroC300 -> {
				sb = GerarRegistroC300.gerar(registroC300, sb);
				efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC300);

				// REGISTROC310
				if (!Util.isEmpty(registroC300.getRegistroC310())) {
					registroC300.getRegistroC310().stream().forEach(registroC310 -> {
						sb = GerarRegistroC310.gerar(registroC310, sb);
						efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC310);
					});
				}

				// REGISTROC320
				if (!Util.isEmpty(registroC300.getRegistroC320())) {
					registroC300.getRegistroC320().stream().forEach(registroC320 -> {
						sb = GerarRegistroC320.gerar(registroC320, sb);
						efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC320);

						// REGISTROC321
						if (!Util.isEmpty(registroC320.getRegistroC321())) {
							registroC320.getRegistroC321().stream().forEach(registroC321 -> {
								sb = GerarRegistroC321.gerar(registroC321, sb);
								efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC321);
							});
						}
					});
				}
			});
		}

		// REGISTROC350
		if (!Util.isEmpty(blocoC.getRegistroC350())) {
			blocoC.getRegistroC350().stream().forEach(registroC350 -> {
				sb = GerarRegistroC350.gerar(registroC350, sb);
				efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC350);

				// REGISTROC370
				if (!Util.isEmpty(registroC350.getRegistroC370())) {
					registroC350.getRegistroC370().stream().forEach(registroC370 -> {
						sb = GerarRegistroC370.gerar(registroC370, sb);
						efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC370);
					});
				}

				// REGISTROC390
				if (!Util.isEmpty(registroC350.getRegistroC390())) {
					registroC350.getRegistroC390().stream().forEach(registroC390 -> {
						sb = GerarRegistroC390.gerar(registroC390, sb);
						efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC390);
					});
				}

			});
		}

		// REGISTROC400
		if (!Util.isEmpty(blocoC.getRegistroC400())) {
			blocoC.getRegistroC400().stream().forEach(registroC400 -> {
				sb = GerarRegistroC400.gerar(registroC400, sb);
				efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC400);

				// REGISTROC405
				if (!Util.isEmpty(registroC400.getRegistroC405())) {
					registroC400.getRegistroC405().stream().forEach(registroC405 -> {
						sb = GerarRegistroC405.gerar(registroC405, sb);
						efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC405);

						// REGISTROC410
						if (!Util.isEmpty(registroC405.getRegistroC410())) {
							sb = GerarRegistroC410.gerar(registroC405.getRegistroC410(), sb);
							efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC410);
						}

						// REGISTROC420
						if (!Util.isEmpty(registroC405.getRegistroC420())) {
							registroC405.getRegistroC420().stream().forEach(registroC420 -> {
								sb = GerarRegistroC420.gerar(registroC420, sb);
								efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC420);

								// REGISTROC425
								if (!Util.isEmpty(registroC420.getRegistroC425())) {
									registroC420.getRegistroC425().stream().forEach(registroC425 -> {
										sb = GerarRegistroC425.gerar(registroC425, sb);
										efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC425);
									});
								}

							});
						}

						// REGISTROC460
						if (!Util.isEmpty(registroC405.getRegistroC460())) {
							registroC405.getRegistroC460().stream().forEach(registroC460 -> {
								sb = GerarRegistroC460.gerar(registroC460, sb);
								efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC460);

								// REGISTROC465
								if (!Util.isEmpty(registroC460.getRegistroC465())) {
									sb = GerarRegistroC465.gerar(registroC460.getRegistroC465(), sb);
									efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC465);
								}

								// REGISTROC470
								if (!Util.isEmpty(registroC460.getRegistroC470())) {
									registroC460.getRegistroC470().stream().forEach(registroC470 -> {
										sb = GerarRegistroC470.gerar(registroC470, sb);
										efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC470);
									});
								}

							});
						}

						// REGISTROC490
						if (!Util.isEmpty(registroC405.getRegistroC490())) {
							registroC405.getRegistroC490().stream().forEach(registroC490 -> {
								sb = GerarRegistroC490.gerar(registroC490, sb);
								efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC490);
							});
						}

					});
				}
			});
		}

		// REGISTROC495
		if (!Util.isEmpty(blocoC.getRegistroC495())) {
			blocoC.getRegistroC495().stream().forEach(registroC495 -> {
				sb = GerarRegistroC495.gerar(registroC495, sb);
				efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC495);
			});
		}

		// REGISTROC500
		if (!Util.isEmpty(blocoC.getRegistroC500())) {
			blocoC.getRegistroC500().stream().forEach(registroC500 -> {
				sb = GerarRegistroC500.gerar(registroC500, sb);
				efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC500);

				// REGISTROC510
				if (!Util.isEmpty(registroC500.getRegistroC510())) {
					registroC500.getRegistroC510().stream().forEach(registroC510 -> {
						sb = GerarRegistroC510.gerar(registroC510, sb);
						efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC510);
					});
				}

				// REGISTROC590
				if (!Util.isEmpty(registroC500.getRegistroC590())) {
					registroC500.getRegistroC590().stream().forEach(registroC590 -> {
						sb = GerarRegistroC590.gerar(registroC590, sb);
						efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC590);
					});
				}

			});
		}

		// REGISTROC600
		if (!Util.isEmpty(blocoC.getRegistroC600())) {
			blocoC.getRegistroC600().stream().forEach(registroC600 -> {
				sb = GerarRegistroC600.gerar(registroC600, sb);
				efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC600);

				// REGISTROC601
				if (!Util.isEmpty(registroC600.getRegistroC601())) {
					registroC600.getRegistroC601().stream().forEach(registroC601 -> {
						sb = GerarRegistroC601.gerar(registroC601, sb);
						efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC601);
					});
				}

				// REGISTROC610
				if (!Util.isEmpty(registroC600.getRegistroC610())) {
					registroC600.getRegistroC610().stream().forEach(registroC610 -> {
						sb = GerarRegistroC610.gerar(registroC610, sb);
						efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC610);
					});
				}

				// REGISTROC690
				if (!Util.isEmpty(registroC600.getRegistroC690())) {
					registroC600.getRegistroC690().stream().forEach(registroC690 -> {
						sb = GerarRegistroC690.gerar(registroC690, sb);
						efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC690);
					});
				}
			});
		}

		// REGISTROC700
		if (!Util.isEmpty(blocoC.getRegistroC700())) {
			blocoC.getRegistroC700().stream().forEach(registroC700 -> {
				sb = GerarRegistroC700.gerar(registroC700, sb);
				efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC700);

				// REGISTROC790
				if (!Util.isEmpty(registroC700.getRegistroC790())) {
					registroC700.getRegistroC790().stream().forEach(registroC790 -> {
						sb = GerarRegistroC790.gerar(registroC790, sb);
						efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC790);

						// REGISTROC791
						if (!Util.isEmpty(registroC790.getRegistroC791())) {
							registroC790.getRegistroC791().stream().forEach(registroC791 -> {
								sb = GerarRegistroC791.gerar(registroC791, sb);
								efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC791);
							});
						}

					});
				}
			});
		}

		// REGISTROC800
		if (!Util.isEmpty(blocoC.getRegistroC800())) {
			blocoC.getRegistroC800().stream().forEach(registroC800 -> {
				sb = GerarRegistroC800.gerar(registroC800, sb);
				efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC800);

				// REGISTROC850
				if (!Util.isEmpty(registroC800.getRegistroC850())) {
					registroC800.getRegistroC850().stream().forEach(registroC850 -> {
						sb = GerarRegistroC850.gerar(registroC850, sb);
						efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC850);
					});
				}
			});
		}

		// REGISTROC860
		if (!Util.isEmpty(blocoC.getRegistroC860())) {
			blocoC.getRegistroC860().stream().forEach(registroC860 -> {
				sb = GerarRegistroC860.gerar(registroC860, sb);
				efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC860);

				// REGISTROC890
				if (!Util.isEmpty(registroC860.getRegistroC890())) {
					registroC860.getRegistroC890().stream().forEach(registroC890 -> {
						sb = GerarRegistroC890.gerar(registroC890, sb);
						efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC890);
					});
				}

			});
		}

		// REGISTROC990
		if (efdIcms.getContadoresBlocoC().getContRegistroC990() > 0) {
			RegistroC990 registroC990 = new RegistroC990();
			registroC990.setQtd_lin_c(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC990()+1));

			blocoC.setRegistroC990(registroC990);
			sb = GerarRegistroC990.gerar(blocoC.getRegistroC990(), sb);
		}

		return sb;
	}
}
