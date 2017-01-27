package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC300;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC300 {

	public static StringBuilder gerar(RegistroC300 registroC300, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC300.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC300.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroC300.getSer()));
		sb.append("|").append(Util.preencheRegistro(registroC300.getSub()));
		sb.append("|").append(Util.preencheRegistro(registroC300.getNum_doc_ini()));
		sb.append("|").append(Util.preencheRegistro(registroC300.getNum_doc_fin()));
		sb.append("|").append(Util.preencheRegistro(registroC300.getDt_doc()));
		sb.append("|").append(Util.preencheRegistro(registroC300.getVl_doc()));
		sb.append("|").append(Util.preencheRegistro(registroC300.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC300.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC300.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
