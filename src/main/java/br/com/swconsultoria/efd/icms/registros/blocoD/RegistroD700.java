/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoD;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class RegistroD700 {

    private final String reg = "D700";
    private String ind_oper;
    private String ind_emit;
    private String cod_part;
    private String cod_mod;
    private String cod_sit;
    private String ser;
    private String num_doc;
    private String dt_doc;
    private String dt_e_s;
    private String vl_doc;
    private String vl_desc;
    private String vl_serv;
    private String vl_serv_nt;
    private String vl_terc;
    private String vl_da;
    private String vl_bc_icms;
    private String vl_icms;
    private String cod_inf;
    private String vl_pis;
    private String vl_cofins;
    private String chv_doce;
    private String fin_doce;
    private String tip_fat;
    private String cod_mod_doc_ref;
    private String chv_doce_ref;
    private String hash_doc_ref;
    private String ser_doc_ref;
    private String num_doc_ref;
    private String mes_doc_ref;
    private String cod_mun_dest;
    private String ded;
    private List<RegistroD730> registroD730;
    private List<RegistroD735> registroD735;

    public String getReg() {
        return reg;
    }

    public String getInd_oper() {
        return ind_oper;
    }

    public void setInd_oper(String ind_oper) {
        this.ind_oper = ind_oper;
    }

    public String getInd_emit() {
        return ind_emit;
    }

    public void setInd_emit(String ind_emit) {
        this.ind_emit = ind_emit;
    }

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

    public String getCod_sit() {
        return cod_sit;
    }

    public void setCod_sit(String cod_sit) {
        this.cod_sit = cod_sit;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
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

    public String getDt_e_s() {
        return dt_e_s;
    }

    public void setDt_e_s(String dt_e_s) {
        this.dt_e_s = dt_e_s;
    }

    public String getVl_doc() {
        return vl_doc;
    }

    public void setVl_doc(String vl_doc) {
        this.vl_doc = vl_doc;
    }

    public String getVl_desc() {
        return vl_desc;
    }

    public void setVl_desc(String vl_desc) {
        this.vl_desc = vl_desc;
    }

    public String getVl_serv() {
        return vl_serv;
    }

    public void setVl_serv(String vl_serv) {
        this.vl_serv = vl_serv;
    }

    public String getVl_serv_nt() {
        return vl_serv_nt;
    }

    public void setVl_serv_nt(String vl_serv_nt) {
        this.vl_serv_nt = vl_serv_nt;
    }

    public String getVl_terc() {
        return vl_terc;
    }

    public void setVl_terc(String vl_terc) {
        this.vl_terc = vl_terc;
    }

    public String getVl_da() {
        return vl_da;
    }

    public void setVl_da(String vl_da) {
        this.vl_da = vl_da;
    }

    public String getVl_bc_icms() {
        return vl_bc_icms;
    }

    public void setVl_bc_icms(String vl_bc_icms) {
        this.vl_bc_icms = vl_bc_icms;
    }

    public String getVl_icms() {
        return vl_icms;
    }

    public void setVl_icms(String vl_icms) {
        this.vl_icms = vl_icms;
    }

    public String getCod_inf() {
        return cod_inf;
    }

    public void setCod_inf(String cod_inf) {
        this.cod_inf = cod_inf;
    }

    public String getVl_pis() {
        return vl_pis;
    }

    public void setVl_pis(String vl_pis) {
        this.vl_pis = vl_pis;
    }

    public String getVl_cofins() {
        return vl_cofins;
    }

    public void setVl_cofins(String vl_cofins) {
        this.vl_cofins = vl_cofins;
    }

    public String getChv_doce() {
        return chv_doce;
    }

    public void setChv_doce(String chv_doce) {
        this.chv_doce = chv_doce;
    }

    public String getFin_doce() {
        return fin_doce;
    }

    public void setFin_doce(String fin_doce) {
        this.fin_doce = fin_doce;
    }

    public String getTip_fat() {
        return tip_fat;
    }

    public void setTip_fat(String tip_fat) {
        this.tip_fat = tip_fat;
    }

    public String getCod_mod_doc_ref() {
        return cod_mod_doc_ref;
    }

    public void setCod_mod_doc_ref(String cod_mod_doc_ref) {
        this.cod_mod_doc_ref = cod_mod_doc_ref;
    }

    public String getChv_doce_ref() {
        return chv_doce_ref;
    }

    public void setChv_doce_ref(String chv_doce_ref) {
        this.chv_doce_ref = chv_doce_ref;
    }

    public String getHash_doc_ref() {
        return hash_doc_ref;
    }

    public void setHash_doc_ref(String hash_doc_ref) {
        this.hash_doc_ref = hash_doc_ref;
    }

    public String getSer_doc_ref() {
        return ser_doc_ref;
    }

    public void setSer_doc_ref(String ser_doc_ref) {
        this.ser_doc_ref = ser_doc_ref;
    }

    public String getNum_doc_ref() {
        return num_doc_ref;
    }

    public void setNum_doc_ref(String num_doc_ref) {
        this.num_doc_ref = num_doc_ref;
    }

    public String getMes_doc_ref() {
        return mes_doc_ref;
    }

    public void setMes_doc_ref(String mes_doc_ref) {
        this.mes_doc_ref = mes_doc_ref;
    }

    public String getCod_mun_dest() {
        return cod_mun_dest;
    }

    public void setCod_mun_dest(String cod_mun_dest) {
        this.cod_mun_dest = cod_mun_dest;
    }

    public String getDed() {
        return ded;
    }

    public void setDed(String ded) {
        this.ded = ded;
    }

    public List<RegistroD730> getRegistroD730() {
        if (registroD730 == null) {
            registroD730 = new ArrayList<>();
        }
        return registroD730;
    }

    public List<RegistroD735> getRegistroD735() {
        if (registroD735 == null) {
            registroD735 = new ArrayList<>();
        }
        return registroD735;
    }

}
