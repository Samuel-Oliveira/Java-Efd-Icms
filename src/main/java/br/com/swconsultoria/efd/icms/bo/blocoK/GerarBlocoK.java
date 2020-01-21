/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoK;

import br.com.swconsultoria.efd.icms.registros.EfdIcms;
import br.com.swconsultoria.efd.icms.registros.blocoK.BlocoK;
import br.com.swconsultoria.efd.icms.registros.blocoK.BlocoKEnum;
import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK990;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Yuri Lemes
 */
public class GerarBlocoK {

    private static StringBuilder sb = null;

    public static StringBuilder gerar(EfdIcms efdIcms, StringBuilder sbr) {
        BlocoK blocoK = efdIcms.getBlocoK();
        sb = sbr;
        // REGISTROK001
        if (!Util.isEmpty(blocoK.getRegistroK001())) {
            GerarRegistroK001.gerar(blocoK.getRegistroK001(), sb);
            efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK001);
        }

        // REGISTROK100
        if (!Util.isEmpty(blocoK.getRegistroK100())) {
            blocoK.getRegistroK100().forEach(registroK100 -> {
                GerarRegistroK100.gerar(registroK100, sb);
                efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK100);

                // REGISTROK200
                if (!Util.isEmpty(registroK100.getRegistroK200())) {
                    registroK100.getRegistroK200().forEach(registroK200 -> {
                        GerarRegistroK200.gerar(registroK200, sb);
                        efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK200);
                    });
                }

                // REGISTROK210
                if (!Util.isEmpty(registroK100.getRegistroK210())) {
                    registroK100.getRegistroK210().forEach(registroK210 -> {
                        GerarRegistroK210.gerar(registroK210, sb);
                        efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK210);

                        // REGISTROK215
                        if (!Util.isEmpty(registroK210.getRegistroK215())) {
                            registroK210.getRegistroK215().forEach(registroK215 -> {
                                GerarRegistroK215.gerar(registroK215, sb);
                                efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK215);
                            });
                        }
                    });
                }

                // REGISTROK220
                if (!Util.isEmpty(registroK100.getRegistroK220())) {
                    registroK100.getRegistroK220().forEach(registroK220 -> {
                        GerarRegistroK220.gerar(registroK220, sb);
                        efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK220);
                    });
                }

                // REGISTROK230
                if (!Util.isEmpty(registroK100.getRegistroK230())) {
                    registroK100.getRegistroK230().forEach(registroK230 -> {
                        GerarRegistroK230.gerar(registroK230, sb);
                        efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK230);

                        // REGISTROK235
                        if (!Util.isEmpty(registroK230.getRegistroK235())) {
                            registroK230.getRegistroK235().forEach(registroK235 -> {
                                GerarRegistroK235.gerar(registroK235, sb);
                                efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK235);
                            });
                        }
                    });
                }

                // REGISTROK250
                if (!Util.isEmpty(registroK100.getRegistroK250())) {
                    registroK100.getRegistroK250().forEach(registroK250 -> {
                        GerarRegistroK250.gerar(registroK250, sb);
                        efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK250);

                        // REGISTROK255
                        if (!Util.isEmpty(registroK250.getRegistroK255())) {
                            registroK250.getRegistroK255().forEach(registroK255 -> {
                                GerarRegistroK255.gerar(registroK255, sb);
                                efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK255);
                            });
                        }
                    });
                }

                // REGISTROK260
                if (!Util.isEmpty(registroK100.getRegistroK260())) {
                    registroK100.getRegistroK260().forEach(registroK260 -> {
                        GerarRegistroK260.gerar(registroK260, sb);
                        efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK260);

                        // REGISTROK265
                        if (!Util.isEmpty(registroK260.getRegistroK265())) {
                            registroK260.getRegistroK265().forEach(registroK265 -> {
                                GerarRegistroK265.gerar(registroK265, sb);
                                efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK265);
                            });
                        }
                    });
                }

                // REGISTROK270
                if (!Util.isEmpty(registroK100.getRegistroK270())) {
                    registroK100.getRegistroK270().forEach(registroK270 -> {
                        GerarRegistroK270.gerar(registroK270, sb);
                        efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK270);

                        // REGISTROK235
                        if (!Util.isEmpty(registroK270.getRegistroK275())) {
                            registroK270.getRegistroK275().forEach(registroK275 -> {
                                GerarRegistroK275.gerar(registroK275, sb);
                                efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK275);
                            });
                        }
                    });
                }

                // REGISTROK280
                if (!Util.isEmpty(registroK100.getRegistroK280())) {
                    registroK100.getRegistroK280().forEach(registroK280 -> {
                        GerarRegistroK280.gerar(registroK280, sb);
                        efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK280);
                    });
                }

                if (Util.versao2019(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {

                    // REGISTROK290
                    if (!Util.isEmpty(registroK100.getRegistroK290())) {
                        registroK100.getRegistroK290().forEach(registroK290 -> {
                            GerarRegistroK290.gerar(registroK290, sb);
                            efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK290);

                            // REGISTROK291
                            if (!Util.isEmpty(registroK290.getRegistroK291())) {
                                registroK290.getRegistroK291().forEach(registroK291 -> {
                                    GerarRegistroK291.gerar(registroK291, sb);
                                    efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK291);
                                });
                            }
                            // REGISTROK292
                            if (!Util.isEmpty(registroK290.getRegistroK292())) {
                                registroK290.getRegistroK292().forEach(registroK292 -> {
                                    GerarRegistroK292.gerar(registroK292, sb);
                                    efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK292);
                                });
                            }
                        });

                        // REGISTROK300
                        if (!Util.isEmpty(registroK100.getRegistroK300())) {
                            registroK100.getRegistroK300().forEach(registroK300 -> {
                                GerarRegistroK300.gerar(registroK300, sb);
                                efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK300);

                                // REGISTROK301
                                if (!Util.isEmpty(registroK300.getRegistroK301())) {
                                    registroK300.getRegistroK301().forEach(registroK301 -> {
                                        GerarRegistroK301.gerar(registroK301, sb);
                                        efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK301);
                                    });
                                }

                                // REGISTROK302
                                if (!Util.isEmpty(registroK300.getRegistroK302())) {
                                    registroK300.getRegistroK302().forEach(registroK302 -> {
                                        GerarRegistroK302.gerar(registroK302, sb);
                                        efdIcms.getContadoresBlocoK().incrementar(BlocoKEnum.RegistroK302);
                                    });
                                }
                            });
                        }
                    }
                }
            });
        }

        // REGISTROK990
        if (efdIcms.getContadoresBlocoK().getContRegistroK990() > 0) {
            RegistroK990 registroK990 = new RegistroK990();
            registroK990.setQtd_lin_k(String.valueOf(efdIcms.getContadoresBlocoK().getContRegistroK990() + 1));

            blocoK.setRegistroK990(registroK990);
            GerarRegistroK990.gerar(blocoK.getRegistroK990(), sb);
        }

        return sb;
    }
}
