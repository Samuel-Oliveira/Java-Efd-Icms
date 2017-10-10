package br.com.samuelweb.efd.icms.bo.bloco9;

import br.com.samuelweb.efd.icms.registros.bloco9.Registro9999;
import br.com.samuelweb.efd.icms.util.Util;
/**
 * @author Samuel Oliveira
 */
public class GerarRegistro9999 {
	
	public static StringBuilder gerar(Registro9999 registro9999, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registro9999.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro9999.getQtd_lin()));
    	sb.append("|");
		
		return sb;
	}
}
