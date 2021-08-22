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
public class RegistroC591 {

    private final String reg = "C591";
    private String vl_fcp_op;
    private String vl_fcp_st;

    public String getVl_fcp_op() {
        return vl_fcp_op;
    }

    public void setVl_fcp_op(String vl_fcp_op) {
        this.vl_fcp_op = vl_fcp_op;
    }

    public String getVl_fcp_st() {
        return vl_fcp_st;
    }

    public void setVl_fcp_st(String vl_fcp_st) {
        this.vl_fcp_st = vl_fcp_st;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
