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
public class RegistroC180 {

    private final String reg = "C180";
    private String cod_resp_ret;
    private String quant_conv;
    private String unid;
    private String vl_unit_conv;
    private String vl_unit_icms_op_conv;
    private String vl_unit_bc_icms_st_conv;
    private String vl_unit_icms_st_conv;
    private String vl_unit_fcp_st_conv;
    private String cod_da;
    private String num_da;

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    public String getCod_resp_ret() {
        return cod_resp_ret;
    }

    public void setCod_resp_ret(String cod_resp_ret) {
        this.cod_resp_ret = cod_resp_ret;
    }

    public String getQuant_conv() {
        return quant_conv;
    }

    public void setQuant_conv(String quant_conv) {
        this.quant_conv = quant_conv;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public String getVl_unit_conv() {
        return vl_unit_conv;
    }

    public void setVl_unit_conv(String vl_unit_conv) {
        this.vl_unit_conv = vl_unit_conv;
    }

    public String getVl_unit_icms_op_conv() {
        return vl_unit_icms_op_conv;
    }

    public void setVl_unit_icms_op_conv(String vl_unit_icms_op_conv) {
        this.vl_unit_icms_op_conv = vl_unit_icms_op_conv;
    }

    public String getVl_unit_bc_icms_st_conv() {
        return vl_unit_bc_icms_st_conv;
    }

    public void setVl_unit_bc_icms_st_conv(String vl_unit_bc_icms_st_conv) {
        this.vl_unit_bc_icms_st_conv = vl_unit_bc_icms_st_conv;
    }

    public String getVl_unit_icms_st_conv() {
        return vl_unit_icms_st_conv;
    }

    public void setVl_unit_icms_st_conv(String vl_unit_icms_st_conv) {
        this.vl_unit_icms_st_conv = vl_unit_icms_st_conv;
    }

    public String getVl_unit_fcp_st_conv() {
        return vl_unit_fcp_st_conv;
    }

    public void setVl_unit_fcp_st_conv(String vl_unit_fcp_st_conv) {
        this.vl_unit_fcp_st_conv = vl_unit_fcp_st_conv;
    }

    public String getCod_da() {
        return cod_da;
    }

    public void setCod_da(String cod_da) {
        this.cod_da = cod_da;
    }

    public String getNum_da() {
        return num_da;
    }

    public void setNum_da(String num_da) {
        this.num_da = num_da;
    }
}
