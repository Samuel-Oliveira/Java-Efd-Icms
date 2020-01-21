package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC880;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC880 {

    public static StringBuilder gerar(RegistroC880 registroC880, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC880.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC880.getCod_mot_rest_compl()));
        sb.append("|").append(Util.preencheRegistro(registroC880.getQuant_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC880.getUnid()));
        sb.append("|").append(Util.preencheRegistro(registroC880.getVl_unit_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC880.getVl_unit_icms_na_operacao_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC880.getVl_unit_icms_op_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC880.getVl_unit_icms_op_estoque_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC880.getVl_unit_icms_st_estoque_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC880.getVl_unit_fcp_icms_st_estoque_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC880.getVl_unit_icms_st_conv_rest()));
        sb.append("|").append(Util.preencheRegistro(registroC880.getVl_unit_fcp_st_conv_rest()));
        sb.append("|").append(Util.preencheRegistro(registroC880.getVl_unit_icms_st_conv_compl()));
        sb.append("|").append(Util.preencheRegistro(registroC880.getVl_unit_fcp_st_conv_compl()));
        sb.append("|").append('\n');

        return sb;
    }
}
