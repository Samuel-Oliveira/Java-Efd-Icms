/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoE;

import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE312;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroE312 {

	public static StringBuilder gerar(RegistroE312 registroE312, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroE312.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroE312.getNum_da()));
		sb.append("|").append(Util.preencheRegistro(registroE312.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroE312.getInd_proc()));
		sb.append("|").append(Util.preencheRegistro(registroE312.getProc()));
		sb.append("|").append(Util.preencheRegistro(registroE312.getTxt_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
