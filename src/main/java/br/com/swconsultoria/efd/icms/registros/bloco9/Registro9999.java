/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.bloco9;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class Registro9999 {

    private final String reg = "9999";
    private String qtd_lin;

    /**
     * @return the qtd_lin
     */
    public String getQtd_lin() {
        return qtd_lin;
    }

    /**
     * @param qtd_lin the qtd_lin to set
     */
    public void setQtd_lin(String qtd_lin) {
        this.qtd_lin = qtd_lin;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }
}
