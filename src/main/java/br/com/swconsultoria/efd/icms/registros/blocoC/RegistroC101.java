/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoC;

/**
 * @author Samuel Oliveira
 *
 */
public class RegistroC101 {

    private final String reg = "C101";
    private String vl_fcp_uf_dest;
    private String vl_icms_uf_dest;
    private String vl_icms_uf_rem;

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the vl_fcp_uf_dest
     */
    public String getVl_fcp_uf_dest() {
        return vl_fcp_uf_dest;
    }

    /**
     * @param vl_fcp_uf_dest the vl_fcp_uf_dest to set
     */
    public void setVl_fcp_uf_dest(String vl_fcp_uf_dest) {
        this.vl_fcp_uf_dest = vl_fcp_uf_dest;
    }

    /**
     * @return the vl_icms_uf_dest
     */
    public String getVl_icms_uf_dest() {
        return vl_icms_uf_dest;
    }

    /**
     * @param vl_icms_uf_dest the vl_icms_uf_dest to set
     */
    public void setVl_icms_uf_dest(String vl_icms_uf_dest) {
        this.vl_icms_uf_dest = vl_icms_uf_dest;
    }

    /**
     * @return the vl_icms_uf_rem
     */
    public String getVl_icms_uf_rem() {
        return vl_icms_uf_rem;
    }

    /**
     * @param vl_icms_uf_rem the vl_icms_uf_rem to set
     */
    public void setVl_icms_uf_rem(String vl_icms_uf_rem) {
        this.vl_icms_uf_rem = vl_icms_uf_rem;
    }

}
