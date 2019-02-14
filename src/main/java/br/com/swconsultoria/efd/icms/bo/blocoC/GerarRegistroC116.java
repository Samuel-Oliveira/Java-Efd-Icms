package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC116;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC116 {

    public static StringBuilder gerar(RegistroC116 registroC116, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC116.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC116.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(registroC116.getNr_sat()));
        sb.append("|").append(Util.preencheRegistro(registroC116.getChv_cfe()));
        sb.append("|").append(Util.preencheRegistro(registroC116.getNum_cfe()));
        sb.append("|").append(Util.preencheRegistro(registroC116.getDt_doc()));
        sb.append("|").append('\n');

        return sb;
    }
}
