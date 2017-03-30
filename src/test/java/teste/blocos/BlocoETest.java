/**
 * 
 */
package teste.blocos;

import br.com.samuelweb.efd.icms.registros.blocoE.BlocoE;
import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE001;
import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE100;
import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE110;
import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE111;
import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE112;
import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE113;

/**
 * @author Yuri Lemes
 *
 */
public class BlocoETest {

	public static BlocoE preencheBlocoE(){
		BlocoE blocoE = new BlocoE();
		blocoE = preencheRegistroE001(blocoE);
		blocoE = preencheRegistroE100(blocoE);
		return blocoE;
	}

	/**
	 * @param blocoE
	 * @return
	 */
	private static BlocoE preencheRegistroE001(BlocoE blocoE) {
		RegistroE001 registroE001 = new RegistroE001();
		registroE001.setInd_mov("0");
		blocoE.setRegistroE001(registroE001);
		return blocoE;
	}

	/**
	 * @param blocoE
	 * @return
	 */
	private static BlocoE preencheRegistroE100(BlocoE blocoE) {
		RegistroE100 registroE100 = new RegistroE100();
		registroE100.setDt_ini("2");
		registroE100.setDt_fin("3");
		
			RegistroE110 registroE110 = new RegistroE110();
			registroE110.setVl_tot_debitos("2");
			registroE110.setVl_aj_debitos("3");
			registroE110.setVl_estornos_cred("5");
			registroE110.setVl_aj_creditos("7");
			registroE110.setVl_sld_apurado("11");
			registroE110.setVl_tot_ded("12");
			registroE110.setDeb_esp("15");
				
				RegistroE111 registroE111 = new RegistroE111();
				registroE111.setCod_aj_apur("2");
				registroE111.setDescr_compl_aj("3");
				registroE111.setVl_aj_apur("4");
				
					RegistroE112 registroE112 = new RegistroE112();
					registroE112.setNum_da("2");
					registroE112.setNum_proc("3");
					registroE112.setInd_proc("4");
					registroE112.setProc("5");
					registroE112.setTxt_compl("6");
					registroE111.getRegistroE112().add(registroE112);
					
					registroE112 = new RegistroE112();
					registroE112.setNum_da("2");
//					registroE112.setNum_proc("3");
					registroE112.setInd_proc("4");
//					registroE112.setProc("5");
					registroE112.setTxt_compl("6");
					registroE111.getRegistroE112().add(registroE112);
					
					RegistroE113 registroE113 = new RegistroE113();
					registroE113.setCod_part("2");
					registroE113.setSer("4");
					registroE113.setSub("5");
					registroE113.setChv_doc_e("10");
					registroE111.getRegistroE113().add(registroE113);
					
					registroE113 = new RegistroE113();
					registroE113.setCod_part("2");
//					registroE113.setSer("4");
					registroE113.setSub("5");
					registroE113.setNum_doc("6");
					registroE113.setChv_doc_e("10");
					registroE111.getRegistroE113().add(registroE113);
				
				registroE110.getRegistroE111().add(registroE111);
			registroE100.setRegistroE110(registroE110);
		blocoE.getRegistroE100().add(registroE100);
		return blocoE;
	}
}
