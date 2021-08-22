/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoB;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sidnei Klein
 */
@EqualsAndHashCode
public class RegistroB030 {

    private final String reg = "B030";
    private String cod_mod;
    private String ser;
    private String num_doc_ini;
    private String num_doc_fin;
    private String dt_doc;
    private String qtde_canc;
    private String vl_cont;
    private String vl_isnt_iss;
    private String vl_bc_iss;
    private String vl_iss;
    private String cod_inf_obs;

    private List<RegistroB035> registroB035;

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
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
     * @return the num_doc_ini
     */
    public String getNum_doc_ini() {
        return num_doc_ini;
    }

    /**
     * @param num_doc_ini the num_doc_ini to set
     */
    public void setNum_doc_ini(String num_doc_ini) {
        this.num_doc_ini = num_doc_ini;
    }

    /**
     * @return the num_doc_fin
     */
    public String getNum_doc_fin() {
        return num_doc_fin;
    }

    /**
     * @param num_doc_fin the num_doc_fin to set
     */
    public void setNum_doc_fin(String num_doc_fin) {
        this.num_doc_fin = num_doc_fin;
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
     * @return the qtde_canc
     */
    public String getQtde_canc() {
        return qtde_canc;
    }

    /**
     * @param qtde_canc the qtde_canc to set
     */
    public void setQtde_canc(String qtde_canc) {
        this.qtde_canc = qtde_canc;
    }

    /**
     * @return the vl_cont
     */
    public String getVl_cont() {
        return vl_cont;
    }

    /**
     * @param vl_cont the vl_cont to set
     */
    public void setVl_cont(String vl_cont) {
        this.vl_cont = vl_cont;
    }

    /**
     * @return the vl_isnt_iss
     */
    public String getVl_isnt_iss() {
        return vl_isnt_iss;
    }

    /**
     * @param vl_isnt_iss the vl_isnt_iss to set
     */
    public void setVl_isnt_iss(String vl_isnt_iss) {
        this.vl_isnt_iss = vl_isnt_iss;
    }

    /**
     * @return the vl_bc_iss
     */
    public String getVl_bc_iss() {
        return vl_bc_iss;
    }

    /**
     * @param vl_bc_iss the vl_bc_iss to set
     */
    public void setVl_bc_iss(String vl_bc_iss) {
        this.vl_bc_iss = vl_bc_iss;
    }

    /**
     * @return the vl_iss
     */
    public String getVl_iss() {
        return vl_iss;
    }

    /**
     * @param vl_iss the vl_iss to set
     */
    public void setVl_iss(String vl_iss) {
        this.vl_iss = vl_iss;
    }

    /**
     * @return the cod_inf_obs
     */
    public String getCod_inf_obs() {
        return cod_inf_obs;
    }

    /**
     * @param cod_inf_obs the cod_inf_obs to set
     */
    public void setCod_inf_obs(String cod_inf_obs) {
        this.cod_inf_obs = cod_inf_obs;
    }

    /**
     * @return the registroB035
     */
    public List<RegistroB035> getRegistroB035() {
        return registroB035;
    }

    /**
     * @param registroB035 the registroB035 to set
     */
    public void setRegistroB035(List<RegistroB035> registroB035) {
        if (registroB035 == null) {
            registroB035 = new ArrayList<>();
        }
        this.registroB035 = registroB035;
    }

}
