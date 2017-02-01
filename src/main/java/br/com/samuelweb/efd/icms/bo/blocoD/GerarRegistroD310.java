/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD310;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD310 {

	public static StringBuilder gerar(RegistroD310 registroD310, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD310.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD310.getCod_mun_orig()));
		sb.append("|").append(Util.preencheRegistro(registroD310.getVl_serv()));
		sb.append("|").append(Util.preencheRegistro(registroD310.getVl_bc_icms()));
		sb.append("|").append(Util.preencheRegistro(registroD310.getVl_icms()));
		sb.append("|").append('\n');

		return sb;
	}
}
