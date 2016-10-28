package br.com.samuelweb.efd.icms.bo.bloco0;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0460;
import br.com.samuelweb.efd.icms.util.Util;
/**
 * @author Samuel Oliveira
 */
public class GerarRegistro0460 {
	
	public static StringBuilder gerar(Registro0460 registro0460, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registro0460.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0460.getCod_obs()));
		sb.append("|").append(Util.preencheRegistro(registro0460.getTxt()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
