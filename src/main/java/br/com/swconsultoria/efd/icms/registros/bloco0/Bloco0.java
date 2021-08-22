/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.bloco0;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */

@EqualsAndHashCode
public class Bloco0 {

    private Registro0000 registro0000;
    private Registro0001 registro0001;
    private Registro0002 registro0002;
    private Registro0005 registro0005;
    private List<Registro0015> registro0015;
    private Registro0100 registro0100;
    private List<Registro0150> registro0150;
    private List<Registro0190> registro0190;
    private List<Registro0200> registro0200;
    private List<Registro0210> registro0210;
    private List<Registro0220> registro0220;
    private List<Registro0300> registro0300;
    private List<Registro0400> registro0400;
    private List<Registro0450> registro0450;
    private List<Registro0460> registro0460;
    private List<Registro0500> registro0500;
    private List<Registro0600> registro0600;
    private Registro0990 registro0990;

    /**
     * @return the registro0000
     */
    public Registro0000 getRegistro0000() {
        return registro0000;
    }

    /**
     * @param registro0000 the registro0000 to set
     */
    public void setRegistro0000(Registro0000 registro0000) {
        this.registro0000 = registro0000;
    }

    /**
     * @return the registro0001
     */
    public Registro0001 getRegistro0001() {
        return registro0001;
    }

    /**
     * @param registro0001 the registro0001 to set
     */
    public void setRegistro0001(Registro0001 registro0001) {
        this.registro0001 = registro0001;
    }

    /**
     * @return the registro0005
     */
    public Registro0005 getRegistro0005() {
        return registro0005;
    }

    /**
     * @param registro0005 the registro0005 to set
     */
    public void setRegistro0005(Registro0005 registro0005) {
        this.registro0005 = registro0005;
    }

    /**
     * @return the registro0100
     */
    public Registro0100 getRegistro0100() {
        return registro0100;
    }

    /**
     * @param registro0100 the registro0100 to set
     */
    public void setRegistro0100(Registro0100 registro0100) {
        this.registro0100 = registro0100;
    }

    /**
     * @return the registro0150
     */
    public List<Registro0150> getRegistro0150() {
        if (registro0150 == null) {
            registro0150 = new ArrayList<Registro0150>();
        }
        return this.registro0150;
    }

    /**
     * @return the registro0015
     */
    public List<Registro0015> getRegistro0015() {
        if (registro0015 == null) {
            registro0015 = new ArrayList<Registro0015>();
        }
        return this.registro0015;
    }

    /**
     * @return the registro0190
     */
    public List<Registro0190> getRegistro0190() {
        if (registro0190 == null) {
            registro0190 = new ArrayList<Registro0190>();
        }
        return this.registro0190;
    }

    /**
     * @return the registro0200
     */
    public List<Registro0200> getRegistro0200() {
        if (registro0200 == null) {
            registro0200 = new ArrayList<Registro0200>();
        }
        return this.registro0200;
    }

    /**
     * @return the registro0210
     */
    public List<Registro0210> getRegistro0210() {
        if (registro0210 == null) {
            registro0210 = new ArrayList<Registro0210>();
        }
        return this.registro0210;
    }

    /**
     * @return the registro0220
     */
    public List<Registro0220> getRegistro0220() {
        if (registro0220 == null) {
            registro0220 = new ArrayList<Registro0220>();
        }
        return this.registro0220;
    }

    /**
     * @return the registro0300
     */
    public List<Registro0300> getRegistro0300() {
        if (registro0300 == null) {
            registro0300 = new ArrayList<Registro0300>();
        }
        return this.registro0300;
    }

    /**
     * @return the registro0400
     */
    public List<Registro0400> getRegistro0400() {
        if (registro0400 == null) {
            registro0400 = new ArrayList<Registro0400>();
        }
        return this.registro0400;
    }

    /**
     * @return the registro0450
     */
    public List<Registro0450> getRegistro0450() {
        if (registro0450 == null) {
            registro0450 = new ArrayList<Registro0450>();
        }
        return this.registro0450;
    }

    /**
     * @return the registro0460
     */
    public List<Registro0460> getRegistro0460() {
        if (registro0460 == null) {
            registro0460 = new ArrayList<Registro0460>();
        }
        return this.registro0460;
    }

    /**
     * @return the registro0500
     */
    public List<Registro0500> getRegistro0500() {
        if (registro0500 == null) {
            registro0500 = new ArrayList<Registro0500>();
        }
        return this.registro0500;
    }

    /**
     * @return the registro0600
     */
    public List<Registro0600> getRegistro0600() {
        if (registro0600 == null) {
            registro0600 = new ArrayList<Registro0600>();
        }
        return this.registro0600;
    }

    /**
     * @return the registro0990
     */
    public Registro0990 getRegistro0990() {
        return registro0990;
    }

    /**
     * @param registro0990 the registro0990 to set
     */
    public void setRegistro0990(Registro0990 registro0990) {
        this.registro0990 = registro0990;
    }

