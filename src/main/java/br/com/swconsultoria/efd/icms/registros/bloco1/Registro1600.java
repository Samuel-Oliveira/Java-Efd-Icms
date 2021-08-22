/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.bloco1;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class Registro1600 {

    private final String reg = "1600";
    private String cod_part;
    private String tot_credito;
    private String tot_debito;

    /**
     * @return the cod_part
     */
    public String getCod_part() {
        return cod_part;
    }

    /**
     * @param cod_part the cod_part to set
     */
    public void setCod_part(String cod_part) {
        this.cod_part = cod_part;
    }

    /**
     * @return the tot_credito
     */
    public String getTot_credito() {
        return tot_credito;
    }

    /**
     * @param tot_credito the tot_credito to set
     */
    public void setTot_credito(String tot_credito) {
        this.tot_credito = tot_credito;
    }

    /**
     * @return the tot_debito
     */
    public String getTot_debito() {
        return tot_debito;
    }

    /**
     * @param tot_debito the tot_debito to set
     */
    public void setTot_debito(String tot_debito) {
        this.tot_debito = tot_debito;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
