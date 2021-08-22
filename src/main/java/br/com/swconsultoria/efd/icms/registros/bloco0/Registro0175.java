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
public class Registro0175 {

    private final String reg = "0175";
    private String dt_alt;
    private String nr_campo;
    private String cont_ant;

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
     * @return the nr_campo
     */
    public String getNr_campo() {
        return nr_campo;
    }

    /**
     * @param nr_campo the nr_campo to set
     */
    public void setNr_campo(String nr_campo) {
        this.nr_campo = nr_campo;
    }

    /**
     * @return the cont_ant
     */
    public String getCont_ant() {
        return cont_ant;
    }

    /**
     * @param cont_ant the cont_ant to set
     */
    public void setCont_ant(String cont_ant) {
        this.cont_ant = cont_ant;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }
}
