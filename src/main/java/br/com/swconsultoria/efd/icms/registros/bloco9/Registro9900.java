/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.bloco9;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class Registro9900 {

    private final String reg = "9900";
    private String reg_blc;
    private String qtd_reg_blc;

    /**
     * @return the reg_blc
     */
    public String getReg_blc() {
        return reg_blc;
    }

    /**
     * @param reg_blc the reg_bloc to set
     */
    public void setReg_blc(String reg_bloc) {
        this.reg_blc = reg_bloc;
    }

    /**
     * @return the qtd_reg_blc
     */
    public String getQtd_reg_blc() {
        return qtd_reg_blc;
    }

    /**
     * @param qtd_reg_blc the qtd_reg_blc to set
     */
    public void setQtd_reg_blc(String qtd_reg_blc) {
        this.qtd_reg_blc = qtd_reg_blc;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }
}
