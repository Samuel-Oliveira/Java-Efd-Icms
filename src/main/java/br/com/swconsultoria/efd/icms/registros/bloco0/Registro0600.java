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
public class Registro0600 {

    private final String reg = "0600";
    private String dt_alt;
    private String cod_ccus;
    private String ccus;

    /**
     * @return the dt_alt
     */
    public String getDt_alt() {
        return dt_alt;
    }

    /**
     * @param dt_alt the dt_alt to set
     */
    public void setDt_alt(String dt_alt) {
        this.dt_alt = dt_alt;
    }

    /**
     * @return the cod_ccus
     */
    public String getCod_ccus() {
        return cod_ccus;
    }

    /**
     * @param cod_ccus the cod_ccus to set
     */
    public void setCod_ccus(String cod_ccus) {
        this.cod_ccus = cod_ccus;
    }

    /**
     * @return the ccus
     */
    public String getCcus() {
        return ccus;
    }

    /**
     * @param ccus the ccus to set
     */
    public void setCcus(String ccus) {
        this.ccus = ccus;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }
}
