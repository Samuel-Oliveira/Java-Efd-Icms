/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.bloco1;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class Registro1710 {

    private final String reg = "1710";
    private String num_doc_ini;
    private String num_doc_fin;

    /**
     * @return the num_doc_ini
     */
    public String getNum_doc_ini() {
        return num_doc_ini;
    }

    /**
     * @param num_doc_ini the num_doc_ini to set
     */
    public void setNum_doc_ini(String num_doc_ini) {
        this.num_doc_ini = num_doc_ini;
    }

    /**
     * @return the num_doc_fin
     */
    public String getNum_doc_fin() {
        return num_doc_fin;
    }

    /**
     * @param num_doc_fin the num_doc_fin to set
     */
    public void setNum_doc_fin(String num_doc_fin) {
        this.num_doc_fin = num_doc_fin;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
