/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.EfdIcms;
import br.com.swconsultoria.efd.icms.registros.blocoD.BlocoD;
import br.com.swconsultoria.efd.icms.registros.blocoD.BlocoDEnum;
import br.com.swconsultoria.efd.icms.registros.blocoD.RegistroD990;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Yuri Lemes, Sidnei Klein
 */
public class GerarBlocoD {

    private static StringBuilder sb = null;

    public static StringBuilder gerar(EfdIcms efdIcms, StringBuilder sbr) {
        BlocoD blocoD = efdIcms.getBlocoD();
        sb = sbr;

        // REGISTROD001
        if (!Util.isEmpty(blocoD.getRegistroD001())) {
            GerarRegistroD001.gerar(blocoD.getRegistroD001(), sb);
            efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD001);
        }

        // REGISTROD100
        if (!Util.isEmpty(blocoD.getRegistroD100())) {
            blocoD.getRegistroD100().forEach(registroD100 -> {
                GerarRegistroD100.gerar(registroD100, sb);
                efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD100);

                // REGISTROD101
                if (!Util.isEmpty(registroD100.getRegistroD101())) {
                    GerarRegistroD101.gerar(registroD100.getRegistroD101(), sb);
                    efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD101);
                }

                // REGISTROD110
                if (!Util.isEmpty(registroD100.getRegistroD110())) {
                    registroD100.getRegistroD110().forEach(registroD110 -> {
                        GerarRegistroD110.gerar(registroD110, sb);
                        efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD110);

                        // REGISTROD120
                        if (!Util.isEmpty(registroD110.getRegistroD120())) {
                            registroD110.getRegistroD120().forEach(registroD120 -> {
                                GerarRegistroD120.gerar(registroD120, sb);
                                efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD120);
                            });
                        }
                    });
                }

                // REGISTROD130
                if (!Util.isEmpty(registroD100.getRegistroD130())) {
                    registroD100.getRegistroD130().forEach(registroD130 -> {
                        GerarRegistroD130.gerar(registroD130, sb);
                        efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD130);
                    });
                }

                // REGISTROD140
                if (!Util.isEmpty(registroD100.getRegistroD140())) {
                    GerarRegistroD140.gerar(registroD100.getRegistroD140(), sb);
                    efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD140);
                }

                // REGISTROD150
                if (!Util.isEmpty(registroD100.getRegistroD150())) {
                    GerarRegistroD150.gerar(registroD100.getRegistroD150(), sb);
                    efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD150);
                }

                // REGISTROD160
                if (!Util.isEmpty(registroD100.getRegistroD160())) {
                    registroD100.getRegistroD160().forEach(registroD160 -> {
                        GerarRegistroD160.gerar(registroD160, sb);
                        efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD160);

                        // REGISTROD161
                        if (!Util.isEmpty(registroD160.getRegistroD161())) {
                            GerarRegistroD161.gerar(registroD160.getRegistroD161(), sb);
                            efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD161);
                        }

                        // REGISTROD162
                        if (!Util.isEmpty(registroD160.getRegistroD162())) {
                            registroD160.getRegistroD162().forEach(registroD162 -> {
                                GerarRegistroD162.gerar(registroD162, sb);
                                efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD162);
                            });
                        }

                    });
                }

                // REGISTROD170
                if (!Util.isEmpty(registroD100.getRegistroD170())) {
                    GerarRegistroD170.gerar(registroD100.getRegistroD170(), sb);
                    efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD170);
                }

                // REGISTROD180
                if (!Util.isEmpty(registroD100.getRegistroD180())) {
                    registroD100.getRegistroD180().forEach(registroD180 -> {
                        GerarRegistroD180.gerar(registroD180, sb);
                        efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD180);
                    });
                }

                // REGISTROD190
                if (!Util.isEmpty(registroD100.getRegistroD190())) {
                    registroD100.getRegistroD190().forEach(registroD190 -> {
                        GerarRegistroD190.gerar(registroD190, sb);
                        efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD190);
                    });
                }

                // REGISTROD195
                if (!Util.isEmpty(registroD100.getRegistroD195())) {
                    registroD100.getRegistroD195().forEach(registroD195 -> {
                        GerarRegistroD195.gerar(registroD195, sb);
                        efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD195);

                        // REGISTROD197
                        if (!Util.isEmpty(registroD195.getRegistroD197())) {
                            registroD195.getRegistroD197().forEach(registroD197 -> {
                                GerarRegistroD197.gerar(registroD197, sb);
                                efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD197);
                            });
                        }

                    });
                }

            });
        }

        // REGISTROD300
        if (!Util.isEmpty(blocoD.getRegistroD300())) {
            blocoD.getRegistroD300().forEach(registroD300 -> {
                GerarRegistroD300.gerar(registroD300, sb);
                efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD300);

                // REGISTROD301
                if (!Util.isEmpty(registroD300.getRegistroD301())) {
                    registroD300.getRegistroD301().forEach(registroD301 -> {
                        GerarRegistroD301.gerar(registroD301, sb);
                        efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD301);
                    });
                }

                // REGISTROD310
                if (!Util.isEmpty(registroD300.getRegistroD310())) {
                    registroD300.getRegistroD310().forEach(registroD310 -> {
                        GerarRegistroD310.gerar(registroD310, sb);
                        efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD310);
                    });
                }

            });
        }

        // REGISTROD350
        if (!Util.isEmpty(blocoD.getRegistroD350())) {
            blocoD.getRegistroD350().forEach(registroD350 -> {
                GerarRegistroD350.gerar(registroD350, sb);
                efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD350);

                // REGISTROD355
                if (!Util.isEmpty(registroD350.getRegistroD355())) {
                    registroD350.getRegistroD355().forEach(registroD355 -> {
                        GerarRegistroD355.gerar(registroD355, sb);
                        efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD355);

                        // REGISTROD360
                        if (!Util.isEmpty(registroD355.getRegistroD360())) {
                            GerarRegistroD360.gerar(registroD355.getRegistroD360(), sb);
                            efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD360);
                        }

                        // REGISTROD365
                        if (!Util.isEmpty(registroD355.getRegistroD365())) {
                            registroD355.getRegistroD365().forEach(registroD365 -> {
                                GerarRegistroD365.gerar(registroD365, sb);
                                efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD365);

                                // REGISTROD370
                                if (!Util.isEmpty(registroD365.getRegistroD370())) {
                                    registroD365.getRegistroD370().forEach(registroD370 -> {
                                        GerarRegistroD370.gerar(registroD370, sb);
                                        efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD370);
                                    });
                                }

                            });
                        }

                        // REGISTROD390
                        if (!Util.isEmpty(registroD355.getRegistroD390())) {
                            registroD355.getRegistroD390().forEach(registroD390 -> {
                                GerarRegistroD390.gerar(registroD390, sb);
                                efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD390);
                            });
                        }
                    });
                }
            });
        }

        //REGISTROD400
        if (!Util.isEmpty(blocoD.getRegistroD400())) {
            blocoD.getRegistroD400().forEach(registroD400 -> {
                GerarRegistroD400.gerar(registroD400, sb);
                efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD400);

                // REGISTROD410
                if (!Util.isEmpty(registroD400.getRegistroD410())) {
                    registroD400.getRegistroD410().forEach(registroD410 -> {
                        GerarRegistroD410.gerar(registroD410, sb);
                        efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD410);

                        // REGISTROD411
                        if (!Util.isEmpty(registroD410.getRegistroD411())) {
                            registroD410.getRegistroD411().forEach(registroD411 -> {
                                GerarRegistroD411.gerar(registroD411, sb);
                                efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD411);
                            });
                        }
                    });
                }

                // REGISTROD420
                if (!Util.isEmpty(registroD400.getRegistroD420())) {
                    registroD400.getRegistroD420().forEach(registroD420 -> {
                        GerarRegistroD420.gerar(registroD420, sb);
                        efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD420);
                    });
                }

            });
        }

        //REGISTROD500
        if (!Util.isEmpty(blocoD.getRegistroD500())) {
            blocoD.getRegistroD500().forEach(registroD500 -> {
                GerarRegistroD500.gerar(registroD500, sb);
                efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD500);

                // REGISTROD510
                if (!Util.isEmpty(registroD500.getRegistroD510())) {
                    registroD500.getRegistroD510().forEach(registroD510 -> {
                        GerarRegistroD510.gerar(registroD510, sb);
                        efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD510);
                    });
                }

                // REGISTROD530
                if (!Util.isEmpty(registroD500.getRegistroD530())) {
                    registroD500.getRegistroD530().forEach(registroD530 -> {
                        GerarRegistroD530.gerar(registroD530, sb);
                        efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD530);
                    });
                }

                // REGISTROD590
                if (!Util.isEmpty(registroD500.getRegistroD590())) {
                    registroD500.getRegistroD590().forEach(registroD590 -> {
                        GerarRegistroD590.gerar(registroD590, sb);
                        efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD590);
                    });
                }
            });
        }

        //REGISTROD600
        if (!Util.isEmpty(blocoD.getRegistroD600())) {
            blocoD.getRegistroD600().forEach(registroD600 -> {
                GerarRegistroD600.gerar(registroD600, sb);
                efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD600);

                // REGISTROD610
                if (!Util.isEmpty(registroD600.getRegistroD610())) {
                    registroD600.getRegistroD610().forEach(registroD610 -> {
                        GerarRegistroD610.gerar(registroD610, sb);
                        efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD610);
                    });
                }

                // REGISTROD690
                if (!Util.isEmpty(registroD600.getRegistroD690())) {
                    registroD600.getRegistroD690().forEach(registroD690 -> {
                        GerarRegistroD690.gerar(registroD690, sb);
                        efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD690);
                    });
                }
            });
        }

        //REGISTROD695
        if (!Util.isEmpty(blocoD.getRegistroD695())) {
            blocoD.getRegistroD695().forEach(registroD695 -> {
                GerarRegistroD695.gerar(registroD695, sb);
                efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD695);

                // REGISTROD696
                if (!Util.isEmpty(registroD695.getRegistroD696())) {
                    registroD695.getRegistroD696().forEach(registroD696 -> {
                        GerarRegistroD696.gerar(registroD696, sb);
                        efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD696);

                        // REGISTROD697
                        if (!Util.isEmpty(registroD696.getRegistroD697())) {
                            registroD696.getRegistroD697().forEach(registroD697 -> {
                                GerarRegistroD697.gerar(registroD697, sb);
                                efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD697);
                            });
                        }
                    });
                }
            });
        }

        //REGISTROD700
        if (Util.versao2023(efdIcms.getBloco0().getRegistro0000().getDt_ini()) &&
                !Util.isEmpty(blocoD.getRegistroD700())) {
            blocoD.getRegistroD700().forEach(registroD700 -> {
                GerarRegistroD700.gerar(efdIcms, registroD700, sb);
                efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD700);

                // REGISTROD730
                if (!Util.isEmpty(registroD700.getRegistroD730())) {
                    registroD700.getRegistroD730().forEach(registroD730 -> {
                        GerarRegistroD730.gerar(registroD730, sb);
                        efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD730);

                        // REGISTROD731
                        if (!Util.isEmpty(registroD730.getRegistroD731())) {
                            GerarRegistroD731.gerar(registroD730.getRegistroD731(), sb);
                            efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD731);
                        }
                    });
                }

                // REGISTROD735
                if (!Util.isEmpty(registroD700.getRegistroD735())) {
                    registroD700.getRegistroD735().forEach(registroD735 -> {
                        GerarRegistroD735.gerar(registroD735, sb);
                        efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD735);

                        // REGISTROD737
                        if (!Util.isEmpty(registroD735.getRegistroD737())) {
                            registroD735.getRegistroD737().forEach(registroD737 -> {
                                GerarRegistroD737.gerar(registroD737, sb);
                                efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD737);
                            });
                        }
                    });
                }
            });
        }

        //REGISTROD750
        if (Util.versao2023(efdIcms.getBloco0().getRegistro0000().getDt_ini()) &&
                !Util.isEmpty(blocoD.getRegistroD750())) {
            blocoD.getRegistroD750().forEach(registroD750 -> {
                GerarRegistroD750.gerar(efdIcms, registroD750, sb);
                efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD750);

                // REGISTROD730
                if (!Util.isEmpty(registroD750.getRegistroD760())) {
                    registroD750.getRegistroD760().forEach(registroD760 -> {
                        GerarRegistroD760.gerar(registroD760, sb);
                        efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD760);

                        // REGISTROD731
                        if (!Util.isEmpty(registroD760.getRegistroD761())) {
                            GerarRegistroD761.gerar(registroD760.getRegistroD761(), sb);
                            efdIcms.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD761);
                        }
                    });
                }
            });
        }

        // REGISTROD990
        if (efdIcms.getContadoresBlocoD().getContRegistroD990() > 0) {
            RegistroD990 registroD990 = new RegistroD990();
            registroD990.setQtd_lin_d(String.valueOf(efdIcms.getContadoresBlocoD().getContRegistroD990() + 1));

            blocoD.setRegistroD990(registroD990);
            GerarRegistroD990.gerar(blocoD.getRegistroD990(), sb);
        }

        return sb;
    }
}
