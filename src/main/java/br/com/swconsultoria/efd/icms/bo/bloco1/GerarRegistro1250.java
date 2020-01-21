/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.bloco1;

import br.com.swconsultoria.efd.icms.registros.bloco1.Registro1250;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1250 {

    public static StringBuilder gerar(Registro1250 registro1250, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro1250.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro1250.getVl_credito_icms_op()));
        sb.append("|").append(Util.preencheRegistro(registro1250.getVl_icms_st_rest()));
        sb.append("|").append(Util.preencheRegistro(registro1250.getVl_fcp_st_rest()));
        sb.append("|").append(Util.preencheRegistro(registro1250.getVl_icms_st_compl()));
        sb.append("|").append(Util.preencheRegistro(registro1250.getVl_fcp_st_compl()));
        sb.append("|").append('\n');

        return sb;
    }
}
