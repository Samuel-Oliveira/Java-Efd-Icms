/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoE;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 *
 */
@EqualsAndHashCode
public class BlocoE {

    private RegistroE001 registroE001;
    private List<RegistroE100> registroE100;
    private List<RegistroE200> registroE200;
    private List<RegistroE300> registroE300;
    private List<RegistroE500> registroE500;
    private RegistroE990 registroE990;

    /**
     * @return the registroE001
     */
    public RegistroE001 getRegistroE001() {
        return registroE001;
    }

    /**
     * @param registroE001 the registroE001 to set
     */
    public void setRegistroE001(RegistroE001 registroE001) {
        this.registroE001 = registroE001;
    }

    /**
     * @return the registroE990
     */
    public RegistroE990 getRegistroE990() {
        return registroE990;
    }

    /**
     * @param registroE990 the registroE990 to set
     */
    public void setRegistroE990(RegistroE990 registroE990) {
        this.registroE990 = registroE990;
    }

    /**
     * @return the registroE100
     */
    public List<RegistroE100> getRegistroE100() {
        if (registroE100 == null) {
            registroE100 = new ArrayList<RegistroE100>();
        }
        return registroE100;
    }

    /**
     * @return the registroE200
     */
    public List<RegistroE200> getRegistroE200() {
        if (registroE200 == null) {
            registroE200 = new ArrayList<RegistroE200>();
        }
        return registroE200;
    }

    /**
     * @return the registroE300
     */
    public List<RegistroE300> getRegistroE300() {
        if (registroE300 == null) {
            registroE300 = new ArrayList<RegistroE300>();
        }
        return registroE300;
    }

    /**
     * @return the registroE500
     */
    public List<RegistroE500> getRegistroE500() {
        if (registroE500 == null) {
            registroE500 = new ArrayList<RegistroE500>();
        }
        return registroE500;
    }

}
