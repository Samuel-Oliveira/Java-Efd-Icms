/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoE;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class RegistroE200 {

    private final String reg = "E200";
    private String uf;
    private String dt_ini;
    private String dt_fin;
    private RegistroE210 registroE210;

    /**
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * @return the dt_ini
     */
    public String getDt_ini() {
        return dt_ini;
    }

    /**
     * @param dt_ini the dt_ini to set
     */
    public void setDt_ini(String dt_ini) {
        this.dt_ini = dt_ini;
    }

    /**
     * @return the dt_fin
     */
    public String getDt_fin() {
        return dt_fin;
    }

    /**
     * @param dt_fin the dt_fin to set
     */
    public void setDt_fin(String dt_fin) {
        this.dt_fin = dt_fin;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroE210
     */
    public RegistroE210 getRegistroE210() {
        return registroE210;
    }

    /**
     * @param registroE210 the registroE210 to set
     */
    public void setRegistroE210(RegistroE210 registroE210) {
        this.registroE210 = registroE210;
    }

}
