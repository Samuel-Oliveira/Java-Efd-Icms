/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoE;

import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE313;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroE313 {

	public static StringBuilder gerar(RegistroE313 registroE313, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroE313.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroE313.getCod_part()));
		sb.append("|").append(Util.preencheRegistro(registroE313.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroE313.getSer()));
		sb.append("|").append(Util.preencheRegistro(registroE313.getSub()));
		sb.append("|").append(Util.preencheRegistro(registroE313.getNum_doc()));
		sb.append("|").append(Util.preencheRegistro(registroE313.getChv_doc_e()));
		sb.append("|").append(Util.preencheRegistro(registroE313.getDt_doc()));
		sb.append("|").append(Util.preencheRegistro(registroE313.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroE313.getVl_aj_item()));
		sb.append("|").append('\n');

		return sb;
	}
}
