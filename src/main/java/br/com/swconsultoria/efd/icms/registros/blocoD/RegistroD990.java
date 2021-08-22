/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoD;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira
 *
 */
@EqualsAndHashCode
public class RegistroD990 {

    private final String reg = "D990";
    private String qtd_lin_d;

    /**
     * @return the qtd_lin_d
     */
    public String getQtd_lin_d() {
        return qtd_lin_d;
    }

    /**
     * @param qtd_lin_d the qtd_lin_d to set
     */
    public void setQtd_lin_d(String qtd_lin_d) {
        this.qtd_lin_d = qtd_lin_d;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }
}
