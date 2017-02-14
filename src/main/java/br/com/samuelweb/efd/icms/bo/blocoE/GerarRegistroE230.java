/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoE;

import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE230;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroE230 {

	public static StringBuilder gerar(RegistroE230 registroE230, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroE230.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroE230.getNum_da()));
		sb.append("|").append(Util.preencheRegistro(registroE230.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroE230.getInd_proc()));
		sb.append("|").append(Util.preencheRegistro(registroE230.getProc()));
		sb.append("|").append(Util.preencheRegistro(registroE230.getTxt_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
