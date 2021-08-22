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
public class RegistroC178 {

    private final String reg = "C178";
    private String cl_enq;
    private String vl_unid;
    private String quant_pad;

    /**
     * @return the cl_enq
     */
    public String getCl_enq() {
        return cl_enq;
    }

    /**
     * @param cl_enq the cl_enq to set
     */
    public void setCl_enq(String cl_enq) {
        this.cl_enq = cl_enq;
    }

    /**
     * @return the vl_unid
     */
    public String getVl_unid() {
        return vl_unid;
    }

    /**
     * @param vl_unid the vl_unid to set
     */
    public void setVl_unid(String vl_unid) {
        this.vl_unid = vl_unid;
    }

    /**
     * @return the quant_pad
     */
    public String getQuant_pad() {
        return quant_pad;
    }

    /**
     * @param quant_pad the quant_pad to set
     */
    public void setQuant_pad(String quant_pad) {
        this.quant_pad = quant_pad;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
