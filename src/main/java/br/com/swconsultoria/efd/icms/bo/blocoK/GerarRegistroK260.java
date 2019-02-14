/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoK;

import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK260;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroK260 {

    public static StringBuilder gerar(RegistroK260 registroK260, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroK260.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroK260.getCod_op_os()));
        sb.append("|").append(Util.preencheRegistro(registroK260.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroK260.getDt_saida()));
        sb.append("|").append(Util.preencheRegistro(registroK260.getQtd_saida()));
        sb.append("|").append(Util.preencheRegistro(registroK260.getDt_ret()));
        sb.append("|").append(Util.preencheRegistro(registroK260.getQtd_ret()));
        sb.append("|").append('\n');

        return sb;
    }
}
