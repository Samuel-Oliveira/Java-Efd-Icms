/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoD;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class RegistroD162 {

    private final String reg = "D162";
    private String cod_mod;
    private String ser;
    private String num_doc;
    private String dt_doc;
    private String vl_doc;
    private String vl_merc;
    private String qtd_vol;
    private String peso_brt;
    private String peso_liq;

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
     * @return the ser
     */
    public String getSer() {
        return ser;
    }

    /**
     * @param ser the ser to set
     */
    public void setSer(String ser) {
        this.ser = ser;
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
     * @return the vl_doc
     */
    public String getVl_doc() {
        return vl_doc;
    }

    /**
     * @param vl_doc the vl_doc to set
     */
    public void setVl_doc(String vl_doc) {
        this.vl_doc = vl_doc;
    }

    /**
     * @return the vl_merc
     */
    public String getVl_merc() {
        return vl_merc;
    }

    /**
     * @param vl_merc the vl_merc to set
     */
    public void setVl_merc(String vl_merc) {
        this.vl_merc = vl_merc;
    }

    /**
     * @return the qtd_vol
     */
    public String getQtd_vol() {
        return qtd_vol;
    }

    /**
     * @param qtd_vol the qtd_vol to set
     */
    public void setQtd_vol(String qtd_vol) {
        this.qtd_vol = qtd_vol;
    }

    /**
     * @return the peso_brt
     */
    public String getPeso_brt() {
        return peso_brt;
    }

    /**
     * @param peso_brt the peso_brt to set
     */
    public void setPeso_brt(String peso_brt) {
        this.peso_brt = peso_brt;
    }

    /**
     * @return the peso_liq
     */
    public String getPeso_liq() {
        return peso_liq;
    }

    /**
     * @param peso_liq the peso_liq to set
     */
    public void setPeso_liq(String peso_liq) {
        this.peso_liq = peso_liq;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
