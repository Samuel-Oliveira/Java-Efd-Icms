package br.com.samuelweb.efd.icms.bo.blocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC165;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC165 {
	
	public static StringBuilder gerar(RegistroC165 registroC165, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registroC165.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC165.getCod_part()));
		sb.append("|").append(Util.preencheRegistro(registroC165.getVeic_id()));
		sb.append("|").append(Util.preencheRegistro(registroC165.getCod_aut()));
		sb.append("|").append(Util.preencheRegistro(registroC165.getNr_passe()));
		sb.append("|").append(Util.preencheRegistro(registroC165.getHora()));
		sb.append("|").append(Util.preencheRegistro(registroC165.getTemper()));
		sb.append("|").append(Util.preencheRegistro(registroC165.getQtd_vol()));
		sb.append("|").append(Util.preencheRegistro(registroC165.getPeso_brt()));
		sb.append("|").append(Util.preencheRegistro(registroC165.getPeso_liq()));
		sb.append("|").append(Util.preencheRegistro(registroC165.getNom_mot()));
		sb.append("|").append(Util.preencheRegistro(registroC165.getCpf()));
		sb.append("|").append(Util.preencheRegistro(registroC165.getUf_id()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
