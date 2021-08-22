/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.bloco1;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class Registro1920 {

    private final String reg = "1920";
    private String vl_tot_transf_debitos_oa;
    private String vl_tot_aj_debitos_oa;
    private String vl_estornos_cred_oa;
    private String vl_tot_transf_creditos_oa;
    private String vl_tot_aj_creditos_oa;
    private String vl_estornos_deb_oa;
    private String vl_sld_credor_ant_oa;
    private String vl_sld_apurado_oa;
    private String vl_tot_ded;
    private String vl_icms_recolher_oa;
    private String vl_sld_credor_transp_oa;
    private String deb_esp_oa;
    private List<Registro1921> registro1921;
    private List<Registro1925> registro1925;
    private List<Registro1926> registro1926;

    /**
     * @return the vl_tot_transf_debitos_oa
     */
    public String getVl_tot_transf_debitos_oa() {
        return vl_tot_transf_debitos_oa;
    }

    /**
     * @param vl_tot_transf_debitos_oa the vl_tot_transf_debitos_oa to set
     */
    public void setVl_tot_transf_debitos_oa(String vl_tot_transf_debitos_oa) {
        this.vl_tot_transf_debitos_oa = vl_tot_transf_debitos_oa;
    }

    /**
     * @return the vl_tot_aj_debitos_oa
     */
    public String getVl_tot_aj_debitos_oa() {
        return vl_tot_aj_debitos_oa;
    }

    /**
     * @param vl_tot_aj_debitos_oa the vl_tot_aj_debitos_oa to set
     */
    public void setVl_tot_aj_debitos_oa(String vl_tot_aj_debitos_oa) {
        this.vl_tot_aj_debitos_oa = vl_tot_aj_debitos_oa;
    }

    /**
     * @return the vl_estornos_cred_oa
     */
    public String getVl_estornos_cred_oa() {
        return vl_estornos_cred_oa;
    }

    /**
     * @param vl_estornos_cred_oa the vl_estornos_cred_oa to set
     */
    public void setVl_estornos_cred_oa(String vl_estornos_cred_oa) {
        this.vl_estornos_cred_oa = vl_estornos_cred_oa;
    }

    /**
     * @return the vl_tot_transf_creditos_oa
     */
    public String getVl_tot_transf_creditos_oa() {
        return vl_tot_transf_creditos_oa;
    }

    /**
     * @param vl_tot_transf_creditos_oa the vl_tot_transf_creditos_oa to set
     */
    public void setVl_tot_transf_creditos_oa(String vl_tot_transf_creditos_oa) {
        this.vl_tot_transf_creditos_oa = vl_tot_transf_creditos_oa;
    }

    /**
     * @return the vl_tot_aj_creditos_oa
     */
    public String getVl_tot_aj_creditos_oa() {
        return vl_tot_aj_creditos_oa;
    }

    /**
     * @param vl_tot_aj_creditos_oa the vl_tot_aj_creditos_oa to set
     */
    public void setVl_tot_aj_creditos_oa(String vl_tot_aj_creditos_oa) {
        this.vl_tot_aj_creditos_oa = vl_tot_aj_creditos_oa;
    }

    /**
     * @return the vl_estornos_deb_oa
     */
    public String getVl_estornos_deb_oa() {
        return vl_estornos_deb_oa;
    }

    /**
     * @param vl_estornos_deb_oa the vl_estornos_deb_oa to set
     */
    public void setVl_estornos_deb_oa(String vl_estornos_deb_oa) {
        this.vl_estornos_deb_oa = vl_estornos_deb_oa;
    }

    /**
     * @return the vl_sld_credor_ant_oa
     */
    public String getVl_sld_credor_ant_oa() {
        return vl_sld_credor_ant_oa;
    }

    /**
     * @param vl_sld_credor_ant_oa the vl_sld_credor_ant_oa to set
     */
    public void setVl_sld_credor_ant_oa(String vl_sld_credor_ant_oa) {
        this.vl_sld_credor_ant_oa = vl_sld_credor_ant_oa;
    }

    /**
     * @return the vl_sld_apurado_oa
     */
    public String getVl_sld_apurado_oa() {
        return vl_sld_apurado_oa;
    }

    /**
     * @param vl_sld_apurado_oa the vl_sld_apurado_oa to set
     */
    public void setVl_sld_apurado_oa(String vl_sld_apurado_oa) {
        this.vl_sld_apurado_oa = vl_sld_apurado_oa;
    }

    /**
     * @return the vl_tot_ded
     */
    public String getVl_tot_ded() {
        return vl_tot_ded;
    }

    /**
     * @param vl_tot_ded the vl_tot_ded to set
     */
    public void setVl_tot_ded(String vl_tot_ded) {
        this.vl_tot_ded = vl_tot_ded;
    }

    /**
     * @return the vl_icms_recolher_oa
     */
    public String getVl_icms_recolher_oa() {
        return vl_icms_recolher_oa;
    }

    /**
     * @param vl_icms_recolher_oa the vl_icms_recolher_oa to set
     */
    public void setVl_icms_recolher_oa(String vl_icms_recolher_oa) {
        this.vl_icms_recolher_oa = vl_icms_recolher_oa;
    }

    /**
     * @return the vl_sld_credor_transp_oa
     */
    public String getVl_sld_credor_transp_oa() {
        return vl_sld_credor_transp_oa;
    }

    /**
     * @param vl_sld_credor_transp_oa the vl_sld_credor_transp_oa to set
     */
    public void setVl_sld_credor_transp_oa(String vl_sld_credor_transp_oa) {
        this.vl_sld_credor_transp_oa = vl_sld_credor_transp_oa;
    }

    /**
     * @return the deb_esp_oa
     */
    public String getDeb_esp_oa() {
        return deb_esp_oa;
    }

    /**
     * @param deb_esp_oa the deb_esp_oa to set
     */
    public void setDeb_esp_oa(String deb_esp_oa) {
        this.deb_esp_oa = deb_esp_oa;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registro1921
     */
    public List<Registro1921> getRegistro1921() {
        if (registro1921 == null) {
            registro1921 = new ArrayList<Registro1921>();
        }
        return registro1921;
    }

    /**
     * @return the registro1925
     */
    public List<Registro1925> getRegistro1925() {
        if (registro1925 == null) {
            registro1925 = new ArrayList<Registro1925>();
        }
        return registro1925;
    }

    /**
     * @return the registro1926
     */
    public List<Registro1926> getRegistro1926() {
        if (registro1926 == null) {
            registro1926 = new ArrayList<Registro1926>();
        }
        return registro1926;
    }

}
