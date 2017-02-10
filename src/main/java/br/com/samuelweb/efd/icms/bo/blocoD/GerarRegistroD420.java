/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD420;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD420 {

	public static StringBuilder gerar(RegistroD420 registroD420, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD420.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD420.getCod_mun_orig()));
		sb.append("|").append(Util.preencheRegistro(registroD420.getVl_serv()));
		sb.append("|").append(Util.preencheRegistro(registroD420.getVl_bc_icms()));
		sb.append("|").append(Util.preencheRegistro(registroD420.getVl_icms()));
		sb.append("|").append('\n');

		return sb;
	}
}
