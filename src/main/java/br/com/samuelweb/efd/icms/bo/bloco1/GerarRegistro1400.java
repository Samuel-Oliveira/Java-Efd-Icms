/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.bloco1;

import br.com.samuelweb.efd.icms.registros.bloco1.Registro1400;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1400 {

	public static StringBuilder gerar(Registro1400 registro1400, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registro1400.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1400.getCod_item_ipm()));
		sb.append("|").append(Util.preencheRegistro(registro1400.getMun()));
		sb.append("|").append(Util.preencheRegistro(registro1400.getValor()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
