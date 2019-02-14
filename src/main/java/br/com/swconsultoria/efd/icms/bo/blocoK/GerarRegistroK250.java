/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoK;

import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK250;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes, Sidnei Klein
 *
 */
public class GerarRegistroK250 {

    public static StringBuilder gerar(RegistroK250 registroK250, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroK250.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroK250.getDt_prod()));
        sb.append("|").append(Util.preencheRegistro(registroK250.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroK250.getQtd()));
        sb.append("|").append(Util.preencheRegistro(registroK250.getCod_ins_subst()));
        sb.append("|").append('\n');

        return sb;
    }
}
