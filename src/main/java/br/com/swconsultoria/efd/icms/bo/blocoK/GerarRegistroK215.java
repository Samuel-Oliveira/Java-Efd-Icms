/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoK;

import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK215;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroK215 {

    public static StringBuilder gerar(RegistroK215 registroK215, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroK215.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroK215.getCod_item_des()));
        sb.append("|").append(Util.preencheRegistro(registroK215.getQtd_des()));
        sb.append("|").append('\n');

        return sb;
    }
}
