package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC115;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC115 {

    public static StringBuilder gerar(RegistroC115 registroC115, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC115.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC115.getInd_carga()));
        sb.append("|").append(Util.preencheRegistro(registroC115.getCnpj_col()));
        sb.append("|").append(Util.preencheRegistro(registroC115.getIe_col()));
        sb.append("|").append(Util.preencheRegistro(registroC115.getCpf_col()));
        sb.append("|").append(Util.preencheRegistro(registroC115.getCod_mun_col()));
        sb.append("|").append(Util.preencheRegistro(registroC115.getCnpj_entg()));
        sb.append("|").append(Util.preencheRegistro(registroC115.getIe_entg()));
        sb.append("|").append(Util.preencheRegistro(registroC115.getCpf_entg()));
        sb.append("|").append(Util.preencheRegistro(registroC115.getCod_mun_entg()));
        sb.append("|").append('\n');

        return sb;
    }
}
