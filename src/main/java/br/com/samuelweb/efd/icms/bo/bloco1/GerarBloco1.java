/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.bloco1;

import br.com.samuelweb.efd.icms.registros.bloco1.Bloco1;
import br.com.samuelweb.efd.icms.registros.bloco1.Registro1990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarBloco1 {
	
	private static int qtdRegistros = 0;
	
	public static StringBuilder gerar(Bloco1 bloco1, StringBuilder sb){
		
		//REGISTRO1001
		if(!Util.isEmpty(bloco1.getRegistro1001())){
			sb = GerarRegistro1001.gerar(bloco1.getRegistro1001(), sb);
			qtdRegistros++;
		}
		
//		//REGISTRO
//		if(!Util.isEmpty(bloco1.getRegistr())){
//			for (Registro5 registro5 : bloco1.getRegistro()) {
//				sb = GerarRegistro.gerar(registr, sb);
//				qtdRegistros++;
//			}
//			bloco1.getRegistro().get(bloco1.getRegistro().size()-1).setQnt(bloco1.getRegistro().size());
//		}
//		
//			
//		//REGISTRO
//		if(!Util.isEmpty(bloco1.getRegistro())){
//			for (Registro registro : bloco1.getRegistro()) {
//				sb = GerarRegistro.gerar(registro, sb);
//				qtdRegistros++;
//				
//				//REGISTRO
//				if(!Util.isEmpty(registro.getRegistro())){
//					for (Registro registro : registro.getRegistro()) {
//						sb = GerarRegistro.gerar(registro, sb);
//						qtdRegistros++;
//					}
//					registro.getRegistro().get(registro.getRegistro().size()-1).setQnt(registro.getRegistro().size());
//				}
//			}
//			bloco1.getRegistro().get(bloco1.getRegistro().size()-1).setQnt(bloco1.getRegistro().size());
//		}
		
		//REGISTRO1990
		if(qtdRegistros > 0){
			qtdRegistros++;
			Registro1990 registro1990 = new Registro1990();
			registro1990.setQtd_lin_1(String.valueOf(qtdRegistros));
			
			bloco1.setRegistro1990(registro1990);
			sb = GerarRegistro1990.gerar(bloco1.getRegistro1990(), sb);
		}
		
		return sb;
	}
}
