/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.bloco1;

import br.com.samuelweb.efd.icms.registros.bloco1.Registro1510;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1510 {

	public static StringBuilder gerar(Registro1510 registro1510, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1510.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1510.getNum_item()));
		sb.append("|").append(Util.preencheRegistro(registro1510.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registro1510.getCod_class()));
		sb.append("|").append(Util.preencheRegistro(registro1510.getQtd()));
		sb.append("|").append(Util.preencheRegistro(registro1510.getUnid()));
		sb.append("|").append(Util.preencheRegistro(registro1510.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registro1510.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registro1510.getCst_icms()));
		sb.append("|").append(Util.preencheRegistro(registro1510.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registro1510.getVl_bc_icms()));
		sb.append("|").append(Util.preencheRegistro(registro1510.getAliq_icms()));
		sb.append("|").append(Util.preencheRegistro(registro1510.getVl_icms()));
		sb.append("|").append(Util.preencheRegistro(registro1510.getVl_bc_icms_st()));
		sb.append("|").append(Util.preencheRegistro(registro1510.getAliq_st()));
		sb.append("|").append(Util.preencheRegistro(registro1510.getVl_icms_st()));
		sb.append("|").append(Util.preencheRegistro(registro1510.getInd_rec()));
		sb.append("|").append(Util.preencheRegistro(registro1510.getCod_part()));
		sb.append("|").append(Util.preencheRegistro(registro1510.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registro1510.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registro1510.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
