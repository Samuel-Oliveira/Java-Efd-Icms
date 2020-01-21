package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC185;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC185 {

    public static StringBuilder gerar(RegistroC185 registroC185, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC185.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC185.getNum_item()));
        sb.append("|").append(Util.preencheRegistro(registroC185.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroC185.getCst_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC185.getCfop()));
        sb.append("|").append(Util.preencheRegistro(registroC185.getCod_mot_rest_compl()));
        sb.append("|").append(Util.preencheRegistro(registroC185.getQuant_mov()));
        sb.append("|").append(Util.preencheRegistro(registroC185.getUnid()));
        sb.append("|").append(Util.preencheRegistro(registroC185.getVl_unid_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC185.getVl_unit_icms_na_operacao_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC185.getVl_unit_icms_op_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC185.getVl_unit_icms_op_estoque_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC185.getVl_unit_icms_st_estoque_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC185.getVl_unit_fcp_icms_st_estoque_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC185.getVl_unit_icms_st_conv_rest()));
        sb.append("|").append(Util.preencheRegistro(registroC185.getVl_unit_fcp_st_conv_rest()));
        sb.append("|").append(Util.preencheRegistro(registroC185.getVl_unit_icms_st_conv_compl()));
        sb.append("|").append(Util.preencheRegistro(registroC185.getVl_unit_fcp_st_conv_compl()));
        sb.append("|").append('\n');

        return sb;
    }
}
