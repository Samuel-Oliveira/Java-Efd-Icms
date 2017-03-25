/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.BlocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Yuri Lemes
 *
 */
public class GerarBlocoC {
	
	private static int qtdRegistros = 0;
	
	private static StringBuilder sb = null;
	
	public static StringBuilder gerar(BlocoC blocoC, StringBuilder sbr){
		
		sb = sbr;
		
		//REGISTROC001
		if(!Util.isEmpty(blocoC.getRegistroC001())){
			sb = GerarRegistroC001.gerar(blocoC.getRegistroC001(), sb);
			qtdRegistros++;
		}
		
		// REGISTROC100
		if (!Util.isEmpty(blocoC.getRegistroC100())) {
			blocoC.getRegistroC100().stream().forEach(registroC100 -> {
				sb = GerarRegistroC100.gerar(registroC100, sb);
				
				//REGISTROC101
				if(!Util.isEmpty(registroC100.getRegistroC101())){
					sb = GerarRegistroC101.gerar(registroC100.getRegistroC101(), sb);
					qtdRegistros++;
				}
				
				//REGISTROC105
				if(!Util.isEmpty(registroC100.getRegistroC105())){
					sb = GerarRegistroC105.gerar(registroC100.getRegistroC105(), sb);
					qtdRegistros++;
				}
				
				//REGISTROC110
				if(!Util.isEmpty(registroC100.getRegistroC110())){
					registroC100.getRegistroC110().stream().forEach(registroC110 ->{
						sb = GerarRegistroC110.gerar(registroC110, sb);
						
						//REGISTROC111
						if(!Util.isEmpty(registroC110.getRegistroC111())){
							qtdRegistros += registroC110.getRegistroC111().stream().peek(registroC111 ->{
								sb = GerarRegistroC111.gerar(registroC111, sb);
							}).count();
						}
						
						//REGISTROC112
						if(!Util.isEmpty(registroC110.getRegistroC112())){
							qtdRegistros += registroC110.getRegistroC112().stream().peek(registroC112 ->{
								sb = GerarRegistroC112.gerar(registroC112, sb);
							}).count();
						}
						
						//REGISTROC113
						if(!Util.isEmpty(registroC110.getRegistroC113())){
							qtdRegistros += registroC110.getRegistroC113().stream().peek(registroC113 ->{
								sb = GerarRegistroC113.gerar(registroC113, sb);
							}).count();
						}
						
						//REGISTROC114
						if(!Util.isEmpty(registroC110.getRegistroC114())){
							qtdRegistros += registroC110.getRegistroC114().stream().peek(registroC114 ->{
								sb = GerarRegistroC114.gerar(registroC114, sb);
							}).count();
						}
						
						//REGISTROC115
						if(!Util.isEmpty(registroC110.getRegistroC115())){
							qtdRegistros += registroC110.getRegistroC115().stream().peek(registroC115 ->{
								sb = GerarRegistroC115.gerar(registroC115, sb);
							}).count();
						}
						
						//REGISTROC116
						if(!Util.isEmpty(registroC110.getRegistroC116())){
							qtdRegistros += registroC110.getRegistroC116().stream().peek(registroC116 ->{
								sb = GerarRegistroC116.gerar(registroC116, sb);
							}).count();
						}
						qtdRegistros++;
					});
				}
				
				qtdRegistros++;
			});
//			qtdRegistros += blocoC.getRegistroC100().stream().peek(registroC100 -> {
//				sb = GerarRegistroC100.gerar(registroC100, sb);
//			}).count();
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
