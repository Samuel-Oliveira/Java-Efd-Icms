package br.com.samuelweb.efd.icms.bo.bloco0;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0100;
import br.com.samuelweb.efd.icms.util.Util;
/**
 * @author Samuel Oliveira
 */
public class GerarRegistro0100 {
	
	public static StringBuilder gerar(Registro0100 registro0100, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registro0100.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0100.getNome()));
		sb.append("|").append(Util.preencheRegistro(registro0100.getCpf()));
		sb.append("|").append(Util.preencheRegistro(registro0100.getCrc()));
		sb.append("|").append(Util.preencheRegistro(registro0100.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registro0100.getCep()));
		sb.append("|").append(Util.preencheRegistro(registro0100.getEnd()));
		sb.append("|").append(Util.preencheRegistro(registro0100.getNum()));
		sb.append("|").append(Util.preencheRegistro(registro0100.getCompl()));
		sb.append("|").append(Util.preencheRegistro(registro0100.getBairro()));
		sb.append("|").append(Util.preencheRegistro(registro0100.getFone()));
		sb.append("|").append(Util.preencheRegistro(registro0100.getFax()));
		sb.append("|").append(Util.preencheRegistro(registro0100.getEmail()));
		sb.append("|").append(Util.preencheRegistro(registro0100.getCod_mun()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
