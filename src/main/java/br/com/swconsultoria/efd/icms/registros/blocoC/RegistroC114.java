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
public class RegistroC114 {

    private final String reg = "C114";
    private String cod_mod;
    private String ecf_fab;
    private String ecf_cx;
    private String num_doc;
    private String dt_doc;

    /**
     * @return the cod_mod
     */
    public String getCod_mod() {
        return cod_mod;
    }

    /**
     * @param cod_mod the cod_mod to set
     */
    public void setCod_mod(String cod_mod) {
        this.cod_mod = cod_mod;
    }

    /**
     * @return the ecf_fab
     */
    public String getEcf_fab() {
        return ecf_fab;
    }

    /**
     * @param ecf_fab the ecf_fab to set
     */
    public void setEcf_fab(String ecf_fab) {
        this.ecf_fab = ecf_fab;
    }

    /**
     * @return the ecf_cx
     */
    public String getEcf_cx() {
        return ecf_cx;
    }

    /**
     * @param ecf_cx the ecf_cx to set
     */
    public void setEcf_cx(String ecf_cx) {
        this.ecf_cx = ecf_cx;
    }

    /**
     * @return the num_doc
     */
    public String getNum_doc() {
        return num_doc;
    }

    /**
     * @param num_doc the num_doc to set
     */
    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    /**
     * @return the dt_doc
     */
    public String getDt_doc() {
        return dt_doc;
    }

    /**
     * @param dt_doc the dt_doc to set
     */
    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
