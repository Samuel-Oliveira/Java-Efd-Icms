/**
 *
 */
package br.com.samuelweb.efd.icms.registros.blocoG;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroG110 {

    private final String reg = "G110";
    private String dt_ini;
    private String dt_fin;
    private String saldo_in_icms;
    private String som_parc;
    private String vl_trib_exp;
    private String vl_total;
    private String ind_per_sai;
    private String icms_aprop;
    private String som_icms_oc;
    private List<RegistroG125> registroG125;

    /**
     * @return the dt_ini
     */
    public String getDt_ini() {
        return dt_ini;
    }

    /**
     * @param dt_ini the dt_ini to set
     */
    public void setDt_ini(String dt_ini) {
        this.dt_ini = dt_ini;
    }

    /**
     * @return the dt_fin
     */
    public String getDt_fin() {
        return dt_fin;
    }

    /**
     * @param dt_fin the dt_fin to set
     */
    public void setDt_fin(String dt_fin) {
        this.dt_fin = dt_fin;
    }

    /**
     * @return the saldo_in_icms
     */
    public String getSaldo_in_icms() {
        return saldo_in_icms;
    }

    /**
     * @param saldo_in_icms the saldo_in_icms to set
     */
    public void setSaldo_in_icms(String saldo_in_icms) {
        this.saldo_in_icms = saldo_in_icms;
    }

    /**
     * @return the som_parc
     */
    public String getSom_parc() {
        return som_parc;
    }

    /**
     * @param som_parc the som_parc to set
     */
    public void setSom_parc(String som_parc) {
        this.som_parc = som_parc;
    }

    /**
     * @return the vl_trib_exp
     */
    public String getVl_trib_exp() {
        return vl_trib_exp;
    }

    /**
     * @param vl_trib_exp the vl_trib_exp to set
     */
    public void setVl_trib_exp(String vl_trib_exp) {
        this.vl_trib_exp = vl_trib_exp;
    }

    /**
     * @return the vl_total
     */
    public String getVl_total() {
        return vl_total;
    }

    /**
     * @param vl_total the vl_total to set
     */
    public void setVl_total(String vl_total) {
        this.vl_total = vl_total;
    }

    /**
     * @return the ind_per_sai
     */
    public String getInd_per_sai() {
        return ind_per_sai;
    }

    /**
     * @param ind_per_sai the ind_per_sai to set
     */
    public void setInd_per_sai(String ind_per_sai) {
        this.ind_per_sai = ind_per_sai;
    }

    /**
     * @return the icms_aprop
     */
    public String getIcms_aprop() {
        return icms_aprop;
    }

    /**
     * @param icms_aprop the icms_aprop to set
     */
    public void setIcms_aprop(String icms_aprop) {
        this.icms_aprop = icms_aprop;
    }

    /**
     * @return the som_icms_oc
     */
    public String getSom_icms_oc() {
        return som_icms_oc;
    }

    /**
     * @param som_icms_oc the som_icms_oc to set
     */
    public void setSom_icms_oc(String som_icms_oc) {
        this.som_icms_oc = som_icms_oc;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroG125
     */
    public List<RegistroG125> getRegistroG125() {
        if (registroG125 == null) {
            registroG125 = new ArrayList<RegistroG125>();
        }
        return registroG125;
    }

}
