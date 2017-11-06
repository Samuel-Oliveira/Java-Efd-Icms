/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoK;

import br.com.samuelweb.efd.icms.registros.blocoK.RegistroK300;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarRegistroK300 {

	public static StringBuilder gerar(RegistroK300 registroK300, StringBuilder sb) {
		if(Util.versao2019()){
			sb.append("|").append(Util.preencheRegistro(registroK300.getReg()));
			sb.append("|").append(Util.preencheRegistro(registroK300.getDt_prod()));
			sb.append("|").append('\n');
		}

		return sb;
	}
}
