package br.com.samuelweb.efd.icms.bo.blocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC101;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC101 {
	
	public static StringBuilder gerar(RegistroC101 registroC101, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registroC101.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC101.getVl_fcp_uf_dest()));
		sb.append("|").append(Util.preencheRegistro(registroC101.getVl_icms_uf_dest()));
		sb.append("|").append(Util.preencheRegistro(registroC101.getVl_icms_uf_rem()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
