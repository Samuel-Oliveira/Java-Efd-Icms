/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoH;

import br.com.samuelweb.efd.icms.registros.blocoH.RegistroH990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarRegistroH990 {
	
	public static StringBuilder gerar(RegistroH990 registroH990, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registroH990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroH990.getQtd_lin_h()));
    	sb.append("|").append('\n');
		
		return sb;
	}

}
