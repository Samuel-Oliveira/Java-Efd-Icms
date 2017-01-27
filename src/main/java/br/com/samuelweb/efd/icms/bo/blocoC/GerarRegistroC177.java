package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC177;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC177 {

	public static StringBuilder gerar(RegistroC177 registroC177, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC177.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC177.getCod_selo_ipi()));
		sb.append("|").append(Util.preencheRegistro(registroC177.getQt_selo_ipi()));
		sb.append("|").append('\n');

		return sb;
	}
}
