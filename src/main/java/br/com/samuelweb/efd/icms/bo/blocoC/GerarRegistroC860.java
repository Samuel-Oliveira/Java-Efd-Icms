package br.com.samuelweb.efd.icms.bo.blocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC860;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC860 {
	
	public static StringBuilder gerar(RegistroC860 registroC860, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registroC860.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC860.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroC860.getNr_sat()));
		sb.append("|").append(Util.preencheRegistro(registroC860.getDt_doc()));
		sb.append("|").append(Util.preencheRegistro(registroC860.getDoc_ini()));
		sb.append("|").append(Util.preencheRegistro(registroC860.getDoc_fim()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
