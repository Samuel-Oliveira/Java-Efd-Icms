/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.bloco1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sidnei Klein
 */
public class Registro1970 {

    private final String reg = "1970";
    private String ind_ap;
    private String g3_01;
    private String g3_02;
    private String g3_03;
    private String g3_04;
    private String g3_05;
    private String g3_06;
    private String g3_07;
    private String g3_08;
    private String g3_09;

    private List<Registro1975> registro1975;

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the ind_ap
     */
    public String getInd_ap() {
        return ind_ap;
    }

    /**
     * @param ind_ap the ind_ap to set
     */
    public void setInd_ap(String ind_ap) {
        this.ind_ap = ind_ap;
    }

    /**
     * @return the g3_01
     */
    public String getG3_01() {
        return g3_01;
    }

    /**
     * @param g3_01 the g3_01 to set
     */
    public void setG3_01(String g3_01) {
        this.g3_01 = g3_01;
    }

    /**
     * @return the g3_02
     */
    public String getG3_02() {
        return g3_02;
    }

    /**
     * @param g3_02 the g3_02 to set
     */
    public void setG3_02(String g3_02) {
        this.g3_02 = g3_02;
    }

    /**
     * @return the g3_03
     */
    public String getG3_03() {
        return g3_03;
    }

    /**
     * @param g3_03 the g3_03 to set
     */
    public void setG3_03(String g3_03) {
        this.g3_03 = g3_03;
    }

    /**
     * @return the g3_04
     */
    public String getG3_04() {
        return g3_04;
    }

    /**
     * @param g3_04 the g3_04 to set
     */
    public void setG3_04(String g3_04) {
        this.g3_04 = g3_04;
    }

    /**
     * @return the g3_05
     */
    public String getG3_05() {
        return g3_05;
    }

    /**
     * @param g3_05 the g3_05 to set
     */
    public void setG3_05(String g3_05) {
        this.g3_05 = g3_05;
    }

    /**
     * @return the g3_06
     */
    public String getG3_06() {
        return g3_06;
    }

    /**
     * @param g3_06 the g3_06 to set
     */
    public void setG3_06(String g3_06) {
        this.g3_06 = g3_06;
    }

    /**
     * @return the g3_07
     */
    public String getG3_07() {
        return g3_07;
    }

    /**
     * @param g3_07 the g3_07 to set
     */
    public void setG3_07(String g3_07) {
        this.g3_07 = g3_07;
    }

    /**
     * @return the g3_08
     */
    public String getG3_08() {
        return g3_08;
    }

    /**
     * @param g3_08 the g3_08 to set
     */
    public void setG3_08(String g3_08) {
        this.g3_08 = g3_08;
    }

    /**
     * @return the g3_09
     */
    public String getG3_09() {
        return g3_09;
    }

    /**
     * @param g3_09 the g3_09 to set
     */
    public void setG3_09(String g3_09) {
        this.g3_09 = g3_09;
    }

    /**
     * @return the registro1975
     */
    public List<Registro1975> getRegistro1975() {
        return registro1975;
    }

    /**
     * @param registro1975 the registro1975 to set
     */
    public void setRegistro1975(List<Registro1975> registro1975) {
        if (registro1975 == null) {
            registro1975 = new ArrayList<>();
        }
        this.registro1975 = registro1975;
    }
}
