package br.com.samuelweb.efd.icms.bo.blocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC130;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC130 {
	
	public static StringBuilder gerar(RegistroC130 registroC130, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registroC130.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC130.getVl_serv_nt()));
		sb.append("|").append(Util.preencheRegistro(registroC130.getVl_bc_issqn()));
		sb.append("|").append(Util.preencheRegistro(registroC130.getVl_issqn()));
		sb.append("|").append(Util.preencheRegistro(registroC130.getVl_bc_irrf()));
		sb.append("|").append(Util.preencheRegistro(registroC130.getVl_irrf()));
		sb.append("|").append(Util.preencheRegistro(registroC130.getVl_bc_prev()));
		sb.append("|").append(Util.preencheRegistro(registroC130.getVl_prev()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
