/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoK;

import br.com.samuelweb.efd.icms.registros.blocoK.BlocoK;
import br.com.samuelweb.efd.icms.registros.blocoK.RegistroK990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarBlocoK {
	
	private static int qtdRegistros = 0;
	
	public static StringBuilder gerar(BlocoK blocoK, StringBuilder sb){
		
		//REGISTROK001
		if(!Util.isEmpty(blocoK.getRegistroK001())){
			sb = GerarRegistroK001.gerar(blocoK.getRegistroK001(), sb);
			qtdRegistros++;
		}
		
//		//REGISTRO
//		if(!Util.isEmpty(blocoK.getRegistr())){
//			for (Registro5 registro5 : blocoK.getRegistro()) {
//				sb = GerarRegistro.gerar(registr, sb);
//				qtdRegistros++;
//			}
//			blocoK.getRegistro().get(blocoK.getRegistro().size()-1).setQnt(blocoK.getRegistro().size());
//		}
//		
//			
//		//REGISTRO
//		if(!Util.isEmpty(blocoK.getRegistro())){
//			for (Registro registro : blocoK.getRegistro()) {
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
//			blocoK.getRegistro().get(blocoK.getRegistro().size()-1).setQnt(blocoK.getRegistro().size());
//		}
			
		//REGISTROK990
		if(qtdRegistros > 0){
			qtdRegistros++;
			RegistroK990 registroK990 = new RegistroK990();
			registroK990.setQtd_lin_k(String.valueOf(qtdRegistros));
			
			blocoK.setRegistroK990(registroK990);
			sb = GerarRegistroK990.gerar(blocoK.getRegistroK990(), sb);
		}
		
		return sb;
	}
}
