/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoK;

import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK290;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Sidnei Klein
 *
 */
public class GerarRegistroK290 {

    public static StringBuilder gerar(RegistroK290 registroK290, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroK290.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroK290.getDt_ini_op()));
        sb.append("|").append(Util.preencheRegistro(registroK290.getDt_fin_op()));
        sb.append("|").append(Util.preencheRegistro(registroK290.getCod_doc_op()));
        sb.append("|").append('\n');

        return sb;
    }
}
