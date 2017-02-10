/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD695;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD695 {

	public static StringBuilder gerar(RegistroD695 registroD695, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD695.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD695.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroD695.getSer()));
		sb.append("|").append(Util.preencheRegistro(registroD695.getNro_ord_ini()));
		sb.append("|").append(Util.preencheRegistro(registroD695.getNro_ord_fin()));
		sb.append("|").append(Util.preencheRegistro(registroD695.getDt_doc_ini()));
		sb.append("|").append(Util.preencheRegistro(registroD695.getDt_doc_fin()));
		sb.append("|").append(Util.preencheRegistro(registroD695.getNom_mest()));
		sb.append("|").append(Util.preencheRegistro(registroD695.getChv_cod_dig()));
		sb.append("|").append('\n');

		return sb;
	}
}
