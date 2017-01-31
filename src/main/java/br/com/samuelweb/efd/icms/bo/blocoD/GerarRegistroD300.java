/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD300;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD300 {

	public static StringBuilder gerar(RegistroD300 registroD300, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD300.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getSer()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getSub()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getNum_doc_ini()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getNum_doc_fin()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getCst_icms()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getAliq_icms()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getDt_doc()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getVl_opr()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getVl_serv()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getVl_seg()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getVl_out_desp()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getVl_bc_icms()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getVl_icms()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getVl_red_bc()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getCod_obs()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
