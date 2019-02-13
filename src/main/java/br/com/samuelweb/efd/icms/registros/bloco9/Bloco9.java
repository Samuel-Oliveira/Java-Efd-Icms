/**
 *
 */
package br.com.samuelweb.efd.icms.registros.bloco9;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 *
 */
public class Bloco9 {

    private Registro9001 registro9001;
    private List<Registro9900> registro9900;
    private Registro9990 registro9990;
    private Registro9999 registro9999;

    /**
     * @return the registro9001
     */
    public Registro9001 getRegistro9001() {
        return registro9001;
    }

    /**
     * @param registro9001 the registro9001 to set
     */
    public void setRegistro9001(Registro9001 registro9001) {
        this.registro9001 = registro9001;
    }

    /**
     * @return the registro9990
     */
    public Registro9990 getRegistro9990() {
        return registro9990;
    }

    /**
     * @param registro9990 the registro9990 to set
     */
    public void setRegistro9990(Registro9990 registro9990) {
        this.registro9990 = registro9990;
    }

    /**
     * @return the registro9900
     */
    public List<Registro9900> getRegistro9900() {
        if (registro9900 == null) {
            registro9900 = new ArrayList<Registro9900>();
        }
        return registro9900;
    }

    /**
     * @return the registro9999
     */
    public Registro9999 getRegistro9999() {
        return registro9999;
    }

    /**
     * @param registro9999 the registro9999 to set
     */
    public void setRegistro9999(Registro9999 registro9999) {
        this.registro9999 = registro9999;
    }
}
