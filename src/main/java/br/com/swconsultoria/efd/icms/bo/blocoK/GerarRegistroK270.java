/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoK;

import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK270;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroK270 {

    public static StringBuilder gerar(RegistroK270 registroK270, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroK270.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroK270.getDt_ini_ap()));
        sb.append("|").append(Util.preencheRegistro(registroK270.getDt_fin_ap()));
        sb.append("|").append(Util.preencheRegistro(registroK270.getCod_op_os()));
        sb.append("|").append(Util.preencheRegistro(registroK270.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroK270.getQtd_cor_pos()));
        sb.append("|").append(Util.preencheRegistro(registroK270.getQtd_cor_neg()));
        sb.append("|").append(Util.preencheRegistro(registroK270.getOrigem()));
        sb.append("|").append('\n');

        return sb;
    }
}
