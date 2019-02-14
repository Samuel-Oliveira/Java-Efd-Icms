/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoG;

import br.com.swconsultoria.efd.icms.registros.EfdIcms_v3_0_1;
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

    public static StringBuilder gerar(EfdIcms_v3_0_1 efdIcms, StringBuilder sbr) {
        BlocoG blocoG = efdIcms.getBlocoG();
        sb = sbr;
        //REGISTROG001
        if (!Util.isEmpty(blocoG.getRegistroG001())) {
            sb = GerarRegistroG001.gerar(blocoG.getRegistroG001(), sb);
            efdIcms.getContadoresBlocoG().incrementar(BlocoGEnum.RegistroG001);
        }

        //REGISTROG110
        if (!Util.isEmpty(blocoG.getRegistroG110())) {
            blocoG.getRegistroG110().stream().forEach(registroG110 -> {
                sb = GerarRegistroG110.gerar(registroG110, sb);
                efdIcms.getContadoresBlocoG().incrementar(BlocoGEnum.RegistroG110);

                //REGISTROG125
                if (!Util.isEmpty(registroG110.getRegistroG125())) {
                    registroG110.getRegistroG125().stream().forEach(registroG125 -> {
                        sb = GerarRegistroG125.gerar(registroG125, sb);
                        efdIcms.getContadoresBlocoG().incrementar(BlocoGEnum.RegistroG125);

                        //REGISTROG126
                        if (!Util.isEmpty(registroG125.getRegistroG126())) {
                            registroG125.getRegistroG126().stream().forEach(registroG126 -> {
                                sb = GerarRegistroG126.gerar(registroG126, sb);
                                efdIcms.getContadoresBlocoG().incrementar(BlocoGEnum.RegistroG126);
                            });
                        }

                        //REGISTROG130
                        if (!Util.isEmpty(registroG125.getRegistroG130())) {
                            registroG125.getRegistroG130().stream().forEach(registroG130 -> {
                                sb = GerarRegistroG130.gerar(registroG130, sb);
                                efdIcms.getContadoresBlocoG().incrementar(BlocoGEnum.RegistroG130);

                                //REGISTROG140
                                if (!Util.isEmpty(registroG130.getRegistroG140())) {
                                    registroG130.getRegistroG140().stream().forEach(registroG140 -> {
                                        sb = GerarRegistroG140.gerar(registroG140, sb);
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
            sb = GerarRegistroG990.gerar(blocoG.getRegistroG990(), sb);
        }

        return sb;
    }
}
