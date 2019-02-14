/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.bloco1;

/**
 * @author Samuel Oliveira
 */
public class Registro1910 {

    private final String reg = "1910";
    private String dt_ini;
    private String dt_fin;
    private Registro1920 registro1920;

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
     * @return the registro1920
     */
    public Registro1920 getRegistro1920() {
        return registro1920;
    }

    /**
     * @param registro1920 the registro1920 to set
     */
    public void setRegistro1920(Registro1920 registro1920) {
        this.registro1920 = registro1920;
    }

}
