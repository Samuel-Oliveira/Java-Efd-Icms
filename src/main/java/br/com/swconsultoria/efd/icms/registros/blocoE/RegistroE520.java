/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoE;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroE520 {

    private final String reg = "E520";
    private String vl_sd_ant_ipi;
    private String vl_deb_ipi;
    private String vl_cred_ipi;
    private String vl_od_ipi;
    private String vl_oc_ipi;
    private String vl_sc_ipi;
    private String vl_sd_ipi;
    private List<RegistroE530> registroE530;

    /**
     * @return the vl_sd_ant_ipi
     */
    public String getVl_sd_ant_ipi() {
        return vl_sd_ant_ipi;
    }

    /**
     * @param vl_sd_ant_ipi the vl_sd_ant_ipi to set
     */
    public void setVl_sd_ant_ipi(String vl_sd_ant_ipi) {
        this.vl_sd_ant_ipi = vl_sd_ant_ipi;
    }

    /**
     * @return the vl_deb_ipi
     */
    public String getVl_deb_ipi() {
        return vl_deb_ipi;
    }

    /**
     * @param vl_deb_ipi the vl_deb_ipi to set
     */
    public void setVl_deb_ipi(String vl_deb_ipi) {
        this.vl_deb_ipi = vl_deb_ipi;
    }

    /**
     * @return the vl_cred_ipi
     */
    public String getVl_cred_ipi() {
        return vl_cred_ipi;
    }

    /**
     * @param vl_cred_ipi the vl_cred_ipi to set
     */
    public void setVl_cred_ipi(String vl_cred_ipi) {
        this.vl_cred_ipi = vl_cred_ipi;
    }

    /**
     * @return the vl_od_ipi
     */
    public String getVl_od_ipi() {
        return vl_od_ipi;
    }

    /**
     * @param vl_od_ipi the vl_od_ipi to set
     */
    public void setVl_od_ipi(String vl_od_ipi) {
        this.vl_od_ipi = vl_od_ipi;
    }

    /**
     * @return the vl_oc_ipi
     */
    public String getVl_oc_ipi() {
        return vl_oc_ipi;
    }

    /**
     * @param vl_oc_ipi the vl_oc_ipi to set
     */
    public void setVl_oc_ipi(String vl_oc_ipi) {
        this.vl_oc_ipi = vl_oc_ipi;
    }

    /**
     * @return the vl_sc_ipi
     */
    public String getVl_sc_ipi() {
        return vl_sc_ipi;
    }

    /**
     * @param vl_sc_ipi the vl_sc_ipi to set
     */
    public void setVl_sc_ipi(String vl_sc_ipi) {
        this.vl_sc_ipi = vl_sc_ipi;
    }

    /**
     * @return the vl_sd_ipi
     */
    public String getVl_sd_ipi() {
        return vl_sd_ipi;
    }

    /**
     * @param vl_sd_ipi the vl_sd_ipi to set
     */
    public void setVl_sd_ipi(String vl_sd_ipi) {
        this.vl_sd_ipi = vl_sd_ipi;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroE530
     */
    public List<RegistroE530> getRegistroE530() {
        if (registroE530 == null) {
            registroE530 = new ArrayList<RegistroE530>();
        }
        return registroE530;
    }

}