    public Registro0002 getRegistro0002() {
        return registro0002;
    }

    public void setRegistro0002(Registro0002 registro0002) {
        this.registro0002 = registro0002;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bloco0)) return false;

        Bloco0 bloco0 = (Bloco0) o;

        if (getRegistro0000() != null ? !getRegistro0000().equals(bloco0.getRegistro0000()) : bloco0.getRegistro0000() != null) return false;
        if (getRegistro0001() != null ? !getRegistro0001().equals(bloco0.getRegistro0001()) : bloco0.getRegistro0001() != null) return false;
        if (getRegistro0002() != null ? !getRegistro0002().equals(bloco0.getRegistro0002()) : bloco0.getRegistro0002() != null) return false;
        if (getRegistro0005() != null ? !getRegistro0005().equals(bloco0.getRegistro0005()) : bloco0.getRegistro0005() != null) return false;
        if (getRegistro0015() != null ? !getRegistro0015().equals(bloco0.getRegistro0015()) : bloco0.getRegistro0015() != null) return false;
        if (getRegistro0100() != null ? !getRegistro0100().equals(bloco0.getRegistro0100()) : bloco0.getRegistro0100() != null) return false;
        if (getRegistro0150() != null ? !getRegistro0150().equals(bloco0.getRegistro0150()) : bloco0.getRegistro0150() != null) return false;
        if (getRegistro0190() != null ? !getRegistro0190().equals(bloco0.getRegistro0190()) : bloco0.getRegistro0190() != null) return false;
        if (getRegistro0200() != null ? !getRegistro0200().equals(bloco0.getRegistro0200()) : bloco0.getRegistro0200() != null) return false;
        if (getRegistro0210() != null ? !getRegistro0210().equals(bloco0.getRegistro0210()) : bloco0.getRegistro0210() != null) return false;
        if (getRegistro0220() != null ? !getRegistro0220().equals(bloco0.getRegistro0220()) : bloco0.getRegistro0220() != null) return false;
        if (getRegistro0300() != null ? !getRegistro0300().equals(bloco0.getRegistro0300()) : bloco0.getRegistro0300() != null) return false;
        if (getRegistro0400() != null ? !getRegistro0400().equals(bloco0.getRegistro0400()) : bloco0.getRegistro0400() != null) return false;
        if (getRegistro0450() != null ? !getRegistro0450().equals(bloco0.getRegistro0450()) : bloco0.getRegistro0450() != null) return false;
        if (getRegistro0460() != null ? !getRegistro0460().equals(bloco0.getRegistro0460()) : bloco0.getRegistro0460() != null) return false;
        if (getRegistro0500() != null ? !getRegistro0500().equals(bloco0.getRegistro0500()) : bloco0.getRegistro0500() != null) return false;
        if (getRegistro0600() != null ? !getRegistro0600().equals(bloco0.getRegistro0600()) : bloco0.getRegistro0600() != null) return false;
        return getRegistro0990() != null ? getRegistro0990().equals(bloco0.getRegistro0990()) : bloco0.getRegistro0990() == null;
    }

    @Override
    public int hashCode() {
        int result = getRegistro0000() != null ? getRegistro0000().hashCode() : 0;
        result = 31 * result + (getRegistro0001() != null ? getRegistro0001().hashCode() : 0);
        result = 31 * result + (getRegistro0002() != null ? getRegistro0002().hashCode() : 0);
        result = 31 * result + (getRegistro0005() != null ? getRegistro0005().hashCode() : 0);
        result = 31 * result + (getRegistro0015() != null ? getRegistro0015().hashCode() : 0);
        result = 31 * result + (getRegistro0100() != null ? getRegistro0100().hashCode() : 0);
        result = 31 * result + (getRegistro0150() != null ? getRegistro0150().hashCode() : 0);
        result = 31 * result + (getRegistro0190() != null ? getRegistro0190().hashCode() : 0);
        result = 31 * result + (getRegistro0200() != null ? getRegistro0200().hashCode() : 0);
        result = 31 * result + (getRegistro0210() != null ? getRegistro0210().hashCode() : 0);
        result = 31 * result + (getRegistro0220() != null ? getRegistro0220().hashCode() : 0);
        result = 31 * result + (getRegistro0300() != null ? getRegistro0300().hashCode() : 0);
        result = 31 * result + (getRegistro0400() != null ? getRegistro0400().hashCode() : 0);
        result = 31 * result + (getRegistro0450() != null ? getRegistro0450().hashCode() : 0);
        result = 31 * result + (getRegistro0460() != null ? getRegistro0460().hashCode() : 0);
        result = 31 * result + (getRegistro0500() != null ? getRegistro0500().hashCode() : 0);
        result = 31 * result + (getRegistro0600() != null ? getRegistro0600().hashCode() : 0);
        result = 31 * result + (getRegistro0990() != null ? getRegistro0990().hashCode() : 0);
        return result;
    }
}
