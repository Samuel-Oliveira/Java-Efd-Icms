package br.com.samuelweb.efd.icms.bo.blocoD;
import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD001;
import br.com.samuelweb.efd.icms.util.Util;
/**
 * @author Samuel Oliveira
 */
public class GerarRegistroD001 {
	
	public static StringBuilder gerar(RegistroD001 registroD001, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registroD001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD001.getInd_mov()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
