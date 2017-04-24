/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.EfdIcms;
import br.com.samuelweb.efd.icms.registros.blocoD.BlocoD;
import br.com.samuelweb.efd.icms.registros.blocoD.BlocoDEnum;
import br.com.samuelweb.efd.icms.registros.blocoD.GerarRegistroD600;
import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Yuri Lemes
 *
 */
public class GerarBlocoD {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EfdIcms efdIcms, StringBuilder sbr) {
		BlocoD blocoD = efdIcms.getBlocoD();
		sb = sbr;
		
		// REGISTROD001
		if (!Util.isEmpty(blocoD.getRegistroD001())) {
			sb = GerarRegistroD001.gerar(blocoD.getRegistroD001(), sb);
			efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD001);
		}

		// REGISTROD100
		if (!Util.isEmpty(blocoD.getRegistroD100())) {
			blocoD.getRegistroD100().stream().forEach(registroD100 -> {
				sb = GerarRegistroD100.gerar(registroD100, sb);
				efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD100);
				
				// REGISTROD101
				if (!Util.isEmpty(registroD100.getRegistroD101())) {
					sb = GerarRegistroD101.gerar(registroD100.getRegistroD101(), sb);
					efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD101);
				}

				// REGISTROD110
				if (!Util.isEmpty(registroD100.getRegistroD110())) {
					registroD100.getRegistroD110().stream().forEach(registroD110 -> {
						sb = GerarRegistroD110.gerar(registroD110, sb);
						efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD110);

						// REGISTROD120
						if (!Util.isEmpty(registroD110.getRegistroD120())) {
							registroD110.getRegistroD120().stream().peek(registroD120 -> {
								sb = GerarRegistroD120.gerar(registroD120, sb);
								efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD120);
							});
						}
					});
				}

				// REGISTROD130
				if (!Util.isEmpty(registroD100.getRegistroD130())) {
					registroD100.getRegistroD130().stream().peek(registroD130 -> {
						sb = GerarRegistroD130.gerar(registroD130, sb);
						efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD130);
					});
				}

				// REGISTROD140
				if (!Util.isEmpty(registroD100.getRegistroD140())) {
					sb = GerarRegistroD140.gerar(registroD100.getRegistroD140(), sb);
					efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD140);
				}

				// REGISTROD150
				if (!Util.isEmpty(registroD100.getRegistroD150())) {
					sb = GerarRegistroD150.gerar(registroD100.getRegistroD150(), sb);
					efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD150);
				}

				// REGISTROD160
				if (!Util.isEmpty(registroD100.getRegistroD160())) {
					registroD100.getRegistroD160().stream().forEach(registroD160 -> {
						sb = GerarRegistroD160.gerar(registroD160, sb);
						efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD160);

						// REGISTROD161
						if (!Util.isEmpty(registroD160.getRegistroD161())) {
							sb = GerarRegistroD161.gerar(registroD160.getRegistroD161(), sb);
							efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD161);
						}

						// REGISTROD162
						if (!Util.isEmpty(registroD160.getRegistroD162())) {
							registroD160.getRegistroD162().stream().peek(registroD162 -> {
								sb = GerarRegistroD162.gerar(registroD162, sb);
								efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD162);
							});
						}

					});
				}

				// REGISTROD170
				if (!Util.isEmpty(registroD100.getRegistroD170())) {
					sb = GerarRegistroD170.gerar(registroD100.getRegistroD170(), sb);
					efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD170);
				}

				// REGISTROD180
				if (!Util.isEmpty(registroD100.getRegistroD180())) {
					registroD100.getRegistroD180().stream().peek(registroD180 -> {
						sb = GerarRegistroD180.gerar(registroD180, sb);
						efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD180);
					});
				}

				// REGISTROD190
				if (!Util.isEmpty(registroD100.getRegistroD190())) {
					registroD100.getRegistroD190().stream().peek(registroD190 -> {
						sb = GerarRegistroD190.gerar(registroD190, sb);
						efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD190);
					});
				}

				// REGISTROD195
				if (!Util.isEmpty(registroD100.getRegistroD195())) {
					registroD100.getRegistroD195().stream().forEach(registroD195 -> {
						sb = GerarRegistroD195.gerar(registroD195, sb);
						efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD195);

						// REGISTROD197
						if (!Util.isEmpty(registroD195.getRegistroD197())) {
							registroD195.getRegistroD197().stream().peek(registroD197 -> {
								sb = GerarRegistroD197.gerar(registroD197, sb);
								efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD197);
							});
						}

					});
				}

			});
		}

		// REGISTROD300
		if (!Util.isEmpty(blocoD.getRegistroD300())) {
			blocoD.getRegistroD300().stream().forEach(registroD300 -> {
				sb = GerarRegistroD300.gerar(registroD300, sb);
				efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD300);

				// REGISTROD301
				if (!Util.isEmpty(registroD300.getRegistroD301())) {
					registroD300.getRegistroD301().stream().peek(registroD301 -> {
						sb = GerarRegistroD301.gerar(registroD301, sb);
						efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD301);
					});
				}

				// REGISTROD310
				if (!Util.isEmpty(registroD300.getRegistroD310())) {
					registroD300.getRegistroD310().stream().peek(registroD310 -> {
						sb = GerarRegistroD310.gerar(registroD310, sb);
						efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD310);
					});
				}

			});
		}

		// REGISTROD350
		if (!Util.isEmpty(blocoD.getRegistroD350())) {
			blocoD.getRegistroD350().stream().forEach(registroD350 -> {
				sb = GerarRegistroD350.gerar(registroD350, sb);
				efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD350);

				// REGISTROD355
				if (!Util.isEmpty(registroD350.getRegistroD355())) {
					registroD350.getRegistroD355().stream().forEach(registroD355 -> {
						sb = GerarRegistroD355.gerar(registroD355, sb);
						efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD355);

						// REGISTROD360
						if (!Util.isEmpty(registroD355.getRegistroD360())) {
							sb = GerarRegistroD360.gerar(registroD355.getRegistroD360(), sb);
							efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD360);
						}

						// REGISTROD365
						if (!Util.isEmpty(registroD355.getRegistroD365())) {
							registroD355.getRegistroD365().stream().forEach(registroD365 -> {
								sb = GerarRegistroD365.gerar(registroD365, sb);
								efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD365);

								// REGISTROD370
								if (!Util.isEmpty(registroD365.getRegistroD370())) {
									registroD365.getRegistroD370().stream().peek(registroD370 -> {
										sb = GerarRegistroD370.gerar(registroD370, sb);
										efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD370);
									});
								}

							});
						}

						// REGISTROD390
						if (!Util.isEmpty(registroD355.getRegistroD390())) {
							registroD355.getRegistroD390().stream().peek(registroD390 -> {
								sb = GerarRegistroD390.gerar(registroD390, sb);
								efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD390);
							});
						}
					});
				}
			});
		}
		
		//REGISTROD400
		if(!Util.isEmpty(blocoD.getRegistroD400())){
			blocoD.getRegistroD400().stream().forEach(registroD400 -> {
				sb = GerarRegistroD400.gerar(registroD400, sb);
				efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD400);
				
				// REGISTROD410
				if (!Util.isEmpty(registroD400.getRegistroD410())) {
					registroD400.getRegistroD410().stream().forEach(registroD410 -> {
						sb = GerarRegistroD410.gerar(registroD410, sb);
						efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD410);
						
						// REGISTROD411
						if (!Util.isEmpty(registroD410.getRegistroD411())) {
							registroD410.getRegistroD411().stream().peek(registroD411 -> {
								sb = GerarRegistroD411.gerar(registroD411, sb);
								efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD411);
							});
						}
					});
				}
				
				// REGISTROD420
				if (!Util.isEmpty(registroD400.getRegistroD420())) {
					registroD400.getRegistroD420().stream().peek(registroD420 -> {
						sb = GerarRegistroD420.gerar(registroD420, sb);
						efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD420);
					});
				}
				
			}); 
		}
		
		//REGISTROD500
		if(!Util.isEmpty(blocoD.getRegistroD500())){
			blocoD.getRegistroD500().stream().forEach(registroD500 -> {
				sb = GerarRegistroD500.gerar(registroD500, sb);
				efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD500);
				
				// REGISTROD510
				if (!Util.isEmpty(registroD500.getRegistroD510())) {
					registroD500.getRegistroD510().stream().peek(registroD510 -> {
						sb = GerarRegistroD510.gerar(registroD510, sb);
						efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD510);
					});
				}
				
				// REGISTROD530
				if (!Util.isEmpty(registroD500.getRegistroD530())) {
					registroD500.getRegistroD530().stream().peek(registroD530 -> {
						sb = GerarRegistroD530.gerar(registroD530, sb);
						efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD530);
					});
				}
				
				// REGISTROD590
				if (!Util.isEmpty(registroD500.getRegistroD590())) {
					registroD500.getRegistroD590().stream().peek(registroD590 -> {
						sb = GerarRegistroD590.gerar(registroD590, sb);
						efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD590);
					});
				}
			}); 
		}
		
		//REGISTROD600
		if(!Util.isEmpty(blocoD.getRegistroD600())){
			blocoD.getRegistroD600().stream().forEach(registroD600 -> {
				sb = GerarRegistroD600.gerar(registroD600, sb);
				efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD600);
				
				// REGISTROD610
				if (!Util.isEmpty(registroD600.getRegistroD610())) {
					registroD600.getRegistroD610().stream().peek(registroD610 -> {
						sb = GerarRegistroD610.gerar(registroD610, sb);
						efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD610);
					});
				}
				
				// REGISTROD690
				if (!Util.isEmpty(registroD600.getRegistroD690())) {
					registroD600.getRegistroD690().stream().peek(registroD690 -> {
						sb = GerarRegistroD690.gerar(registroD690, sb);
						efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD690);
					});
				}
			}); 
		}

		//REGISTROD695
		if(!Util.isEmpty(blocoD.getRegistroD695())){
			blocoD.getRegistroD695().stream().forEach(registroD695 -> {
				sb = GerarRegistroD695.gerar(registroD695, sb);
				efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD695);
						
				// REGISTROD696
				if (!Util.isEmpty(registroD695.getRegistroD696())) {
					registroD695.getRegistroD696().stream().forEach(registroD696 -> {
						sb = GerarRegistroD696.gerar(registroD696, sb);
						efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD696);
						
						// REGISTROD697
						if (!Util.isEmpty(registroD696.getRegistroD697())) {
							registroD696.getRegistroD697().stream().peek(registroD697 -> {
								sb = GerarRegistroD697.gerar(registroD697, sb);
								efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD697);
							});
						}
					});
				}
			}); 
		}

		// REGISTROD990
		if (efdIcms.getContadoresBlocoD().getContRegistroD990() > 0) {
			RegistroD990 registroD990 = new RegistroD990();
			registroD990.setQtd_lin_d(String.valueOf(efdIcms.getContadoresBlocoD().getContRegistroD990()+1));

			blocoD.setRegistroD990(registroD990);
			sb = GerarRegistroD990.gerar(blocoD.getRegistroD990(), sb);
		}

		return sb;
	}
}
