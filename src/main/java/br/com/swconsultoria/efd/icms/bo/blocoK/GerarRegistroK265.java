/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoK;

import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK265;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroK265 {

    public static StringBuilder gerar(RegistroK265 registroK265, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroK265.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroK265.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroK265.getQtd_cons()));
        sb.append("|").append(Util.preencheRegistro(registroK265.getQtd_ret()));
        sb.append("|").append('\n');

        return sb;
    }
}
