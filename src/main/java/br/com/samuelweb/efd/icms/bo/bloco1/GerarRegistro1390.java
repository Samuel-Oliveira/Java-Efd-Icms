/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.bloco1;

import br.com.samuelweb.efd.icms.registros.bloco1.Registro1390;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1390 {

	public static StringBuilder gerar(Registro1390 registro1390, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registro1390.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1390.getCod_prod()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
