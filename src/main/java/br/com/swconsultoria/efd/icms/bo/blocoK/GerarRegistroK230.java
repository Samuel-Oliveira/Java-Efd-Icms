/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoK;

import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK230;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroK230 {

    public static StringBuilder gerar(RegistroK230 registroK230, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroK230.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroK230.getDt_ini_op()));
        sb.append("|").append(Util.preencheRegistro(registroK230.getDt_fin_op()));
        sb.append("|").append(Util.preencheRegistro(registroK230.getCod_doc_op()));
        sb.append("|").append(Util.preencheRegistro(registroK230.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroK230.getQtd_enc()));
        sb.append("|").append('\n');

        return sb;
    }
}
