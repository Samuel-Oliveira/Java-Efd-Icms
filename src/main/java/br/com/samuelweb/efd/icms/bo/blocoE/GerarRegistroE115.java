/**
 *
 */
package br.com.samuelweb.efd.icms.bo.blocoE;

import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE115;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroE115 {

    public static StringBuilder gerar(RegistroE115 registroE115, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroE115.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroE115.getCod_inf_adic()));
        sb.append("|").append(Util.preencheRegistro(registroE115.getVl_inf_adic()));
        sb.append("|").append(Util.preencheRegistro(registroE115.getDescr_compl_aj()));
        sb.append("|").append('\n');

        return sb;
    }
}
