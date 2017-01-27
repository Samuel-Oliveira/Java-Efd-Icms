package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC370;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC370 {

	public static StringBuilder gerar(RegistroC370 registroC370, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC370.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC370.getNum_item()));
		sb.append("|").append(Util.preencheRegistro(registroC370.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroC370.getQtd()));
		sb.append("|").append(Util.preencheRegistro(registroC370.getUnid()));
		sb.append("|").append(Util.preencheRegistro(registroC370.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC370.getVl_desc()));
		sb.append("|").append('\n');

		return sb;
	}
}
