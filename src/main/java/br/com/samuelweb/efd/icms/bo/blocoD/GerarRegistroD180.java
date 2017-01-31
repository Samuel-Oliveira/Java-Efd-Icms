/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD180;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD180 {

	public static StringBuilder gerar(RegistroD180 registroD180, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD180.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD180.getNum_seq()));
		sb.append("|").append(Util.preencheRegistro(registroD180.getInd_emit()));
		sb.append("|").append(Util.preencheRegistro(registroD180.getCnpj_cpf_emit()));
		sb.append("|").append(Util.preencheRegistro(registroD180.getUf_emit()));
		sb.append("|").append(Util.preencheRegistro(registroD180.getIe_emit()));
		sb.append("|").append(Util.preencheRegistro(registroD180.getCod_mun_orig()));
		sb.append("|").append(Util.preencheRegistro(registroD180.getCnpj_cpf_tom()));
		sb.append("|").append(Util.preencheRegistro(registroD180.getUf_tom()));
		sb.append("|").append(Util.preencheRegistro(registroD180.getIe_tom()));
		sb.append("|").append(Util.preencheRegistro(registroD180.getCod_mun_dest()));
		sb.append("|").append(Util.preencheRegistro(registroD180.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroD180.getSer()));
		sb.append("|").append(Util.preencheRegistro(registroD180.getSub()));
		sb.append("|").append(Util.preencheRegistro(registroD180.getNum_doc()));
		sb.append("|").append(Util.preencheRegistro(registroD180.getDt_doc()));
		sb.append("|").append(Util.preencheRegistro(registroD180.getVl_doc()));
		sb.append("|").append('\n');

		return sb;
	}
}
