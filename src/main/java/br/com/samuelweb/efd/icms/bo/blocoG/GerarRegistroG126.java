/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoG;

import br.com.samuelweb.efd.icms.registros.blocoG.RegistroG126;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroG126 {

	public static StringBuilder gerar(RegistroG126 registroG126, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroG126.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroG126.getDt_ini()));
		sb.append("|").append(Util.preencheRegistro(registroG126.getDt_fin()));
		sb.append("|").append(Util.preencheRegistro(registroG126.getNum_parc()));
		sb.append("|").append(Util.preencheRegistro(registroG126.getVl_parc_pass()));
		sb.append("|").append(Util.preencheRegistro(registroG126.getVl_trib_oc()));
		sb.append("|").append(Util.preencheRegistro(registroG126.getVl_total()));
		sb.append("|").append(Util.preencheRegistro(registroG126.getInd_per_sai()));
		sb.append("|").append(Util.preencheRegistro(registroG126.getVl_parc_aprop()));
		sb.append("|").append('\n');

		return sb;
	}
}
