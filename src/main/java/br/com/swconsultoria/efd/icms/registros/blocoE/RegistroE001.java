/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoE;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class RegistroE001 {

    private final String reg = "E001";
    private String ind_mov;

    /**
     * @return the ind_mov
     */
    public String getInd_mov() {
        return ind_mov;
    }

    /**
     * @param ind_mov the ind_mov to set
     */
    public void setInd_mov(String ind_mov) {
        this.ind_mov = ind_mov;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
