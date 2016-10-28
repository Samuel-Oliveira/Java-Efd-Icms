/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.BlocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarBlocoC {
	
	private static int qtdRegistros = 0;
	
	public static StringBuilder gerar(BlocoC blocoC, StringBuilder sb){
		
		//REGISTROC001
		if(!Util.isEmpty(blocoC.getRegistroC001())){
			sb = GerarRegistroC001.gerar(blocoC.getRegistroC001(), sb);
			qtdRegistros++;
		}
		
		//REGISTRO
//		if(!Util.isEmpty(blocoC.getRegistr())){
//			for (Registro5 registro5 : blocoC.getRegistro()) {
//				sb = GerarRegistro.gerar(registr, sb);
//				qtdRegistros++;
//			}
//			blocoC.getRegistro().get(blocoC.getRegistro().size()-1).setQnt(blocoC.getRegistro().size());
//		}
//		
//			
//		//REGISTRO
//		if(!Util.isEmpty(blocoC.getRegistro())){
//			for (Registro registro : blocoC.getRegistro()) {
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
//			blocoC.getRegistro().get(blocoC.getRegistro().size()-1).setQnt(blocoC.getRegistro().size());
//		}
			
		//REGISTROC990
		if(qtdRegistros > 0){
			qtdRegistros++;
			RegistroC990 registroC990 = new RegistroC990();
			registroC990.setQtd_lin_c(String.valueOf(qtdRegistros));
			
			blocoC.setRegistroC990(registroC990);
			sb = GerarRegistroC990.gerar(blocoC.getRegistroC990(), sb);
		}
		
		return sb;
	}
}
