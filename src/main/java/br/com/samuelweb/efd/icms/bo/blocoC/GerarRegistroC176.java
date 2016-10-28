package br.com.samuelweb.efd.icms.bo.blocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC176;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC176 {
	
	public static StringBuilder gerar(RegistroC176 registroC176, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registroC176.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getCod_mod_ult_e()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getNum_doc_ult_e()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getSer_ult_e()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getDt_ult_e()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getCod_part_ult_e()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getQuant_ult_e()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getVl_unit_ult_e()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getVl_unit_bc_st()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getChave_nfe_ult_e()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getNum_item_ult_e()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getVl_unit_bc_icms_ult_e()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getAliq_icms_ult_e()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getVl_unit_limite_bc_icms_ult_e()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getVl_unit_icms_ult_e()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getAliq_st_ult_e()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getVl_unit_res()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getCod_resp_ret()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getCod_mot_res()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getChave_nfe_ret()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getCod_part_nfe_ret()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getSer_nfe_ret()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getNum_nfe_ret()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getItem_nfe_ret()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getCod_da()));
		sb.append("|").append(Util.preencheRegistro(registroC176.getNum_da()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
