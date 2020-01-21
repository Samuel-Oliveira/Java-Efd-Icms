/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoB;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sidnei Klein
 */
public class RegistroB020 {

    private final String reg = "B020";
    private String ind_oper;
    private String ind_emit;
    private String cod_part;
    private String cod_mod;
    private String cod_sit;
    private String ser;
    private String num_doc;
    private String chv_nfe;
    private String dt_doc;
    private String cod_mun_serv;
    private String vl_cont;
    private String vl_mat_terc;
    private String vl_sub;
    private String vl_isnt_iss;
    private String vl_ded_bc;
    private String vl_bc_iss;
    private String vl_bc_iss_rt;
    private String vl_iss_rt;
    private String vl_iss;
    private String cod_inf_obs;

    private List<RegistroB025> registroB025;

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

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
     * @return the cod_sit
     */
    public String getCod_sit() {
        return cod_sit;
    }

    /**
     * @param cod_sit the cod_sit to set
     */
    public void setCod_sit(String cod_sit) {
        this.cod_sit = cod_sit;
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
     * @return the cod_mun_serv
     */
    public String getCod_mun_serv() {
        return cod_mun_serv;
    }

    /**
     * @param cod_mun_serv the cod_mun_serv to set
     */
    public void setCod_mun_serv(String cod_mun_serv) {
        this.cod_mun_serv = cod_mun_serv;
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
     * @return the vl_mat_merc
     */
    public String getVl_mat_terc() {
        return vl_mat_terc;
    }

    /**
     * @param vl_mat_terc the vl_mat_merc to set
     */
    public void setVl_mat_terc(String vl_mat_terc) {
        this.vl_mat_terc = vl_mat_terc;
    }

    /**
     * @return the vl_sub
     */
    public String getVl_sub() {
        return vl_sub;
    }

    /**
     * @param vl_sub the vl_sub to set
     */
    public void setVl_sub(String vl_sub) {
        this.vl_sub = vl_sub;
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
     * @return the vl_ded_bc
     */
    public String getVl_ded_bc() {
        return vl_ded_bc;
    }

    /**
     * @param vl_ded_bc the vl_ded_bc to set
     */
    public void setVl_ded_bc(String vl_ded_bc) {
        this.vl_ded_bc = vl_ded_bc;
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
     * @return the vl_bc_iss_rt
     */
    public String getVl_bc_iss_rt() {
        return vl_bc_iss_rt;
    }

    /**
     * @param vl_bc_iss_rt the vl_bc_iss_rt to set
     */
    public void setVl_bc_iss_rt(String vl_bc_iss_rt) {
        this.vl_bc_iss_rt = vl_bc_iss_rt;
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
     * @return the vl_iss_rt
     */
    public String getVl_iss_rt() {
        return vl_iss_rt;
    }

    /**
     * @param vl_iss_rt the vl_iss_rt to set
     */
    public void setVl_iss_rt(String vl_iss_rt) {
        this.vl_iss_rt = vl_iss_rt;
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
     * @return the registroB025
     */
    public List<RegistroB025> getRegistroB025() {
        return registroB025;
    }

    public String getDt_doc() {
        return dt_doc;
    }

    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    /**
     * @param registroB025 the registroB025 to set
     */
    public void setRegistroB025(List<RegistroB025> registroB025) {
        if (registroB025 == null) {
            registroB025 = new ArrayList<>();
        }
        this.registroB025 = registroB025;
    }

}
