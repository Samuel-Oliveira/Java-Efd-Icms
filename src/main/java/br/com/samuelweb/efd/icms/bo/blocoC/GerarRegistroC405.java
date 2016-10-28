package br.com.samuelweb.efd.icms.bo.blocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC405;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC405 {
	
	public static StringBuilder gerar(RegistroC405 registroC405, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registroC405.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC405.getDt_doc()));
		sb.append("|").append(Util.preencheRegistro(registroC405.getCro()));
		sb.append("|").append(Util.preencheRegistro(registroC405.getCrz()));
		sb.append("|").append(Util.preencheRegistro(registroC405.getNum_coo_fin()));
		sb.append("|").append(Util.preencheRegistro(registroC405.getGt_fin()));
		sb.append("|").append(Util.preencheRegistro(registroC405.getVl_brt()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
