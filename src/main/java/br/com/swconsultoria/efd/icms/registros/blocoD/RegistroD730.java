/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoD;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class RegistroD730 {

    private final String reg = "D730";
    private String cst_icms;
    private String cfop;
    private String aliq_icms;
    private String vl_opr;
    private String vl_bc_icms;
    private String vl_icms;
    private String vl_red_bc;
    private String cod_obs;
    private RegistroD731 registroD731;

    public String getCst_icms() {
        return cst_icms;
    }

    public void setCst_icms(String cst_icms) {
        this.cst_icms = cst_icms;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getAliq_icms() {
        return aliq_icms;
    }

    public void setAliq_icms(String aliq_icms) {
        this.aliq_icms = aliq_icms;
    }

    public String getVl_opr() {
        return vl_opr;
    }

    public void setVl_opr(String vl_opr) {
        this.vl_opr = vl_opr;
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

    public String getVl_red_bc() {
        return vl_red_bc;
    }

    public void setVl_red_bc(String vl_red_bc) {
        this.vl_red_bc = vl_red_bc;
    }

    public String getCod_obs() {
        return cod_obs;
    }

    public void setCod_obs(String cod_obs) {
        this.cod_obs = cod_obs;
    }

    public RegistroD731 getRegistroD731() {
        return registroD731;
    }

    public void setRegistroD731(RegistroD731 registroD731) {
        this.registroD731 = registroD731;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
