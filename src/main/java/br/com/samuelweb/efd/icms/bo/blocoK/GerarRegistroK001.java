package br.com.samuelweb.efd.icms.bo.blocoK;
import br.com.samuelweb.efd.icms.registros.blocoK.RegistroK001;
import br.com.samuelweb.efd.icms.util.Util;
/**
 * @author Samuel Oliveira
 */
public class GerarRegistroK001 {
	
	public static StringBuilder gerar(RegistroK001 registroK001, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registroK001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroK001.getInd_mov()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
