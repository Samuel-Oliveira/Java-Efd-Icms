/**
 *
 */
package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD170;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD170 {

    public static StringBuilder gerar(RegistroD170 registroD170, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD170.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD170.getCod_part_consg()));
        sb.append("|").append(Util.preencheRegistro(registroD170.getCod_part_red()));
        sb.append("|").append(Util.preencheRegistro(registroD170.getCod_mun_orig()));
        sb.append("|").append(Util.preencheRegistro(registroD170.getCod_mun_dest()));
        sb.append("|").append(Util.preencheRegistro(registroD170.getOtm()));
        sb.append("|").append(Util.preencheRegistro(registroD170.getInd_nat_frt()));
        sb.append("|").append(Util.preencheRegistro(registroD170.getVl_liq_frt()));
        sb.append("|").append(Util.preencheRegistro(registroD170.getVl_gris()));
        sb.append("|").append(Util.preencheRegistro(registroD170.getVl_pdg()));
        sb.append("|").append(Util.preencheRegistro(registroD170.getVl_out()));
        sb.append("|").append(Util.preencheRegistro(registroD170.getVl_frt()));
        sb.append("|").append(Util.preencheRegistro(registroD170.getVeic_id()));
        sb.append("|").append(Util.preencheRegistro(registroD170.getUf_id()));
        sb.append("|").append('\n');

        return sb;
    }
}
