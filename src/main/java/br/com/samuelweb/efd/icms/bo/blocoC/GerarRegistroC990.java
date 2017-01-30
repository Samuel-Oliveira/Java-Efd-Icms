/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarRegistroC990 {

	public static StringBuilder gerar(RegistroC990 registroC990, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC990.getQtd_lin_c()));
		sb.append("|").append('\n');

		return sb;
	}

}
