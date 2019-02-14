/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoK;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroK210 {

    private final String reg = "K210";
    private String dt_ini_os;
    private String dt_fin_os;
    private String cod_doc_os;
    private String cod_item_ori;
    private String qtd_ori;
    private List<RegistroK215> registroK215;

    /**
     * @return the dt_ini_os
     */
    public String getDt_ini_os() {
        return dt_ini_os;
    }

    /**
     * @param dt_ini_os the dt_ini_os to set
     */
    public void setDt_ini_os(String dt_ini_os) {
        this.dt_ini_os = dt_ini_os;
    }

    /**
     * @return the dt_fin_os
     */
    public String getDt_fin_os() {
        return dt_fin_os;
    }

    /**
     * @param dt_fin_os the dt_fin_os to set
     */
    public void setDt_fin_os(String dt_fin_os) {
        this.dt_fin_os = dt_fin_os;
    }

    /**
     * @return the cod_doc_os
     */
    public String getCod_doc_os() {
        return cod_doc_os;
    }

    /**
     * @param cod_doc_os the cod_doc_os to set
     */
    public void setCod_doc_os(String cod_doc_os) {
        this.cod_doc_os = cod_doc_os;
    }

    /**
     * @return the cod_item_ori
     */
    public String getCod_item_ori() {
        return cod_item_ori;
    }

    /**
     * @param cod_item_ori the cod_item_ori to set
     */
    public void setCod_item_ori(String cod_item_ori) {
        this.cod_item_ori = cod_item_ori;
    }

    /**
     * @return the qtd_ori
     */
    public String getQtd_ori() {
        return qtd_ori;
    }

    /**
     * @param qtd_ori the qtd_ori to set
     */
    public void setQtd_ori(String qtd_ori) {
        this.qtd_ori = qtd_ori;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registro215
     */
    public List<RegistroK215> getRegistroK215() {
        if (registroK215 == null) {
            registroK215 = new ArrayList<RegistroK215>();
        }
        return registroK215;
    }

}
