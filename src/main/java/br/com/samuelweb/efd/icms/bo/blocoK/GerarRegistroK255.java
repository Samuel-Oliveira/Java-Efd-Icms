/**
 *
 */
package br.com.samuelweb.efd.icms.bo.blocoK;

import br.com.samuelweb.efd.icms.registros.blocoK.RegistroK255;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroK255 {

    public static StringBuilder gerar(RegistroK255 registroK255, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroK255.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroK255.getDt_cons()));
        sb.append("|").append(Util.preencheRegistro(registroK255.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroK255.getQtd()));
        sb.append("|").append(Util.preencheRegistro(registroK255.getCod_ins_subst()));
        sb.append("|").append('\n');

        return sb;
    }
}
