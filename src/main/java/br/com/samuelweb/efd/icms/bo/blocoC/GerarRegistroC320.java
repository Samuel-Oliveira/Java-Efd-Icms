package br.com.samuelweb.efd.icms.bo.blocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC320;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC320 {
	
	public static StringBuilder gerar(RegistroC320 registroC320, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registroC320.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC320.getCst_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC320.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroC320.getAliq_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC320.getVl_opr()));
		sb.append("|").append(Util.preencheRegistro(registroC320.getVl_bc_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC320.getVl_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC320.getVl_red_bc()));
		sb.append("|").append(Util.preencheRegistro(registroC320.getCod_obs()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
