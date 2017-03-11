/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.bloco1;

import br.com.samuelweb.efd.icms.registros.bloco1.Registro1922;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1922 {

	public static StringBuilder gerar(Registro1922 registro1922, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registro1922.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1922.getNum_da()));
		sb.append("|").append(Util.preencheRegistro(registro1922.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registro1922.getInd_proc()));
		sb.append("|").append(Util.preencheRegistro(registro1922.getProc()));
		sb.append("|").append(Util.preencheRegistro(registro1922.getTxt_compl()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
