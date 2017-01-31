package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD100;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD100 {

	public static StringBuilder gerar(RegistroD100 registroD100, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD100.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getInd_oper()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getInd_emit()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getCod_part()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getCod_sit()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getSer()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getSub()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getNum_doc()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getChv_cte()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getDt_doc()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getDt_a_p()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getTp_cte()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getChv_cte_ref()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getVl_doc()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getInd_frt()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getVl_serv()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getVl_bc_icms()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getVl_icms()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getVl_nt()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getCod_inf()));
		sb.append("|").append(Util.preencheRegistro(registroD100.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
