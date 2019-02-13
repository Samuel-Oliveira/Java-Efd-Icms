/**
 *
 */
package br.com.samuelweb.efd.icms.bo.blocoK;

import br.com.samuelweb.efd.icms.registros.blocoK.RegistroK275;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroK275 {

    public static StringBuilder gerar(RegistroK275 registroK275, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroK275.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroK275.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroK275.getQtd_cor_pos()));
        sb.append("|").append(Util.preencheRegistro(registroK275.getQtd_cor_neg()));
        sb.append("|").append(Util.preencheRegistro(registroK275.getCod_ins_subst()));
        sb.append("|").append('\n');

        return sb;
    }
}
