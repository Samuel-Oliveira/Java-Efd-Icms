/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoC;

import lombok.EqualsAndHashCode;

/**
 * @author Sidnei Klein
 *
 */
@EqualsAndHashCode
public class RegistroC191 {

    private final String reg = "C191";
    private String vl_fcp_op;
    private String vl_fcp_st;
    private String vl_fcp_ret;

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the vl_fcp_op
     */
    public String getVl_fcp_op() {
        return vl_fcp_op;
    }

    /**
     * @param vl_fcp_op the vl_fcp_op to set
     */
    public void setVl_fcp_op(String vl_fcp_op) {
        this.vl_fcp_op = vl_fcp_op;
    }

    /**
     * @return the vl_fcp_st
     */
    public String getVl_fcp_st() {
        return vl_fcp_st;
    }

    /**
     * @param vl_fcp_st the vl_fcp_st to set
     */
    public void setVl_fcp_st(String vl_fcp_st) {
        this.vl_fcp_st = vl_fcp_st;
    }

    /**
     * @return the vl_fcp_ret
     */
    public String getVl_fcp_ret() {
        return vl_fcp_ret;
    }

    /**
     * @param vl_fcp_ret the vl_fcp_ret to set
     */
    public void setVl_fcp_ret(String vl_fcp_ret) {
        this.vl_fcp_ret = vl_fcp_ret;
    }

}
