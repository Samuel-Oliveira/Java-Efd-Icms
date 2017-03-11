/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.bloco1;

import br.com.samuelweb.efd.icms.registros.bloco1.Registro1700;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1700 {

	public static StringBuilder gerar(Registro1700 registro1700, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registro1700.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1700.getCod_disp()));
		sb.append("|").append(Util.preencheRegistro(registro1700.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registro1700.getSer()));
		sb.append("|").append(Util.preencheRegistro(registro1700.getSub()));
		sb.append("|").append(Util.preencheRegistro(registro1700.getNum_doc_ini()));
		sb.append("|").append(Util.preencheRegistro(registro1700.getNum_doc_fin()));
		sb.append("|").append(Util.preencheRegistro(registro1700.getNum_aut()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
