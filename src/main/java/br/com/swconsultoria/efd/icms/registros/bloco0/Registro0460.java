/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.bloco0;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira
 *
 */
@EqualsAndHashCode
public class Registro0460 {

    private final String reg = "0460";
    private String cod_obs;
    private String txt;

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
     * @return the txt
     */
    public String getTxt() {
        return txt;
    }

    /**
     * @param txt the txt to set
     */
    public void setTxt(String txt) {
        this.txt = txt;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }
}
