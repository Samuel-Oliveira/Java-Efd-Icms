package br.com.samuelweb.efd.icms.bo.blocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC321;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC321 {
	
	public static StringBuilder gerar(RegistroC321 registroC321, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registroC321.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC321.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroC321.getQtd()));
		sb.append("|").append(Util.preencheRegistro(registroC321.getUnid()));
		sb.append("|").append(Util.preencheRegistro(registroC321.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC321.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registroC321.getVl_bc_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC321.getVl_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC321.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC321.getVl_cofins()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
