/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.bloco0;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 *
 */
@EqualsAndHashCode
public class Registro0200 {

    private final String reg = "0200";
    private String cod_item;
    private String descr_item;
    private String cod_barra;
    private String cod_ant_item;
    private String unid_inv;
    private String tipo_item;
    private String cod_ncm;
    private String ex_ipi;
    private String cod_gen;
    private String cod_lst;
    private String aliq_icms;
    private String cest;
    private List<Registro0205> registro0205;
    private Registro0206 registro0206;
    private List<Registro0210> registro0210;
    private List<Registro0220> registro0220;

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the cod_item
     */
    public String getCod_item() {
        return cod_item;
    }

    /**
     * @param cod_item the cod_item to set
     */
    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    /**
     * @return the descr_item
     */
    public String getDescr_item() {
        return descr_item;
    }

    /**
     * @param descr_item the descr_item to set
     */
    public void setDescr_item(String descr_item) {
        this.descr_item = descr_item;
    }

    /**
     * @return the cod_barra
     */
    public String getCod_barra() {
        return cod_barra;
    }

    /**
     * @param cod_barra the cod_barra to set
     */
    public void setCod_barra(String cod_barra) {
        this.cod_barra = cod_barra;
    }

    /**
     * @return the cod_ant_item
     */
    public String getCod_ant_item() {
        return cod_ant_item;
    }

    /**
     * @param cod_ant_item the cod_ant_item to set
     */
    public void setCod_ant_item(String cod_ant_item) {
        this.cod_ant_item = cod_ant_item;
    }

    /**
     * @return the unid_inv
     */
    public String getUnid_inv() {
        return unid_inv;
    }

    /**
     * @param unid_inv the unid_inv to set
     */
    public void setUnid_inv(String unid_inv) {
        this.unid_inv = unid_inv;
    }

    /**
     * @return the tipo_item
     */
    public String getTipo_item() {
        return tipo_item;
    }

    /**
     * @param tipo_item the tipo_item to set
     */
    public void setTipo_item(String tipo_item) {
        this.tipo_item = tipo_item;
    }

    /**
     * @return the cod_ncm
     */
    public String getCod_ncm() {
        return cod_ncm;
    }

    /**
     * @param cod_ncm the cod_ncm to set
     */
    public void setCod_ncm(String cod_ncm) {
        this.cod_ncm = cod_ncm;
    }

    /**
     * @return the ex_ipi
     */
    public String getEx_ipi() {
        return ex_ipi;
    }

    /**
     * @param ex_ipi the ex_ipi to set
     */
    public void setEx_ipi(String ex_ipi) {
        this.ex_ipi = ex_ipi;
    }

    /**
     * @return the cod_gen
     */
    public String getCod_gen() {
        return cod_gen;
    }

    /**
     * @param cod_gen the cod_gen to set
     */
    public void setCod_gen(String cod_gen) {
        this.cod_gen = cod_gen;
    }

    /**
     * @return the cod_lst
     */
    public String getCod_lst() {
        return cod_lst;
    }

    /**
     * @param cod_lst the cod_lst to set
     */
    public void setCod_lst(String cod_lst) {
        this.cod_lst = cod_lst;
    }

    /**
     * @return the aliq_icms
     */
    public String getAliq_icms() {
        return aliq_icms;
    }

    /**
     * @param aliq_icms the aliq_icms to set
     */
    public void setAliq_icms(String aliq_icms) {
        this.aliq_icms = aliq_icms;
    }

    /**
     * @return the registro0206
     */
    public Registro0206 getRegistro0206() {
        return registro0206;
    }

    /**
     * @param registro0206 the registro0206 to set
     */
    public void setRegistro0206(Registro0206 registro0206) {
        this.registro0206 = registro0206;
    }

    /**
     * @return the registro0205
     */
    public List<Registro0205> getRegistro0205() {
        if (registro0205 == null) {
            registro0205 = new ArrayList<Registro0205>();
        }
        return this.registro0205;
    }

    /**
     * @return the registro0210
     */
    public List<Registro0210> getRegistro0210() {
        if (registro0210 == null) {
            registro0210 = new ArrayList<Registro0210>();
        }
        return this.registro0210;
    }

    /**
     * @return the registro0220
     */
    public List<Registro0220> getRegistro0220() {
        if (registro0220 == null) {
            registro0220 = new ArrayList<Registro0220>();
        }
        return this.registro0220;
    }

    /**
     * @return the cest
     */
    public String getCest() {
        return cest;
    }

    /**
     * @param cest the cest to set
     */
    public void setCest(String cest) {
        this.cest = cest;
    }
}
