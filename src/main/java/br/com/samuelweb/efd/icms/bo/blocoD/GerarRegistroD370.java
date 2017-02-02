/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD370;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes - yurilemes2@gmail.com
 * 
 */
public class GerarRegistroD370 {

	public static StringBuilder gerar(RegistroD370 registroD370, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD370.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD370.getCod_mun_orig()));
		sb.append("|").append(Util.preencheRegistro(registroD370.getVl_serv()));
		sb.append("|").append(Util.preencheRegistro(registroD370.getQtd_bilh()));
		sb.append("|").append(Util.preencheRegistro(registroD370.getVl_bc_icms()));
		sb.append("|").append(Util.preencheRegistro(registroD370.getVl_icms()));
		sb.append("|").append('\n');

		return sb;
	}
}
