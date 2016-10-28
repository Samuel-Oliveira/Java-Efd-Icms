/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoG;

import br.com.samuelweb.efd.icms.registros.blocoG.BlocoG;
import br.com.samuelweb.efd.icms.registros.blocoG.RegistroG990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarBlocoG {
	
	private static int qtdRegistros = 0;
	
	public static StringBuilder gerar(BlocoG blocoG, StringBuilder sb){
		
		//REGISTROG001
		if(!Util.isEmpty(blocoG.getRegistroG001())){
			sb = GerarRegistroG001.gerar(blocoG.getRegistroG001(), sb);
			qtdRegistros++;
		}
		
//		//REGISTRO
//		if(!Util.isEmpty(blocoG.getRegistr())){
//			for (Registro5 registro5 : blocoG.getRegistro()) {
//				sb = GerarRegistro.gerar(registr, sb);
//				qtdRegistros++;
//			}
//			blocoG.getRegistro().get(blocoG.getRegistro().size()-1).setQnt(blocoG.getRegistro().size());
//		}
//		
//			
//		//REGISTRO
//		if(!Util.isEmpty(blocoG.getRegistro())){
//			for (Registro registro : blocoG.getRegistro()) {
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
//			blocoG.getRegistro().get(blocoG.getRegistro().size()-1).setQnt(blocoG.getRegistro().size());
//		}
		
		//REGISTROG990
		if(qtdRegistros > 0){
			qtdRegistros++;
			RegistroG990 registroG990 = new RegistroG990();
			registroG990.setQtd_lin_g(String.valueOf(qtdRegistros));
			
			blocoG.setRegistroG990(registroG990);
			sb = GerarRegistroG990.gerar(blocoG.getRegistroG990(), sb);
		}
		
		return sb;
	}
}
