/**
 *
 */
package br.com.samuelweb.efd.icms.bo.bloco0;

import br.com.samuelweb.efd.icms.registros.EfdIcms_v3_0_1;
import br.com.samuelweb.efd.icms.registros.bloco0.Bloco0;
import br.com.samuelweb.efd.icms.registros.bloco0.Bloco0Enum;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Yuri Lemes
 *
 */
public class GerarBloco0 {

    private static StringBuilder sb = null;

    public static StringBuilder gerar(EfdIcms_v3_0_1 efdIcms, StringBuilder sbr) {

        Bloco0 bloco0 = efdIcms.getBloco0();

        sb = sbr;

        // REGISTRO0000
        if (!Util.isEmpty(bloco0.getRegistro0000())) {
            sb = GerarRegistro0000.gerar(bloco0.getRegistro0000(), sb);
            efdIcms.getContadoresBloco0().incrementar(Bloco0Enum.Registro0000);
        }

        // REGISTRO0001
        if (!Util.isEmpty(bloco0.getRegistro0001())) {
            sb = GerarRegistro0001.gerar(bloco0.getRegistro0001(), sb);
            efdIcms.getContadoresBloco0().incrementar(Bloco0Enum.Registro0001);
        }

        // REGISTRO0005
        if (!Util.isEmpty(bloco0.getRegistro0005())) {
            sb = GerarRegistro0005.gerar(bloco0.getRegistro0005(), sb);
            efdIcms.getContadoresBloco0().incrementar(Bloco0Enum.Registro0005);
        }

        // REGISTRO0015
        if (!Util.isEmpty(bloco0.getRegistro0015())) {
            bloco0.getRegistro0015().stream().forEach(registro0015 -> {
                sb = GerarRegistro0015.gerar(registro0015, sb);
                efdIcms.getContadoresBloco0().incrementar(Bloco0Enum.Registro0015);
            });

        }

        // REGISTRO0100
        if (!Util.isEmpty(bloco0.getRegistro0100())) {
            sb = GerarRegistro0100.gerar(bloco0.getRegistro0100(), sb);
            efdIcms.getContadoresBloco0().incrementar(Bloco0Enum.Registro0100);
        }

        // REGISTRO0150
        if (!Util.isEmpty(bloco0.getRegistro0150())) {

            bloco0.getRegistro0150().stream().forEach(registro0150 -> {
                sb = GerarRegistro0150.gerar(registro0150, sb);
                efdIcms.getContadoresBloco0().incrementar(Bloco0Enum.Registro0150);

                //REGISTRO0175
                if (!Util.isEmpty(registro0150.getRegistro0175())) {
                    registro0150.getRegistro0175().stream().forEach(registro0175 -> {
                        sb = GerarRegistro0175.gerar(registro0175, sb);
                        efdIcms.getContadoresBloco0().incrementar(Bloco0Enum.Registro0175);
                    });
                }
            });
        }

        // REGISTRO0190
        if (!Util.isEmpty(bloco0.getRegistro0190())) {
            bloco0.getRegistro0190().stream().forEach(registro0190 -> {
                sb = GerarRegistro0190.gerar(registro0190, sb);
                efdIcms.getContadoresBloco0().incrementar(Bloco0Enum.Registro0190);
            });
        }

        // REGISTRO0200
        if (!Util.isEmpty(bloco0.getRegistro0200())) {
            bloco0.getRegistro0200().stream().forEach(registro0200 -> {
                sb = GerarRegistro0200.gerar(registro0200, sb);
                efdIcms.getContadoresBloco0().incrementar(Bloco0Enum.Registro0200);

                // REGISTRO0205
                if (!Util.isEmpty(registro0200.getRegistro0205())) {
                    registro0200.getRegistro0205().stream().forEach(registro0205 -> {
                        sb = GerarRegistro0205.gerar(registro0205, sb);
                        efdIcms.getContadoresBloco0().incrementar(Bloco0Enum.Registro0205);
                    });
                }

                // REGISTRO0206
                if (!Util.isEmpty(registro0200.getRegistro0206())) {
                    sb = GerarRegistro0206.gerar(registro0200.getRegistro0206(), sb);
                    efdIcms.getContadoresBloco0().incrementar(Bloco0Enum.Registro0206);
                }

            });

        }

        // REGISTRO0210
        if (!Util.isEmpty(bloco0.getRegistro0210())) {
            bloco0.getRegistro0210().stream().forEach(registro0210 -> {
                sb = GerarRegistro0210.gerar(registro0210, sb);
                efdIcms.getContadoresBloco0().incrementar(Bloco0Enum.Registro0210);
            });
        }
        // REGISTRO0220
        if (!Util.isEmpty(bloco0.getRegistro0220())) {
            bloco0.getRegistro0220().stream().forEach(registro0220 -> {
                sb = GerarRegistro0220.gerar(registro0220, sb);
                efdIcms.getContadoresBloco0().incrementar(Bloco0Enum.Registro0220);
            });
        }

        // REGISTRO0300
        if (!Util.isEmpty(bloco0.getRegistro0300())) {
            bloco0.getRegistro0300().forEach(registro0300 -> {
                sb = GerarRegistro0300.gerar(registro0300, sb);
                efdIcms.getContadoresBloco0().incrementar(Bloco0Enum.Registro0300);
                // REGISTRO0305
                if (!Util.isEmpty(registro0300.getRegistro0305())) {
                    sb = GerarRegistro0305.gerar(registro0300.getRegistro0305(), sb);
                    efdIcms.getContadoresBloco0().incrementar(Bloco0Enum.Registro0305);
                }
            });
        }

        // REGISTRO0400
        if (!Util.isEmpty(bloco0.getRegistro0400())) {
            bloco0.getRegistro0400().stream().forEach(registro0400 -> {
                sb = GerarRegistro0400.gerar(registro0400, sb);
                efdIcms.getContadoresBloco0().incrementar(Bloco0Enum.Registro0400);
            });
        }

        // REGISTRO0450
        if (!Util.isEmpty(bloco0.getRegistro0450())) {
            bloco0.getRegistro0450().stream().forEach(registro0450 -> {
                sb = GerarRegistro0450.gerar(registro0450, sb);
                efdIcms.getContadoresBloco0().incrementar(Bloco0Enum.Registro0450);
            });
        }

        // REGISTRO0460
        if (!Util.isEmpty(bloco0.getRegistro0460())) {
            bloco0.getRegistro0460().stream().forEach(registro0460 -> {
                sb = GerarRegistro0460.gerar(registro0460, sb);
                efdIcms.getContadoresBloco0().incrementar(Bloco0Enum.Registro0460);
            });
        }

        // REGISTRO0500
        if (!Util.isEmpty(bloco0.getRegistro0500())) {
            bloco0.getRegistro0500().stream().forEach(registro0500 -> {
                sb = GerarRegistro0500.gerar(registro0500, sb);
                efdIcms.getContadoresBloco0().incrementar(Bloco0Enum.Registro0500);
            });
        }

        // REGISTRO0600
        if (!Util.isEmpty(bloco0.getRegistro0600())) {
            bloco0.getRegistro0600().stream().forEach(registro0600 -> {
                sb = GerarRegistro0600.gerar(registro0600, sb);
                efdIcms.getContadoresBloco0().incrementar(Bloco0Enum.Registro0600);
            });
        }

        // REGISTRO0990
        if (efdIcms.getContadoresBloco0().getContRegistro0990() > 0) {
            Registro0990 registro0990 = new Registro0990();
            registro0990.setQtd_lin_0(String.valueOf(efdIcms.getContadoresBloco0().getContRegistro0990() + 1));

            bloco0.setRegistro0990(registro0990);
            sb = GerarRegistro0990.gerar(bloco0.getRegistro0990(), sb);
        }

        return sb;
    }
}
