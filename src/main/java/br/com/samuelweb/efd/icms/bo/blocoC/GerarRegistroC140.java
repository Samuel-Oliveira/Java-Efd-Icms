package br.com.samuelweb.efd.icms.bo.blocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC140;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC140 {
	
	public static StringBuilder gerar(RegistroC140 registroC140, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registroC140.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC140.getInd_emit()));
		sb.append("|").append(Util.preencheRegistro(registroC140.getInd_tit()));
		sb.append("|").append(Util.preencheRegistro(registroC140.getDesc_tit()));
		sb.append("|").append(Util.preencheRegistro(registroC140.getNum_tit()));
		sb.append("|").append(Util.preencheRegistro(registroC140.getQtd_parc()));
		sb.append("|").append(Util.preencheRegistro(registroC140.getVl_tit()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
