/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.bloco1;

import br.com.swconsultoria.efd.icms.registros.bloco1.Registro1110;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1110 {

    public static StringBuilder gerar(Registro1110 registro1110, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro1110.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro1110.getCod_part()));
        sb.append("|").append(Util.preencheRegistro(registro1110.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(registro1110.getSer()));
        sb.append("|").append(Util.preencheRegistro(registro1110.getNum_doc()));
        sb.append("|").append(Util.preencheRegistro(registro1110.getDt_doc()));
        sb.append("|").append(Util.preencheRegistro(registro1110.getChv_nfe()));
        sb.append("|").append(Util.preencheRegistro(registro1110.getNr_memo()));
        sb.append("|").append(Util.preencheRegistro(registro1110.getQtd()));
        sb.append("|").append(Util.preencheRegistro(registro1110.getUnid()));
        sb.append("|").append('\n');

        return sb;
    }
}
