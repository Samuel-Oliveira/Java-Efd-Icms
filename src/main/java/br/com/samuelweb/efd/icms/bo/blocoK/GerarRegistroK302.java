/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoK;

import br.com.samuelweb.efd.icms.registros.blocoK.RegistroK302;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarRegistroK302 {

	public static StringBuilder gerar(RegistroK302 registroK302, StringBuilder sb) {
		if(Util.versao2019()){
			sb.append("|").append(Util.preencheRegistro(registroK302.getReg()));
			sb.append("|").append(Util.preencheRegistro(registroK302.getCod_item()));
			sb.append("|").append(Util.preencheRegistro(registroK302.getQtd()));
			sb.append("|").append('\n');
		}

		return sb;
	}
}
