/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoH;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class RegistroH010 {

    private final String reg = "H010";
    private String cod_item;
    private String unid;
    private String qtd;
    private String vl_unit;
    private String vl_item;
    private String ind_prop;
    private String cod_part;
    private String txt_compl;
    private String cod_cta;
    private String vl_item_ir;
    private List<RegistroH020> registroH020;

    private RegistroH030 registroH030;

    public RegistroH030 getRegistroH030() {
        return registroH030;
    }

    public void setRegistroH030(RegistroH030 registroH030) {
        this.registroH030 = registroH030;
    }

    /**
     * @return the cod_item
     */
    public String getCod_item() {
        return cod_item;
    }

    /**
     * @param cod_item the cod_item to set
     */
    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    /**
     * @return the unid
     */
    public String getUnid() {
        return unid;
    }

    /**
     * @param unid the unid to set
     */
    public void setUnid(String unid) {
        this.unid = unid;
    }

    /**
     * @return the qtd
     */
    public String getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

    /**
     * @return the vl_init
     */
    public String getVl_unit() {
        return vl_unit;
    }

    /**
     * @param vl_unit the vl_unit to set
     */
    public void setVl_unit(String vl_unit) {
        this.vl_unit = vl_unit;
    }

    /**
     * @return the vl_item
     */
    public String getVl_item() {
        return vl_item;
    }

    /**
     * @param vl_item the vl_item to set
     */
    public void setVl_item(String vl_item) {
        this.vl_item = vl_item;
    }

    /**
     * @return the ind_prop
     */
    public String getInd_prop() {
        return ind_prop;
    }

    /**
     * @param ind_prop the ind_prop to set
     */
    public void setInd_prop(String ind_prop) {
        this.ind_prop = ind_prop;
    }

    /**
     * @return the cod_part
     */
    public String getCod_part() {
        return cod_part;
    }

    /**
     * @param cod_part the cod_part to set
     */
    public void setCod_part(String cod_part) {
        this.cod_part = cod_part;
    }

    /**
     * @return the txt_compl
     */
    public String getTxt_compl() {
        return txt_compl;
    }

    /**
     * @param txt_compl the txt_compl to set
     */
    public void setTxt_compl(String txt_compl) {
        this.txt_compl = txt_compl;
    }

    /**
     * @return the cod_cta
     */
    public String getCod_cta() {
        return cod_cta;
    }

    /**
     * @param cod_cta the cod_cta to set
     */
    public void setCod_cta(String cod_cta) {
        this.cod_cta = cod_cta;
    }

    /**
     * @return the vl_item_ir
     */
    public String getVl_item_ir() {
        return vl_item_ir;
    }

    /**
     * @param vl_item_ir the vl_item_ir to set
     */
    public void setVl_item_ir(String vl_item_ir) {
        this.vl_item_ir = vl_item_ir;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroH020
     */
    public List<RegistroH020> getRegistroH020() {
        if (registroH020 == null) {
            registroH020 = new ArrayList<RegistroH020>();
        }
        return registroH020;
    }

}
