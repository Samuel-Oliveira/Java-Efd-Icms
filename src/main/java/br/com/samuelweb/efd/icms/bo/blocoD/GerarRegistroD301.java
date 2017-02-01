/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD301;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD301 {
	
	public static StringBuilder gerar(RegistroD301 registroD301, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD301.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD301.getNum_doc_canc()));
		sb.append("|").append('\n');

		return sb;
	}
}
