package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC410;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC410 {

	public static StringBuilder gerar(RegistroC410 registroC410, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC410.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC410.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC410.getVl_cofins()));
		sb.append("|").append('\n');

		return sb;
	}
}
