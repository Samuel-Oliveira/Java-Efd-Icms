/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoK;

import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK220;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroK220 {

    public static StringBuilder gerar(RegistroK220 registroK220, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroK220.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroK220.getDt_mov()));
        sb.append("|").append(Util.preencheRegistro(registroK220.getCod_item_ori()));
        sb.append("|").append(Util.preencheRegistro(registroK220.getCod_item_dest()));
        sb.append("|").append(Util.preencheRegistro(registroK220.getQtd_ori()));
        sb.append("|").append(Util.preencheRegistro(registroK220.getQtd_dest()));
        sb.append("|").append('\n');

        return sb;
    }
}
