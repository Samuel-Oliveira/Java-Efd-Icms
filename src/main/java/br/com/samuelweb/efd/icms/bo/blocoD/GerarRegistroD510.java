/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD510;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD510 {

	public static StringBuilder gerar(RegistroD510 registroD510, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD510.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD510.getNum_item()));
		sb.append("|").append(Util.preencheRegistro(registroD510.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroD510.getCod_class()));
		sb.append("|").append(Util.preencheRegistro(registroD510.getQtd()));
		sb.append("|").append(Util.preencheRegistro(registroD510.getUnid()));
		sb.append("|").append(Util.preencheRegistro(registroD510.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroD510.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registroD510.getCst_icms()));
		sb.append("|").append(Util.preencheRegistro(registroD510.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroD510.getVl_bc_icms()));
		sb.append("|").append(Util.preencheRegistro(registroD510.getAliq_icms()));
		sb.append("|").append(Util.preencheRegistro(registroD510.getVl_icms()));
		sb.append("|").append(Util.preencheRegistro(registroD510.getVl_bc_icms_uf()));
		sb.append("|").append(Util.preencheRegistro(registroD510.getVl_icms_uf()));
		sb.append("|").append(Util.preencheRegistro(registroD510.getInd_rec()));
		sb.append("|").append(Util.preencheRegistro(registroD510.getCod_part()));
		sb.append("|").append(Util.preencheRegistro(registroD510.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroD510.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroD510.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
