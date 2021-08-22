/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.bloco1;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class Registro1110 {

    private final String reg = "1110";
    private String cod_part;
    private String cod_mod;
    private String ser;
    private String num_doc;
    private String dt_doc;
    private String chv_nfe;
    private String nr_memo;
    private String qtd;
    private String unid;

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

    /**
     * @return the nr_memo
     */
    public String getNr_memo() {
        return nr_memo;
    }

    /**
     * @param nr_memo the nr_memo to set
     */
    public void setNr_memo(String nr_memo) {
        this.nr_memo = nr_memo;
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
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
