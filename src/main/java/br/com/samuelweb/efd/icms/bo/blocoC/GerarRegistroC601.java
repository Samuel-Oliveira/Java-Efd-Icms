package br.com.samuelweb.efd.icms.bo.blocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC601;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC601 {
	
	public static StringBuilder gerar(RegistroC601 registroC601, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registroC601.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC601.getNum_doc_canc()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
