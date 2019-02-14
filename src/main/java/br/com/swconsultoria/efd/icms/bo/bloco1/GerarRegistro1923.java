/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.bloco1;

import br.com.swconsultoria.efd.icms.registros.bloco1.Registro1923;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1923 {

    public static StringBuilder gerar(Registro1923 registro1923, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro1923.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro1923.getCod_part()));
        sb.append("|").append(Util.preencheRegistro(registro1923.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(registro1923.getSer()));
        sb.append("|").append(Util.preencheRegistro(registro1923.getSub()));
        sb.append("|").append(Util.preencheRegistro(registro1923.getNum_doc()));
        sb.append("|").append(Util.preencheRegistro(registro1923.getDt_doc()));
        sb.append("|").append(Util.preencheRegistro(registro1923.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registro1923.getVl_aj_item()));
        sb.append("|").append(Util.preencheRegistro(registro1923.getChv_doce()));
        sb.append("|").append('\n');

        return sb;
    }
}
