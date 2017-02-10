/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD500;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD500 {

	public static StringBuilder gerar(RegistroD500 registroD500, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD500.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getInd_oper()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getInd_emit()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getCod_part()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getCod_sit()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getSer()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getSub()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getNum_doc()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getDt_doc()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getDt_a_p()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getVl_doc()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getVl_serv()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getVl_serv_nt()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getVl_terc()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getVl_da()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getVl_bc_icms()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getVl_icms()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getCod_inf()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroD500.getTp_assinante()));
		sb.append("|").append('\n');

		return sb;
	}
}
