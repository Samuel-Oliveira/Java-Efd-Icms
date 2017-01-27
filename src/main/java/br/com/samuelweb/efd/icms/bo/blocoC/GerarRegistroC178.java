package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC178;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC178 {

	public static StringBuilder gerar(RegistroC178 registroC178, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC178.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC178.getCl_enq()));
		sb.append("|").append(Util.preencheRegistro(registroC178.getVl_unid()));
		sb.append("|").append(Util.preencheRegistro(registroC178.getQuant_pad()));
		sb.append("|").append('\n');

		return sb;
	}
}
