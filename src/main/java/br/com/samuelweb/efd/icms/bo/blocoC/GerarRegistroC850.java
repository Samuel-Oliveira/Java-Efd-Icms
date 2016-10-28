package br.com.samuelweb.efd.icms.bo.blocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC850;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC850 {
	
	public static StringBuilder gerar(RegistroC850 registroC850, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registroC850.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC850.getCst_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC850.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroC850.getAliq_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC850.getVl_opr()));
		sb.append("|").append(Util.preencheRegistro(registroC850.getVl_bc_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC850.getVl_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC850.getCod_obs()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
