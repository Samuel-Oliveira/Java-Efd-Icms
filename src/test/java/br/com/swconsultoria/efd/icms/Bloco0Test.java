/**
 *
 */
package br.com.swconsultoria.efd.icms;

import br.com.swconsultoria.efd.icms.registros.bloco0.*;

/**
 * @author Samuel Oliveira
 *
 */
public class Bloco0Test {

    public static Bloco0 preencheBloco0() {
        Bloco0 bloco0 = new Bloco0();
        bloco0 = preencheRegistro0000(bloco0);
        bloco0 = preencheRegistro0001(bloco0);
        bloco0 = preencheRegistro0005(bloco0);
        bloco0 = preencheRegistro0100(bloco0);
        bloco0 = preencheRegistro0150(bloco0);
        bloco0 = preencheRegistro0190(bloco0);
        bloco0 = preencheRegistro0200(bloco0);
        bloco0 = preencheRegistro0450(bloco0);

        return bloco0;
    }

    public static Bloco0 preencheRegistro0000(Bloco0 bloco0) {
        Registro0000 registro0000 = new Registro0000();
        registro0000.setCod_fin("0");
        registro0000.setDt_ini("01012022");
        registro0000.setDt_fin("15012022");
        registro0000.setNome("NOME");
        registro0000.setCnpj("99999999999999");
        registro0000.setUf("GO");
        registro0000.setIe("999999999");
        registro0000.setCod_mun("9999999");
        registro0000.setInd_perfil("A");
        registro0000.setInd_ativ("1");
        bloco0.setRegistro0000(registro0000);

        return bloco0;
    }

    public static Bloco0 preencheRegistro0001(Bloco0 bloco0) {
        Registro0001 registro0001 = new Registro0001();
        registro0001.setInd_mov("0");
        bloco0.setRegistro0001(registro0001);

        return bloco0;
    }

    public static Bloco0 preencheRegistro0005(Bloco0 bloco0) {
        Registro0005 registro0005 = new Registro0005();
        registro0005.setFantasia("NOME FANTASIA");
        registro0005.setCep("75000000");
        registro0005.setEnd("RUA TESTE");
        registro0005.setNum("999");
        registro0005.setCompl("COMPLEMENTO");
        registro0005.setBairro("BAIRRO");
        registro0005.setFone("9999999999");
        registro0005.setEmail("teste@teste");
        bloco0.setRegistro0005(registro0005);

        return bloco0;
    }

    public static Bloco0 preencheRegistro0100(Bloco0 bloco0) {
        Registro0100 registro0100 = new Registro0100();
        registro0100.setNome("CONTADOR");
        registro0100.setCpf("99999999999");
        registro0100.setCrc("999999");
        registro0100.setCnpj("999999999");
        registro0100.setCep("75000000");
        registro0100.setEnd("AV TESTE");
        registro0100.setNum("9999");
        registro0100.setBairro("BAIRRO");
        registro0100.setFone("9999999999");
        registro0100.setFax("9999999999");
        registro0100.setEmail("teste@teste.com");
        registro0100.setCod_mun("9999999");
        bloco0.setRegistro0100(registro0100);

        return bloco0;
    }

    public static Bloco0 preencheRegistro0150(Bloco0 bloco0) {
        Registro0150 registro0150 = new Registro0150();
        registro0150.setCod_part("99999999999");
        registro0150.setNome("FORNECEDOR");
        registro0150.setCod_pais("1058");
        registro0150.setCnpj("99999999999999");
        registro0150.setIe("99999999");
        registro0150.setCod_mun("9999999");
        registro0150.setEnd("RUA TESTE");
        registro0150.setNum("999");
        registro0150.setCompl("COMPLEMENTO");
        registro0150.setBairro("BAIRRO");
        bloco0.getRegistro0150().add(registro0150);

        return bloco0;
    }

    public static Bloco0 preencheRegistro0190(Bloco0 bloco0) {
        Registro0190 registro0190 = new Registro0190();
        registro0190.setUnid("LT");
        registro0190.setDescr("LT");
        bloco0.getRegistro0190().add(registro0190);

        return bloco0;
    }

    public static Bloco0 preencheRegistro0200(Bloco0 bloco0) {
        Registro0200 registro0200 = new Registro0200();
        registro0200.setCod_item("810101001");
        registro0200.setDescr_item("ETANOL HIDRATADO COMBUSTIVEL-COMUM");
        registro0200.setUnid_inv("LT");
        registro0200.setTipo_item("00");
        registro0200.setCod_ncm("22071090");
        registro0200.setAliq_icms("0");

        Registro0206 registro0206 = new Registro0206();
        registro0206.setCod_comb("810101001");
        registro0200.setRegistro0206(registro0206);

        bloco0.getRegistro0200().add(registro0200);

        Registro0200 registro0200a = new Registro0200();
        registro0200a.setCod_item("820101034");
        registro0200a.setDescr_item("OLEO DIESEL B S10-COMUM");
        registro0200a.setUnid_inv("LT");
        registro0200a.setTipo_item("00");
        registro0200a.setCod_ncm("27101921");
        registro0200a.setAliq_icms("0");

        Registro0206 registro0206a = new Registro0206();
        registro0206a.setCod_comb("820101034");
        registro0200a.setRegistro0206(registro0206a);

        bloco0.getRegistro0200().add(registro0200a);

        Registro0200 registro0200d = new Registro0200();
        registro0200d.setCod_item("320102001");
        registro0200d.setDescr_item("GASOLINA C-COMUM");
        registro0200d.setUnid_inv("LT");
        registro0200d.setTipo_item("00");
        registro0200d.setCod_ncm("27101259");
        registro0200d.setAliq_icms("0");

        Registro0206 registro0206d = new Registro0206();
        registro0206d.setCod_comb("320102001");
        registro0200d.setRegistro0206(registro0206d);

        bloco0.getRegistro0200().add(registro0200d);

        return bloco0;
    }

    public static Bloco0 preencheRegistro0450(Bloco0 bloco0) {
        Registro0450 registro0450 = new Registro0450();
        registro0450.setCod_inf("1");
        registro0450.setTxt("Relacao ECF(S):");
        bloco0.getRegistro0450().add(registro0450);

        return bloco0;
    }

}
