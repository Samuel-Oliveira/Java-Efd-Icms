/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoK;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroK290 {

    private final String reg = "K290";
    private String dt_ini_op;
    private String dt_fin_op;
    private String cod_doc_op;
    private List<RegistroK291> registroK291;
    private List<RegistroK292> registroK292;

    public String getReg() {
        return reg;
    }

    public String getDt_ini_op() {

        return dt_ini_op;
    }

    public void setDt_ini_op(String dt_ini_op) {
        this.dt_ini_op = dt_ini_op;
    }

    public String getDt_fin_op() {
        return dt_fin_op;
    }

    public void setDt_fin_op(String dt_fin_op) {
        this.dt_fin_op = dt_fin_op;
    }

    public String getCod_doc_op() {
        return cod_doc_op;
    }

    public void setCod_doc_op(String cod_doc_op) {
        this.cod_doc_op = cod_doc_op;
    }

    /**
     * @return the registroK91
     */
    public List<RegistroK291> getRegistroK291() {
        if (registroK291 == null) {
            registroK291 = new ArrayList<RegistroK291>();
        }
        return registroK291;
    }

    /**
     * @return the registroK292
     */
    public List<RegistroK292> getRegistroK292() {
        if (registroK292 == null) {
            registroK292 = new ArrayList<RegistroK292>();
        }
        return registroK292;
    }
}
