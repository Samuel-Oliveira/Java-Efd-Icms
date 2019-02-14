/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoE;

import br.com.swconsultoria.efd.icms.registros.blocoE.RegistroE111;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroE111 {

    public static StringBuilder gerar(RegistroE111 registroE111, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroE111.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroE111.getCod_aj_apur()));
        sb.append("|").append(Util.preencheRegistro(registroE111.getDescr_compl_aj()));
        sb.append("|").append(Util.preencheRegistro(registroE111.getVl_aj_apur()));
        sb.append("|").append('\n');

        return sb;
    }
}
