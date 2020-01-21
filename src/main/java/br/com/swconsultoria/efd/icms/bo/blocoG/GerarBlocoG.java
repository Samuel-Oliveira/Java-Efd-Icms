/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoG;

import br.com.swconsultoria.efd.icms.registros.EfdIcms;
import br.com.swconsultoria.efd.icms.registros.blocoG.BlocoG;
import br.com.swconsultoria.efd.icms.registros.blocoG.BlocoGEnum;
import br.com.swconsultoria.efd.icms.registros.blocoG.RegistroG990;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Yuri Lemes
 *
 */
public class GerarBlocoG {

    private static StringBuilder sb = null;

    public static StringBuilder gerar(EfdIcms efdIcms, StringBuilder sbr) {
        BlocoG blocoG = efdIcms.getBlocoG();
        sb = sbr;
        //REGISTROG001
        if (!Util.isEmpty(blocoG.getRegistroG001())) {
            GerarRegistroG001.gerar(blocoG.getRegistroG001(), sb);
            efdIcms.getContadoresBlocoG().incrementar(BlocoGEnum.RegistroG001);
        }

        //REGISTROG110
        if (!Util.isEmpty(blocoG.getRegistroG110())) {
            blocoG.getRegistroG110().forEach(registroG110 -> {
                GerarRegistroG110.gerar(registroG110, sb);
                efdIcms.getContadoresBlocoG().incrementar(BlocoGEnum.RegistroG110);

                //REGISTROG125
                if (!Util.isEmpty(registroG110.getRegistroG125())) {
                    registroG110.getRegistroG125().forEach(registroG125 -> {
                        GerarRegistroG125.gerar(registroG125, sb);
                        efdIcms.getContadoresBlocoG().incrementar(BlocoGEnum.RegistroG125);

                        //REGISTROG126
                        if (!Util.isEmpty(registroG125.getRegistroG126())) {
                            registroG125.getRegistroG126().forEach(registroG126 -> {
                                GerarRegistroG126.gerar(registroG126, sb);
                                efdIcms.getContadoresBlocoG().incrementar(BlocoGEnum.RegistroG126);
                            });
                        }

                        //REGISTROG130
                        if (!Util.isEmpty(registroG125.getRegistroG130())) {
                            registroG125.getRegistroG130().forEach(registroG130 -> {
                                GerarRegistroG130.gerar(efdIcms, registroG130, sb);
                                efdIcms.getContadoresBlocoG().incrementar(BlocoGEnum.RegistroG130);

                                //REGISTROG140
                                if (!Util.isEmpty(registroG130.getRegistroG140())) {
                                    registroG130.getRegistroG140().forEach(registroG140 -> {
                                        GerarRegistroG140.gerar(efdIcms, registroG140, sb);
                                        efdIcms.getContadoresBlocoG().incrementar(BlocoGEnum.RegistroG140);
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        //REGISTROG990
        if (efdIcms.getContadoresBlocoG().getContRegistroG990() > 0) {
            RegistroG990 registroG990 = new RegistroG990();
            registroG990.setQtd_lin_g(String.valueOf(efdIcms.getContadoresBlocoG().getContRegistroG990() + 1));

            blocoG.setRegistroG990(registroG990);
            GerarRegistroG990.gerar(blocoG.getRegistroG990(), sb);
        }

        return sb;
    }
}
