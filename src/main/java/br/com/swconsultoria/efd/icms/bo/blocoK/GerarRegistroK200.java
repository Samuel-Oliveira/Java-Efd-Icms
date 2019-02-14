/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoK;

import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK200;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroK200 {

    public static StringBuilder gerar(RegistroK200 registroK200, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroK200.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroK200.getDt_est()));
        sb.append("|").append(Util.preencheRegistro(registroK200.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroK200.getQtd()));
        sb.append("|").append(Util.preencheRegistro(registroK200.getInd_est()));
        sb.append("|").append(Util.preencheRegistro(registroK200.getCod_part()));
        sb.append("|").append('\n');

        return sb;
    }
}
