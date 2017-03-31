/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoG;

import br.com.samuelweb.efd.icms.registros.blocoG.BlocoG;
import br.com.samuelweb.efd.icms.registros.blocoG.RegistroG990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Yuri Lemes
 *
 */
public class GerarBlocoG {
	
	private static int qtdRegistros = 0;
	
	private static StringBuilder sb = null;
	
	public static StringBuilder gerar(BlocoG blocoG, StringBuilder sbr){
		sb = sbr;
		//REGISTROG001
		if(!Util.isEmpty(blocoG.getRegistroG001())){
			sb = GerarRegistroG001.gerar(blocoG.getRegistroG001(), sb);
			qtdRegistros++;
		}
		
		//REGISTROG110
		if(!Util.isEmpty(blocoG.getRegistroG110())){
			blocoG.getRegistroG110().stream().forEach(registroG110 -> {
				sb = GerarRegistroG110.gerar(registroG110, sb);
				
				//REGISTROG125
				if(!Util.isEmpty(registroG110.getRegistroG125())){
					registroG110.getRegistroG125().stream().forEach(registroG125 -> {
						sb = GerarRegistroG125.gerar(registroG125, sb);
						
						//REGISTROG126
						if(!Util.isEmpty(registroG125.getRegistroG126())){
							qtdRegistros +=  registroG125.getRegistroG126().stream().peek(registroG126 -> {
								sb = GerarRegistroG126.gerar(registroG126, sb);
							}).count();
						}
						
						//REGISTROG130
						if(!Util.isEmpty(registroG125.getRegistroG130())){
							registroG125.getRegistroG130().stream().forEach(registroG130 -> {
								sb = GerarRegistroG130.gerar(registroG130, sb);
								
								//REGISTROG140
								if(!Util.isEmpty(registroG130.getRegistroG140())){
									qtdRegistros +=  registroG130.getRegistroG140().stream().peek(registroG140 -> {
										sb = GerarRegistroG140.gerar(registroG140, sb);
									}).count();
								}
								qtdRegistros++;
							});
						}
						qtdRegistros++;
					});
				}
				qtdRegistros++;
			});
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
