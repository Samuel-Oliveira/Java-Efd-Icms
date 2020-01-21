/**
 *
 */
package br.com.swconsultoria.efd.icms;

import br.com.swconsultoria.efd.icms.registros.blocoC.*;

/**
 * @author Samuel Oliveira
 *
 */
public class BlocoCTest {

    public static BlocoC preencheBlocoC() {
        BlocoC blocoC = new BlocoC();
        blocoC = preencheRegistroC001(blocoC);
        blocoC = preencheRegistroC100(blocoC);
        blocoC = preencheRegistroC400(blocoC);
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
        registroC100.setInd_oper("0");
        registroC100.setInd_emit("1");
        registroC100.setCod_part("00018");
        registroC100.setCod_mod("55");
        registroC100.setCod_sit("00");
        registroC100.setSer("1");
        registroC100.setNum_doc("170197");
        registroC100.setChv_nfe("52170202909530000425550010001701971941144629");
        registroC100.setDt_doc("02022017");
        registroC100.setDt_e_s("02022017");
        registroC100.setVl_doc("14062");
        registroC100.setInd_pagto("1");
        registroC100.setVl_desc("0");
        registroC100.setVl_abat_nt("0");
        registroC100.setVl_merc("14062");
        registroC100.setInd_frt("9");
        registroC100.setVl_frt("0");
        registroC100.setVl_seg("0");
        registroC100.setVl_out_da("0");
        registroC100.setVl_bc_icms("0");
        registroC100.setVl_icms("0");
        registroC100.setVl_bc_icms_st("0");
        registroC100.setVl_icms_st("0");
        registroC100.setVl_ipi("0");
        registroC100.setVl_pis("0");
        registroC100.setVl_cofins("0");
        registroC100.setVl_pis_st("0");
        registroC100.setVl_cofins_st("0");

        RegistroC170 registroC170 = new RegistroC170();
        registroC170.setNum_item("1");
        registroC170.setCod_item("820101034");
        registroC170.setQtd("5000");
        registroC170.setUnid("LT");
        registroC170.setVl_item("14062");
        registroC170.setVl_desc("0");
        registroC170.setInd_mov("0");
        registroC170.setCst_icms("060");
        registroC170.setCfop("1652");
        registroC170.setVl_bc_icms("0");
        registroC170.setAliq_icms("0");
        registroC170.setVl_icms("0");
        registroC170.setVl_bc_icms_st("0");
        registroC170.setAliq_st("0");
        registroC170.setVl_icms_st("0");
        registroC170.setCst_pis("98");
        registroC170.setVl_bc_pis("0");
        registroC170.setAliq_pis_percentual("0");
        registroC170.setQuant_bc_pis("0");
        registroC170.setAliq_pis_reais("0");
        registroC170.setVl_pis("0");
        registroC170.setCst_cofins("98");
        registroC170.setVl_bc_cofins("0");
        registroC170.setAliq_cofins_percentual("0");
        registroC170.setQuant_bc_cofins("0");
        registroC170.setAliq_cofins_reais("0");
        registroC170.setVl_cofins("0");

        RegistroC171 registroC171 = new RegistroC171();
        registroC171.setNum_tanque("4");
        registroC171.setQtde("5000");

        registroC170.getRegistroC171().add(registroC171);

        registroC100.getRegistroC170().add(registroC170);

        RegistroC190 registroC190 = new RegistroC190();
        registroC190.setCst_icms("060");
        registroC190.setCfop("1652");
        registroC190.setAliq_icms("0");
        registroC190.setVl_opr("14062");
        registroC190.setVl_bc_icms("0");
        registroC190.setVl_icms("0");
        registroC190.setVl_bc_icms_st("0");
        registroC190.setVl_icms_st("0");
        registroC190.setVl_red_bc("0");
        registroC190.setVl_ipi("0");

        registroC100.getRegistroC190().add(registroC190);
        blocoC.getRegistroC100().add(registroC100);

        RegistroC100 registroC100a = new RegistroC100();
        registroC100a.setInd_oper("1");
        registroC100a.setInd_emit("0");
        registroC100a.setCod_part("17365083000115");
        registroC100a.setCod_mod("55");
        registroC100a.setCod_sit("08");
        registroC100a.setSer("1");
        registroC100a.setNum_doc("173");
        registroC100a.setChv_nfe("52170220697013000179550010000011731173650837");
        registroC100a.setDt_doc("01022017");
        registroC100a.setDt_e_s("01022017");
        registroC100a.setInd_pagto("0");
        registroC100a.setInd_frt("9");
        registroC100a.setVl_frt("0");
        registroC100a.setVl_seg("0");

        RegistroC110 registroC110 = new RegistroC110();
        registroC110.setCod_inf("1");

        RegistroC114 registroC114 = new RegistroC114();
        registroC114.setCod_mod("2D");
        registroC114.setEcf_fab("BE051575610000228956");
        registroC114.setEcf_cx("1");
        registroC114.setNum_doc("27463");
        registroC114.setDt_doc("27012017");
        registroC110.getRegistroC114().add(registroC114);

        RegistroC114 registroC114a = new RegistroC114();
        registroC114a.setCod_mod("2D");
        registroC114a.setEcf_fab("BE051575610000228956");
        registroC114a.setEcf_cx("1");
        registroC114a.setNum_doc("27615");
        registroC114a.setDt_doc("29012017");
        registroC110.getRegistroC114().add(registroC114a);

        RegistroC114 registroC114c = new RegistroC114();
        registroC114c.setCod_mod("2D");
        registroC114c.setEcf_fab("BE051575610000228956");
        registroC114c.setEcf_cx("1");
        registroC114c.setNum_doc("27605");
        registroC114c.setDt_doc("29012017");
        registroC110.getRegistroC114().add(registroC114c);

        registroC100a.getRegistroC110().add(registroC110);

        RegistroC190 registroC190a = new RegistroC190();
        registroC190a.setCst_icms("060");
        registroC190a.setCfop("5929");
        registroC190a.setAliq_icms("0");
        registroC190a.setVl_opr("0");
        registroC190a.setVl_bc_icms("0");
        registroC190a.setVl_icms("0");
        registroC190a.setVl_bc_icms_st("0");
        registroC190a.setVl_icms_st("0");
        registroC190a.setVl_red_bc("0");
        registroC190a.setVl_ipi("0");
        registroC100a.getRegistroC190().add(registroC190a);

        blocoC.getRegistroC100().add(registroC100a);

        return blocoC;
    }

