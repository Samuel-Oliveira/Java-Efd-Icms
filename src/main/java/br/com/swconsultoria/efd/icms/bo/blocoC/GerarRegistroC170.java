package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC170;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Sidnei Klein
 */
public class GerarRegistroC170 {

    public static StringBuilder gerar(RegistroC170 registroC170, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC170.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getNum_item()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getDescr_compl()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getQtd()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getUnid()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getVl_item()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getVl_desc()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getInd_mov()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getCst_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getCfop()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getCod_nat()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getVl_bc_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getAliq_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getVl_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getVl_bc_icms_st()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getAliq_st()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getVl_icms_st()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getInd_apur()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getCst_ipi()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getCod_enq()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getVl_bc_ipi()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getAliq_ipi()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getVl_ipi()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getCst_pis()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getVl_bc_pis()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getAliq_pis_percentual()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getQuant_bc_pis()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getAliq_pis_reais()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getVl_pis()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getCst_cofins()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getVl_bc_cofins()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getAliq_cofins_percentual()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getQuant_bc_cofins()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getAliq_cofins_reais()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getVl_cofins()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getcod_cta()));
        sb.append("|").append(Util.preencheRegistro(registroC170.getVl_abat_nt()));
        sb.append("|").append('\n');

        return sb;
    }
}
