/**
 *
 */
package br.com.samuelweb.efd.icms.registros.blocoK;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroK100 {

    private final String reg = "K100";
    private String dt_ini;
    private String dt_fin;
    private List<RegistroK200> registroK200;
    private List<RegistroK210> registroK210;
    private List<RegistroK220> registroK220;
    private List<RegistroK230> registroK230;
    private List<RegistroK250> registroK250;
    private List<RegistroK260> registroK260;
    private List<RegistroK270> registroK270;
    private List<RegistroK280> registroK280;
    private List<RegistroK290> registroK290;
    private List<RegistroK300> registroK300;

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
     * @return the registroK200
     */
    public List<RegistroK200> getRegistroK200() {
        if (registroK200 == null) {
            registroK200 = new ArrayList<RegistroK200>();
        }
        return registroK200;
    }

    /**
     * @return the registroK210
     */
    public List<RegistroK210> getRegistroK210() {
        if (registroK210 == null) {
            registroK210 = new ArrayList<RegistroK210>();
        }
        return registroK210;
    }

    /**
     * @return the registroK220
     */
    public List<RegistroK220> getRegistroK220() {
        if (registroK220 == null) {
            registroK220 = new ArrayList<RegistroK220>();
        }
        return registroK220;
    }

    /**
     * @return the registroK230
     */
    public List<RegistroK230> getRegistroK230() {
        if (registroK230 == null) {
            registroK230 = new ArrayList<RegistroK230>();
        }
        return registroK230;
    }

    /**
     * @return the registroK250
     */
    public List<RegistroK250> getRegistroK250() {
        if (registroK250 == null) {
            registroK250 = new ArrayList<RegistroK250>();
        }
        return registroK250;
    }

    /**
     * @return the registroK260
     */
    public List<RegistroK260> getRegistroK260() {
        if (registroK260 == null) {
            registroK260 = new ArrayList<RegistroK260>();
        }
        return registroK260;
    }

    /**
     * @return the registroK270
     */
    public List<RegistroK270> getRegistroK270() {
        if (registroK270 == null) {
            registroK270 = new ArrayList<RegistroK270>();
        }
        return registroK270;
    }

    /**
     * @return the registroK280
     */
    public List<RegistroK280> getRegistroK280() {
        if (registroK280 == null) {
            registroK280 = new ArrayList<RegistroK280>();
        }
        return registroK280;
    }

    /**
     * @return the registroK290
     */
    public List<RegistroK290> getRegistroK290() {
        if (registroK290 == null) {
            registroK290 = new ArrayList<RegistroK290>();
        }
        return registroK290;
    }

    /**
     * @return the registroK300
     */
    public List<RegistroK300> getRegistroK300() {
        if (registroK300 == null) {
            registroK300 = new ArrayList<RegistroK300>();
        }
        return registroK300;
    }

}
