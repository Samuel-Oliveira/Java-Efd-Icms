package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC590;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC590 {

	public static StringBuilder gerar(RegistroC590 registroC590, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC590.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC590.getCst_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC590.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroC590.getAliq_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC590.getVl_opr()));
		sb.append("|").append(Util.preencheRegistro(registroC590.getVl_bc_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC590.getVl_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC590.getVl_bc_icms_st()));
		sb.append("|").append(Util.preencheRegistro(registroC590.getVl_icms_st()));
		sb.append("|").append(Util.preencheRegistro(registroC590.getVl_red_bc()));
		sb.append("|").append(Util.preencheRegistro(registroC590.getCod_obs()));
		sb.append("|").append('\n');

		return sb;
	}
}
