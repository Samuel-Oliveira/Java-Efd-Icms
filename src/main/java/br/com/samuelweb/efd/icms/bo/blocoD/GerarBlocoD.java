/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.BlocoD;
import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarBlocoD {
	
	private static int qtdRegistros = 0;
	
	public static StringBuilder gerar(BlocoD blocoD, StringBuilder sb){
		
		//REGISTROD001
		if(!Util.isEmpty(blocoD.getRegistroD001())){
			sb = GerarRegistroD001.gerar(blocoD.getRegistroD001(), sb);
			qtdRegistros++;
		}
		
//		//REGISTRO
//		if(!Util.isEmpty(blocoD.getRegistr())){
//			for (Registro5 registro5 : blocoD.getRegistro()) {
//				sb = GerarRegistro.gerar(registr, sb);
//				qtdRegistros++;
//			}
//			blocoD.getRegistro().get(blocoD.getRegistro().size()-1).setQnt(blocoD.getRegistro().size());
//		}
//		
//			
//		//REGISTRO
//		if(!Util.isEmpty(blocoD.getRegistro())){
//			for (Registro registro : blocoD.getRegistro()) {
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
//			blocoD.getRegistro().get(blocoD.getRegistro().size()-1).setQnt(blocoD.getRegistro().size());
//		}
		
		//REGISTROD990
		if(qtdRegistros > 0){
			qtdRegistros++;
			RegistroD990 registroD990 = new RegistroD990();
			registroD990.setQtd_lin_d(String.valueOf(qtdRegistros));
			
			blocoD.setRegistroD990(registroD990);
			sb = GerarRegistroD990.gerar(blocoD.getRegistroD990(), sb);
		}
		
		return sb;
	}
}
