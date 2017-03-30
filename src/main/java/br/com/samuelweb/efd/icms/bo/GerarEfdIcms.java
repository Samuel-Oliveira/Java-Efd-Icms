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
import br.com.samuelweb.efd.icms.registros.bloco1.Bloco1;
import br.com.samuelweb.efd.icms.registros.bloco1.Registro1001;
import br.com.samuelweb.efd.icms.registros.bloco9.Registro9001;
import br.com.samuelweb.efd.icms.registros.blocoC.BlocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC001;
import br.com.samuelweb.efd.icms.registros.blocoD.BlocoD;
import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD001;
import br.com.samuelweb.efd.icms.registros.blocoE.BlocoE;
import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE001;
import br.com.samuelweb.efd.icms.registros.blocoG.BlocoG;
import br.com.samuelweb.efd.icms.registros.blocoG.RegistroG001;
import br.com.samuelweb.efd.icms.registros.blocoH.BlocoH;
import br.com.samuelweb.efd.icms.registros.blocoH.RegistroH001;
import br.com.samuelweb.efd.icms.registros.blocoK.BlocoK;
import br.com.samuelweb.efd.icms.registros.blocoK.RegistroK001;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarEfdIcms {
	
	public static StringBuilder gerar(EfdIcms efdIcms, StringBuilder sb){
		
		//BLOCO0
		if(!Util.isEmpty(efdIcms.getBloco0())){
			sb = GerarBloco0.gerar(efdIcms.getBloco0(), sb);
			efdIcms = GerarContadoresBloco0.gerar(efdIcms);
		}
		
		//BLOCOC
		if(Util.isEmpty(efdIcms.getBlocoC())){
			sb = GerarBlocoC.gerar(efdIcms.getBlocoC(), sb);
			efdIcms = GerarContadoresBlocoC.gerar(efdIcms);
			
//			BlocoC blocoC = new BlocoC();
//			RegistroC001 registroC001 = new RegistroC001();
//			registroC001.setInd_mov("1");
//			blocoC.setRegistroC001(registroC001);
//			efdIcms.setBlocoC(blocoC);
		}
		sb = GerarBlocoC.gerar(efdIcms.getBlocoC(), sb);
		efdIcms = GerarContadoresBlocoC.gerar(efdIcms);
		
		//BLOCOD
		if(Util.isEmpty(efdIcms.getBlocoD())){
			BlocoD blocoD = new BlocoD();
			RegistroD001 registroD001 = new RegistroD001();
			registroD001.setInd_mov("0");
			blocoD.setRegistroD001(registroD001);
			efdIcms.setBlocoD(blocoD);
		}
		sb = GerarBlocoD.gerar(efdIcms.getBlocoD(), sb);
		efdIcms = GerarContadoresBlocoD.gerar(efdIcms);
		
		//BLOCOE
		if(Util.isEmpty(efdIcms.getBlocoE())){
			BlocoE blocoE = new BlocoE();
			RegistroE001 registroE001 = new RegistroE001();
			registroE001.setInd_mov("0");
			blocoE.setRegistroE001(registroE001);
			efdIcms.setBlocoE(blocoE);
		}
		sb = GerarBlocoE.gerar(efdIcms.getBlocoE(), sb);
		efdIcms = GerarContadoresBlocoE.gerar(efdIcms);
		
		//BLOCOG
		if(Util.isEmpty(efdIcms.getBlocoG())){
			BlocoG blocoG = new BlocoG();
			RegistroG001 registroG001 = new RegistroG001();
			registroG001.setInd_mov("1");
			blocoG.setRegistroG001(registroG001);
			efdIcms.setBlocoG(blocoG);
		}
		sb = GerarBlocoG.gerar(efdIcms.getBlocoG(), sb);
		efdIcms = GerarContadoresBlocoG.gerar(efdIcms);
		
		//BLOCOH
		if(Util.isEmpty(efdIcms.getBlocoH())){
			BlocoH blocoH = new BlocoH();
			RegistroH001 registroH001 = new RegistroH001();
			registroH001.setInd_mov("1");
			blocoH.setRegistroH001(registroH001);
			efdIcms.setBlocoH(blocoH);
		}
		sb = GerarBlocoH.gerar(efdIcms.getBlocoH(), sb);
		efdIcms = GerarContadoresBlocoH.gerar(efdIcms);
		
		//BLOCOK
		if(Util.isEmpty(efdIcms.getBlocoK())){
			BlocoK blocoK = new BlocoK();
			RegistroK001 registroK001 = new RegistroK001();
			registroK001.setInd_mov("1");
			blocoK.setRegistroK001(registroK001);
			efdIcms.setBlocoK(blocoK);
		}
		sb = GerarBlocoK.gerar(efdIcms.getBlocoK(), sb);
		efdIcms = GerarContadoresBlocoK.gerar(efdIcms);
		
		//BLOCO1
		if(Util.isEmpty(efdIcms.getBloco1())){
			Bloco1 bloco1 = new Bloco1();
			Registro1001 registro1001 = new Registro1001();
			registro1001.setInd_mov("1");
			bloco1.setRegistro1001(registro1001);
			efdIcms.setBloco1(bloco1);
		}
		sb = GerarBloco1.gerar(efdIcms.getBloco1(), sb);
		efdIcms = GerarContadoresBloco1.gerar(efdIcms);
		
		//BLOCO9
		Registro9001 registro9001 = new Registro9001();
		registro9001.setInd_mov("0");
		efdIcms.getBloco9().setRegistro9001(registro9001);
		sb = GerarBloco9.gerar(efdIcms.getBloco9(), sb);
		
		return sb;
	}
}
