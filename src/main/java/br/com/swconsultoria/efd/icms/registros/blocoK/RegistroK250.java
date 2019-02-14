/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoK;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira, Sidnei Klein
 */
public class RegistroK250 {

    private final String reg = "K250";
    private String dt_prod;
    private String cod_item;
    private String qtd;
    private String cod_ins_subst;

    private List<RegistroK255> registroK255;

    /**
     * @return the dt_prod
     */
    public String getDt_prod() {
        return dt_prod;
    }

    /**
     * @param dt_prod the dt_prod to set
     */
    public void setDt_prod(String dt_prod) {
        this.dt_prod = dt_prod;
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
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroK255
     */
    public List<RegistroK255> getRegistroK255() {
        if (registroK255 == null) {
            registroK255 = new ArrayList<RegistroK255>();
        }
        return registroK255;
    }

    /**
     * @return the cod_ins_subst
     */
    public String getCod_ins_subst() {
        return cod_ins_subst;
    }

    /**
     * @param cod_ins_subst the cod_ins_subst to set
     */
    public void setCod_ins_subst(String cod_ins_subst) {
        this.cod_ins_subst = cod_ins_subst;
    }
}
