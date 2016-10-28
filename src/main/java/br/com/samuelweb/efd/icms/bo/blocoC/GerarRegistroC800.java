package br.com.samuelweb.efd.icms.bo.blocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC800;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC800 {
	
	public static StringBuilder gerar(RegistroC800 registroC800, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registroC800.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC800.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroC800.getCod_sit()));
		sb.append("|").append(Util.preencheRegistro(registroC800.getNum_cfe()));
		sb.append("|").append(Util.preencheRegistro(registroC800.getDt_doc()));
		sb.append("|").append(Util.preencheRegistro(registroC800.getVl_cfe()));
		sb.append("|").append(Util.preencheRegistro(registroC800.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC800.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC800.getCnpj_cpf()));
		sb.append("|").append(Util.preencheRegistro(registroC800.getNr_sat()));
		sb.append("|").append(Util.preencheRegistro(registroC800.getChv_cfe()));
		sb.append("|").append(Util.preencheRegistro(registroC800.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registroC800.getVl_merc()));
		sb.append("|").append(Util.preencheRegistro(registroC800.getVl_out_da()));
		sb.append("|").append(Util.preencheRegistro(registroC800.getVl_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC800.getVl_pis_st()));
		sb.append("|").append(Util.preencheRegistro(registroC800.getVl_cofins_st()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
