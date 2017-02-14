/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoE;

import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE112;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroE112 {

public static StringBuilder gerar(RegistroE112 registroE112, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registroE112.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroE112.getNum_da()));
		sb.append("|").append(Util.preencheRegistro(registroE112.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroE112.getInd_proc()));
		sb.append("|").append(Util.preencheRegistro(registroE112.getProc()));
		sb.append("|").append(Util.preencheRegistro(registroE112.getTxt_compl()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
