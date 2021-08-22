/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoC;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira
 *
 */
@EqualsAndHashCode
public class RegistroC120 {

    private final String reg = "C120";
    private String cod_doc_imp;
    private String num_doc_imp;
    private String pis_imp;
    private String cofins_imp;
    private String num_acdraw;

    /**
     * @return the cod_doc_imp
     */
    public String getCod_doc_imp() {
        return cod_doc_imp;
    }

    /**
     * @param cod_doc_imp the cod_doc_imp to set
     */
    public void setCod_doc_imp(String cod_doc_imp) {
        this.cod_doc_imp = cod_doc_imp;
    }

    /**
     * @return the num_doc_imp
     */
    public String getNum_doc_imp() {
        return num_doc_imp;
    }

    /**
     * @param num_doc_imp the num_doc_imp to set
     */
    public void setNum_doc_imp(String num_doc_imp) {
        this.num_doc_imp = num_doc_imp;
    }

    /**
     * @return the pis_imp
     */
    public String getPis_imp() {
        return pis_imp;
    }

    /**
     * @param pis_imp the pis_imp to set
     */
    public void setPis_imp(String pis_imp) {
        this.pis_imp = pis_imp;
    }

    /**
     * @return the cofins_imp
     */
    public String getCofins_imp() {
        return cofins_imp;
    }

    /**
     * @param cofins_imp the cofins_imp to set
     */
    public void setCofins_imp(String cofins_imp) {
        this.cofins_imp = cofins_imp;
    }

    /**
     * @return the num_acdraw
     */
    public String getNum_acdraw() {
        return num_acdraw;
    }

    /**
     * @param num_acdraw the num_acdraw to set
     */
    public void setNum_acdraw(String num_acdraw) {
        this.num_acdraw = num_acdraw;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
