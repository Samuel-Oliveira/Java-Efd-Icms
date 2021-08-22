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
public class RegistroC810 {

    private final String reg = "C810";
    private String num_item;
    private String cod_item;
    private String qtd;
    private String unid;
    private String vl_item;
    private String cst_icms;
    private String cfop;
    private RegistroC815 registroC815;

    public String getNum_item() {
        return num_item;
    }

    public void setNum_item(String num_item) {
        this.num_item = num_item;
    }

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

    public String getVl_item() {
        return vl_item;
    }

    public void setVl_item(String vl_item) {
        this.vl_item = vl_item;
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

    public RegistroC815 getRegistroC815() {
        return registroC815;
    }

    public void setRegistroC815(RegistroC815 registroC815) {
        this.registroC815 = registroC815;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
