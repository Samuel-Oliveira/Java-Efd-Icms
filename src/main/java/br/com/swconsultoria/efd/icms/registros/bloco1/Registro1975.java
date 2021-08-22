/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.bloco1;

import lombok.EqualsAndHashCode;

/**
 * @author Sidnei Klein
 */
@EqualsAndHashCode
public class Registro1975 {

    private final String reg = "1975";
    private String aliq_imp_base;
    private String g3_10;
    private String g3_11;
    private String g3_12;

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the aliq_imp_base
     */
    public String getAliq_imp_base() {
        return aliq_imp_base;
    }

    /**
     * @param aliq_imp_base the aliq_imp_base to set
     */
    public void setAliq_imp_base(String aliq_imp_base) {
        this.aliq_imp_base = aliq_imp_base;
    }

    /**
     * @return the g3_10
     */
    public String getG3_10() {
        return g3_10;
    }

    /**
     * @param g3_10 the g3_10 to set
     */
    public void setG3_10(String g3_10) {
        this.g3_10 = g3_10;
    }

    /**
     * @return the g3_11
     */
    public String getG3_11() {
        return g3_11;
    }

    /**
     * @param g3_11 the g3_11 to set
     */
    public void setG3_11(String g3_11) {
        this.g3_11 = g3_11;
    }

    /**
     * @return the g3_12
     */
    public String getG3_12() {
        return g3_12;
    }

    /**
     * @param g3_12 the g3_12 to set
     */
    public void setG3_12(String g3_12) {
        this.g3_12 = g3_12;
    }

}
