package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC510;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC510 {

	public static StringBuilder gerar(RegistroC510 registroC510, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC510.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC510.getNum_item()));
		sb.append("|").append(Util.preencheRegistro(registroC510.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroC510.getCod_class()));
		sb.append("|").append(Util.preencheRegistro(registroC510.getQtd()));
		sb.append("|").append(Util.preencheRegistro(registroC510.getUnid()));
		sb.append("|").append(Util.preencheRegistro(registroC510.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC510.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registroC510.getCst_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC510.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroC510.getVl_bc_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC510.getAliq_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC510.getVl_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC510.getVl_bc_icms_st()));
		sb.append("|").append(Util.preencheRegistro(registroC510.getAliq_st()));
		sb.append("|").append(Util.preencheRegistro(registroC510.getVl_icms_st()));
		sb.append("|").append(Util.preencheRegistro(registroC510.getInd_rec()));
		sb.append("|").append(Util.preencheRegistro(registroC510.getCod_part()));
		sb.append("|").append(Util.preencheRegistro(registroC510.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC510.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC510.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
