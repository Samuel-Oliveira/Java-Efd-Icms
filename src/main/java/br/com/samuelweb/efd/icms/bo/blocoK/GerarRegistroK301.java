/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoK;

import br.com.samuelweb.efd.icms.registros.blocoK.RegistroK301;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarRegistroK301 {

	public static StringBuilder gerar(RegistroK301 registroK301, StringBuilder sb) {
		if(Util.versao2019()){
			sb.append("|").append(Util.preencheRegistro(registroK301.getReg()));
			sb.append("|").append(Util.preencheRegistro(registroK301.getCod_item()));
			sb.append("|").append(Util.preencheRegistro(registroK301.getQtd()));
			sb.append("|").append('\n');
		}

		return sb;
	}
}
