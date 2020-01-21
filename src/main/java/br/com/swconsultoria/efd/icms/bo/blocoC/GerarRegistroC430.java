package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC430;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC430 {

    public static StringBuilder gerar(RegistroC430 registroC430, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC430.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC430.getCod_mot_rest_compl()));
        sb.append("|").append(Util.preencheRegistro(registroC430.getQuant_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC430.getUnid()));
        sb.append("|").append(Util.preencheRegistro(registroC430.getVl_unit_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC430.getVl_unit_icms_na_operacao_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC430.getVl_unit_icms_op_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC430.getVl_unit_icms_op_estoque_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC430.getVl_unit_icms_st_estoque_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC430.getVl_unit_fcp_icms_st_estoque_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC430.getVl_unit_icms_st_conv_rest()));
        sb.append("|").append(Util.preencheRegistro(registroC430.getVl_unit_fcp_st_conv_rest()));
        sb.append("|").append(Util.preencheRegistro(registroC430.getVl_unit_icms_st_conv_compl()));
        sb.append("|").append(Util.preencheRegistro(registroC430.getVl_unit_fcp_st_conv_compl()));
        sb.append("|").append(Util.preencheRegistro(registroC430.getCst_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC430.getCfop()));
        sb.append("|").append('\n');

        return sb;
    }
}
