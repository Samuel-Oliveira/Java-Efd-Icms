/**
 * 
 */
package br.com.samuelweb.efd.icms.bo;

import br.com.samuelweb.efd.icms.bo.bloco0.GerarBloco0;
import br.com.samuelweb.efd.icms.bo.bloco0.GerarContadoresBloco0;
import br.com.samuelweb.efd.icms.bo.bloco1.GerarBloco1;
import br.com.samuelweb.efd.icms.bo.bloco1.GerarContadoresBloco1;
import br.com.samuelweb.efd.icms.bo.bloco9.GerarBloco9;
import br.com.samuelweb.efd.icms.bo.blocoC.GerarBlocoC;
import br.com.samuelweb.efd.icms.bo.blocoC.GerarContadoresBlocoC;
import br.com.samuelweb.efd.icms.bo.blocoD.GerarBlocoD;
import br.com.samuelweb.efd.icms.bo.blocoD.GerarContadoresBlocoD;
import br.com.samuelweb.efd.icms.bo.blocoE.GerarBlocoE;
import br.com.samuelweb.efd.icms.bo.blocoE.GerarContadoresBlocoE;
import br.com.samuelweb.efd.icms.bo.blocoG.GerarBlocoG;
import br.com.samuelweb.efd.icms.bo.blocoG.GerarContadoresBlocoG;
import br.com.samuelweb.efd.icms.bo.blocoH.GerarBlocoH;
import br.com.samuelweb.efd.icms.bo.blocoH.GerarContadoresBlocoH;
import br.com.samuelweb.efd.icms.bo.blocoK.GerarBlocoK;
import br.com.samuelweb.efd.icms.bo.blocoK.GerarContadoresBlocoK;
import br.com.samuelweb.efd.icms.registros.EfdIcms;
import br.com.samuelweb.efd.icms.registros.bloco9.Registro9001;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarEfdIcms {
	
	public static StringBuilder gerar(EfdIcms efdIcms, StringBuilder sb){
		
		//BLOCO0
		if(!Util.isEmpty(efdIcms.getBloco0())){
			sb = GerarBloco0.gerar(efdIcms, sb);
			efdIcms = GerarContadoresBloco0.gerar(efdIcms);
		}
		
		//BLOCOC
		if(!Util.isEmpty(efdIcms.getBlocoC())){
			sb = GerarBlocoC.gerar(efdIcms, sb);
			efdIcms = GerarContadoresBlocoC.gerar(efdIcms);
		}
		
		//BLOCOD
		if(!Util.isEmpty(efdIcms.getBlocoD())){
			sb = GerarBlocoD.gerar(efdIcms.getBlocoD(), sb);
			efdIcms = GerarContadoresBlocoD.gerar(efdIcms);
		}
		
		//BLOCOE
		if(!Util.isEmpty(efdIcms.getBlocoE())){
			sb = GerarBlocoE.gerar(efdIcms.getBlocoE(), sb);
			efdIcms = GerarContadoresBlocoE.gerar(efdIcms);
		}
		
		//BLOCOG
		if(!Util.isEmpty(efdIcms.getBlocoG())){
			sb = GerarBlocoG.gerar(efdIcms.getBlocoG(), sb);
			efdIcms = GerarContadoresBlocoG.gerar(efdIcms);
		}
		
		//BLOCOH
		if(!Util.isEmpty(efdIcms.getBlocoH())){
			sb = GerarBlocoH.gerar(efdIcms.getBlocoH(), sb);
			efdIcms = GerarContadoresBlocoH.gerar(efdIcms);
		}
		
		//BLOCOK
		if(!Util.isEmpty(efdIcms.getBlocoK())){
			sb = GerarBlocoK.gerar(efdIcms.getBlocoK(), sb);
			efdIcms = GerarContadoresBlocoK.gerar(efdIcms);
		}
		
		//BLOCO1
		if(!Util.isEmpty(efdIcms.getBloco1())){
			sb = GerarBloco1.gerar(efdIcms.getBloco1(), sb);
			efdIcms = GerarContadoresBloco1.gerar(efdIcms);
		}
		
		//BLOCO9
		Registro9001 registro9001 = new Registro9001();
		registro9001.setInd_mov("0");
		efdIcms.getBloco9().setRegistro9001(registro9001);
		sb = GerarBloco9.gerar(efdIcms.getBloco9(), sb);
		
		return sb;
	}
}
