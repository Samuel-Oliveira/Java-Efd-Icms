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
public class Registro0450 {

    private final String reg = "0450";
    private String cod_inf;
    private String txt;

    /**
     * @return the cod_inf
     */
    public String getCod_inf() {
        return cod_inf;
    }

    /**
     * @param cod_inf the cod_inf to set
     */
    public void setCod_inf(String cod_inf) {
        this.cod_inf = cod_inf;
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
