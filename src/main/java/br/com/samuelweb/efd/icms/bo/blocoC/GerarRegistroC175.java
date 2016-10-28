package br.com.samuelweb.efd.icms.bo.blocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC175;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC175 {
	
	public static StringBuilder gerar(RegistroC175 registroC175, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registroC175.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC175.getInd_veic_oper()));
		sb.append("|").append(Util.preencheRegistro(registroC175.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroC175.getUf()));
		sb.append("|").append(Util.preencheRegistro(registroC175.getChassi_veic()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
