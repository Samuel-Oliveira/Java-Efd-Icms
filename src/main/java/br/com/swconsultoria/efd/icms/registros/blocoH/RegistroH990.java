/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoH;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira
 *
 */
@EqualsAndHashCode
public class RegistroH990 {

    private final String reg = "H990";
    private String qtd_lin_h;

    /**
     * @return the qtd_lin_h
     */
    public String getQtd_lin_h() {
        return qtd_lin_h;
    }

    /**
     * @param qtd_lin_h the qtd_lin_h to set
     */
    public void setQtd_lin_h(String qtd_lin_h) {
        this.qtd_lin_h = qtd_lin_h;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }
}
