/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoE;

import br.com.samuelweb.efd.icms.registros.blocoE.BlocoE;
import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE110;
import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE210;
import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE310;
import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE520;
import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Yuri Lemes
 *
 */
public class GerarBlocoE {
	
	private static int qtdRegistros = 0;
	
	private static StringBuilder sb = null;
	
	public static StringBuilder gerar(BlocoE blocoE, StringBuilder sbr){
		sb = sbr;
		//REGISTROE001
		if(!Util.isEmpty(blocoE.getRegistroE001())){
			sb = GerarRegistroE001.gerar(blocoE.getRegistroE001(), sb);
			qtdRegistros++;
		}
		
		//REGISTROE100
		if(!Util.isEmpty(blocoE.getRegistroE100())){
			blocoE.getRegistroE100().stream().forEach(registroE100 -> {
				sb = GerarRegistroE100.gerar(registroE100, sb);
				
				//REGISTROE110
				if(!Util.isEmpty(registroE100.getRegistroE110())){
					RegistroE110 registroE110 = registroE100.getRegistroE110();
					sb = GerarRegistroE110.gerar(registroE110, sb);
					
					//REGISTROE111
					if(!Util.isEmpty(registroE110.getRegistroE111())){
						registroE110.getRegistroE111().stream().forEach(registroE111 -> {
							sb = GerarRegistroE111.gerar(registroE111, sb);
							
							//REGISTROE112
							if(!Util.isEmpty(registroE111.getRegistroE112())){
								qtdRegistros += registroE111.getRegistroE112().stream().peek(registroE112 -> {
									sb = GerarRegistroE112.gerar(registroE112, sb);
								}).count();
							}
							
							//REGISTROE113
							if(!Util.isEmpty(registroE111.getRegistroE113())){
								qtdRegistros += registroE111.getRegistroE113().stream().peek(registroE113 -> {
									sb = GerarRegistroE113.gerar(registroE113, sb);
								}).count();
							}
							qtdRegistros++;
						});
					}
					
					//REGISTROE115
					if(!Util.isEmpty(registroE110.getRegistroE115())){
						qtdRegistros += registroE110.getRegistroE115().stream().peek(registroE115 -> {
							sb = GerarRegistroE115.gerar(registroE115, sb);
						}).count();
					}
					
					//REGISTROE116
					if(!Util.isEmpty(registroE110.getRegistroE116())){
						qtdRegistros += registroE110.getRegistroE116().stream().peek(registroE116 -> {
							sb = GerarRegistroE116.gerar(registroE116, sb);
						}).count();
					}
					qtdRegistros++;
				}
				qtdRegistros++;
			});
		}
		
		//REGISTROE200
		if(!Util.isEmpty(blocoE.getRegistroE200())){
			blocoE.getRegistroE200().stream().forEach(registroE200 -> {
				sb = GerarRegistroE200.gerar(registroE200, sb);
				
				//REGISTROE210
				if(!Util.isEmpty(registroE200.getRegistroE210())){
					RegistroE210 registroE210 = registroE200.getRegistroE210();
					
					sb = GerarRegistroE210.gerar(registroE210, sb);
					
					//REGISTROE220
					if(!Util.isEmpty(registroE210.getRegistroE220())){
						registroE210.getRegistroE220().stream().forEach(registroE220 -> {
							sb = GerarRegistroE220.gerar(registroE220, sb);
							
							//REGISTROE230
							if(!Util.isEmpty(registroE220.getRegistroE230())){
								qtdRegistros += registroE220.getRegistroE230().stream().peek(registroE230 -> {
									sb = GerarRegistroE230.gerar(registroE230, sb);
								}).count();
							}
							
							//REGISTROE240
							if(!Util.isEmpty(registroE220.getRegistroE240())){
								qtdRegistros += registroE220.getRegistroE240().stream().peek(registroE240 -> {
									sb = GerarRegistroE240.gerar(registroE240, sb);
								}).count();
							}
							qtdRegistros++;
						});
					}
					
					//REGISTROE250
					if(!Util.isEmpty(registroE210.getRegistroE250())){
						qtdRegistros += registroE210.getRegistroE250().stream().peek(registroE250 -> {
							sb = GerarRegistroE250.gerar(registroE250, sb);
						}).count();
					}
					qtdRegistros++;
				}
				qtdRegistros++;
			});			
		}
			
		//REGISTROE300
		if(!Util.isEmpty(blocoE.getRegistroE300())){
			blocoE.getRegistroE300().stream().forEach(registroE300 -> {
				sb = GerarRegistroE300.gerar(registroE300, sb);
						
				//REGISTROE310
				if(!Util.isEmpty(registroE300.getRegistroE310())){
					RegistroE310 registroE310 = registroE300.getRegistroE310();
					
					sb = GerarRegistroE310.gerar(registroE310, sb);
							
					//REGISTROE311
					if(!Util.isEmpty(registroE310.getRegistroE311())){
						registroE310.getRegistroE311().stream().forEach(registroE311 -> {
							sb = GerarRegistroE311.gerar(registroE311, sb);
									
							//REGISTROE312
							if(!Util.isEmpty(registroE311.getRegistroE312())){
								qtdRegistros += registroE311.getRegistroE312().stream().peek(registroE312 -> {
									sb = GerarRegistroE312.gerar(registroE312, sb);
								}).count();
							}
									
							//REGISTROE313
							if(!Util.isEmpty(registroE311.getRegistroE313())){
								qtdRegistros += registroE311.getRegistroE313().stream().peek(registroE313 -> {
									sb = GerarRegistroE313.gerar(registroE313, sb);
								}).count();
							}
							qtdRegistros++;
						});
					}
							
					//REGISTROE316
					if(!Util.isEmpty(registroE310.getRegistroE316())){
						qtdRegistros += registroE310.getRegistroE316().stream().peek(registroE316 -> {
							sb = GerarRegistroE316.gerar(registroE316, sb);
						}).count();
					}
					qtdRegistros++;
				}
				qtdRegistros++;
			});
		}
		
		//REGISTROE500
		if (!Util.isEmpty(blocoE.getRegistroE500())){
			blocoE.getRegistroE500().stream().forEach(registroE500 -> {
				sb = GerarRegistroE500.gerar(registroE500, sb);
				
				//REGISTROE510
				if (!Util.isEmpty(registroE500.getRegistroE510())){
					qtdRegistros += registroE500.getRegistroE510().stream().peek(registroE510 -> {
						sb = GerarRegistroE510.gerar(registroE510, sb);
					}).count();
				}
				
				//REGISTROE520
				if (!Util.isEmpty(registroE500.getRegistroE520())){
					RegistroE520 registroE520 = registroE500.getRegistroE520();
					
					sb = GerarRegistroE520.gerar(registroE520, sb);
					
					//REGISTROE530
					if (!Util.isEmpty(registroE520.getRegistroE530())){
						qtdRegistros += registroE520.getRegistroE530().stream().peek(registroE530 -> {
							sb = GerarRegistroE530.gerar(registroE530, sb);
						}).count();
					}
					qtdRegistros++;
				}
				qtdRegistros++;
			});
		}
		
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
