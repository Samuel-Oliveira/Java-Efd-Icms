/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoB;

import br.com.swconsultoria.efd.icms.registros.EfdIcms;
import br.com.swconsultoria.efd.icms.registros.blocoB.BlocoB;
import br.com.swconsultoria.efd.icms.registros.blocoB.BlocoBEnum;
import br.com.swconsultoria.efd.icms.registros.blocoB.RegistroB990;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Sidnei Klein
 *
 */
public class GerarBlocoB {

    private static StringBuilder sb = null;

    public static StringBuilder gerar(EfdIcms efdIcms, StringBuilder sbr) {

        BlocoB blocoB = efdIcms.getBlocoB();

        sb = sbr;

        // REGISTROB001 - (N�vel 1)
        if (!Util.isEmpty(blocoB.getRegistroB001())) {
            GerarRegistroB001.gerar(blocoB.getRegistroB001(), sb);
            efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB001);

            // REGISTROB020 - (N�vel 2)
            if (!Util.isEmpty(blocoB.getRegistroB001().getRegistroB020())) {
                blocoB.getRegistroB001().getRegistroB020().forEach(registroB020 -> {
                    GerarRegistroB020.gerar(registroB020, sb);
                    efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB020);

                    // REGISTROB025 - (N�vel 3)
                    if (!Util.isEmpty(registroB020.getRegistroB025())) {
                        registroB020.getRegistroB025().forEach(registroB025 -> {
                            GerarRegistroB025.gerar(registroB025, sb);
                            efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB025);
                        });
                    }
                });
            }

            // REGISTROB030 - (N�vel 2)
            if (!Util.isEmpty(blocoB.getRegistroB001().getRegistroB030())) {
                blocoB.getRegistroB001().getRegistroB030().forEach(registroB030 -> {
                    GerarRegistroB030.gerar(registroB030, sb);
                    efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB030);

                    // REGISTROB035 - (N�vel 3)
                    if (!Util.isEmpty(registroB030.getRegistroB035())) {
                        registroB030.getRegistroB035().forEach(registroB035 -> {
                            GerarRegistroB035.gerar(registroB035, sb);
                            efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB035);
                        });
                    }
                });
            }

            // REGISTROB350 - (N�vel 2)
            if (!Util.isEmpty(blocoB.getRegistroB001().getRegistroB350())) {
                blocoB.getRegistroB001().getRegistroB350().forEach(registroB350 -> {
                    GerarRegistroB350.gerar(registroB350, sb);
                    efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB350);
                });
            }

            // REGISTROB420 - (N�vel 2)
            if (!Util.isEmpty(blocoB.getRegistroB001().getRegistroB420())) {
                blocoB.getRegistroB001().getRegistroB420().forEach(registroB420 -> {
                    GerarRegistroB420.gerar(registroB420, sb);
                    efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB420);
                });
            }

            // REGISTROB440 - (N�vel 2)
            if (!Util.isEmpty(blocoB.getRegistroB001().getRegistroB440())) {
                blocoB.getRegistroB001().getRegistroB440().forEach(registroB440 -> {
                    GerarRegistroB440.gerar(registroB440, sb);
                    efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB440);
                });
            }

            // REGISTROB460 - (N�vel 2)
            if (!Util.isEmpty(blocoB.getRegistroB001().getRegistroB460())) {
                blocoB.getRegistroB001().getRegistroB460().forEach(registroB460 -> {
                    GerarRegistroB460.gerar(registroB460, sb);
                    efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB460);
                });
            }

            // REGISTROB470 - (N�vel 2)
            if (!Util.isEmpty(blocoB.getRegistroB001().getRegistroB470())) {
                GerarRegistroB470.gerar(blocoB.getRegistroB001().getRegistroB470(), sb);
                efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB470);
            }

            // REGISTROB500 - (N�vel 2)
            if (!Util.isEmpty(blocoB.getRegistroB001().getRegistroB500())) {
                GerarRegistroB500.gerar(blocoB.getRegistroB001().getRegistroB500(), sb);
                efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB500);

                // REGISTROB510 - (N�vel 3)
                if (!Util.isEmpty(blocoB.getRegistroB001().getRegistroB500().getRegistroB510())) {
                    blocoB.getRegistroB001().getRegistroB500().getRegistroB510().forEach(registroB510 -> {
                        GerarRegistroB510.gerar(registroB510, sb);
                        efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB510);
                    });
                }
            }

        }

        // REGISTRO0990
        if (efdIcms.getContadoresBlocoB().getContRegistroB990() > 0) {
            RegistroB990 registroB990 = new RegistroB990();
            registroB990.setQtd_lin_b(String.valueOf(efdIcms.getContadoresBlocoB().getContRegistroB990() + 1));

            blocoB.setRegistroB990(registroB990);
            GerarRegistroB990.gerar(blocoB.getRegistroB990(), sb);
        }

        return sb;
    }
}
