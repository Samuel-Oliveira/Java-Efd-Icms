/**
 *
 */
package br.com.samuelweb.efd.icms.bo.blocoE;

import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE310;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroE310 {

    public static StringBuilder gerar(RegistroE310 registroE310, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroE310.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroE310.getInd_mov_fcp_difal()));
        sb.append("|").append(Util.preencheRegistro(registroE310.getVl_sld_cred_ant_difal()));
        sb.append("|").append(Util.preencheRegistro(registroE310.getVl_tot_debitos_difal()));
        sb.append("|").append(Util.preencheRegistro(registroE310.getVl_out_deb_difal()));
        sb.append("|").append(Util.preencheRegistro(registroE310.getVl_tot_creditos_difal()));
        sb.append("|").append(Util.preencheRegistro(registroE310.getVl_out_cred_difal()));
        sb.append("|").append(Util.preencheRegistro(registroE310.getVl_sld_dev_ant_difal()));
        sb.append("|").append(Util.preencheRegistro(registroE310.getVl_deducoes_difal()));
        sb.append("|").append(Util.preencheRegistro(registroE310.getVl_recol_difal()));
        sb.append("|").append(Util.preencheRegistro(registroE310.getVl_sld_cred_transportar_difal()));
        sb.append("|").append(Util.preencheRegistro(registroE310.getDeb_esp_difal()));
        sb.append("|").append(Util.preencheRegistro(registroE310.getVl_sld_cred_ant_fcp()));
        sb.append("|").append(Util.preencheRegistro(registroE310.getVl_tot_deb_fcp()));
        sb.append("|").append(Util.preencheRegistro(registroE310.getVl_out_deb_fcp()));
        sb.append("|").append(Util.preencheRegistro(registroE310.getVl_tot_cred_fcp()));
        sb.append("|").append(Util.preencheRegistro(registroE310.getVl_out_cred_fcp()));
        sb.append("|").append(Util.preencheRegistro(registroE310.getVl_sld_dev_ant_fcp()));
        sb.append("|").append(Util.preencheRegistro(registroE310.getVl_deducoes_fcp()));
        sb.append("|").append(Util.preencheRegistro(registroE310.getVl_recol_fcp()));
        sb.append("|").append(Util.preencheRegistro(registroE310.getVl_sld_cred_transportar_fcp()));
        sb.append("|").append(Util.preencheRegistro(registroE310.getDeb_esp_fcp()));
        sb.append("|").append('\n');

        return sb;
    }
}
