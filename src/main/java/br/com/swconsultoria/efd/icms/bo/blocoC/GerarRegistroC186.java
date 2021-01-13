package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC186;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC186 {

    public static StringBuilder gerar(RegistroC186 registroC186, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC186.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC186.getNum_item()));
        sb.append("|").append(Util.preencheRegistro(registroC186.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroC186.getCst_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC186.getCfop()));
        sb.append("|").append(Util.preencheRegistro(registroC186.getCod_mot_rest_compl()));
        sb.append("|").append(Util.preencheRegistro(registroC186.getQuant_conv()));
        sb.append("|").append(Util.preencheRegistro(registroC186.getUnid()));
        sb.append("|").append(Util.preencheRegistro(registroC186.getCod_mod_entrada()));
        sb.append("|").append(Util.preencheRegistro(registroC186.getSerie_entrada()));
        sb.append("|").append(Util.preencheRegistro(registroC186.getNum_doc_entrada()));
        sb.append("|").append(Util.preencheRegistro(registroC186.getChv_dfe_entrada()));
        sb.append("|").append(Util.preencheRegistro(registroC186.getDt_doc_entrada()));
        sb.append("|").append(Util.preencheRegistro(registroC186.getNum_item_entrada()));
        sb.append("|").append(Util.preencheRegistro(registroC186.getVl_unit_conv_entrada()));
        sb.append("|").append(Util.preencheRegistro(registroC186.getVl_unit_icms_op_conv_entrada()));
        sb.append("|").append(Util.preencheRegistro(registroC186.getVl_unit_bc_icms_st_conv_entrada()));
        sb.append("|").append(Util.preencheRegistro(registroC186.getVl_unit_icms_st_conv_entrada()));
        sb.append("|").append(Util.preencheRegistro(registroC186.getVl_unit_fcp_st_conv_entrada()));
        sb.append("|").append('\n');

        return sb;
    }
}
