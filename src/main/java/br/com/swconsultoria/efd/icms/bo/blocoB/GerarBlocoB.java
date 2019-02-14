/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoB;

import br.com.swconsultoria.efd.icms.registros.EfdIcms_v3_0_1;
import br.com.swconsultoria.efd.icms.registros.blocoB.RegistroB990;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Sidnei Klein
 *
 */
public class GerarBlocoB {

    private static StringBuilder sb = null;

    public static StringBuilder gerar(EfdIcms_v3_0_1 efdIcms, StringBuilder sbr) {

        BlocoB blocoB = efdIcms.getBlocoB();

        sb = sbr;

        // REGISTROB001 - (N�vel 1)
        if (!Util.isEmpty(blocoB.getRegistroB001())) {
            sb = GerarRegistroB001.gerar(blocoB.getRegistroB001(), sb);
            efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB001);

            // REGISTROB020 - (N�vel 2)
            if (!Util.isEmpty(blocoB.getRegistroB001().getRegistroB020())) {
                sb = GerarRegistroB020.gerar(blocoB.getRegistroB001().getRegistroB020(), sb);
                efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB020);

                // REGISTROB025 - (N�vel 3)
                if (!Util.isEmpty(blocoB.getRegistroB001().getRegistroB020().getRegistroB025())) {
                    blocoB.getRegistroB001().getRegistroB020().getRegistroB025().stream().forEach(registroB025 -> {
                        sb = GerarRegistroB025.gerar(registroB025, sb);
                        efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB025);
                    });
                }
            }

            // REGISTROB030 - (N�vel 2)
            if (!Util.isEmpty(blocoB.getRegistroB001().getRegistroB030())) {
                blocoB.getRegistroB001().getRegistroB030().stream().forEach(registroB030 -> {
                    sb = GerarRegistroB030.gerar(registroB030, sb);
                    efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB030);

                    // REGISTROB035 - (N�vel 3)
                    if (!Util.isEmpty(registroB030.getRegistroB035())) {
                        registroB030.getRegistroB035().stream().forEach(registroB035 -> {
                            sb = GerarRegistroB035.gerar(registroB035, sb);
                            efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB035);
                        });
                    }
                });
            }

            // REGISTROB350 - (N�vel 2)
            if (!Util.isEmpty(blocoB.getRegistroB001().getRegistroB350())) {
                blocoB.getRegistroB001().getRegistroB350().stream().forEach(registroB350 -> {
                    sb = GerarRegistroB350.gerar(registroB350, sb);
                    efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB350);
                });
            }

            // REGISTROB420 - (N�vel 2)
            if (!Util.isEmpty(blocoB.getRegistroB001().getRegistroB420())) {
                blocoB.getRegistroB001().getRegistroB420().stream().forEach(registroB420 -> {
                    sb = GerarRegistroB420.gerar(registroB420, sb);
                    efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB420);
                });
            }

            // REGISTROB440 - (N�vel 2)
            if (!Util.isEmpty(blocoB.getRegistroB001().getRegistroB440())) {
                blocoB.getRegistroB001().getRegistroB440().stream().forEach(registroB440 -> {
                    sb = GerarRegistroB440.gerar(registroB440, sb);
                    efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB440);
                });
            }

            // REGISTROB460 - (N�vel 2)
            if (!Util.isEmpty(blocoB.getRegistroB001().getRegistroB460())) {
                blocoB.getRegistroB001().getRegistroB460().stream().forEach(registroB460 -> {
                    sb = GerarRegistroB460.gerar(registroB460, sb);
                    efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB460);
                });
            }

            // REGISTROB470 - (N�vel 2)
            if (!Util.isEmpty(blocoB.getRegistroB001().getRegistroB470())) {
                sb = GerarRegistroB470.gerar(blocoB.getRegistroB001().getRegistroB470(), sb);
                efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB470);
            }

            // REGISTROB500 - (N�vel 2)
            if (!Util.isEmpty(blocoB.getRegistroB001().getRegistroB500())) {
                sb = GerarRegistroB500.gerar(blocoB.getRegistroB001().getRegistroB500(), sb);
                efdIcms.getContadoresBlocoB().incrementar(BlocoBEnum.RegistroB500);

                // REGISTROB510 - (N�vel 3)
                if (!Util.isEmpty(blocoB.getRegistroB001().getRegistroB500().getRegistroB510())) {
                    blocoB.getRegistroB001().getRegistroB500().getRegistroB510().stream().forEach(registroB510 -> {
                        sb = GerarRegistroB510.gerar(registroB510, sb);
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
            sb = GerarRegistroB990.gerar(blocoB.getRegistroB990(), sb);
        }

        return sb;
    }
}
