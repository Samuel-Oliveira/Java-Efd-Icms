package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC190;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC190 {

	public static StringBuilder gerar(RegistroC190 registroC190, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC190.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC190.getCst_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC190.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroC190.getAliq_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC190.getVl_opr()));
		sb.append("|").append(Util.preencheRegistro(registroC190.getVl_bc_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC190.getVl_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC190.getVl_bc_icms_st()));
		sb.append("|").append(Util.preencheRegistro(registroC190.getVl_icms_st()));
		sb.append("|").append(Util.preencheRegistro(registroC190.getVl_red_bc()));
		sb.append("|").append(Util.preencheRegistro(registroC190.getVl_ipi()));
		sb.append("|").append(Util.preencheRegistro(registroC190.getCod_obs()));
		sb.append("|").append('\n');

		return sb;
	}
}
