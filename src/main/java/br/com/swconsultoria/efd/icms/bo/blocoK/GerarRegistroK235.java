/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoK;

import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK235;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroK235 {

    public static StringBuilder gerar(RegistroK235 registroK235, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroK235.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroK235.getDt_saida()));
        sb.append("|").append(Util.preencheRegistro(registroK235.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroK235.getQtd()));
        sb.append("|").append(Util.preencheRegistro(registroK235.getCod_ins_subst()));
        sb.append("|").append('\n');

        return sb;
    }
}
