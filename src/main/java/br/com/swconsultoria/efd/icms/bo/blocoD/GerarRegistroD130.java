/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.blocoD.RegistroD130;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD130 {

    public static StringBuilder gerar(RegistroD130 registroD130, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD130.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD130.getCod_part_consg()));
        sb.append("|").append(Util.preencheRegistro(registroD130.getCod_part_red()));
        sb.append("|").append(Util.preencheRegistro(registroD130.getInd_frt_red()));
        sb.append("|").append(Util.preencheRegistro(registroD130.getCod_mun_orig()));
        sb.append("|").append(Util.preencheRegistro(registroD130.getCod_mun_dest()));
        sb.append("|").append(Util.preencheRegistro(registroD130.getVeic_id()));
        sb.append("|").append(Util.preencheRegistro(registroD130.getVl_liq_frt()));
        sb.append("|").append(Util.preencheRegistro(registroD130.getVl_sec_cat()));
        sb.append("|").append(Util.preencheRegistro(registroD130.getVl_desp()));
        sb.append("|").append(Util.preencheRegistro(registroD130.getVl_pedg()));
        sb.append("|").append(Util.preencheRegistro(registroD130.getVl_out()));
        sb.append("|").append(Util.preencheRegistro(registroD130.getVl_frt()));
        sb.append("|").append(Util.preencheRegistro(registroD130.getUf_id()));
        sb.append("|").append('\n');

        return sb;
    }
}
