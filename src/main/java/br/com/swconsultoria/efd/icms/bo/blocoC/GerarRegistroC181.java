package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC181;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC181 {

    public static StringBuilder gerar(RegistroC181 registroC181, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC181.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC181.getCod_mot_rest_compl()));
        sb.append("|").append(Util.preencheRegistro(registroC181.getQuant_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC181.getUnid()));
        sb.append("|").append(Util.preencheRegistro(registroC181.getCod_mod_saida()));
        sb.append("|").append(Util.preencheRegistro(registroC181.getSerie_saida()));
        sb.append("|").append(Util.preencheRegistro(registroC181.getEcf_fab_saida()));
        sb.append("|").append(Util.preencheRegistro(registroC181.getNum_doc_saida()));
        sb.append("|").append(Util.preencheRegistro(registroC181.getChv_dfe_saida()));
        sb.append("|").append(Util.preencheRegistro(registroC181.getDt_doc_saida()));
        sb.append("|").append(Util.preencheRegistro(registroC181.getNum_item_saida()));
        sb.append("|").append(Util.preencheRegistro(registroC181.getVl_unit_conv_saida()));
        sb.append("|").append(Util.preencheRegistro(registroC181.getVl_unit_icms_op_estoque_conv_saida()));
        sb.append("|").append(Util.preencheRegistro(registroC181.getVl_unit_icms_st_estoque_conv_saida()));
        sb.append("|").append(Util.preencheRegistro(registroC181.getVl_unit_fcp_icms_st_estoque_conv_saida()));
        sb.append("|").append(Util.preencheRegistro(registroC181.getVl_unit_icms_na_operacao_conv_saida()));
        sb.append("|").append(Util.preencheRegistro(registroC181.getVl_unit_icms_op_conv_saida()));
        sb.append("|").append(Util.preencheRegistro(registroC181.getVl_unit_icms_st_conv_rest()));
        sb.append("|").append(Util.preencheRegistro(registroC181.getVl_unit_fcp_st_conv_rest()));
        sb.append("|").append(Util.preencheRegistro(registroC181.getVl_unit_icms_st_conv_compl()));
        sb.append("|").append(Util.preencheRegistro(registroC181.getVl_unit_fcp_st_conv_compl()));
        sb.append("|").append('\n');

        return sb;
    }
}
