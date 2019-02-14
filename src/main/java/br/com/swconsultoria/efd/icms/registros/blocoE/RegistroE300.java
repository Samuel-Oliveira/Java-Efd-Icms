/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoE;

/**
 * @author Samuel Oliveira
 */
public class RegistroE300 {

    private final String reg = "E300";
    private String uf;
    private String dt_ini;
    private String dt_fin;
    private RegistroE310 registroE310;

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
     * @return the registroE310
     */
    public RegistroE310 getRegistroE310() {
        return registroE310;
    }

    /**
     * @param registroE310 the registroE310 to set
     */
    public void setRegistroE310(RegistroE310 registroE310) {
        this.registroE310 = registroE310;
    }

}
