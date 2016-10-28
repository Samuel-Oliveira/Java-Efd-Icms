/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoE;

import br.com.samuelweb.efd.icms.registros.blocoE.BlocoE;
import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarBlocoE {
	
	private static int qtdRegistros = 0;
	
	public static StringBuilder gerar(BlocoE blocoE, StringBuilder sb){
		
		//REGISTROE001
		if(!Util.isEmpty(blocoE.getRegistroE001())){
			sb = GerarRegistroE001.gerar(blocoE.getRegistroE001(), sb);
			qtdRegistros++;
		}
		
//		//REGISTRO
//		if(!Util.isEmpty(blocoE.getRegistr())){
//			for (Registro5 registro5 : blocoE.getRegistro()) {
//				sb = GerarRegistro.gerar(registr, sb);
//				qtdRegistros++;
//			}
//			blocoE.getRegistro().get(blocoE.getRegistro().size()-1).setQnt(blocoE.getRegistro().size());
//		}
//		
//			
//		//REGISTRO
//		if(!Util.isEmpty(blocoE.getRegistro())){
//			for (Registro registro : blocoE.getRegistro()) {
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
//			blocoE.getRegistro().get(blocoE.getRegistro().size()-1).setQnt(blocoE.getRegistro().size());
//		}
		
		//REGISTROE990
		if(qtdRegistros > 0){
			qtdRegistros++;
			RegistroE990 registroE990 = new RegistroE990();
			registroE990.setQtd_lin_e(String.valueOf(qtdRegistros));
			
			blocoE.setRegistroE990(registroE990);
			sb = GerarRegistroE990.gerar(blocoE.getRegistroE990(), sb);
		}
		
		return sb;
	}
}
