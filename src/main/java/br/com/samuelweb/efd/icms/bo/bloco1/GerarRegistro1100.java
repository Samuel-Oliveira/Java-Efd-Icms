/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.bloco1;

import br.com.samuelweb.efd.icms.registros.bloco1.Registro1100;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1100 {

	public static StringBuilder gerar(Registro1100 registro1100, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1100.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getInd_doc()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getNro_de()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getDt_de()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getNat_exp()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getNro_re()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getDt_re()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getChc_emb()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getDt_chc()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getDt_avb()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getTp_chc()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getPais()));
		sb.append("|").append('\n');

		return sb;
	}
}
