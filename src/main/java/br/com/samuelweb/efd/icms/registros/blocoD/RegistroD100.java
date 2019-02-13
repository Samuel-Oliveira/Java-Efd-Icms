/**
 *
 */
package br.com.samuelweb.efd.icms.registros.blocoD;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroD100 {

    private final String reg = "D100";
    private String ind_oper;
    private String ind_emit;
    private String cod_part;
    private String cod_mod;
    private String cod_sit;
    private String ser;
    private String sub;
    private String num_doc;
    private String chv_cte;
    private String dt_doc;
    private String dt_a_p;
    private String tp_cte;
    private String chv_cte_ref;
    private String vl_doc;
    private String vl_desc;
    private String ind_frt;
    private String vl_serv;
    private String vl_bc_icms;
    private String vl_icms;
    private String vl_nt;
    private String cod_inf;
    private String cod_cta;
    private String cod_mun_orig;
    private String cod_mun_dest;
    private RegistroD101 registroD101;
    private RegistroD140 registroD140;
    private RegistroD150 registroD150;
    private RegistroD170 registroD170;
    private List<RegistroD110> registroD110;
    private List<RegistroD130> registroD130;
    private List<RegistroD160> registroD160;
    private List<RegistroD180> registroD180;
    private List<RegistroD190> registroD190;
    private List<RegistroD195> registroD195;

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
     * @return the chv_cte
     */
    public String getChv_cte() {
        return chv_cte;
    }

    /**
     * @param chv_cte the chv_cte to set
     */
    public void setChv_cte(String chv_cte) {
        this.chv_cte = chv_cte;
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
     * @return the dt_a_p
     */
    public String getDt_a_p() {
        return dt_a_p;
    }

    /**
     * @param dt_a_p the dt_a_p to set
     */
    public void setDt_a_p(String dt_a_p) {
        this.dt_a_p = dt_a_p;
    }

    /**
     * @return the tp_cte
     */
    public String getTp_cte() {
        return tp_cte;
    }

    /**
     * @param tp_cte the tp_cte to set
     */
    public void setTp_cte(String tp_cte) {
        this.tp_cte = tp_cte;
    }

    /**
     * @return the chv_cte_ref
     */
    public String getChv_cte_ref() {
        return chv_cte_ref;
    }

    /**
     * @param chv_cte_ref the chv_cte_ref to set
     */
    public void setChv_cte_ref(String chv_cte_ref) {
        this.chv_cte_ref = chv_cte_ref;
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
     * @return the vl_desc
     */
    public String getVl_desc() {
        return vl_desc;
    }

    /**
     * @param vl_desc the vl_desc to set
     */
    public void setVl_desc(String vl_desc) {
        this.vl_desc = vl_desc;
    }

    /**
     * @return the ind_frt
     */
    public String getInd_frt() {
        return ind_frt;
    }

    /**
     * @param ind_frt the ind_frt to set
     */
    public void setInd_frt(String ind_frt) {
        this.ind_frt = ind_frt;
    }

    /**
     * @return the vl_serv
     */
    public String getVl_serv() {
        return vl_serv;
    }

    /**
     * @param vl_serv the vl_serv to set
     */
    public void setVl_serv(String vl_serv) {
        this.vl_serv = vl_serv;
    }

    /**
     * @return the vl_bc_icms
     */
    public String getVl_bc_icms() {
        return vl_bc_icms;
    }

    /**
     * @param vl_bc_icms the vl_bc_icms to set
     */
    public void setVl_bc_icms(String vl_bc_icms) {
        this.vl_bc_icms = vl_bc_icms;
    }

    /**
     * @return the vl_icms
     */
    public String getVl_icms() {
        return vl_icms;
    }

    /**
     * @param vl_icms the vl_icms to set
     */
    public void setVl_icms(String vl_icms) {
        this.vl_icms = vl_icms;
    }

    /**
     * @return the vl_nt
     */
    public String getVl_nt() {
        return vl_nt;
    }

    /**
     * @param vl_nt the vl_nt to set
     */
    public void setVl_nt(String vl_nt) {
        this.vl_nt = vl_nt;
    }

    /**
     * @return the cod_inf
     */
    public String getCod_inf() {
        return cod_inf;
    }

    /**
     * @param cod_inf the cod_inf to set
     */
    public void setCod_inf(String cod_inf) {
        this.cod_inf = cod_inf;
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
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroD101
     */
    public RegistroD101 getRegistroD101() {
        return registroD101;
    }

    /**
     * @param registroD101 the registroD101 to set
     */
    public void setRegistroD101(RegistroD101 registroD101) {
        this.registroD101 = registroD101;
    }

    /**
     * @return the registroD140
     */
    public RegistroD140 getRegistroD140() {
        return registroD140;
    }

    /**
     * @param registroD140 the registroD140 to set
     */
    public void setRegistroD140(RegistroD140 registroD140) {
        this.registroD140 = registroD140;
    }

    /**
     * @return the registroD150
     */
    public RegistroD150 getRegistroD150() {
        return registroD150;
    }

    /**
     * @param registroD150 the registroD150 to set
     */
    public void setRegistroD150(RegistroD150 registroD150) {
        this.registroD150 = registroD150;
    }

    /**
     * @return the registroD170
     */
    public RegistroD170 getRegistroD170() {
        return registroD170;
    }

    /**
     * @param registroD170 the registroD170 to set
     */
    public void setRegistroD170(RegistroD170 registroD170) {
        this.registroD170 = registroD170;
    }

    public String getCod_mun_orig() {
        return cod_mun_orig;
    }

    public void setCod_mun_orig(String cod_mun_orig) {
        this.cod_mun_orig = cod_mun_orig;
    }

    public String getCod_mun_dest() {
        return cod_mun_dest;
    }

    public void setCod_mun_dest(String cod_mun_dest) {
        this.cod_mun_dest = cod_mun_dest;
    }

    /**
     * @return the registroD110
     */
    public List<RegistroD110> getRegistroD110() {
        if (registroD110 == null) {
            registroD110 = new ArrayList<RegistroD110>();
        }
        return registroD110;
    }

    /**
     * @return the registroD130
     */
    public List<RegistroD130> getRegistroD130() {
        if (registroD130 == null) {
            registroD130 = new ArrayList<RegistroD130>();
        }
        return registroD130;
    }

    /**
     * @return the registroD160
     */
    public List<RegistroD160> getRegistroD160() {
        if (registroD160 == null) {
            registroD160 = new ArrayList<RegistroD160>();
        }
        return registroD160;
    }

    /**
     * @return the registroD180
     */
    public List<RegistroD180> getRegistroD180() {
        if (registroD180 == null) {
            registroD180 = new ArrayList<RegistroD180>();
        }
        return registroD180;
    }

    /**
     * @return the registroD190
     */
    public List<RegistroD190> getRegistroD190() {
        if (registroD190 == null) {
            registroD190 = new ArrayList<RegistroD190>();
        }
        return registroD190;
    }

    /**
     * @return the registroD195
     */
    public List<RegistroD195> getRegistroD195() {
        if (registroD195 == null) {
            registroD195 = new ArrayList<RegistroD195>();
        }
        return registroD195;
    }

}
