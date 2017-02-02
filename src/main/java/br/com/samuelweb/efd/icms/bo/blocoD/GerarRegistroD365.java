/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD365;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes - yurilemes2@gmail.com
 * 
 */
public class GerarRegistroD365 {

	public static StringBuilder gerar(RegistroD365 registroD365, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD365.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD365.getCod_tot_par()));
		sb.append("|").append(Util.preencheRegistro(registroD365.getVlr_acum_tot()));
		sb.append("|").append(Util.preencheRegistro(registroD365.getNr_tot()));
		sb.append("|").append(Util.preencheRegistro(registroD365.getDescr_nr_tot()));
		sb.append("|").append('\n');

		return sb;
	}
}
