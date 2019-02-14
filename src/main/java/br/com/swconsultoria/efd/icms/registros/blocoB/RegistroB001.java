/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoB;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sidnei Klein
 */
public class RegistroB001 {

    private final String reg = "B001";
    private String ind_dad;

    private RegistroB020 registroB020;
    private List<RegistroB030> registroB030;
    private List<RegistroB350> registroB350;
    private List<RegistroB420> registroB420;
    private List<RegistroB440> registroB440;
    private List<RegistroB460> registroB460;
    private RegistroB470 registroB470;
    private RegistroB500 registroB500;

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the ind_dad
     */
    public String getInd_dad() {
        return ind_dad;
    }

    /**
     * @param ind_dad the ind_dad to set
     */
    public void setInd_dad(String ind_dad) {
        this.ind_dad = ind_dad;
    }

    /**
     * @return the registroB020
     */
    public RegistroB020 getRegistroB020() {
        return registroB020;
    }

    /**
     * @param registroB020 the registroB020 to set
     */
    public void setRegistroB020(RegistroB020 registroB020) {
        this.registroB020 = registroB020;
    }

    /**
     * @return the registroB030
     */
    public List<RegistroB030> getRegistroB030() {
        return registroB030;
    }

    /**
     * @param registroB030 the registroB030 to set
     */
    public void setRegistroB030(List<RegistroB030> registroB030) {
        if (registroB030 == null) {
            registroB030 = new ArrayList<>();
        }
        this.registroB030 = registroB030;
    }

    /**
     * @return the registroB350
     */
    public List<RegistroB350> getRegistroB350() {
        return registroB350;
    }

    /**
     * @param registroB350 the registroB350 to set
     */
    public void setRegistroB350(List<RegistroB350> registroB350) {
        if (registroB350 == null) {
            registroB350 = new ArrayList<>();
        }
        this.registroB350 = registroB350;
    }

    /**
     * @return the registroB420
     */
    public List<RegistroB420> getRegistroB420() {
        return registroB420;
    }

    /**
     * @param registroB420 the registroB420 to set
     */
    public void setRegistroB420(List<RegistroB420> registroB420) {
        if (registroB420 == null) {
            registroB420 = new ArrayList<>();
        }
        this.registroB420 = registroB420;
    }

    /**
     * @return the registroB440
     */
    public List<RegistroB440> getRegistroB440() {
        return registroB440;
    }

    /**
     * @param registroB440 the registroB440 to set
     */
    public void setRegistroB440(List<RegistroB440> registroB440) {
        if (registroB440 == null) {
            registroB440 = new ArrayList<>();
        }
        this.registroB440 = registroB440;
    }

    /**
     * @return the registroB460
     */
    public List<RegistroB460> getRegistroB460() {
        return registroB460;
    }

    /**
     * @param registroB460 the registroB460 to set
     */
    public void setRegistroB460(List<RegistroB460> registroB460) {
        if (registroB460 == null) {
            registroB460 = new ArrayList<>();
        }
        this.registroB460 = registroB460;
    }

    /**
     * @return the registroB470
     */
    public RegistroB470 getRegistroB470() {
        return registroB470;
    }

    /**
     * @param registroB470 the registroB470 to set
     */
    public void setRegistroB470(RegistroB470 registroB470) {
        this.registroB470 = registroB470;
    }

    /**
     * @return the registroB500
     */
    public RegistroB500 getRegistroB500() {
        return registroB500;
    }

    /**
     * @param registroB500 the registroB500 to set
     */
    public void setRegistroB500(RegistroB500 registroB500) {
        this.registroB500 = registroB500;
    }

}
