/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.bloco0;

import br.com.samuelweb.efd.icms.registros.bloco0.Registro0001;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarRegistro0001 {
	
	public static StringBuilder gerar(Registro0001 registro0001, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registro0001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0001.getInd_mov()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
