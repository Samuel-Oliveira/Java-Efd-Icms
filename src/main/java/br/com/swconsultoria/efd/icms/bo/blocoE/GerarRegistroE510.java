/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoE;

import br.com.swconsultoria.efd.icms.registros.blocoE.RegistroE510;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroE510 {

    public static StringBuilder gerar(RegistroE510 registroE510, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroE510.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroE510.getCfop()));
        sb.append("|").append(Util.preencheRegistro(registroE510.getCst_ipi()));
        sb.append("|").append(Util.preencheRegistro(registroE510.getVl_cont_ipi()));
        sb.append("|").append(Util.preencheRegistro(registroE510.getVl_bc_ipi()));
        sb.append("|").append(Util.preencheRegistro(registroE510.getVl_ipi()));
        sb.append("|").append('\n');

        return sb;
    }
}
