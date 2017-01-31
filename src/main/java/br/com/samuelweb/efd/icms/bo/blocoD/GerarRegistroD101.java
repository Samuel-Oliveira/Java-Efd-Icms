package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD101;
import br.com.samuelweb.efd.icms.util.Util;
/**
 * @author Yuri Lemes
 * 
 */
public class GerarRegistroD101 {
	
	public static StringBuilder gerar(RegistroD101 registroD101, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD101.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD101.getVl_fcp_uf_dest()));
		sb.append("|").append(Util.preencheRegistro(registroD101.getVl_icms_uf_dest()));
		sb.append("|").append(Util.preencheRegistro(registroD101.getVl_icms_uf_rem()));
		sb.append("|").append('\n');

		return sb;
	}
}
