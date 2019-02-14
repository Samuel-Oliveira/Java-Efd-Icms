/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.blocoD.RegistroD140;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD140 {

    public static StringBuilder gerar(RegistroD140 registroD140, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD140.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD140.getCod_part_consg()));
        sb.append("|").append(Util.preencheRegistro(registroD140.getCod_mun_orig()));
        sb.append("|").append(Util.preencheRegistro(registroD140.getCod_mun_dest()));
        sb.append("|").append(Util.preencheRegistro(registroD140.getInd_veic()));
        sb.append("|").append(Util.preencheRegistro(registroD140.getVeic_id()));
        sb.append("|").append(Util.preencheRegistro(registroD140.getInd_nav()));
        sb.append("|").append(Util.preencheRegistro(registroD140.getViagem()));
        sb.append("|").append(Util.preencheRegistro(registroD140.getVl_frt_liq()));
        sb.append("|").append(Util.preencheRegistro(registroD140.getVl_desp_port()));
        sb.append("|").append(Util.preencheRegistro(registroD140.getVl_desp_car_desc()));
        sb.append("|").append(Util.preencheRegistro(registroD140.getVl_out()));
        sb.append("|").append(Util.preencheRegistro(registroD140.getVl_frt_brt()));
        sb.append("|").append(Util.preencheRegistro(registroD140.getVl_frt_mm()));
        sb.append("|").append('\n');

        return sb;
    }
}
