/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoE;

import br.com.swconsultoria.efd.icms.registros.blocoE.RegistroE210;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroE210 {

    public static StringBuilder gerar(RegistroE210 registroE210, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroE210.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroE210.getInd_mov_st()));
        sb.append("|").append(Util.preencheRegistro(registroE210.getVl_sld_cred_ant_st()));
        sb.append("|").append(Util.preencheRegistro(registroE210.getVl_devol_st()));
        sb.append("|").append(Util.preencheRegistro(registroE210.getVl_ressarc_st()));
        sb.append("|").append(Util.preencheRegistro(registroE210.getVl_out_cred_st()));
        sb.append("|").append(Util.preencheRegistro(registroE210.getVl_aj_creditos_st()));
        sb.append("|").append(Util.preencheRegistro(registroE210.getVl_retencao_st()));
        sb.append("|").append(Util.preencheRegistro(registroE210.getVl_out_deb_st()));
        sb.append("|").append(Util.preencheRegistro(registroE210.getVl_aj_debitos_st()));
        sb.append("|").append(Util.preencheRegistro(registroE210.getVl_sld_dev_ant_st()));
        sb.append("|").append(Util.preencheRegistro(registroE210.getVl_deducoes_st()));
        sb.append("|").append(Util.preencheRegistro(registroE210.getVl_icms_recol_st()));
        sb.append("|").append(Util.preencheRegistro(registroE210.getVl_sld_cred_st_transportar()));
        sb.append("|").append(Util.preencheRegistro(registroE210.getDeb_esp_st()));
        sb.append("|").append('\n');

        return sb;
    }
}
