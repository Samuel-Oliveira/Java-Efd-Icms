/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoC;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira
 *
 */
@EqualsAndHashCode
public class RegistroC870 {

    private final String reg = "C870";
    private String cod_item;
    private String qtd;
    private String unid;
    private String cst_icms;
    private String cfop;
    private RegistroC880 registroC880;

    public String getCod_item() {
        return cod_item;
    }

    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    public String getQtd() {
        return qtd;
    }

    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public String getCst_icms() {
        return cst_icms;
    }

    public void setCst_icms(String cst_icms) {
        this.cst_icms = cst_icms;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public RegistroC880 getRegistroC880() {
        return registroC880;
    }

    public void setRegistroC880(RegistroC880 registroC880) {
        this.registroC880 = registroC880;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
