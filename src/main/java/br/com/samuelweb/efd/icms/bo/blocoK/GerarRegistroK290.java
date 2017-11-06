/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoK;

import br.com.samuelweb.efd.icms.registros.blocoK.RegistroK280;
import br.com.samuelweb.efd.icms.registros.blocoK.RegistroK290;
import br.com.samuelweb.efd.icms.registros.blocoK.RegistroK291;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarRegistroK290 {

	public static StringBuilder gerar(RegistroK290 registroK290, StringBuilder sb) {
		if(Util.versao2019()){
			sb.append("|").append(Util.preencheRegistro(registroK290.getReg()));
			sb.append("|").append(Util.preencheRegistro(registroK290.getDt_ini_op()));
			sb.append("|").append(Util.preencheRegistro(registroK290.getDt_fin_op()));
			sb.append("|").append(Util.preencheRegistro(registroK290.getCod_doc_op()));
			sb.append("|").append('\n');
		}

		return sb;
	}
}