    private static BlocoC preencheRegistroC400(BlocoC blocoC) {

        RegistroC400 registroC400 = new RegistroC400();
        registroC400.setCod_mod("2D");
        registroC400.setEcf_mod("MP2100FI");
        registroC400.setEcf_fab("BE051575610000228956");
        registroC400.setEcf_cx("1");

        RegistroC405 registroC405 = new RegistroC405();
        registroC405.setDt_doc("01022017");
        registroC405.setCro("2");
        registroC405.setCrz("444");
        registroC405.setNum_coo_fin("27883");
        registroC405.setGt_fin("4517216,6");
        registroC405.setVl_brt("11606,2");

        RegistroC410 registroC410 = new RegistroC410();
        registroC410.setVl_pis("1,24");
        registroC410.setVl_cofins("5,7");
        registroC405.setRegistroC410(registroC410);

        RegistroC420 registroC420 = new RegistroC420();
        registroC420.setCod_tot_par("F1");
        registroC420.setVlr_acum_tot("11606,2");
        registroC405.getRegistroC420().add(registroC420);

        RegistroC460 registroC460 = new RegistroC460();
        registroC460.setCod_mod("2D");
        registroC460.setCod_sit("00");
        registroC460.setNum_doc("27820");
        registroC460.setDt_doc("01022017");
        registroC460.setVl_doc("5050");

        RegistroC470 registroC470 = new RegistroC470();
        registroC470.setCod_item("320102001");
        registroC470.setQtd("1383,562");
        registroC470.setUnid("LT");
        registroC470.setVl_item("5050");
        registroC470.setCst_icms("060");
        registroC470.setCfop("5656");
        registroC470.setAliq_icms("0");
        registroC470.setVl_pis("0");
        registroC470.setVl_cofins("0");
        registroC460.getRegistroC470().add(registroC470);
        registroC405.getRegistroC460().add(registroC460);

        RegistroC490 registroC490 = new RegistroC490();
        registroC490.setCst_icms("060");
        registroC490.setCfop("5656");
        registroC490.setAliq_icms("0");
        registroC490.setVl_opr("11606,2");
        registroC490.setVl_bc_icms("0");
        registroC490.setVl_icms("0");
        registroC405.getRegistroC490().add(registroC490);

        registroC400.getRegistroC405().add(registroC405);

        blocoC.getRegistroC400().add(registroC400);

        return blocoC;
    }

}
