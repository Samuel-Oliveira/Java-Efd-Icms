/**
 *
 */
package br.com.samuelweb.efd.icms.registros.bloco1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class Registro1921 {

    private final String reg = "1921";
    private String cod_aj_apur;
    private String descr_compl_aj;
    private String vl_aj_apur;
    private List<Registro1922> registro1922;
    private List<Registro1923> registro1923;

    /**
     * @return the cod_aj_apur
     */
    public String getCod_aj_apur() {
        return cod_aj_apur;
    }

    /**
     * @param cod_aj_apur the cod_aj_apur to set
     */
    public void setCod_aj_apur(String cod_aj_apur) {
        this.cod_aj_apur = cod_aj_apur;
    }

    /**
     * @return the descr_compl_aj
     */
    public String getDescr_compl_aj() {
        return descr_compl_aj;
    }

    /**
     * @param descr_compl_aj the descr_compl_aj to set
     */
    public void setDescr_compl_aj(String descr_compl_aj) {
        this.descr_compl_aj = descr_compl_aj;
    }

    /**
     * @return the vl_aj_apur
     */
    public String getVl_aj_apur() {
        return vl_aj_apur;
    }

    /**
     * @param vl_aj_apur the vl_aj_apur to set
     */
    public void setVl_aj_apur(String vl_aj_apur) {
        this.vl_aj_apur = vl_aj_apur;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registro1922
     */
    public List<Registro1922> getRegistro1922() {
        if (registro1922 == null) {
            registro1922 = new ArrayList<Registro1922>();
        }
        return registro1922;
    }

    /**
     * @return the registro1923
     */
    public List<Registro1923> getRegistro1923() {
        if (registro1923 == null) {
            registro1923 = new ArrayList<Registro1923>();
        }
        return registro1923;
    }

}
