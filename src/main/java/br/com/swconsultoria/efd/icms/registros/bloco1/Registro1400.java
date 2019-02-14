/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.bloco1;

/**
 * @author Samuel Oliveira
 */
public class Registro1400 {

    private final String reg = "1400";
    private String cod_item_ipm;
    private String mun;
    private String valor;

    /**
     * @return the cod_item_ipm
     */
    public String getCod_item_ipm() {
        return cod_item_ipm;
    }

    /**
     * @param cod_item_ipm the cod_item_ipm to set
     */
    public void setCod_item_ipm(String cod_item_ipm) {
        this.cod_item_ipm = cod_item_ipm;
    }

    /**
     * @return the mun
     */
    public String getMun() {
        return mun;
    }

    /**
     * @param mun the mun to set
     */
    public void setMun(String mun) {
        this.mun = mun;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
