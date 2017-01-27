package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC310;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC310 {

	public static StringBuilder gerar(RegistroC310 registroC310, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC310.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC310.getNum_doc_canc()));
		sb.append("|").append('\n');

		return sb;
	}
}
