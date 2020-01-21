/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.bloco1;

import br.com.swconsultoria.efd.icms.registros.bloco1.Registro1255;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1255 {

    public static StringBuilder gerar(Registro1255 registro1255, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro1255.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro1255.getCod_mot_rest_compl()));
        sb.append("|").append(Util.preencheRegistro(registro1255.getVl_credito_icms_op_mot()));
        sb.append("|").append(Util.preencheRegistro(registro1255.getVl_icms_st_rest_mot()));
        sb.append("|").append(Util.preencheRegistro(registro1255.getVl_fcp_st_rest_mot()));
        sb.append("|").append(Util.preencheRegistro(registro1255.getVl_icms_st_compl_mot()));
        sb.append("|").append(Util.preencheRegistro(registro1255.getVl_fcp_st_compl_mot()));
        sb.append("|").append('\n');

        return sb;
    }
}
