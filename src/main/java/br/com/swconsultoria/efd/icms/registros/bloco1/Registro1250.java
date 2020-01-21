/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.bloco1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class Registro1250 {

    private final String reg = "1250";
    private String vl_credito_icms_op;
    private String vl_icms_st_rest;
    private String vl_fcp_st_rest;
    private String vl_icms_st_compl;
    private String vl_fcp_st_compl;
    private List<Registro1255> registro1255;

    public String getVl_credito_icms_op() {
        return vl_credito_icms_op;
    }

    public void setVl_credito_icms_op(String vl_credito_icms_op) {
        this.vl_credito_icms_op = vl_credito_icms_op;
    }

    public String getVl_icms_st_rest() {
        return vl_icms_st_rest;
    }

    public void setVl_icms_st_rest(String vl_icms_st_rest) {
        this.vl_icms_st_rest = vl_icms_st_rest;
    }

    public String getVl_fcp_st_rest() {
        return vl_fcp_st_rest;
    }

    public void setVl_fcp_st_rest(String vl_fcp_st_rest) {
        this.vl_fcp_st_rest = vl_fcp_st_rest;
    }

    public String getVl_icms_st_compl() {
        return vl_icms_st_compl;
    }

    public void setVl_icms_st_compl(String vl_icms_st_compl) {
        this.vl_icms_st_compl = vl_icms_st_compl;
    }

    public String getVl_fcp_st_compl() {
        return vl_fcp_st_compl;
    }

    public void setVl_fcp_st_compl(String vl_fcp_st_compl) {
        this.vl_fcp_st_compl = vl_fcp_st_compl;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registro1255
     */
    public List<Registro1255> getRegistro1255() {
        if (registro1255 == null) {
            registro1255 = new ArrayList<Registro1255>();
        }
        return registro1255;
    }

}
