/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoK;

import br.com.samuelweb.efd.icms.registros.blocoK.RegistroK291;
import br.com.samuelweb.efd.icms.registros.blocoK.RegistroK292;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarRegistroK292 {

	public static StringBuilder gerar(RegistroK292 registroK292, StringBuilder sb) {
		if(Util.versao2019()){
			sb.append("|").append(Util.preencheRegistro(registroK292.getReg()));
			sb.append("|").append(Util.preencheRegistro(registroK292.getCod_item()));
			sb.append("|").append(Util.preencheRegistro(registroK292.getQtd()));
			sb.append("|").append('\n');
		}

		return sb;
	}
}
