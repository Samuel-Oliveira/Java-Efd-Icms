package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC160;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC160 {

    public static StringBuilder gerar(RegistroC160 registroC160, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC160.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC160.getCod_part()));
        sb.append("|").append(Util.preencheRegistro(registroC160.getVeic_id()));
        sb.append("|").append(Util.preencheRegistro(registroC160.getQtd_vol()));
        sb.append("|").append(Util.preencheRegistro(registroC160.getPeso_brt()));
        sb.append("|").append(Util.preencheRegistro(registroC160.getPeso_liq()));
        sb.append("|").append(Util.preencheRegistro(registroC160.getUf_id()));
        sb.append("|").append('\n');

        return sb;
    }
}
