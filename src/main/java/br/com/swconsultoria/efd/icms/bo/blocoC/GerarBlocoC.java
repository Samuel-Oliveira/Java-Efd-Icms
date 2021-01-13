/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.EfdIcms;
import br.com.swconsultoria.efd.icms.registros.blocoC.BlocoC;
import br.com.swconsultoria.efd.icms.registros.blocoC.BlocoCEnum;
import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC990;
import br.com.swconsultoria.efd.icms.util.Util;

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
            GerarRegistroC001.gerar(blocoC.getRegistroC001(), sb);
            efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC001);
        }

        // REGISTROC100
        if (!Util.isEmpty(blocoC.getRegistroC100())) {
            blocoC.getRegistroC100().forEach(registroC100 -> {
                GerarRegistroC100.gerar(registroC100, sb);
                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC100);

                // REGISTROC101
                if (!Util.isEmpty(registroC100.getRegistroC101())) {
                    GerarRegistroC101.gerar(registroC100.getRegistroC101(), sb);
                    efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC101);
                }

                // REGISTROC105
                if (!Util.isEmpty(registroC100.getRegistroC105())) {
                    GerarRegistroC105.gerar(registroC100.getRegistroC105(), sb);
                    efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC105);
                }

                // REGISTROC110
                if (!Util.isEmpty(registroC100.getRegistroC110())) {
                    registroC100.getRegistroC110().forEach(registroC110 -> {
                        GerarRegistroC110.gerar(registroC110, sb);
                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC110);

                        // REGISTROC111
                        if (!Util.isEmpty(registroC110.getRegistroC111())) {
                            registroC110.getRegistroC111().forEach(registroC111 -> {
                                GerarRegistroC111.gerar(registroC111, sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC111);
                            });
                        }

                        // REGISTROC112
                        if (!Util.isEmpty(registroC110.getRegistroC112())) {
                            registroC110.getRegistroC112().forEach(registroC112 -> {
                                GerarRegistroC112.gerar(registroC112, sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC112);
                            });
                        }

                        // REGISTROC113
                        if (!Util.isEmpty(registroC110.getRegistroC113())) {
                            registroC110.getRegistroC113().forEach(registroC113 -> {
                                GerarRegistroC113.gerar(registroC113, sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC113);
                            });
                        }

                        // REGISTROC114
                        if (!Util.isEmpty(registroC110.getRegistroC114())) {
                            registroC110.getRegistroC114().forEach(registroC114 -> {
                                GerarRegistroC114.gerar(registroC114, sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC114);
                            });
                        }

                        // REGISTROC115
                        if (!Util.isEmpty(registroC110.getRegistroC115())) {
                            registroC110.getRegistroC115().forEach(registroC115 -> {
                                GerarRegistroC115.gerar(registroC115, sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC115);
                            });
                        }

                        // REGISTROC116
                        if (!Util.isEmpty(registroC110.getRegistroC116())) {
                            registroC110.getRegistroC116().forEach(registroC116 -> {
                                GerarRegistroC116.gerar(registroC116, sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC116);
                            });
                        }
                    });
                }

                // REGISTROC120
                if (!Util.isEmpty(registroC100.getRegistroC120())) {
                    registroC100.getRegistroC120().forEach(registroC120 -> {
                        GerarRegistroC120.gerar(registroC120, sb);
                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC120);
                    });
                }

                // REGISTROC130
                if (!Util.isEmpty(registroC100.getRegistroC130())) {
                    GerarRegistroC130.gerar(registroC100.getRegistroC130(), sb);
                    efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC130);
                }

                // REGISTROC140
                if (!Util.isEmpty(registroC100.getRegistroC140())) {
                    GerarRegistroC140.gerar(registroC100.getRegistroC140(), sb);
                    efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC140);

                    // REGISTRO141
                    if (!Util.isEmpty(registroC100.getRegistroC140().getRegistroC141())) {
                        registroC100.getRegistroC140().getRegistroC141().forEach(registroC141 -> {
                            GerarRegistroC141.gerar(registroC141, sb);
                            efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC141);
                        });
                    }
                }

                // REGISTROC160
                if (!Util.isEmpty(registroC100.getRegistroC160())) {
                    GerarRegistroC160.gerar(registroC100.getRegistroC160(), sb);
                    efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC160);
                }

                // REGISTROC165
                if (!Util.isEmpty(registroC100.getRegistroC165())) {
                    registroC100.getRegistroC165().forEach(registroC165 -> {
                        GerarRegistroC165.gerar(registroC165, sb);
                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC165);
                    });
                }

                // REGISTROC170
                if (!Util.isEmpty(registroC100.getRegistroC170())) {
                    registroC100.getRegistroC170().forEach(registroC170 -> {
                        GerarRegistroC170.gerar(registroC170, sb);
                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC170);

                        // REGISTROC171
                        if (!Util.isEmpty(registroC170.getRegistroC171())) {
                            registroC170.getRegistroC171().forEach(registroC171 -> {
                                GerarRegistroC171.gerar(registroC171, sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC171);
                            });
                        }

                        // REGISTROC172
                        if (!Util.isEmpty(registroC170.getRegistroC172())) {
                            GerarRegistroC172.gerar(registroC170.getRegistroC172(), sb);
                            efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC172);
                        }

                        // REGISTROC173
                        if (!Util.isEmpty(registroC170.getRegistroC173())) {
                            registroC170.getRegistroC173().forEach(registroC173 -> {
                                GerarRegistroC173.gerar(registroC173, sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC173);
                            });
                        }

                        // REGISTROC174
                        if (!Util.isEmpty(registroC170.getRegistroC174())) {
                            registroC170.getRegistroC174().forEach(registroC174 -> {
                                GerarRegistroC174.gerar(registroC174, sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC174);
                            });
                        }

                        // REGISTROC175
                        if (!Util.isEmpty(registroC170.getRegistroC175())) {
                            registroC170.getRegistroC175().forEach(registroC175 -> {
                                GerarRegistroC175.gerar(registroC175, sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC175);
                            });
                        }

                        // REGISTROC176
                        if (!Util.isEmpty(registroC170.getRegistroC176())) {
                            registroC170.getRegistroC176().forEach(registroC176 -> {
                                GerarRegistroC176.gerar(registroC176, sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC176);
                            });
                        }

                        // REGISTROC177
                        if (!Util.isEmpty(registroC170.getRegistroC177())) {
                            GerarRegistroC177.gerar(registroC170.getRegistroC177(), sb);
                            efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC177);
                        }

                        // REGISTROC178
                        if (!Util.isEmpty(registroC170.getRegistroC178())) {
                            GerarRegistroC178.gerar(registroC170.getRegistroC178(), sb);
                            efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC178);
                        }

                        // REGISTROC179
                        if (!Util.isEmpty(registroC170.getRegistroC179())) {
                            GerarRegistroC179.gerar(registroC170.getRegistroC179(), sb);
                            efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC179);
                        }

                        if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
                            // REGISTROC180
                            if (!Util.isEmpty(registroC170.getRegistroC180())) {
                                GerarRegistroC180.gerar(registroC170.getRegistroC180(), sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC180);
                            }
                        }
                        if (Util.versao2021(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
                            // REGISTROC181
                            if (!Util.isEmpty(registroC170.getRegistroC181())) {
                                registroC170.getRegistroC181().forEach(registroC181 -> {
                                    GerarRegistroC181.gerar(registroC181, sb);
                                    efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC181);
                                });
                            }
                        }
                    });
                }

                if (Util.versao2021(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
                    // REGISTROC186
                    if (!Util.isEmpty(registroC100.getRegistroC186())) {
                        registroC100.getRegistroC186().forEach(registroC186 -> {
                            GerarRegistroC186.gerar(registroC186, sb);
                            efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC186);
                        });
                    }
                }

                // REGISTROC190
                if (!Util.isEmpty(registroC100.getRegistroC190())) {
                    registroC100.getRegistroC190().forEach(registroC190 -> {
                        GerarRegistroC190.gerar(registroC190, sb);
                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC190);

                        //REGISTROC191
                        if (!Util.isEmpty(registroC190.getRegistroC191())) {
                            GerarRegistroC191.gerar(registroC190.getRegistroC191(), sb);
                            efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC191);
                        }
                    });
                }

                if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
                    // REGISTROC185
                    if (!Util.isEmpty(registroC100.getRegistroC185())) {
                        registroC100.getRegistroC185().forEach(registroC185 -> {
                            GerarRegistroC185.gerar(registroC185, sb);
                            efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC185);
                        });
                    }
                }

                // REGISTROC195
                if (!Util.isEmpty(registroC100.getRegistroC195())) {
                    registroC100.getRegistroC195().forEach(registroC195 -> {
                        GerarRegistroC195.gerar(registroC195, sb);
                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC195);

                        // REGISTROC197
                        if (!Util.isEmpty(registroC195.getRegistroC197())) {
                            registroC195.getRegistroC197().forEach(registroC197 -> {
                                GerarRegistroC197.gerar(registroC197, sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC197);
                            });
                        }
                    });
                }
            });
        }

        // REGISTROC300
        if (!Util.isEmpty(blocoC.getRegistroC300())) {
            blocoC.getRegistroC300().forEach(registroC300 -> {
                GerarRegistroC300.gerar(registroC300, sb);
                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC300);

                // REGISTROC310
                if (!Util.isEmpty(registroC300.getRegistroC310())) {
                    registroC300.getRegistroC310().forEach(registroC310 -> {
                        GerarRegistroC310.gerar(registroC310, sb);
                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC310);
                    });
                }

                // REGISTROC320
                if (!Util.isEmpty(registroC300.getRegistroC320())) {
                    registroC300.getRegistroC320().forEach(registroC320 -> {
                        GerarRegistroC320.gerar(registroC320, sb);
                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC320);

                        // REGISTROC321
                        if (!Util.isEmpty(registroC320.getRegistroC321())) {
                            registroC320.getRegistroC321().forEach(registroC321 -> {
                                GerarRegistroC321.gerar(registroC321, sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC321);

                                if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
                                    //REGISTROC330
                                    if (!Util.isEmpty(registroC321.getRegistroC330())) {
                                        GerarRegistroC330.gerar(registroC321.getRegistroC330(), sb);
                                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC330);
                                    }
                                }
                            });
                        }
                    });
                }
            });
        }

        // REGISTROC350
        if (!Util.isEmpty(blocoC.getRegistroC350())) {
            blocoC.getRegistroC350().forEach(registroC350 -> {
                GerarRegistroC350.gerar(registroC350, sb);
                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC350);

                // REGISTROC370
                if (!Util.isEmpty(registroC350.getRegistroC370())) {
                    registroC350.getRegistroC370().forEach(registroC370 -> {
                        GerarRegistroC370.gerar(registroC370, sb);
                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC370);
                        if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
                            //REGISTROC380
                            if (!Util.isEmpty(registroC370.getRegistroC380())) {
                                GerarRegistroC380.gerar(registroC370.getRegistroC380(), sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC380);
                            }
                        }
                    });
                }

                // REGISTROC390
                if (!Util.isEmpty(registroC350.getRegistroC390())) {
                    registroC350.getRegistroC390().forEach(registroC390 -> {
                        GerarRegistroC390.gerar(registroC390, sb);
                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC390);
                    });
                }

            });
        }

        // REGISTROC400
        if (!Util.isEmpty(blocoC.getRegistroC400())) {
            blocoC.getRegistroC400().forEach(registroC400 -> {
                GerarRegistroC400.gerar(registroC400, sb);
                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC400);

                // REGISTROC405
                if (!Util.isEmpty(registroC400.getRegistroC405())) {
                    registroC400.getRegistroC405().forEach(registroC405 -> {
                        GerarRegistroC405.gerar(registroC405, sb);
                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC405);

                        // REGISTROC410
                        if (!Util.isEmpty(registroC405.getRegistroC410())) {
                            GerarRegistroC410.gerar(registroC405.getRegistroC410(), sb);
                            efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC410);
                        }

                        // REGISTROC420
                        if (!Util.isEmpty(registroC405.getRegistroC420())) {
                            registroC405.getRegistroC420().forEach(registroC420 -> {
                                GerarRegistroC420.gerar(registroC420, sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC420);

                                // REGISTROC425
                                if (!Util.isEmpty(registroC420.getRegistroC425())) {
                                    registroC420.getRegistroC425().forEach(registroC425 -> {
                                        GerarRegistroC425.gerar(registroC425, sb);
                                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC425);

                                        if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
                                            // REGISTROC430
                                            if (!Util.isEmpty(registroC425.getRegistroC430())) {
                                                GerarRegistroC430.gerar(registroC425.getRegistroC430(), sb);
                                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC430);
                                            }
                                        }
                                    });
                                }

                            });
                        }

                        // REGISTROC460
                        if (!Util.isEmpty(registroC405.getRegistroC460())) {
                            registroC405.getRegistroC460().forEach(registroC460 -> {
                                GerarRegistroC460.gerar(registroC460, sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC460);

                                // REGISTROC465
                                if (!Util.isEmpty(registroC460.getRegistroC465())) {
                                    GerarRegistroC465.gerar(registroC460.getRegistroC465(), sb);
                                    efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC465);
                                }

                                // REGISTROC470
                                if (!Util.isEmpty(registroC460.getRegistroC470())) {
                                    registroC460.getRegistroC470().forEach(registroC470 -> {
                                        GerarRegistroC470.gerar(registroC470, sb);
                                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC470);

                                        if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
                                            // REGISTROC480
                                            if (!Util.isEmpty(registroC470.getRegistroC480())) {
                                                GerarRegistroC480.gerar(registroC470.getRegistroC480(), sb);
                                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC480);
                                            }
                                        }
                                    });
                                }

                            });
                        }

                        // REGISTROC490
                        if (!Util.isEmpty(registroC405.getRegistroC490())) {
                            registroC405.getRegistroC490().forEach(registroC490 -> {
                                GerarRegistroC490.gerar(registroC490, sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC490);
                            });
                        }

                    });
                }
            });
        }

        // REGISTROC495
        if (!Util.isEmpty(blocoC.getRegistroC495())) {
            blocoC.getRegistroC495().forEach(registroC495 -> {
                GerarRegistroC495.gerar(registroC495, sb);
                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC495);
            });
        }

        // REGISTROC500
        if (!Util.isEmpty(blocoC.getRegistroC500())) {
            blocoC.getRegistroC500().forEach(registroC500 -> {
                GerarRegistroC500.gerar(efdIcms, registroC500, sb);
                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC500);

                // REGISTROC510
                if (!Util.isEmpty(registroC500.getRegistroC510())) {
                    registroC500.getRegistroC510().forEach(registroC510 -> {
                        GerarRegistroC510.gerar(registroC510, sb);
                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC510);
                    });
                }

                // REGISTROC590
                if (!Util.isEmpty(registroC500.getRegistroC590())) {
                    registroC500.getRegistroC590().forEach(registroC590 -> {
                        GerarRegistroC590.gerar(registroC590, sb);
                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC590);

                        if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
                            // REGISTROC591
                            if (!Util.isEmpty(registroC590.getRegistroC591())) {
                                GerarRegistroC591.gerar(registroC590.getRegistroC591(), sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC591);
                            }
                        }
                    });
                }

                if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
                    // REGISTROC595
                    if (!Util.isEmpty(registroC500.getRegistroC595())) {
                        registroC500.getRegistroC595().forEach(registroC595 -> {
                            GerarRegistroC595.gerar(registroC595, sb);
                            efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC595);

                            // REGISTROC597
                            if (!Util.isEmpty(registroC595.getRegistroC597())) {
                                registroC595.getRegistroC597().forEach(registroC597 -> {
                                    GerarRegistroC597.gerar(registroC597, sb);
                                    efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC597);
                                });
                            }
                        });
                    }
                }
            });
        }

        // REGISTROC600
        if (!Util.isEmpty(blocoC.getRegistroC600())) {
            blocoC.getRegistroC600().forEach(registroC600 -> {
                GerarRegistroC600.gerar(registroC600, sb);
                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC600);

                // REGISTROC601
                if (!Util.isEmpty(registroC600.getRegistroC601())) {
                    registroC600.getRegistroC601().forEach(registroC601 -> {
                        GerarRegistroC601.gerar(registroC601, sb);
                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC601);
                    });
                }

                // REGISTROC610
                if (!Util.isEmpty(registroC600.getRegistroC610())) {
                    registroC600.getRegistroC610().forEach(registroC610 -> {
                        GerarRegistroC610.gerar(registroC610, sb);
                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC610);
                    });
                }

                // REGISTROC690
                if (!Util.isEmpty(registroC600.getRegistroC690())) {
                    registroC600.getRegistroC690().forEach(registroC690 -> {
                        GerarRegistroC690.gerar(registroC690, sb);
                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC690);
                    });
                }
            });
        }

        // REGISTROC700
        if (!Util.isEmpty(blocoC.getRegistroC700())) {
            blocoC.getRegistroC700().forEach(registroC700 -> {
                GerarRegistroC700.gerar(registroC700, sb);
                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC700);

                // REGISTROC790
                if (!Util.isEmpty(registroC700.getRegistroC790())) {
                    registroC700.getRegistroC790().forEach(registroC790 -> {
                        GerarRegistroC790.gerar(registroC790, sb);
                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC790);

                        // REGISTROC791
                        if (!Util.isEmpty(registroC790.getRegistroC791())) {
                            registroC790.getRegistroC791().forEach(registroC791 -> {
                                GerarRegistroC791.gerar(registroC791, sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC791);
                            });
                        }

                    });
                }
            });
        }

        // REGISTROC800
        if (!Util.isEmpty(blocoC.getRegistroC800())) {
            blocoC.getRegistroC800().forEach(registroC800 -> {
                GerarRegistroC800.gerar(registroC800, sb);
                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC800);

                if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
                    // REGISTROC810
                    if (!Util.isEmpty(registroC800.getRegistroC810())) {
                        registroC800.getRegistroC810().forEach(registroC810 -> {
                            GerarRegistroC810.gerar(registroC810, sb);
                            efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC810);

                            // REGISTROC815
                            if (!Util.isEmpty(registroC810.getRegistroC815())) {
                                GerarRegistroC815.gerar(registroC810.getRegistroC815(), sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC815);
                            }

                        });
                    }
                }
                // REGISTROC850
                if (!Util.isEmpty(registroC800.getRegistroC850())) {
                    registroC800.getRegistroC850().forEach(registroC850 -> {
                        GerarRegistroC850.gerar(registroC850, sb);
                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC850);
                    });
                }
            });
        }

        // REGISTROC860
        if (!Util.isEmpty(blocoC.getRegistroC860())) {
            blocoC.getRegistroC860().forEach(registroC860 -> {
                GerarRegistroC860.gerar(registroC860, sb);
                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC860);

                if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
                    // REGISTROC870
                    if (!Util.isEmpty(registroC860.getRegistroC870())) {
                        registroC860.getRegistroC870().forEach(registroC870 -> {
                            GerarRegistroC870.gerar(registroC870, sb);
                            efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC870);

                            // REGISTROC880
                            if (!Util.isEmpty(registroC870.getRegistroC880())) {
                                GerarRegistroC880.gerar(registroC870.getRegistroC880(), sb);
                                efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC880);
                            }

                        });
                    }
                }

                // REGISTROC890
                if (!Util.isEmpty(registroC860.getRegistroC890())) {
                    registroC860.getRegistroC890().forEach(registroC890 -> {
                        GerarRegistroC890.gerar(registroC890, sb);
                        efdIcms.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC890);
                    });
                }

            });
        }

        // REGISTROC990
        if (efdIcms.getContadoresBlocoC().getContRegistroC990() > 0) {
            RegistroC990 registroC990 = new RegistroC990();
            registroC990.setQtd_lin_c(String.valueOf(efdIcms.getContadoresBlocoC().getContRegistroC990() + 1));

            blocoC.setRegistroC990(registroC990);
            GerarRegistroC990.gerar(blocoC.getRegistroC990(), sb);
        }

        return sb;
    }
}
