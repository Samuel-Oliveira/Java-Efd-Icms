package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC380;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC380 {

    public static StringBuilder gerar(RegistroC380 registroC380, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC380.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC380.getCod_mot_rest_compl()));
        sb.append("|").append(Util.preencheRegistro(registroC380.getQuant_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC380.getUnid()));
        sb.append("|").append(Util.preencheRegistro(registroC380.getVl_unit_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC380.getVl_unit_icms_na_operacao_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC380.getVl_unit_icms_op_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC380.getVl_unit_icms_op_estoque_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC380.getVl_unit_icms_st_estoque_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC380.getVl_unit_fcp_icms_st_estoque_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC380.getVl_unit_icms_st_conv_rest()));
        sb.append("|").append(Util.preencheRegistro(registroC380.getVl_unit_fcp_st_conv_rest()));
        sb.append("|").append(Util.preencheRegistro(registroC380.getVl_unit_icms_st_conv_compl()));
        sb.append("|").append(Util.preencheRegistro(registroC380.getVl_unit_fcp_st_conv_compl()));
        sb.append("|").append(Util.preencheRegistro(registroC380.getCst_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC380.getCfop()));
        sb.append("|").append('\n');

        return sb;
    }
}
