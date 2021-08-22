/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoB;

import lombok.EqualsAndHashCode;

/**
 * @author Sidnei Klein
 */
@EqualsAndHashCode
public class RegistroB990 {

    private final String reg = "B990";
    private String qtd_lin_b;

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the qtde_lin_b
     */
    public String getQtd_lin_b() {
        return qtd_lin_b;
    }

    /**
     * @param qtde_lin_b the qtde_lin_b to set
     */
    public void setQtd_lin_b(String qtde_lin_b) {
        this.qtd_lin_b = qtde_lin_b;
    }

}
