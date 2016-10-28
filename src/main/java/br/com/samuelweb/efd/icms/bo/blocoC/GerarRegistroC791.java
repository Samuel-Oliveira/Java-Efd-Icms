package br.com.samuelweb.efd.icms.bo.blocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC791;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC791 {
	
	public static StringBuilder gerar(RegistroC791 registroC791, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registroC791.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC791.getUf()));
		sb.append("|").append(Util.preencheRegistro(registroC791.getVl_bc_icms_st()));
		sb.append("|").append(Util.preencheRegistro(registroC791.getVl_icms_st()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
