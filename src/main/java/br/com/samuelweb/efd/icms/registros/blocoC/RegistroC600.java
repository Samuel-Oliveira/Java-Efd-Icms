/**
 *
 */
package br.com.samuelweb.efd.icms.registros.blocoC;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroC600 {

    private final String reg = "C600";
    private String cod_mod;
    private String cod_mun;
    private String ser;
    private String sub;
    private String cod_cons;
    private String qtd_cons;
    private String qtd_canc;
    private String dt_doc;
    private String vl_doc;
    private String vl_desc;
    private String cons;
    private String vl_forn;
    private String vl_serv_nt;
    private String vl_terc;
    private String vl_da;
    private String vl_bc_icms;
    private String vl_icms;
    private String vl_bc_icms_st;
    private String vl_icms_st;
    private String vl_pis;
    private String vl_cofins;
    private List<RegistroC601> registroC601;
    private List<RegistroC610> registroC610;
    private List<RegistroC690> registroC690;

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
     * @return the cod_mun
     */
    public String getCod_mun() {
        return cod_mun;
    }

    /**
     * @param cod_mun the cod_mun to set
     */
    public void setCod_mun(String cod_mun) {
        this.cod_mun = cod_mun;
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
     * @return the cod_cons
     */
    public String getCod_cons() {
        return cod_cons;
    }

    /**
     * @param cod_cons the cod_cons to set
     */
    public void setCod_cons(String cod_cons) {
        this.cod_cons = cod_cons;
    }

    /**
     * @return the qtd_cons
     */
    public String getQtd_cons() {
        return qtd_cons;
    }

    /**
     * @param qtd_cons the qtd_cons to set
     */
    public void setQtd_cons(String qtd_cons) {
        this.qtd_cons = qtd_cons;
    }

    /**
     * @return the qtd_canc
     */
    public String getQtd_canc() {
        return qtd_canc;
    }

    /**
     * @param qtd_canc the qtd_canc to set
     */
    public void setQtd_canc(String qtd_canc) {
        this.qtd_canc = qtd_canc;
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
     * @return the cons
     */
    public String getCons() {
        return cons;
    }

    /**
     * @param cons the cons to set
     */
    public void setCons(String cons) {
        this.cons = cons;
    }

    /**
     * @return the vl_forn
     */
    public String getVl_forn() {
        return vl_forn;
    }

    /**
     * @param vl_forn the vl_forn to set
     */
    public void setVl_forn(String vl_forn) {
        this.vl_forn = vl_forn;
    }

    /**
     * @return the vl_serv_nt
     */
    public String getVl_serv_nt() {
        return vl_serv_nt;
    }

    /**
     * @param vl_serv_nt the vl_serv_nt to set
     */
    public void setVl_serv_nt(String vl_serv_nt) {
        this.vl_serv_nt = vl_serv_nt;
    }

    /**
     * @return the vl_terc
     */
    public String getVl_terc() {
        return vl_terc;
    }

    /**
     * @param vl_terc the vl_terc to set
     */
    public void setVl_terc(String vl_terc) {
        this.vl_terc = vl_terc;
    }

    /**
     * @return the vl_da
     */
    public String getVl_da() {
        return vl_da;
    }

    /**
     * @param vl_da the vl_da to set
     */
    public void setVl_da(String vl_da) {
        this.vl_da = vl_da;
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
     * @return the vl_bc_icms_st
     */
    public String getVl_bc_icms_st() {
        return vl_bc_icms_st;
    }

    /**
     * @param vl_bc_icms_st the vl_bc_icms_st to set
     */
    public void setVl_bc_icms_st(String vl_bc_icms_st) {
        this.vl_bc_icms_st = vl_bc_icms_st;
    }

    /**
     * @return the vl_icms_st
     */
    public String getVl_icms_st() {
        return vl_icms_st;
    }

    /**
     * @param vl_icms_st the vl_icms_st to set
     */
    public void setVl_icms_st(String vl_icms_st) {
        this.vl_icms_st = vl_icms_st;
    }

    /**
     * @return the vl_pis
     */
    public String getVl_pis() {
        return vl_pis;
    }

    /**
     * @param vl_pis the vl_pis to set
     */
    public void setVl_pis(String vl_pis) {
        this.vl_pis = vl_pis;
    }

    /**
     * @return the vl_cofins
     */
    public String getVl_cofins() {
        return vl_cofins;
    }

    /**
     * @param vl_cofins the vl_cofins to set
     */
    public void setVl_cofins(String vl_cofins) {
        this.vl_cofins = vl_cofins;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroC601
     */
    public List<RegistroC601> getRegistroC601() {
        if (registroC601 == null) {
            registroC601 = new ArrayList<RegistroC601>();
        }
        return registroC601;
    }

    /**
     * @return the registroC610
     */
    public List<RegistroC610> getRegistroC610() {
        if (registroC610 == null) {
            registroC610 = new ArrayList<RegistroC610>();
        }
        return registroC610;
    }

    /**
     * @return the registroC690
     */
    public List<RegistroC690> getRegistroC690() {
        if (registroC690 == null) {
            registroC690 = new ArrayList<RegistroC690>();
        }
        return registroC690;
    }

}
