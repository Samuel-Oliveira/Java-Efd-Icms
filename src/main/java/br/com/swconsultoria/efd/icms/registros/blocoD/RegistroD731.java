/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoD;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class RegistroD731 {

    private final String reg = "D731";
    private String vl_fcp_op;

    public String getReg() {
        return reg;
    }

    public String getVl_fcp_op() {
        return vl_fcp_op;
    }

    public void setVl_fcp_op(String vl_fcp_op) {
        this.vl_fcp_op = vl_fcp_op;
    }
}
