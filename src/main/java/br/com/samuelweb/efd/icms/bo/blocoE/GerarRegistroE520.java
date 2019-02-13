/**
 *
 */
package br.com.samuelweb.efd.icms.bo.blocoE;

import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE520;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroE520 {

    public static StringBuilder gerar(RegistroE520 registroE520, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroE520.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroE520.getVl_sd_ant_ipi()));
        sb.append("|").append(Util.preencheRegistro(registroE520.getVl_deb_ipi()));
        sb.append("|").append(Util.preencheRegistro(registroE520.getVl_cred_ipi()));
        sb.append("|").append(Util.preencheRegistro(registroE520.getVl_od_ipi()));
        sb.append("|").append(Util.preencheRegistro(registroE520.getVl_oc_ipi()));
        sb.append("|").append(Util.preencheRegistro(registroE520.getVl_sc_ipi()));
        sb.append("|").append(Util.preencheRegistro(registroE520.getVl_sd_ipi()));
        sb.append("|").append('\n');

        return sb;
    }
}
