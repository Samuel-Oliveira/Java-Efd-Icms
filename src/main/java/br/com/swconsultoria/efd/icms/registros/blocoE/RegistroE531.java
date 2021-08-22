/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoE;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira, Sidnei Klein
 */
@EqualsAndHashCode
public class RegistroE531 {

    private final String reg = "E531";
    private String cod_part;
    private String cod_mod;
    private String ser;
    private String sub;
    private String num_doc;
    private String dt_doc;
    private String cod_item;
    private String vl_aj_item;
    private String chv_nfe;

    public String getCod_part() {
        return cod_part;
    }

    public void setCod_part(String cod_part) {
        this.cod_part = cod_part;
    }

    public String getCod_mod() {
        return cod_mod;
    }

    public void setCod_mod(String cod_mod) {
        this.cod_mod = cod_mod;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public String getDt_doc() {
        return dt_doc;
    }

    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    public String getCod_item() {
        return cod_item;
    }

    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    public String getVl_aj_item() {
        return vl_aj_item;
    }

    public void setVl_aj_item(String vl_aj_item) {
        this.vl_aj_item = vl_aj_item;
    }

    public String getReg() {
        return reg;
    }

    /**
     * @return the chv_nfe
     */
    public String getChv_nfe() {
        return chv_nfe;
    }

    /**
     * @param chv_nfe the chv_nfe to set
     */
    public void setChv_nfe(String chv_nfe) {
        this.chv_nfe = chv_nfe;
    }
}
