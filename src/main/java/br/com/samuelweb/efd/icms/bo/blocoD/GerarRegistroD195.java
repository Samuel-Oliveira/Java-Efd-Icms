/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD195;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD195 {

	public static StringBuilder gerar(RegistroD195 registroD195, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD195.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD195.getCod_obs()));
		sb.append("|").append(Util.preencheRegistro(registroD195.getTxt_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
