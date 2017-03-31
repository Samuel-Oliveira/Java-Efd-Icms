/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoH;

import br.com.samuelweb.efd.icms.registros.blocoH.BlocoH;
import br.com.samuelweb.efd.icms.registros.blocoH.RegistroH990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Yuri Lemes
 *
 */
public class GerarBlocoH {
	
	private static int qtdRegistros = 0;
	
	private static StringBuilder sb = null;
	
	public static StringBuilder gerar(BlocoH blocoH, StringBuilder sbr){
		sb = sbr;
		//REGISTROH001
		if(!Util.isEmpty(blocoH.getRegistroH001())){
			sb = GerarRegistroH001.gerar(blocoH.getRegistroH001(), sb);
			qtdRegistros++;
		}
		
		//REGISTROH005
		if(!Util.isEmpty(blocoH.getRegistroH005())){
			blocoH.getRegistroH005().stream().forEach(registroH005 -> {
				sb = GerarRegistroH005.gerar(registroH005, sb);
				
				//REGISTROH010
				if(!Util.isEmpty(registroH005.getRegistroH010())){
					registroH005.getRegistroH010().stream().forEach(registroH010 -> {
						sb = GerarRegistroH010.gerar(registroH010, sb);
						
						//REGISTROH020
						if(!Util.isEmpty(registroH010.getRegistroH020())){
							qtdRegistros+=registroH010.getRegistroH020().stream().peek(registroH020 -> {
								sb = GerarRegistroH020.gerar(registroH020, sb);
							}).count();
						}
						qtdRegistros++;
					});
				}
				qtdRegistros++;
			});
		}
		
//		//REGISTRO
//		if(!Util.isEmpty(blocoH.getRegistr())){
//			for (Registro5 registro5 : blocoH.getRegistro()) {
//				sb = GerarRegistro.gerar(registr, sb);
//				qtdRegistros++;
//			}
//			blocoH.getRegistro().get(blocoH.getRegistro().size()-1).setQnt(blocoH.getRegistro().size());
//		}
//		
//			
//		//REGISTRO
//		if(!Util.isEmpty(blocoH.getRegistro())){
//			for (Registro registro : blocoH.getRegistro()) {
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
//			blocoH.getRegistro().get(blocoH.getRegistro().size()-1).setQnt(blocoH.getRegistro().size());
//		}
		
			
		//REGISTROH990
		if(qtdRegistros > 0){
			qtdRegistros++;
			RegistroH990 registroH990 = new RegistroH990();
			registroH990.setQtd_lin_h(String.valueOf(qtdRegistros));
			
			blocoH.setRegistroH990(registroH990);
			sb = GerarRegistroH990.gerar(blocoH.getRegistroH990(), sb);
		}
		
		return sb;
	}
}
