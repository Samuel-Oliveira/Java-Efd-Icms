/**
 *
 */
package br.com.samuelweb.efd.icms.registros.bloco1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class Registro1200 {

    private final String reg = "1200";
    private String cod_aj_apur;
    private String sld_cred;
    private String cred_apr;
    private String cred_receb;
    private String cred_util;
    private String sld_cred_fim;
    private List<Registro1210> registro1210;

    /**
     * @return the cod_aj_apur
     */
    public String getCod_aj_apur() {
        return cod_aj_apur;
    }

    /**
     * @param cod_aj_apur the cod_aj_apur to set
     */
    public void setCod_aj_apur(String cod_aj_apur) {
        this.cod_aj_apur = cod_aj_apur;
    }

    /**
     * @return the sld_cred
     */
    public String getSld_cred() {
        return sld_cred;
    }

    /**
     * @param sld_cred the sld_cred to set
     */
    public void setSld_cred(String sld_cred) {
        this.sld_cred = sld_cred;
    }

    /**
     * @return the cred_apr
     */
    public String getCred_apr() {
        return cred_apr;
    }

    /**
     * @param cred_apr the cred_apr to set
     */
    public void setCred_apr(String cred_apr) {
        this.cred_apr = cred_apr;
    }

    /**
     * @return the cred_receb
     */
    public String getCred_receb() {
        return cred_receb;
    }

    /**
     * @param cred_receb the cred_receb to set
     */
    public void setCred_receb(String cred_receb) {
        this.cred_receb = cred_receb;
    }

    /**
     * @return the cred_util
     */
    public String getCred_util() {
        return cred_util;
    }

    /**
     * @param cred_util the cred_util to set
     */
    public void setCred_util(String cred_util) {
        this.cred_util = cred_util;
    }

    /**
     * @return the sld_cred_fim
     */
    public String getSld_cred_fim() {
        return sld_cred_fim;
    }

    /**
     * @param sld_cred_fim the sld_cred_fim to set
     */
    public void setSld_cred_fim(String sld_cred_fim) {
        this.sld_cred_fim = sld_cred_fim;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registro1210
     */
    public List<Registro1210> getRegistro1210() {
        if (registro1210 == null) {
            registro1210 = new ArrayList<Registro1210>();
        }
        return registro1210;
    }

}
