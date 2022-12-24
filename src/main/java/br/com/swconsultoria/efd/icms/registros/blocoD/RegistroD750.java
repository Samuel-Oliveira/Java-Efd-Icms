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
public class RegistroD750 {

    private final String reg = "D750";
    private String cod_mod;
    private String ser;
    private String dt_doc;
    private String qtd_cons;
    private String ind_prepago;
    private String vl_doc;
    private String vl_serv;
    private String vl_serv_nt;
    private String vl_terc;
    private String vl_desc;
    private String vl_da;
    private String vl_bc_icms;
    private String vl_icms;
    private String vl_pis;
    private String vl_cofins;

    private List<RegistroD760> registroD760;

    public String getReg() {
        return reg;
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

    public String getDt_doc() {
        return dt_doc;
    }

    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    public String getQtd_cons() {
        return qtd_cons;
    }

    public void setQtd_cons(String qtd_cons) {
        this.qtd_cons = qtd_cons;
    }

    public String getInd_prepago() {
        return ind_prepago;
    }

    public void setInd_prepago(String ind_prepago) {
        this.ind_prepago = ind_prepago;
    }

    public String getVl_doc() {
        return vl_doc;
    }

    public void setVl_doc(String vl_doc) {
        this.vl_doc = vl_doc;
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

    public String getVl_desc() {
        return vl_desc;
    }

    public void setVl_desc(String vl_desc) {
        this.vl_desc = vl_desc;
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

    public List<RegistroD760> getRegistroD760() {
        if (registroD760 == null) {
            registroD760 = new ArrayList<>();
        }
        return registroD760;
    }
}
