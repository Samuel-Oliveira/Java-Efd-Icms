/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoE;

/**
 * @author Samuel Oliveira
 */
public class RegistroE100 {

    private final String reg = "E100";
    private String dt_ini;
    private String dt_fin;
    private RegistroE110 registroE110;

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
     * @return the registroE110
     */
    public RegistroE110 getRegistroE110() {
        return registroE110;
    }

    /**
     * @param registroE110 the registroE110 to set
     */
    public void setRegistroE110(RegistroE110 registroE110) {
        this.registroE110 = registroE110;
    }

}
