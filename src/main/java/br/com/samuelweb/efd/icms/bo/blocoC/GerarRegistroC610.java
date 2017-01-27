package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC610;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC610 {

	public static StringBuilder gerar(RegistroC610 registroC610, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC610.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC610.getCod_class()));
		sb.append("|").append(Util.preencheRegistro(registroC610.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroC610.getQtd()));
		sb.append("|").append(Util.preencheRegistro(registroC610.getUnid()));
		sb.append("|").append(Util.preencheRegistro(registroC610.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC610.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registroC610.getCst_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC610.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroC610.getAliq_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC610.getVl_bc_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC610.getVl_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC610.getVl_bc_icms_st()));
		sb.append("|").append(Util.preencheRegistro(registroC610.getVl_icms_st()));
		sb.append("|").append(Util.preencheRegistro(registroC610.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC610.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC610.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
