/**
 *
 */
package br.com.samuelweb.efd.icms.registros.blocoE;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroE110 {

    private final String reg = "E110";
    private String vl_tot_debitos;
    private String vl_aj_debitos;
    private String vl_tot_aj_debitos;
    private String vl_estornos_cred;
    private String vl_tot_creditos;
    private String vl_aj_creditos;
    private String vl_tot_aj_creditos;
    private String vl_estornos_deb;
    private String vl_sld_credor_ant;
    private String vl_sld_apurado;
    private String vl_tot_ded;
    private String vl_icms_recolher;
    private String vl_sld_credor_transportar;
    private String deb_esp;
    private List<RegistroE111> registroE111;
    private List<RegistroE115> registroE115;
    private List<RegistroE116> registroE116;

    /**
     * @return the vl_tot_debitos
     */
    public String getVl_tot_debitos() {
        return vl_tot_debitos;
    }

    /**
     * @param vl_tot_debitos the vl_tot_debitos to set
     */
    public void setVl_tot_debitos(String vl_tot_debitos) {
        this.vl_tot_debitos = vl_tot_debitos;
    }

    /**
     * @return the vl_aj_debitos
     */
    public String getVl_aj_debitos() {
        return vl_aj_debitos;
    }

    /**
     * @param vl_aj_debitos the vl_aj_debitos to set
     */
    public void setVl_aj_debitos(String vl_aj_debitos) {
        this.vl_aj_debitos = vl_aj_debitos;
    }

    /**
     * @return the vl_tot_aj_debitos
     */
    public String getVl_tot_aj_debitos() {
        return vl_tot_aj_debitos;
    }

    /**
     * @param vl_tot_aj_debitos the vl_tot_aj_debitos to set
     */
    public void setVl_tot_aj_debitos(String vl_tot_aj_debitos) {
        this.vl_tot_aj_debitos = vl_tot_aj_debitos;
    }

    /**
     * @return the vl_estornos_cred
     */
    public String getVl_estornos_cred() {
        return vl_estornos_cred;
    }

    /**
     * @param vl_estornos_cred the vl_estornos_cred to set
     */
    public void setVl_estornos_cred(String vl_estornos_cred) {
        this.vl_estornos_cred = vl_estornos_cred;
    }

    /**
     * @return the vl_tot_creditos
     */
    public String getVl_tot_creditos() {
        return vl_tot_creditos;
    }

    /**
     * @param vl_tot_creditos the vl_tot_creditos to set
     */
    public void setVl_tot_creditos(String vl_tot_creditos) {
        this.vl_tot_creditos = vl_tot_creditos;
    }

    /**
     * @return the vl_aj_creditos
     */
    public String getVl_aj_creditos() {
        return vl_aj_creditos;
    }

    /**
     * @param vl_aj_creditos the vl_aj_creditos to set
     */
    public void setVl_aj_creditos(String vl_aj_creditos) {
        this.vl_aj_creditos = vl_aj_creditos;
    }

    /**
     * @return the vl_tot_aj_creditos
     */
    public String getVl_tot_aj_creditos() {
        return vl_tot_aj_creditos;
    }

    /**
     * @param vl_tot_aj_creditos the vl_tot_aj_creditos to set
     */
    public void setVl_tot_aj_creditos(String vl_tot_aj_creditos) {
        this.vl_tot_aj_creditos = vl_tot_aj_creditos;
    }

    /**
     * @return the vl_estornos_deb
     */
    public String getVl_estornos_deb() {
        return vl_estornos_deb;
    }

    /**
     * @param vl_estornos_deb the vl_estornos_deb to set
     */
    public void setVl_estornos_deb(String vl_estornos_deb) {
        this.vl_estornos_deb = vl_estornos_deb;
    }

    /**
     * @return the vl_sld_credor_ant
     */
    public String getVl_sld_credor_ant() {
        return vl_sld_credor_ant;
    }

    /**
     * @param vl_sld_credor_ant the vl_sld_credor_ant to set
     */
    public void setVl_sld_credor_ant(String vl_sld_credor_ant) {
        this.vl_sld_credor_ant = vl_sld_credor_ant;
    }

    /**
     * @return Valor do saldo devedor apurado
     */
    public String getVl_sld_apurado() {
        return vl_sld_apurado;
    }

    /**
     * @param vl_sld_apurado the vl_sld_apurado to set
     */
    public void setVl_sld_apurado(String vl_sld_apurado) {
        this.vl_sld_apurado = vl_sld_apurado;
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
     * @return the vl_icms_recolher
     */
    public String getVl_icms_recolher() {
        return vl_icms_recolher;
    }

    /**
     * @param vl_icms_recolher the vl_icms_recolher to set
     */
    public void setVl_icms_recolher(String vl_icms_recolher) {
        this.vl_icms_recolher = vl_icms_recolher;
    }

    /**
     * @return the vl_sld_credor_transportar
     */
    public String getVl_sld_credor_transportar() {
        return vl_sld_credor_transportar;
    }

    /**
     * @param vl_sld_credor_transportar the vl_sld_credor_transportar to set
     */
    public void setVl_sld_credor_transportar(String vl_sld_credor_transportar) {
        this.vl_sld_credor_transportar = vl_sld_credor_transportar;
    }

    /**
     * @return the deb_esp
     */
    public String getDeb_esp() {
        return deb_esp;
    }

    /**
     * @param deb_esp the deb_esp to set
     */
    public void setDeb_esp(String deb_esp) {
        this.deb_esp = deb_esp;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroE111
     */
    public List<RegistroE111> getRegistroE111() {
        if (registroE111 == null) {
            registroE111 = new ArrayList<RegistroE111>();
        }
        return registroE111;
    }

    /**
     * @return the registroE115
     */
    public List<RegistroE115> getRegistroE115() {
        if (registroE115 == null) {
            registroE115 = new ArrayList<RegistroE115>();
        }
        return registroE115;
    }

    /**
     * @return the registroE116
     */
    public List<RegistroE116> getRegistroE116() {
        if (registroE116 == null) {
            registroE116 = new ArrayList<RegistroE116>();
        }
        return registroE116;
    }

}
