package br.com.samuelweb.efd.icms.bo.bloco1;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0000;
import br.com.samuelweb.efd.icms.util.Util;
/**
 * @author Samuel Oliveira
 */
public class GerarRegistro0 {
	
	public static StringBuilder gerar(Registro1 registro1, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registro1.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1.get));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
