package br.com.swconsultoria.efd.icms.bo.bloco0;

import br.com.swconsultoria.efd.icms.registros.bloco0.Registro0210;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
@Deprecated
public class GerarRegistro0210 {

    public static StringBuilder gerar(Registro0210 registro0210, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro0210.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro0210.getCod_item_comp()));
        sb.append("|").append(Util.preencheRegistro(registro0210.getQtd_comp()));
        sb.append("|").append(Util.preencheRegistro(registro0210.getPerda()));
        sb.append("|").append('\n');

        return sb;
    }
}
