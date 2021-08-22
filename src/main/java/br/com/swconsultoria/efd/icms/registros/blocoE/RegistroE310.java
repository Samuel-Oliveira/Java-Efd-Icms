/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoE;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class RegistroE310 {

    private final String reg = "E310";
    private String ind_mov_fcp_difal;
    private String vl_sld_cred_ant_difal;
    private String vl_tot_debitos_difal;
    private String vl_out_deb_difal;
    private String vl_tot_creditos_difal;
    private String vl_out_cred_difal;
    private String vl_sld_dev_ant_difal;
    private String vl_deducoes_difal;
    private String vl_recol_difal;
    private String vl_sld_cred_transportar_difal;
    private String deb_esp_difal;
    private String vl_sld_cred_ant_fcp;
    private String vl_tot_deb_fcp;
    private String vl_out_deb_fcp;
    private String vl_tot_cred_fcp;
    private String vl_out_cred_fcp;
    private String vl_sld_dev_ant_fcp;
    private String vl_deducoes_fcp;
    private String vl_recol_fcp;
    private String vl_sld_cred_transportar_fcp;
    private String deb_esp_fcp;
    private List<RegistroE311> registroE311;
    private List<RegistroE316> registroE316;

    /**
     * @return the ind_mov_fcp_difal
     */
    public String getInd_mov_fcp_difal() {
        return ind_mov_fcp_difal;
    }

    /**
     * @param ind_mov_fcp_difal the ind_mov_fcp_difal to set
     */
    public void setInd_mov_fcp_difal(String ind_mov_fcp_difal) {
        this.ind_mov_fcp_difal = ind_mov_fcp_difal;
    }

    /**
     * @return the vl_sld_cred_ant_difal
     */
    public String getVl_sld_cred_ant_difal() {
        return vl_sld_cred_ant_difal;
    }

    /**
     * @param vl_sld_cred_ant_difal the vl_sld_cred_ant_difal to set
     */
    public void setVl_sld_cred_ant_difal(String vl_sld_cred_ant_difal) {
        this.vl_sld_cred_ant_difal = vl_sld_cred_ant_difal;
    }

    /**
     * @return the vl_tot_debitos_difal
     */
    public String getVl_tot_debitos_difal() {
        return vl_tot_debitos_difal;
    }

    /**
     * @param vl_tot_debitos_difal the vl_tot_debitos_difal to set
     */
    public void setVl_tot_debitos_difal(String vl_tot_debitos_difal) {
        this.vl_tot_debitos_difal = vl_tot_debitos_difal;
    }

    /**
     * @return the vl_out_deb_difal
     */
    public String getVl_out_deb_difal() {
        return vl_out_deb_difal;
    }

    /**
     * @param vl_out_deb_difal the vl_out_deb_difal to set
     */
    public void setVl_out_deb_difal(String vl_out_deb_difal) {
        this.vl_out_deb_difal = vl_out_deb_difal;
    }

    /**
     * @return the vl_tot_creditos_difal
     */
    public String getVl_tot_creditos_difal() {
        return vl_tot_creditos_difal;
    }

    /**
     * @param vl_tot_creditos_difal the vl_tot_creditos_difal to set
     */
    public void setVl_tot_creditos_difal(String vl_tot_creditos_difal) {
        this.vl_tot_creditos_difal = vl_tot_creditos_difal;
    }

    /**
     * @return the vl_out_cred_difal
     */
    public String getVl_out_cred_difal() {
        return vl_out_cred_difal;
    }

    /**
     * @param vl_out_cred_difal the vl_out_cred_difal to set
     */
    public void setVl_out_cred_difal(String vl_out_cred_difal) {
        this.vl_out_cred_difal = vl_out_cred_difal;
    }

    /**
     * @return the vl_sld_dev_ant_difal
     */
    public String getVl_sld_dev_ant_difal() {
        return vl_sld_dev_ant_difal;
    }

    /**
     * @param vl_sld_dev_ant_difal the vl_sld_dev_ant_difal to set
     */
    public void setVl_sld_dev_ant_difal(String vl_sld_dev_ant_difal) {
        this.vl_sld_dev_ant_difal = vl_sld_dev_ant_difal;
    }

    /**
     * @return the vl_deducoes_difal
     */
    public String getVl_deducoes_difal() {
        return vl_deducoes_difal;
    }

    /**
     * @param vl_deducoes_difal the vl_deducoes_difal to set
     */
    public void setVl_deducoes_difal(String vl_deducoes_difal) {
        this.vl_deducoes_difal = vl_deducoes_difal;
    }

    /**
     * @return the vl_recol_difal
     */
    public String getVl_recol_difal() {
        return vl_recol_difal;
    }

    /**
     * @param vl_recol_difal the vl_recol_difal to set
     */
    public void setVl_recol_difal(String vl_recol_difal) {
        this.vl_recol_difal = vl_recol_difal;
    }

    /**
     * @return the vl_sld_cred_transportar_difal
     */
    public String getVl_sld_cred_transportar_difal() {
        return vl_sld_cred_transportar_difal;
    }

    /**
     * @param vl_sld_cred_transportar_difal the vl_sld_cred_transportar_difal to
     *                                      set
     */
    public void setVl_sld_cred_transportar_difal(String vl_sld_cred_transportar_difal) {
        this.vl_sld_cred_transportar_difal = vl_sld_cred_transportar_difal;
    }

    /**
     * @return the deb_esp_difal
     */
    public String getDeb_esp_difal() {
        return deb_esp_difal;
    }

    /**
     * @param deb_esp_difal the deb_esp_difal to set
     */
    public void setDeb_esp_difal(String deb_esp_difal) {
        this.deb_esp_difal = deb_esp_difal;
    }

    /**
     * @return the vl_sld_cred_ant_fcp
     */
    public String getVl_sld_cred_ant_fcp() {
        return vl_sld_cred_ant_fcp;
    }

    /**
     * @param vl_sld_cred_ant_fcp the vl_sld_cred_ant_fcp to set
     */
    public void setVl_sld_cred_ant_fcp(String vl_sld_cred_ant_fcp) {
        this.vl_sld_cred_ant_fcp = vl_sld_cred_ant_fcp;
    }

    /**
     * @return the vl_tot_deb_fcp
     */
    public String getVl_tot_deb_fcp() {
        return vl_tot_deb_fcp;
    }

    /**
     * @param vl_tot_deb_fcp the vl_tot_deb_fcp to set
     */
    public void setVl_tot_deb_fcp(String vl_tot_deb_fcp) {
        this.vl_tot_deb_fcp = vl_tot_deb_fcp;
    }

    /**
     * @return the vl_out_deb_fcp
     */
    public String getVl_out_deb_fcp() {
        return vl_out_deb_fcp;
    }

    /**
     * @param vl_out_deb_fcp the vl_out_deb_fcp to set
     */
    public void setVl_out_deb_fcp(String vl_out_deb_fcp) {
        this.vl_out_deb_fcp = vl_out_deb_fcp;
    }

    /**
     * @return the vl_tot_cred_fcp
     */
    public String getVl_tot_cred_fcp() {
        return vl_tot_cred_fcp;
    }

    /**
     * @param vl_tot_cred_fcp the vl_tot_cred_fcp to set
     */
    public void setVl_tot_cred_fcp(String vl_tot_cred_fcp) {
        this.vl_tot_cred_fcp = vl_tot_cred_fcp;
    }

    /**
     * @return the vl_out_cred_fcp
     */
    public String getVl_out_cred_fcp() {
        return vl_out_cred_fcp;
    }

    /**
     * @param vl_out_cred_fcp the vl_out_cred_fcp to set
     */
    public void setVl_out_cred_fcp(String vl_out_cred_fcp) {
        this.vl_out_cred_fcp = vl_out_cred_fcp;
    }

    /**
     * @return the vl_sld_dev_ant_fcp
     */
    public String getVl_sld_dev_ant_fcp() {
        return vl_sld_dev_ant_fcp;
    }

    /**
     * @param vl_sld_dev_ant_fcp the vl_sld_dev_ant_fcp to set
     */
    public void setVl_sld_dev_ant_fcp(String vl_sld_dev_ant_fcp) {
        this.vl_sld_dev_ant_fcp = vl_sld_dev_ant_fcp;
    }

    /**
     * @return the vl_deducoes_fcp
     */
    public String getVl_deducoes_fcp() {
        return vl_deducoes_fcp;
    }

    /**
     * @param vl_deducoes_fcp the vl_deducoes_fcp to set
     */
    public void setVl_deducoes_fcp(String vl_deducoes_fcp) {
        this.vl_deducoes_fcp = vl_deducoes_fcp;
    }

    /**
     * @return the vl_recol_fcp
     */
    public String getVl_recol_fcp() {
        return vl_recol_fcp;
    }

    /**
     * @param vl_recol_fcp the vl_recol_fcp to set
     */
    public void setVl_recol_fcp(String vl_recol_fcp) {
        this.vl_recol_fcp = vl_recol_fcp;
    }

    /**
     * @return the vl_sld_cred_transportar_fcp
     */
    public String getVl_sld_cred_transportar_fcp() {
        return vl_sld_cred_transportar_fcp;
    }

    /**
     * @param vl_sld_cred_transportar_fcp the vl_sld_cred_transportar_fcp to set
     */
    public void setVl_sld_cred_transportar_fcp(String vl_sld_cred_transportar_fcp) {
        this.vl_sld_cred_transportar_fcp = vl_sld_cred_transportar_fcp;
    }

    /**
     * @return the deb_esp_fcp
     */
    public String getDeb_esp_fcp() {
        return deb_esp_fcp;
    }

    /**
     * @param deb_esp_fcp the deb_esp_fcp to set
     */
    public void setDeb_esp_fcp(String deb_esp_fcp) {
        this.deb_esp_fcp = deb_esp_fcp;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroE311
     */
    public List<RegistroE311> getRegistroE311() {
        if (registroE311 == null) {
            registroE311 = new ArrayList<RegistroE311>();
        }
        return registroE311;
    }

    /**
     * @return the registroE316
     */
    public List<RegistroE316> getRegistroE316() {
        if (registroE316 == null) {
            registroE316 = new ArrayList<RegistroE316>();
        }
        return registroE316;
    }
}
