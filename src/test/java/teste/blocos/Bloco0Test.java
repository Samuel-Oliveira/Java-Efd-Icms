///**
// *
// */
//package teste.blocos;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import br.com.samuelweb.efd.icms.bo.GerarEfdIcms;
//import br.com.samuelweb.efd.icms.registros.EfdIcms;
//import br.com.samuelweb.efd.icms.registros.bloco0.Bloco0;
//import br.com.samuelweb.efd.icms.registros.bloco0.Registro0000;
//import br.com.samuelweb.efd.icms.registros.bloco0.Registro0001;
//import br.com.samuelweb.efd.icms.registros.bloco0.Registro0005;
//import br.com.samuelweb.efd.icms.registros.bloco0.Registro0100;
//import br.com.samuelweb.efd.icms.registros.bloco0.Registro0150;
//import br.com.samuelweb.efd.icms.registros.bloco0.Registro0175;
//import br.com.samuelweb.efd.icms.registros.bloco0.Registro0190;
//import br.com.samuelweb.efd.icms.registros.bloco0.Registro0200;
//import br.com.samuelweb.efd.icms.registros.bloco0.Registro0206;
//import br.com.samuelweb.efd.icms.registros.bloco0.Registro0450;
//
///**
// * @author Samuel Oliveira
// *
// */
//public class Bloco0Test {
//
//	@Test
//	public void testaBloco0(){
//		StringBuilder sb = new StringBuilder();
//		EfdIcms efdIcms = new EfdIcms();
//		efdIcms.setBloco0(preencheBloco0());
//		sb = GerarEfdIcms.gerar(efdIcms, sb);
//		System.out.println(sb.toString());
//		Assert.assertEquals(sb.toString(),Resultados.resultadoBloco0());
//	}
//
//	public Bloco0 preencheBloco0(){
//		Bloco0 bloco0 = new Bloco0();
//		bloco0 = preencheRegistro0000(bloco0);
//		bloco0 = preencheRegistro0001(bloco0);
//		bloco0 = preencheRegistro0005(bloco0);
//		bloco0 = preencheRegistro0100(bloco0);
//		bloco0 = preencheRegistro0150(bloco0);
//		bloco0 = preencheRegistro0190(bloco0);
//		bloco0 = preencheRegistro0200(bloco0);
//		bloco0 = preencheRegistro0450(bloco0);
//
//		return bloco0;
//	}
//
//	public Bloco0 preencheRegistro0000(Bloco0 bloco0){
//		Registro0000 registro0000 = new Registro0000();
//		registro0000.setCod_ver("010");
//		registro0000.setCod_fin("0");
//		registro0000.setDt_ini("01082016");
//		registro0000.setDt_fin("31082016");
//		registro0000.setNome("FERREIRA COM DE DER DE PETROLEO LTDA");
//		registro0000.setCnpj("08381059000774");
//		registro0000.setUf("TO");
//		registro0000.setIe("294434763");
//		registro0000.setCod_mun("1706258");
//		registro0000.setInd_perfil("A");
//		registro0000.setInd_ativ("1");
//		bloco0.setRegistro0000(registro0000);
//
//		return bloco0;
//	}
//
//	public Bloco0 preencheRegistro0001(Bloco0 bloco0){
//		Registro0001 registro0001 = new Registro0001();
//		registro0001.setInd_mov("0");
//		bloco0.setRegistro0001(registro0001);
//
//		return bloco0;
//	}
//
//	public Bloco0 preencheRegistro0005(Bloco0 bloco0){
//		Registro0005 registro0005 = new Registro0005();
//		registro0005.setFantasia("POSTO SAO JORGE");
//		registro0005.setCep("77463000");
//		registro0005.setEnd("RODOVIA BR 153");
//		registro0005.setNum("S/N");
//		registro0005.setCompl("KM608");
//		registro0005.setBairro("ZONA RURAL");
//		registro0005.setFone("6333521135");
//		registro0005.setEmail("agenorferreira10@hotmail.com");
//		bloco0.setRegistro0005(registro0005);
//
//		return bloco0;
//	}
//
//	public Bloco0 preencheRegistro0100(Bloco0 bloco0){
//		Registro0100 registro0100 = new Registro0100();
//		registro0100.setNome("MARLENE GONÇALVES DE CAMARGO OLIVEIRA");
//		registro0100.setCpf("51513676172");
//		registro0100.setCrc("11479");
//		registro0100.setCep("74320070");
//		registro0100.setEnd("RUA E 1");
//		registro0100.setNum("00002");
//		registro0100.setBairro("VILA LUCY");
//		registro0100.setFone("6232876383");
//		registro0100.setFax("6232876383");
//		registro0100.setEmail("camargoassessoriacontabil@gmail.com");
//		registro0100.setCod_mun("5208707");
//		bloco0.setRegistro0100(registro0100);
//
//		return bloco0;
//	}
//
//	public Bloco0 preencheRegistro0150(Bloco0 bloco0){
//		Registro0150 registro0150 = new Registro0150();
//		registro0150.setCod_part("51786192934");
//		registro0150.setNome("FAZENDA CJL");
//		registro0150.setCod_pais("1058");
//		registro0150.setCpf("51786192934");
//		registro0150.setCod_mun("1706258");
//		registro0150.setEnd("FAZENDA CJL S/N");
//		registro0150.setNum("S/N");
//		registro0150.setBairro("ZONA RURAL");
//		bloco0.getRegistro0150().add(registro0150);
//
//			Registro0175 registro0175 = new Registro0175();
//			registro0175.setDt_alt("10082016");
//			registro0175.setNr_campo("10");
//			registro0175.setCont_ant("Rua Anterior");
//			registro0150.getRegistro0175().add(registro0175);
//
//		registro0150 = new Registro0150();
//		registro0150.setCod_part("00001");
//		registro0150.setNome("BR - PETROBRAS");
//		registro0150.setCod_pais("1058");
//		registro0150.setCnpj("34274233023811");
//		registro0150.setIe("294509577");
//		registro0150.setCod_mun("1718204");
//		registro0150.setEnd("RODOVIA TO-80 KM23 LT12");
//		registro0150.setNum("SN");
//		registro0150.setBairro("PATIO MULTIMODAL");
//
//			registro0175 = new Registro0175();
//			registro0175.setDt_alt("10082016");
//			registro0175.setNr_campo("10");
//			registro0175.setCont_ant("Rua Anterior");
//			registro0150.getRegistro0175().add(registro0175);
//
//			registro0175 = new Registro0175();
//			registro0175.setDt_alt("11082016");
//			registro0175.setNr_campo("11");
//			registro0175.setCont_ant("123");
//			registro0150.getRegistro0175().add(registro0175);
//
//		bloco0.getRegistro0150().add(registro0150);
//
//		return bloco0;
//	}
//
//	public Bloco0 preencheRegistro0190(Bloco0 bloco0){
//		Registro0190 registro0190 = new Registro0190();
//		registro0190.setUnid("LT");
//		registro0190.setDescr("LT.");
//		bloco0.getRegistro0190().add(registro0190);
//
//		return bloco0;
//	}
//
//	public Bloco0 preencheRegistro0200(Bloco0 bloco0){
//		Registro0200 registro0200 = new Registro0200();
//		registro0200.setCod_item("810101001");
//		registro0200.setDescr_item("ETANOL HIDRATADO COMBUSTIVEL-COMUM");
//		registro0200.setUnid_inv("LT");
//		registro0200.setTipo_item("00");
//		registro0200.setCod_ncm("22071090");
//		registro0200.setAliq_icms("0");
//		registro0200.setCest("012345");
//
//			Registro0206 registro0206 = new Registro0206();
//			registro0206.setCod_comb("810101001");
//			registro0200.setRegistro0206(registro0206);
//
//		bloco0.getRegistro0200().add(registro0200);
//
//		return bloco0;
//	}
//
//	public Bloco0 preencheRegistro0450(Bloco0 bloco0){
//		Registro0450 registro0450 = new Registro0450();
//		registro0450.setCod_inf("1");
//		registro0450.setTxt("Relacao ECF(S):");
//		bloco0.getRegistro0450().add(registro0450);
//
//		return bloco0;
//	}
//
//}
