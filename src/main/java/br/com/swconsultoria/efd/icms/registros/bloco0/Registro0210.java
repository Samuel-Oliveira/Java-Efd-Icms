/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.bloco0;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira
 *
 */
@EqualsAndHashCode
public class Registro0210 {

    private final String reg = "0210";
    private String cod_item_comp;
    private String qtd_comp;
    private String perda;

    /**
     * @return the cod_item_comp
     */
    public String getCod_item_comp() {
        return cod_item_comp;
    }

    /**
     * @param cod_item_comp the cod_item_comp to set
     */
    public void setCod_item_comp(String cod_item_comp) {
        this.cod_item_comp = cod_item_comp;
    }

    /**
     * @return the qtd_comp
     */
    public String getQtd_comp() {
        return qtd_comp;
    }

    /**
     * @param qtd_comp the qtd_comp to set
     */
    public void setQtd_comp(String qtd_comp) {
        this.qtd_comp = qtd_comp;
    }

    /**
     * @return the perda
     */
    public String getPerda() {
        return perda;
    }

    /**
     * @param perda the perda to set
     */
    public void setPerda(String perda) {
        this.perda = perda;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }
}
