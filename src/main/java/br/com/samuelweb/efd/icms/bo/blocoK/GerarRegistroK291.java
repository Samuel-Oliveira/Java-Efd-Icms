/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoK;

import br.com.samuelweb.efd.icms.registros.blocoK.RegistroK291;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarRegistroK291 {

	public static StringBuilder gerar(RegistroK291 registroK291, StringBuilder sb) {
		if(Util.versao2019()){
			sb.append("|").append(Util.preencheRegistro(registroK291.getReg()));
			sb.append("|").append(Util.preencheRegistro(registroK291.getCod_item()));
			sb.append("|").append(Util.preencheRegistro(registroK291.getQtd()));
			sb.append("|").append('\n');
		}

		return sb;
	}
}
