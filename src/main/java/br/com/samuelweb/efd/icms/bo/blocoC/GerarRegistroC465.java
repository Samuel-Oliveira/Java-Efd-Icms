package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC465;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC465 {

	public static StringBuilder gerar(RegistroC465 registroC465, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC465.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC465.getChv_cfe()));
		sb.append("|").append(Util.preencheRegistro(registroC465.getNum_ccf()));
		sb.append("|").append('\n');

		return sb;
	}
}
