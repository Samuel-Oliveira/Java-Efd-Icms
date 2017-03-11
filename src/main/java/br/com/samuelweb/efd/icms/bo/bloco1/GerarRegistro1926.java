/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.bloco1;

import br.com.samuelweb.efd.icms.registros.bloco1.Registro1926;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1926 {

	public static StringBuilder gerar(Registro1926 registro1926, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1926.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1926.getCod_or()));
		sb.append("|").append(Util.preencheRegistro(registro1926.getVl_or()));
		sb.append("|").append(Util.preencheRegistro(registro1926.getDt_vcto()));
		sb.append("|").append(Util.preencheRegistro(registro1926.getCod_rec()));
		sb.append("|").append(Util.preencheRegistro(registro1926.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registro1926.getInd_proc()));
		sb.append("|").append(Util.preencheRegistro(registro1926.getProc()));
		sb.append("|").append(Util.preencheRegistro(registro1926.getTxt_compl()));
		sb.append("|").append(Util.preencheRegistro(registro1926.getMes_ref()));
		sb.append("|").append('\n');

		return sb;
	}
}
