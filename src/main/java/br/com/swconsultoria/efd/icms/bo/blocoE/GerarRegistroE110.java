/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoE;

import br.com.swconsultoria.efd.icms.registros.blocoE.RegistroE110;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroE110 {

    public static StringBuilder gerar(RegistroE110 registroE110, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroE110.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroE110.getVl_tot_debitos()));
        sb.append("|").append(Util.preencheRegistro(registroE110.getVl_aj_debitos()));
        sb.append("|").append(Util.preencheRegistro(registroE110.getVl_tot_aj_debitos()));
        sb.append("|").append(Util.preencheRegistro(registroE110.getVl_estornos_cred()));
        sb.append("|").append(Util.preencheRegistro(registroE110.getVl_tot_creditos()));
        sb.append("|").append(Util.preencheRegistro(registroE110.getVl_aj_creditos()));
        sb.append("|").append(Util.preencheRegistro(registroE110.getVl_tot_aj_creditos()));
        sb.append("|").append(Util.preencheRegistro(registroE110.getVl_estornos_deb()));
        sb.append("|").append(Util.preencheRegistro(registroE110.getVl_sld_credor_ant()));
        sb.append("|").append(Util.preencheRegistro(registroE110.getVl_sld_apurado()));
        sb.append("|").append(Util.preencheRegistro(registroE110.getVl_tot_ded()));
        sb.append("|").append(Util.preencheRegistro(registroE110.getVl_icms_recolher()));
        sb.append("|").append(Util.preencheRegistro(registroE110.getVl_sld_credor_transportar()));
        sb.append("|").append(Util.preencheRegistro(registroE110.getDeb_esp()));
        sb.append("|").append('\n');

        return sb;
    }
}
