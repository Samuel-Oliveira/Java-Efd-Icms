package br.com.swconsultoria.efd.icms.bo.bloco0;

import br.com.swconsultoria.efd.icms.registros.EfdIcms;
import br.com.swconsultoria.efd.icms.registros.bloco0.Registro0220;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistro0220 {

    public static StringBuilder gerar(EfdIcms efdIcms, Registro0220 registro0220, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro0220.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro0220.getUnid_conv()));
        sb.append("|").append(Util.preencheRegistro(registro0220.getFat_conv()));
        if (Util.versao2022(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
            sb.append("|").append(Util.preencheRegistro(registro0220.getCod_barra()));
        }
        sb.append("|").append('\n');

        return sb;
    }
}
