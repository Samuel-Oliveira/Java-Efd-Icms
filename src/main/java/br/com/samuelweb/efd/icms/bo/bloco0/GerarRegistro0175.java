package br.com.samuelweb.efd.icms.bo.bloco0;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0175;
import br.com.samuelweb.efd.icms.util.Util;
/**
 * @author Samuel Oliveira
 */
public class GerarRegistro0175 {
	
	public static StringBuilder gerar(Registro0175 registro0175, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registro0175.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0175.getDt_alt()));
		sb.append("|").append(Util.preencheRegistro(registro0175.getNr_campo()));
		sb.append("|").append(Util.preencheRegistro(registro0175.getCont_ant()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
