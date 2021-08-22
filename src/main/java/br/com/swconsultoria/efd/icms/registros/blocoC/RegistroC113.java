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
public class RegistroC113 {

    private final String reg = "C113";
    private String ind_oper;
    private String ind_emit;
    private String cod_part;
    private String cod_mod;
    private String ser;
    private String sub;
    private String num_doc;
    private String dt_doc;
    private String chv_docE;

    /**
     * @return the ind_oper
     */
    public String getInd_oper() {
        return ind_oper;
    }

    /**
     * @param ind_oper the ind_oper to set
     */
    public void setInd_oper(String ind_oper) {
        this.ind_oper = ind_oper;
    }

    /**
     * @return the ind_emit
     */
    public String getInd_emit() {
        return ind_emit;
    }

    /**
     * @param ind_emit the ind_emit to set
     */
    public void setInd_emit(String ind_emit) {
        this.ind_emit = ind_emit;
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
     * @return the sub
     */
    public String getSub() {
        return sub;
    }

    /**
     * @param sub the sub to set
     */
    public void setSub(String sub) {
        this.sub = sub;
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

    /**
     * @return the chv_docE
     */
    public String getChv_docE() {
        return chv_docE;
    }

    /**
     * @param chv_docE the chv_docE to set
     */
    public void setChv_docE(String chv_docE) {
        this.chv_docE = chv_docE;
    }

}
