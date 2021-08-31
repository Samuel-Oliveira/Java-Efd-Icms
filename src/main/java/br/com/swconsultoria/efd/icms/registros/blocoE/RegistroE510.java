/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoE;

/**
 * @author Samuel Oliveira
 */
public class RegistroE510 {

    private final String reg = "E510";
    private String cfop;
    private String cst_ipi;
    private String vl_cont_ipi;
    private String vl_bc_ipi;
    private String vl_ipi;

    /**
     * @return the cfop
     */
    public String getCfop() {
        return cfop;
    }

    /**
     * @param cfop the cfop to set
     */
    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    /**
     * @return the cst_ipi
     */
    public String getCst_ipi() {
        return cst_ipi;
    }

    /**
     * @param cst_ipi the cst_ipi to set
     */
    public void setCst_ipi(String cst_ipi) {
        this.cst_ipi = cst_ipi;
    }

    /**
     * @return the vl_cont_ipi
     */
    public String getVl_cont_ipi() {
        return vl_cont_ipi;
    }

    /**
     * @param vl_cont_ipi the vl_cont_ipi to set
     */
    public void setVl_cont_ipi(String vl_cont_ipi) {
        this.vl_cont_ipi = vl_cont_ipi;
    }

    /**
     * @return the vl_bc_ipi
     */
    public String getVl_bc_ipi() {
        return vl_bc_ipi;
    }

    /**
     * @param vl_bc_ipi the vl_bc_ipi to set
     */
    public void setVl_bc_ipi(String vl_bc_ipi) {
        this.vl_bc_ipi = vl_bc_ipi;
    }

    /**
     * @return the vl_ipi
     */
    public String getVl_ipi() {
        return vl_ipi;
    }

    /**
     * @param vl_ipi the vl_ipi to set
     */
    public void setVl_ipi(String vl_ipi) {
        this.vl_ipi = vl_ipi;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegistroE510)) return false;

        RegistroE510 that = (RegistroE510) o;

        if (getCfop() != null ? !getCfop().equals(that.getCfop()) : that.getCfop() != null) return false;
        return getCst_ipi() != null ? getCst_ipi().equals(that.getCst_ipi()) : that.getCst_ipi() == null;
    }

    @Override
    public int hashCode() {
        int result = getCfop() != null ? getCfop().hashCode() : 0;
        result = 31 * result + (getCst_ipi() != null ? getCst_ipi().hashCode() : 0);
        return result;
    }
}
