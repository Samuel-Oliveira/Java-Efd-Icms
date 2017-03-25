/**
 * 
 */
package teste.blocos;

import br.com.samuelweb.efd.icms.registros.blocoC.BlocoC;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC001;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC100;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC101;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC110;
import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC111;

/**
 * @author Yuri Lemes
 *
 */
public class BlocoCTest {

	public static BlocoC preencheBlocoC(){
		BlocoC blocoC = new BlocoC();
		blocoC = preencheRegistroC001(blocoC);
		blocoC = preencheRegistroC100(blocoC);
		return blocoC;
	}

	private static BlocoC preencheRegistroC001(BlocoC blocoC) {
		RegistroC001 registroC001 = new RegistroC001();
		registroC001.setInd_mov("0");
		blocoC.setRegistroC001(registroC001);
		return blocoC;
	}
	
	private static BlocoC preencheRegistroC100(BlocoC blocoC) {
		RegistroC100 registroC100 = new RegistroC100();
		registroC100.setInd_oper("2");
		registroC100.setInd_emit("3");
		registroC100.setCod_mod("5");
		registroC100.setCod_sit("6");
		registroC100.setNum_doc("8");
		registroC100.setChv_nfe("9");
		registroC100.setVl_desc("14");
		registroC100.setVl_abat_nt("15");
		registroC100.setVl_merc("16");
		registroC100.setVl_frt("18");
		registroC100.setVl_seg("19");
		registroC100.setVl_icms("22");
		registroC100.setVl_icms_st("24");
		registroC100.setVl_cofins_st("29");
		
			RegistroC101 registroC101 = new RegistroC101();
			registroC101.setVl_fcp_uf_dest("2");
			registroC101.setVl_icms_uf_dest("3");
			registroC101.setVl_icms_uf_rem("4");
			registroC100.setRegistroC101(registroC101);
		
			RegistroC110 registroC110 = new RegistroC110();
			registroC110.setCod_inf("2");
			registroC110.setTxt_compl("3");
			registroC100.getRegistroC110().add(registroC110);
			
				RegistroC111 registroC111 = new RegistroC111();
				registroC111.setNum_proc("2");
				registroC111.setInd_proc("3");
				registroC110.getRegistroC111().add(registroC111);
				
		blocoC.getRegistroC100().add(registroC100);
		return blocoC;
	}

	
}
