/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoE;

import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE311;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroE311 {

	public static StringBuilder gerar(RegistroE311 registroE311, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroE311.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroE311.getCod_aj_apur()));
		sb.append("|").append(Util.preencheRegistro(registroE311.getDescr_compl_aj()));
		sb.append("|").append(Util.preencheRegistro(registroE311.getVl_aj_apur()));
		sb.append("|").append('\n');

		return sb;
	}
}
