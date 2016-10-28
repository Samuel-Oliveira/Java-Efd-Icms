package br.com.samuelweb.efd.icms.bo.bloco0;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0205;
import br.com.samuelweb.efd.icms.util.Util;
/**
 * @author Samuel Oliveira
 */
public class GerarRegistro0205 {
	
	public static StringBuilder gerar(Registro0205 registro0205, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registro0205.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0205.getDesc_ant_item()));
		sb.append("|").append(Util.preencheRegistro(registro0205.getDt_ini()));
		sb.append("|").append(Util.preencheRegistro(registro0205.getDt_fim()));
		sb.append("|").append(Util.preencheRegistro(registro0205.getCod_ant_item()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
