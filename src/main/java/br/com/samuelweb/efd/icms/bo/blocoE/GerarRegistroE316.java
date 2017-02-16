/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoE;

import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE316;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroE316 {

	public static StringBuilder gerar(RegistroE316 registroE316, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroE316.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroE316.getCod_or()));
		sb.append("|").append(Util.preencheRegistro(registroE316.getVl_or()));
		sb.append("|").append(Util.preencheRegistro(registroE316.getDt_vcto()));
		sb.append("|").append(Util.preencheRegistro(registroE316.getCod_rec()));
		sb.append("|").append(Util.preencheRegistro(registroE316.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroE316.getInd_proc()));
		sb.append("|").append(Util.preencheRegistro(registroE316.getProc()));
		sb.append("|").append(Util.preencheRegistro(registroE316.getTxt_compl()));
		sb.append("|").append(Util.preencheRegistro(registroE316.getMes_ref()));
		sb.append("|").append('\n');

		return sb;
	}
}
