/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoC;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroC790 {

    private final String reg = "C790";
    private String cst_icms;
    private String cfop;
    private String aliq_icms;
    private String vl_opr;
    private String vl_bc_icms;
    private String vl_icms;
    private String vl_bc_icms_st;
    private String vl_icms_st;
    private String vl_red_bc;
    private String cod_obs;
    private List<RegistroC791> registroC791;

    /**
     * @return the cst_icms
     */
    public String getCst_icms() {
        return cst_icms;
    }

    /**
     * @param cst_icms the cst_icms to set
     */
    public void setCst_icms(String cst_icms) {
        this.cst_icms = cst_icms;
    }

    /**
     * @return the cfop
     */
    public String getCfop() {
        return cfop;
    }

    /**
     * @param cfop the cfop to set
     */
    public void setCfop(String cfop) {
        this.cfop = cfop;
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
     * @return the vl_opr
     */
    public String getVl_opr() {
        return vl_opr;
    }

    /**
     * @param vl_opr the vl_opr to set
     */
    public void setVl_opr(String vl_opr) {
        this.vl_opr = vl_opr;
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
     * @return the vl_red_bc
     */
    public String getVl_red_bc() {
        return vl_red_bc;
    }

    /**
     * @param vl_red_bc the vl_red_bc to set
     */
    public void setVl_red_bc(String vl_red_bc) {
        this.vl_red_bc = vl_red_bc;
    }

    /**
     * @return the cod_obs
     */
    public String getCod_obs() {
        return cod_obs;
    }

    /**
     * @param cod_obs the cod_obs to set
     */
    public void setCod_obs(String cod_obs) {
        this.cod_obs = cod_obs;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroC791
     */
    public List<RegistroC791> getRegistroC791() {
        if (registroC791 == null) {
            registroC791 = new ArrayList<RegistroC791>();
        }
        return registroC791;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegistroC790)) return false;

        RegistroC790 that = (RegistroC790) o;

        if (getCst_icms() != null ? !getCst_icms().equals(that.getCst_icms()) : that.getCst_icms() != null) return false;
        if (getCfop() != null ? !getCfop().equals(that.getCfop()) : that.getCfop() != null) return false;
        return getAliq_icms() != null ? getAliq_icms().equals(that.getAliq_icms()) : that.getAliq_icms() == null;
    }

    @Override
    public int hashCode() {
        int result = getCst_icms() != null ? getCst_icms().hashCode() : 0;
        result = 31 * result + (getCfop() != null ? getCfop().hashCode() : 0);
        result = 31 * result + (getAliq_icms() != null ? getAliq_icms().hashCode() : 0);
        return result;
    }

}
