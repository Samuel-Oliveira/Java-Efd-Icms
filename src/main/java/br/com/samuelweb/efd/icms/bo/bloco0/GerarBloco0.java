/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.bloco0;

import br.com.samuelweb.efd.icms.registros.bloco0.Bloco0;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0015;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0150;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0175;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0190;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0200;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0205;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0210;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0220;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0300;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0400;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0450;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0460;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0500;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0600;
import br.com.samuelweb.efd.icms.registros.bloco0.Registro0990;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarBloco0 {
	
	private static int qtdRegistros = 0;
	
	public static StringBuilder gerar(Bloco0 bloco0, StringBuilder sb){
		
		//REGISTRO0000
		if(!Util.isEmpty(bloco0.getRegistro0000())){
			sb = GerarRegistro0000.gerar(bloco0.getRegistro0000(), sb);
			qtdRegistros++;
		}
		
		//REGISTRO0001
		if(!Util.isEmpty(bloco0.getRegistro0001())){
			sb = GerarRegistro0001.gerar(bloco0.getRegistro0001(), sb);
			qtdRegistros++;
		}
		
		//REGISTRO0005
		if(!Util.isEmpty(bloco0.getRegistro0005())){
			sb = GerarRegistro0005.gerar(bloco0.getRegistro0005(), sb);
			qtdRegistros++;
		}
		
		//REGISTRO0015
		if(!Util.isEmpty(bloco0.getRegistro0015())){
			for (Registro0015 registro0015 : bloco0.getRegistro0015()) {
				sb = GerarRegistro0015.gerar(registro0015, sb);
				qtdRegistros++;
			}
		}
		
		//REGISTRO0100
		if(!Util.isEmpty(bloco0.getRegistro0100())){
			sb = GerarRegistro0100.gerar(bloco0.getRegistro0100(), sb);
			qtdRegistros++;
		}
		
		
		//REGISTRO0150
		if(!Util.isEmpty(bloco0.getRegistro0150())){
			for (Registro0150 registro0150 : bloco0.getRegistro0150()) {
				sb = GerarRegistro0150.gerar(registro0150, sb);
				qtdRegistros++;
				
				//REGISTRO0175
				if(!Util.isEmpty(registro0150.getRegistro0175())){
					for (Registro0175 registro0175 : registro0150.getRegistro0175()) {
						sb = GerarRegistro0175.gerar(registro0175, sb);
						qtdRegistros++;
					}
				}
			}
		}
		
		//REGISTRO0190
		if(!Util.isEmpty(bloco0.getRegistro0190())){
			for (Registro0190 registro0190 : bloco0.getRegistro0190()) {
				sb = GerarRegistro0190.gerar(registro0190, sb);
				qtdRegistros++;
			}
		}	
		
		//REGISTRO0200
		if(!Util.isEmpty(bloco0.getRegistro0200())){
			for (Registro0200 registro0200 : bloco0.getRegistro0200()) {
				sb = GerarRegistro0200.gerar(registro0200, sb);
				qtdRegistros++;
				
				//REGISTRO0205
				if(!Util.isEmpty(registro0200.getRegistro0205())){
					for (Registro0205 registro0205 : registro0200.getRegistro0205()) {
						sb = GerarRegistro0205.gerar(registro0205, sb);
						qtdRegistros++;
					}
				}
				
				//REGISTRO0206
				if(!Util.isEmpty(registro0200.getRegistro0206())){
					sb = GerarRegistro0206.gerar(registro0200.getRegistro0206(), sb);
					qtdRegistros++;
				}
				
				//REGISTRO0210
				if(!Util.isEmpty(registro0200.getRegistro0210())){
					for (Registro0210 registro0210 : registro0200.getRegistro0210()) {
						sb = GerarRegistro0210.gerar(registro0210, sb);
						qtdRegistros++;
					}
				}
				
				//REGISTRO0220
				if(!Util.isEmpty(registro0200.getRegistro0220())){
					for (Registro0220 registro0220 : registro0200.getRegistro0220()) {
						sb = GerarRegistro0220.gerar(registro0220, sb);
						qtdRegistros++;
					}
				}
			}
		}		
		
		//REGISTRO0300
		if(!Util.isEmpty(bloco0.getRegistro0300())){
			for (Registro0300 registro0300 : bloco0.getRegistro0300()) {
				sb = GerarRegistro0300.gerar(registro0300, sb);
				qtdRegistros++;
				
				//REGISTRO0305
				if(!Util.isEmpty(registro0300.getRegistro0305())){
					sb = GerarRegistro0305.gerar(registro0300.getRegistro0305(), sb);
					qtdRegistros++;
				}
			}
		}
		
		//REGISTRO0400
		if(!Util.isEmpty(bloco0.getRegistro0400())){
			for (Registro0400 registro0400 : bloco0.getRegistro0400()) {
				sb = GerarRegistro0400.gerar(registro0400, sb);
				qtdRegistros++;
			}
		}	
		
		//REGISTRO0450
		if(!Util.isEmpty(bloco0.getRegistro0450())){
			for (Registro0450 registro0450 : bloco0.getRegistro0450()) {
				sb = GerarRegistro0450.gerar(registro0450, sb);
				qtdRegistros++;
			}
		}	
		
		//REGISTRO0460
		if(!Util.isEmpty(bloco0.getRegistro0460())){
			for (Registro0460 registro0460 : bloco0.getRegistro0460()) {
				sb = GerarRegistro0460.gerar(registro0460, sb);
				qtdRegistros++;
			}
		}	
		
		//REGISTRO0500
		if(!Util.isEmpty(bloco0.getRegistro0500())){
			for (Registro0500 registro0500 : bloco0.getRegistro0500()) {
				sb = GerarRegistro0500.gerar(registro0500, sb);
				qtdRegistros++;
			}
		}	
		
		//REGISTRO0600
		if(!Util.isEmpty(bloco0.getRegistro0600())){
			for (Registro0600 registro0600 : bloco0.getRegistro0600()) {
				sb = GerarRegistro0600.gerar(registro0600, sb);
				qtdRegistros++;
			}
		}	
		
		//REGISTRO0990
		if(qtdRegistros > 0){
			qtdRegistros++;
			Registro0990 registro0990 = new Registro0990();
			registro0990.setQtd_lin_0(String.valueOf(qtdRegistros));
			
			bloco0.setRegistro0990(registro0990);
			sb = GerarRegistro0990.gerar(bloco0.getRegistro0990(), sb);
		}
		
		return sb;
	}
}
