/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoH;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class RegistroH005 {

    private final String reg = "H005";
    private String dt_inv;
    private String vl_inv;
    private String mot_inv;
    private List<RegistroH010> registroH010;

    /**
     * @return the dt_inv
     */
    public String getDt_inv() {
        return dt_inv;
    }

    /**
     * @param dt_inv the dt_inv to set
     */
    public void setDt_inv(String dt_inv) {
        this.dt_inv = dt_inv;
    }

    /**
     * @return the vl_inv
     */
    public String getVl_inv() {
        return vl_inv;
    }

    /**
     * @param vl_inv the vl_inv to set
     */
    public void setVl_inv(String vl_inv) {
        this.vl_inv = vl_inv;
    }

    /**
     * @return the mot_inv
     */
    public String getMot_inv() {
        return mot_inv;
    }

    /**
     * @param mot_inv the mot_inv to set
     */
    public void setMot_inv(String mot_inv) {
        this.mot_inv = mot_inv;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroH010
     */
    public List<RegistroH010> getRegistroH010() {
        if (registroH010 == null) {
            registroH010 = new ArrayList<RegistroH010>();
        }
        return registroH010;
    }

}
