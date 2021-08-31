/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoC;

/**
 * @author Samuel Oliveira
 *
 */
public class RegistroC197 {

    private final String reg = "C197";
    private String cod_aj;
    private String descr_compl_aj;
    private String cod_item;
    private String vl_bc_icms;
    private String aliq_icms;
    private String vl_icms;
    private String vl_outros;

    /**
     * @return the cod_aj
     */
    public String getCod_aj() {
        return cod_aj;
    }

    /**
     * @param cod_aj the cod_aj to set
     */
    public void setCod_aj(String cod_aj) {
        this.cod_aj = cod_aj;
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
     * @return the cod_item
     */
    public String getCod_item() {
        return cod_item;
    }

    /**
     * @param cod_item the cod_item to set
     */
    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    /**
     * @return the vl_bc_icms
     */
    public String getVl_bc_icms() {
        return vl_bc_icms;
    }

    /**
     * @param vl_bc_icms the vl_bc_icms to set
     */
    public void setVl_bc_icms(String vl_bc_icms) {
        this.vl_bc_icms = vl_bc_icms;
    }

    /**
     * @return the aliq_icms
     */
    public String getAliq_icms() {
        return aliq_icms;
    }

    /**
     * @param aliq_icms the aliq_icms to set
     */
    public void setAliq_icms(String aliq_icms) {
        this.aliq_icms = aliq_icms;
    }

    /**
     * @return the vl_icms
     */
    public String getVl_icms() {
        return vl_icms;
    }

    /**
     * @param vl_icms the vl_icms to set
     */
    public void setVl_icms(String vl_icms) {
        this.vl_icms = vl_icms;
    }

    /**
     * @return the vl_outros
     */
    public String getVl_outros() {
        return vl_outros;
    }

    /**
     * @param vl_outros the vl_outros to set
     */
    public void setVl_outros(String vl_outros) {
        this.vl_outros = vl_outros;
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
        if (!(o instanceof RegistroC197)) return false;

        RegistroC197 that = (RegistroC197) o;

        if (getCod_aj() != null ? !getCod_aj().equals(that.getCod_aj()) : that.getCod_aj() != null) return false;
        if (getCod_item() != null ? !getCod_item().equals(that.getCod_item()) : that.getCod_item() != null) return false;
        return getAliq_icms() != null ? getAliq_icms().equals(that.getAliq_icms()) : that.getAliq_icms() == null;
    }

    @Override
    public int hashCode() {
        int result = getCod_aj() != null ? getCod_aj().hashCode() : 0;
        result = 31 * result + (getCod_item() != null ? getCod_item().hashCode() : 0);
        result = 31 * result + (getAliq_icms() != null ? getAliq_icms().hashCode() : 0);
        return result;
    }
}
