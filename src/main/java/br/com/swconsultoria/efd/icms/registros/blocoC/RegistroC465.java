/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoC;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira
 *
 */
@EqualsAndHashCode
public class RegistroC465 {

    private final String reg = "C465";
    private String chv_cfe;
    private String num_ccf;

    /**
     * @return the chv_cfe
     */
    public String getChv_cfe() {
        return chv_cfe;
    }

    /**
     * @param chv_cfe the chv_cfe to set
     */
    public void setChv_cfe(String chv_cfe) {
        this.chv_cfe = chv_cfe;
    }

    /**
     * @return the num_cc
     */
    public String getNum_ccf() {
        return num_ccf;
    }

    /**
     * @param num_cc the num_cc to set
     */
    public void setNum_ccf(String num_ccf) {
        this.num_ccf = num_ccf;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
