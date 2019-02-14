/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoK;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroK230 {

    private final String reg = "K230";
    private String dt_ini_op;
    private String dt_fin_op;
    private String cod_doc_op;
    private String cod_item;
    private String qtd_enc;
    private List<RegistroK235> registroK235;

    /**
     * @return the dt_ini_op
     */
    public String getDt_ini_op() {
        return dt_ini_op;
    }

    /**
     * @param dt_ini_op the dt_ini_op to set
     */
    public void setDt_ini_op(String dt_ini_op) {
        this.dt_ini_op = dt_ini_op;
    }

    /**
     * @return the dt_fin_op
     */
    public String getDt_fin_op() {
        return dt_fin_op;
    }

    /**
     * @param dt_fin_op the dt_fin_op to set
     */
    public void setDt_fin_op(String dt_fin_op) {
        this.dt_fin_op = dt_fin_op;
    }

    /**
     * @return the cod_doc_op
     */
    public String getCod_doc_op() {
        return cod_doc_op;
    }

    /**
     * @param cod_doc_op the cod_doc_op to set
     */
    public void setCod_doc_op(String cod_doc_op) {
        this.cod_doc_op = cod_doc_op;
    }

    /**
     * @return the cod_item
     */
    public String getCod_item() {
        return cod_item;
    }

    /**
     * @param cod_item the cod_item to set
     */
    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    /**
     * @return the qtd_enc
     */
    public String getQtd_enc() {
        return qtd_enc;
    }

    /**
     * @param qtd_enc the qtd_enc to set
     */
    public void setQtd_enc(String qtd_enc) {
        this.qtd_enc = qtd_enc;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroK235
     */
    public List<RegistroK235> getRegistroK235() {
        if (registroK235 == null) {
            registroK235 = new ArrayList<RegistroK235>();
        }
        return registroK235;
    }

}
