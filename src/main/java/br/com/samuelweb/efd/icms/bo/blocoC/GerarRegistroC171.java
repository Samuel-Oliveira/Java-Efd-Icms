package br.com.samuelweb.efd.icms.bo.blocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC171;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC171 {
	
	public static StringBuilder gerar(RegistroC171 registroC171, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registroC171.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC171.getNum_tanque()));
		sb.append("|").append(Util.preencheRegistro(registroC171.getQtde()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
