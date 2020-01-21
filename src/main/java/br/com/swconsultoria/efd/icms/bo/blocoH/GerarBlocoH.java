/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoH;

import br.com.swconsultoria.efd.icms.registros.EfdIcms;
import br.com.swconsultoria.efd.icms.registros.blocoH.BlocoH;
import br.com.swconsultoria.efd.icms.registros.blocoH.BlocoHEnum;
import br.com.swconsultoria.efd.icms.registros.blocoH.RegistroH990;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Yuri Lemes
 *
 */
public class GerarBlocoH {

    private static StringBuilder sb = null;

    public static StringBuilder gerar(EfdIcms efdIcms, StringBuilder sbr) {
        BlocoH blocoH = efdIcms.getBlocoH();
        sb = sbr;
        // REGISTROH001
        if (!Util.isEmpty(blocoH.getRegistroH001())) {
            GerarRegistroH001.gerar(blocoH.getRegistroH001(), sb);
            efdIcms.getContadoresBlocoH().incrementar(BlocoHEnum.RegistroH001);
        }

        // REGISTROH005
        if (!Util.isEmpty(blocoH.getRegistroH005())) {
            blocoH.getRegistroH005().forEach(registroH005 -> {
                GerarRegistroH005.gerar(registroH005, sb);
                efdIcms.getContadoresBlocoH().incrementar(BlocoHEnum.RegistroH005);

                // REGISTROH010
                if (!Util.isEmpty(registroH005.getRegistroH010())) {
                    registroH005.getRegistroH010().forEach(registroH010 -> {
                        GerarRegistroH010.gerar(registroH010, sb);
                        efdIcms.getContadoresBlocoH().incrementar(BlocoHEnum.RegistroH010);

                        if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
                            // REGISTROH030
                            if (!Util.isEmpty(registroH010.getRegistroH030())) {
                                GerarRegistroH030.gerar(registroH010.getRegistroH030(), sb);
                                efdIcms.getContadoresBlocoH().incrementar(BlocoHEnum.RegistroH030);
                            }
                        }
                        // REGISTROH020
                        if (!Util.isEmpty(registroH010.getRegistroH020())) {
                            registroH010.getRegistroH020().forEach(registroH020 -> {
                                GerarRegistroH020.gerar(registroH020, sb);
                                efdIcms.getContadoresBlocoH().incrementar(BlocoHEnum.RegistroH020);
                            });
                        }
                    });
                }
            });
        }

        // REGISTROH990
        if (efdIcms.getContadoresBlocoH().getContRegistroH990() > 0) {
            RegistroH990 registroH990 = new RegistroH990();
            registroH990.setQtd_lin_h(String.valueOf(efdIcms.getContadoresBlocoH().getContRegistroH990() + 1));

            blocoH.setRegistroH990(registroH990);
            GerarRegistroH990.gerar(blocoH.getRegistroH990(), sb);
        }

        return sb;
    }
}
