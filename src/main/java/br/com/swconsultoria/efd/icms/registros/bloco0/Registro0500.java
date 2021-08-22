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
public class Registro0500 {

    private final String reg = "0500";
    private String dt_alt;
    private String cod_nat_cc;
    private String ind_cta;
    private String nivel;
    private String cod_cta;
    private String nome_cta;

    /**
     * @return the dt_alt
     */
    public String getDt_alt() {
        return dt_alt;
    }

    /**
     * @param dt_alt the dt_alt to set
     */
    public void setDt_alt(String dt_alt) {
        this.dt_alt = dt_alt;
    }

    /**
     * @return the cod_nat_cc
     */
    public String getCod_nat_cc() {
        return cod_nat_cc;
    }

    /**
     * @param cod_nat_cc the cod_nat_cc to set
     */
    public void setCod_nat_cc(String cod_nat_cc) {
        this.cod_nat_cc = cod_nat_cc;
    }

    /**
     * @return the ind_cta
     */
    public String getInd_cta() {
        return ind_cta;
    }

    /**
     * @param ind_cta the ind_cta to set
     */
    public void setInd_cta(String ind_cta) {
        this.ind_cta = ind_cta;
    }

    /**
     * @return the nivel
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the cod_cta
     */
    public String getCod_cta() {
        return cod_cta;
    }

    /**
     * @param cod_cta the cod_cta to set
     */
    public void setCod_cta(String cod_cta) {
        this.cod_cta = cod_cta;
    }

    /**
     * @return the nome_cta
     */
    public String getNome_cta() {
        return nome_cta;
    }

    /**
     * @param nome_cta the nome_cta to set
     */
    public void setNome_cta(String nome_cta) {
        this.nome_cta = nome_cta;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }
}
