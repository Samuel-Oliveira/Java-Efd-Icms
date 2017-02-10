/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD696;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD696 {

	public static StringBuilder gerar(RegistroD696 registroD696, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD696.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD696.getCst_icms()));
		sb.append("|").append(Util.preencheRegistro(registroD696.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroD696.getAliq_icms()));
		sb.append("|").append(Util.preencheRegistro(registroD696.getVl_opr()));
		sb.append("|").append(Util.preencheRegistro(registroD696.getVl_bc_icms()));
		sb.append("|").append(Util.preencheRegistro(registroD696.getVl_icms()));
		sb.append("|").append(Util.preencheRegistro(registroD696.getVl_bc_icms_uf()));
		sb.append("|").append(Util.preencheRegistro(registroD696.getVl_icms_uf()));
		sb.append("|").append(Util.preencheRegistro(registroD696.getVl_red_bc()));
		sb.append("|").append(Util.preencheRegistro(registroD696.getCod_obs()));
		sb.append("|").append('\n');

		return sb;
	}
}
