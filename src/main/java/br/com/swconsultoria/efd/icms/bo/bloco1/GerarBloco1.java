/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.bloco1;

import br.com.swconsultoria.efd.icms.registros.EfdIcms;
import br.com.swconsultoria.efd.icms.registros.bloco1.Bloco1;
import br.com.swconsultoria.efd.icms.registros.bloco1.Bloco1Enum;
import br.com.swconsultoria.efd.icms.registros.bloco1.Registro1920;
import br.com.swconsultoria.efd.icms.registros.bloco1.Registro1990;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Yuri Lemes, Sidnei Klein
 *
 */
public class GerarBloco1 {

    private static StringBuilder sb = null;

    public static StringBuilder gerar(EfdIcms efdIcms, StringBuilder sbr) {
        Bloco1 bloco1 = efdIcms.getBloco1();
        sb = sbr;
        // REGISTRO1001
        if (!Util.isEmpty(bloco1.getRegistro1001())) {
            GerarRegistro1001.gerar(bloco1.getRegistro1001(), sb);
            efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1001);
        }

        // REGISTRO1010
        if (!Util.isEmpty(bloco1.getRegistro1010())) {
            GerarRegistro1010.gerar(efdIcms, bloco1.getRegistro1010(), sb);
            efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1010);
        }

        // REGISTRO1100
        if (!Util.isEmpty(bloco1.getRegistro1100())) {
            bloco1.getRegistro1100().forEach(registro1100 -> {
                GerarRegistro1100.gerar(registro1100, sb);
                efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1100);

                // REGISTRO1105
                if (!Util.isEmpty(registro1100.getRegistro1105())) {
                    registro1100.getRegistro1105().forEach(registro1105 -> {
                        GerarRegistro1105.gerar(registro1105, sb);
                        efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1105);

                        // REGISTRO1110
                        if (!Util.isEmpty(registro1105.getRegistro1110())) {
                            registro1105.getRegistro1110().forEach(registro1110 -> {
                                GerarRegistro1110.gerar(registro1110, sb);
                                efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1110);
                            });
                        }
                    });
                }
            });
        }

        // REGISTRO1200
        if (!Util.isEmpty(bloco1.getRegistro1200())) {
            bloco1.getRegistro1200().forEach(registro1200 -> {
                GerarRegistro1200.gerar(registro1200, sb);
                efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1200);

                // REGISTRO1210
                if (!Util.isEmpty(registro1200.getRegistro1210())) {
                    registro1200.getRegistro1210().forEach(registro1210 -> {
                        GerarRegistro1210.gerar(registro1210, sb);
                        efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1210);
                    });
                }
            });
        }

        if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
            // REGISTRO1250
            if (!Util.isEmpty(bloco1.getRegistro1250())) {
                GerarRegistro1250.gerar(bloco1.getRegistro1250(), sb);
                efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1250);

                // REGISTRO1255
                if (!Util.isEmpty(bloco1.getRegistro1250().getRegistro1255())) {
                    bloco1.getRegistro1250().getRegistro1255().forEach(registro1255 -> {
                        GerarRegistro1255.gerar(registro1255, sb);
                        efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1255);
                    });
                }
            }
        }

        // REGISTRO1300
        if (!Util.isEmpty(bloco1.getRegistro1300())) {
            bloco1.getRegistro1300().forEach(registro1300 -> {
                GerarRegistro1300.gerar(registro1300, sb);
                efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1300);

                // REGISTRO1310
                if (!Util.isEmpty(registro1300.getRegistro1310())) {
                    registro1300.getRegistro1310().forEach(registro1310 -> {
                        GerarRegistro1310.gerar(registro1310, sb);
                        efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1310);

                        // REGISTRO1320
                        if (!Util.isEmpty(registro1310.getRegistro1320())) {
                            registro1310.getRegistro1320().forEach(registro1320 -> {
                                GerarRegistro1320.gerar(registro1320, sb);
                                efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1320);
                            });
                        }
                    });
                }
            });
        }

        // REGISTRO1350
        if (!Util.isEmpty(bloco1.getRegistro1350())) {
            bloco1.getRegistro1350().forEach(registro1350 -> {
                GerarRegistro1350.gerar(registro1350, sb);
                efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1350);

                // REGISTRO1360
                if (!Util.isEmpty(registro1350.getRegistro1360())) {
                    registro1350.getRegistro1360().forEach(registro1360 -> {
                        GerarRegistro1360.gerar(registro1360, sb);
                        efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1360);
                    });
                }

                // REGISTRO1370
                if (!Util.isEmpty(registro1350.getRegistro1370())) {
                    registro1350.getRegistro1370().forEach(registro1370 -> {
                        GerarRegistro1370.gerar(registro1370, sb);
                        efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1370);
                    });
                }
            });
        }

        // REGISTRO1390
        if (!Util.isEmpty(bloco1.getRegistro1390())) {
            bloco1.getRegistro1390().forEach(registro1390 -> {
                GerarRegistro1390.gerar(registro1390, sb);
                efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1390);

                // REGISTRO1391
                if (!Util.isEmpty(registro1390.getRegistro1391())) {
                    registro1390.getRegistro1391().forEach(registro1391 -> {
                        GerarRegistro1391.gerar(efdIcms, registro1391, sb);
                        efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1391);
                    });
                }
            });
        }

        // REGISTRO1400
        if (!Util.isEmpty(bloco1.getRegistro1400())) {
            bloco1.getRegistro1400().forEach(registro1400 -> {
                GerarRegistro1400.gerar(registro1400, sb);
                efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1400);
            });
        }

        // REGISTRO1500
        if (!Util.isEmpty(bloco1.getRegistro1500())) {
            bloco1.getRegistro1500().forEach(registro1500 -> {
                GerarRegistro1500.gerar(registro1500, sb);
                efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1500);

                // REGISTRO1510
                if (!Util.isEmpty(registro1500.getRegistro1510())) {
                    registro1500.getRegistro1510().forEach(registro1510 -> {
                        GerarRegistro1510.gerar(registro1510, sb);
                        efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1510);
                    });
                }
            });
        }

        // REGISTRO1600
        if (!Util.versao2022(efdIcms.getBloco0().getRegistro0000().getDt_ini())
                && !Util.isEmpty(bloco1.getRegistro1600())) {
            bloco1.getRegistro1600().forEach(registro1600 -> {
                GerarRegistro1600.gerar(registro1600, sb);
                efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1600);
            });
        }

        // REGISTRO1601
        if (Util.versao2022(efdIcms.getBloco0().getRegistro0000().getDt_ini()) &&
                !Util.isEmpty(bloco1.getRegistro1601())) {
            bloco1.getRegistro1601().forEach(registro1601 -> {
                GerarRegistro1601.gerar(registro1601, sb);
                efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1601);
            });
        }

        // REGISTRO1700
        if (!Util.isEmpty(bloco1.getRegistro1700())) {
            bloco1.getRegistro1700().forEach(registro1700 -> {
                GerarRegistro1700.gerar(registro1700, sb);
                efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1700);

                // REGISTRO1710
                if (!Util.isEmpty(registro1700.getRegistro1710())) {
                    registro1700.getRegistro1710().forEach(registro1710 -> {
                        GerarRegistro1710.gerar(registro1710, sb);
                        efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1710);
                    });
                }
            });
        }

        // REGISTRO1800
        if (!Util.isEmpty(bloco1.getRegistro1800())) {
            GerarRegistro1800.gerar(bloco1.getRegistro1800(), sb);
            efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1800);
        }

        // REGISTRO1900 (N�vel 2)
        if (!Util.isEmpty(bloco1.getRegistro1900())) {
            bloco1.getRegistro1900().forEach(registro1900 -> {
                GerarRegistro1900.gerar(registro1900, sb);
                efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1900);

                // REGISTRO1910
                if (!Util.isEmpty(registro1900.getRegistro1910())) {
                    registro1900.getRegistro1910().forEach(registro1910 -> {
                        GerarRegistro1910.gerar(registro1910, sb);
                        efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1910);

                        // REGISTRO1920
                        if (!Util.isEmpty(registro1910.getRegistro1920())) {
                            Registro1920 registro1920 = registro1910.getRegistro1920();
                            GerarRegistro1920.gerar(registro1920, sb);
                            efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1920);

                            // REGISTRO1921
                            if (!Util.isEmpty(registro1920.getRegistro1921())) {
                                registro1920.getRegistro1921().forEach(registro1921 -> {
                                    GerarRegistro1921.gerar(registro1921, sb);
                                    efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1921);

                                    // REGISTRO1922
                                    if (!Util.isEmpty(registro1921.getRegistro1922())) {
                                        registro1921.getRegistro1922().forEach(registro1922 -> {
                                            GerarRegistro1922.gerar(registro1922, sb);
                                            efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1922);
                                        });
                                    }

                                    // REGISTRO1923
                                    if (!Util.isEmpty(registro1921.getRegistro1923())) {
                                        registro1921.getRegistro1923().forEach(registro1923 -> {
                                            GerarRegistro1923.gerar(registro1923, sb);
                                            efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1923);
                                        });
                                    }
                                });
                            }

                            // REGISTRO1925
                            if (!Util.isEmpty(registro1920.getRegistro1925())) {
                                registro1920.getRegistro1925().forEach(registro1925 -> {
                                    GerarRegistro1925.gerar(registro1925, sb);
                                    efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1925);
                                });
                            }

                            // REGISTRO1926
                            if (!Util.isEmpty(registro1920.getRegistro1926())) {
                                registro1920.getRegistro1926().forEach(registro1926 -> {
                                    GerarRegistro1926.gerar(registro1926, sb);
                                    efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1926);
                                });
                            }
                        }
                    });
                }
            });
        }

        // REGISTRO 1960 (N�vel 2) add v3_0_1
        if (!Util.isEmpty(bloco1.getRegistro1960())) {
            bloco1.getRegistro1960().forEach(registro1960 -> {
                GerarRegistro1960.gerar(registro1960, sb);
                efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1960);
            });
        }

        // REGISTRO 1970 (N�vel 2) add v3_0_1
        if (!Util.isEmpty(bloco1.getRegistro1970())) {
            bloco1.getRegistro1970().forEach(registro1970 -> {
                GerarRegistro1970.gerar(registro1970, sb);
                efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1970);

                // REGISTRO1975 (N�vel 3) add v3_0_1
                if (!Util.isEmpty(registro1970.getRegistro1975())) {
                    registro1970.getRegistro1975().forEach(registro1975 -> {
                        GerarRegistro1975.gerar(registro1975, sb);
                        efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1975);
                    });
                }
            });
        }

        // REGISTRO 1980 (N�vel 2) add v3_0_1
        if (!Util.isEmpty(bloco1.getRegistro1980())) {
            GerarRegistro1980.gerar(bloco1.getRegistro1980(), sb);
            efdIcms.getContadoresBloco1().incrementar(Bloco1Enum.Registro1980);
        }

        // REGISTRO1990
        if (efdIcms.getContadoresBloco1().getContRegistro1990() > 0) {
            Registro1990 registro1990 = new Registro1990();
            registro1990.setQtd_lin_1(String.valueOf(efdIcms.getContadoresBloco1().getContRegistro1990() + 1));

            bloco1.setRegistro1990(registro1990);
            GerarRegistro1990.gerar(bloco1.getRegistro1990(), sb);
        }

        return sb;
    }
}
