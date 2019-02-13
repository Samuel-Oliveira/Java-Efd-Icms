/**
 *
 */
package br.com.samuelweb.efd.icms.registros.bloco1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class Registro1700 {

    private final String reg = "1700";
    private String cod_disp;
    private String cod_mod;
    private String ser;
    private String sub;
    private String num_doc_ini;
    private String num_doc_fin;
    private String num_aut;
    private List<Registro1710> registro1710;

    /**
     * @return the cod_disp
     */
    public String getCod_disp() {
        return cod_disp;
    }

    /**
     * @param cod_disp the cod_disp to set
     */
    public void setCod_disp(String cod_disp) {
        this.cod_disp = cod_disp;
    }

    /**
     * @return the cod_mod
     */
    public String getCod_mod() {
        return cod_mod;
    }

    /**
     * @param cod_mod the cod_mod to set
     */
    public void setCod_mod(String cod_mod) {
        this.cod_mod = cod_mod;
    }

    /**
     * @return the ser
     */
    public String getSer() {
        return ser;
    }

    /**
     * @param ser the ser to set
     */
    public void setSer(String ser) {
        this.ser = ser;
    }

    /**
     * @return the sub
     */
    public String getSub() {
        return sub;
    }

    /**
     * @param sub the sub to set
     */
    public void setSub(String sub) {
        this.sub = sub;
    }

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
     * @return the num_aut
     */
    public String getNum_aut() {
        return num_aut;
    }

    /**
     * @param num_aut the num_aut to set
     */
    public void setNum_aut(String num_aut) {
        this.num_aut = num_aut;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registro1710
     */
    public List<Registro1710> getRegistro1710() {
        if (registro1710 == null) {
            registro1710 = new ArrayList<Registro1710>();
        }
        return registro1710;
    }

}
