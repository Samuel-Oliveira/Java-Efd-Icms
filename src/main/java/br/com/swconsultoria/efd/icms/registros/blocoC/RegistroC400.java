/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoC;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 *
 */
public class RegistroC400 {

    private final String reg = "C400";
    private String cod_mod;
    private String ecf_mod;
    private String ecf_fab;
    private String ecf_cx;
    private List<RegistroC405> registroC405;

    /**
     * @return the cod_mod
     */
    public String getCod_mod() {
        return cod_mod;
    }

    /**
     * @param cod_mod the cod_mod to set
     */
    public void setCod_mod(String cod_mod) {
        this.cod_mod = cod_mod;
    }

    /**
     * @return the ecf_mod
     */
    public String getEcf_mod() {
        return ecf_mod;
    }

    /**
     * @param ecf_mod the ecf_mod to set
     */
    public void setEcf_mod(String ecf_mod) {
        this.ecf_mod = ecf_mod;
    }

    /**
     * @return the ecf_fab
     */
    public String getEcf_fab() {
        return ecf_fab;
    }

    /**
     * @param ecf_fab the ecf_fab to set
     */
    public void setEcf_fab(String ecf_fab) {
        this.ecf_fab = ecf_fab;
    }

    /**
     * @return the ecf_cx
     */
    public String getEcf_cx() {
        return ecf_cx;
    }

    /**
     * @param ecf_cx the ecf_cx to set
     */
    public void setEcf_cx(String ecf_cx) {
        this.ecf_cx = ecf_cx;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroC405
     */
    public List<RegistroC405> getRegistroC405() {
        if (registroC405 == null) {
            registroC405 = new ArrayList<RegistroC405>();
        }
        return registroC405;
    }

}
