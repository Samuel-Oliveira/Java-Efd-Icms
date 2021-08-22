/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoD;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class RegistroD530 {

    private final String reg = "D530";
    private String ind_serv;
    private String dt_ini_serv;
    private String dt_fin_serv;
    private String per_fiscal;
    private String cod_area;
    private String terminal;

    /**
     * @return the ind_serv
     */
    public String getInd_serv() {
        return ind_serv;
    }

    /**
     * @param ind_serv the ind_serv to set
     */
    public void setInd_serv(String ind_serv) {
        this.ind_serv = ind_serv;
    }

    /**
     * @return the dt_ini_serv
     */
    public String getDt_ini_serv() {
        return dt_ini_serv;
    }

    /**
     * @param dt_ini_serv the dt_ini_serv to set
     */
    public void setDt_ini_serv(String dt_ini_serv) {
        this.dt_ini_serv = dt_ini_serv;
    }

    /**
     * @return the dt_fin_serv
     */
    public String getDt_fin_serv() {
        return dt_fin_serv;
    }

    /**
     * @param dt_fin_serv the dt_fin_serv to set
     */
    public void setDt_fin_serv(String dt_fin_serv) {
        this.dt_fin_serv = dt_fin_serv;
    }

    /**
     * @return the per_fiscal
     */
    public String getPer_fiscal() {
        return per_fiscal;
    }

    /**
     * @param per_fiscal the per_fiscal to set
     */
    public void setPer_fiscal(String per_fiscal) {
        this.per_fiscal = per_fiscal;
    }

    /**
     * @return the cod_area
     */
    public String getCod_area() {
        return cod_area;
    }

    /**
     * @param cod_area the cod_area to set
     */
    public void setCod_area(String cod_area) {
        this.cod_area = cod_area;
    }

    /**
     * @return the terminal
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * @param terminal the terminal to set
     */
    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
