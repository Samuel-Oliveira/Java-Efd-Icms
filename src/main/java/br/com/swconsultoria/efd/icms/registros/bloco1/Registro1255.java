/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.bloco1;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class Registro1255 {

    private final String reg = "1255";
    private String cod_mot_rest_compl;
    private String vl_credito_icms_op_mot;
    private String vl_icms_st_rest_mot;
    private String vl_fcp_st_rest_mot;
    private String vl_icms_st_compl_mot;
    private String vl_fcp_st_compl_mot;

    public String getCod_mot_rest_compl() {
        return cod_mot_rest_compl;
    }

    public void setCod_mot_rest_compl(String cod_mot_rest_compl) {
        this.cod_mot_rest_compl = cod_mot_rest_compl;
    }

    public String getVl_credito_icms_op_mot() {
        return vl_credito_icms_op_mot;
    }

    public void setVl_credito_icms_op_mot(String vl_credito_icms_op_mot) {
        this.vl_credito_icms_op_mot = vl_credito_icms_op_mot;
    }

    public String getVl_icms_st_rest_mot() {
        return vl_icms_st_rest_mot;
    }

    public void setVl_icms_st_rest_mot(String vl_icms_st_rest_mot) {
        this.vl_icms_st_rest_mot = vl_icms_st_rest_mot;
    }

    public String getVl_fcp_st_rest_mot() {
        return vl_fcp_st_rest_mot;
    }

    public void setVl_fcp_st_rest_mot(String vl_fcp_st_rest_mot) {
        this.vl_fcp_st_rest_mot = vl_fcp_st_rest_mot;
    }

    public String getVl_icms_st_compl_mot() {
        return vl_icms_st_compl_mot;
    }

    public void setVl_icms_st_compl_mot(String vl_icms_st_compl_mot) {
        this.vl_icms_st_compl_mot = vl_icms_st_compl_mot;
    }

    public String getVl_fcp_st_compl_mot() {
        return vl_fcp_st_compl_mot;
    }

    public void setVl_fcp_st_compl_mot(String vl_fcp_st_compl_mot) {
        this.vl_fcp_st_compl_mot = vl_fcp_st_compl_mot;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
