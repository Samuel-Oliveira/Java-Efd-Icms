/**
 *
 */
package br.com.samuelweb.efd.icms.registros.bloco0;

/**
 * @author Samuel Oliveira
 *
 */
public class Registro0300 {

    private final String reg = "0300";
    private String cod_ind_bem;
    private String ident_merc;
    private String descr_item;
    private String cod_prnc;
    private String cod_cta;
    private String nr_parc;
    private Registro0305 registro0305;

    /**
     * @return the cod_ind_bem
     */
    public String getCod_ind_bem() {
        return cod_ind_bem;
    }

    /**
     * @param cod_ind_bem the cod_ind_bem to set
     */
    public void setCod_ind_bem(String cod_ind_bem) {
        this.cod_ind_bem = cod_ind_bem;
    }

    /**
     * @return the ident_merc
     */
    public String getIdent_merc() {
        return ident_merc;
    }

    /**
     * @param ident_merc the ident_merc to set
     */
    public void setIdent_merc(String ident_merc) {
        this.ident_merc = ident_merc;
    }

    /**
     * @return the descr_item
     */
    public String getDescr_item() {
        return descr_item;
    }

    /**
     * @param descr_item the descr_item to set
     */
    public void setDescr_item(String descr_item) {
        this.descr_item = descr_item;
    }

    /**
     * @return the cod_prnc
     */
    public String getCod_prnc() {
        return cod_prnc;
    }

    /**
     * @param cod_prnc the cod_prnc to set
     */
    public void setCod_prnc(String cod_prnc) {
        this.cod_prnc = cod_prnc;
    }

    /**
     * @return the cod_cta
     */
    public String getCod_cta() {
        return cod_cta;
    }

    /**
     * @param cod_cta the cod_cta to set
     */
    public void setCod_cta(String cod_cta) {
        this.cod_cta = cod_cta;
    }

    /**
     * @return the nr_parc
     */
    public String getNr_parc() {
        return nr_parc;
    }

    /**
     * @param nr_parc the nr_parc to set
     */
    public void setNr_parc(String nr_parc) {
        this.nr_parc = nr_parc;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registro0305
     */
    public Registro0305 getRegistro0305() {
        return registro0305;
    }

    /**
     * @param registro0305 the registro0305 to set
     */
    public void setRegistro0305(Registro0305 registro0305) {
        this.registro0305 = registro0305;
    }
}
