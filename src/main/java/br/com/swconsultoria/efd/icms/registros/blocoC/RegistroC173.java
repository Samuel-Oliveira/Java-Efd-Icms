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
public class RegistroC173 {

    private final String reg = "C173";
    private String lote_med;
    private String qtd_item;
    private String dt_fab;
    private String dt_val;
    private String ind_med;
    private String tp_prod;
    private String vl_tab_max;

    /**
     * @return the lote_med
     */
    public String getLote_med() {
        return lote_med;
    }

    /**
     * @param lote_med the lote_med to set
     */
    public void setLote_med(String lote_med) {
        this.lote_med = lote_med;
    }

    /**
     * @return the qtd_item
     */
    public String getQtd_item() {
        return qtd_item;
    }

    /**
     * @param qtd_item the qtd_item to set
     */
    public void setQtd_item(String qtd_item) {
        this.qtd_item = qtd_item;
    }

    /**
     * @return the dt_fab
     */
    public String getDt_fab() {
        return dt_fab;
    }

    /**
     * @param dt_fab the dt_fab to set
     */
    public void setDt_fab(String dt_fab) {
        this.dt_fab = dt_fab;
    }

    /**
     * @return the dt_val
     */
    public String getDt_val() {
        return dt_val;
    }

    /**
     * @param dt_val the dt_val to set
     */
    public void setDt_val(String dt_val) {
        this.dt_val = dt_val;
    }

    /**
     * @return the ind_med
     */
    public String getInd_med() {
        return ind_med;
    }

    /**
     * @param ind_med the ind_med to set
     */
    public void setInd_med(String ind_med) {
        this.ind_med = ind_med;
    }

    /**
     * @return the tp_prod
     */
    public String getTp_prod() {
        return tp_prod;
    }

    /**
     * @param tp_prod the tp_prod to set
     */
    public void setTp_prod(String tp_prod) {
        this.tp_prod = tp_prod;
    }

    /**
     * @return the vl_tab_max
     */
    public String getVl_tab_max() {
        return vl_tab_max;
    }

    /**
     * @param vl_tab_max the vl_tab_max to set
     */
    public void setVl_tab_max(String vl_tab_max) {
        this.vl_tab_max = vl_tab_max;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
