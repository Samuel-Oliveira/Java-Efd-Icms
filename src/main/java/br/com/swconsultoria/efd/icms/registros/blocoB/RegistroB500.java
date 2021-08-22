/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoB;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sidnei Klein
 */
@EqualsAndHashCode
public class RegistroB500 {

    private final String reg = "B500";
    private String vl_rec;
    private String qtde_prof;
    private String vl_or;

    private List<RegistroB510> registroB510;

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the vl_rec
     */
    public String getVl_rec() {
        return vl_rec;
    }

    /**
     * @param vl_rec the vl_rec to set
     */
    public void setVl_rec(String vl_rec) {
        this.vl_rec = vl_rec;
    }

    /**
     * @return the qtde_prof
     */
    public String getQtde_prof() {
        return qtde_prof;
    }

    /**
     * @param qtde_prof the qtde_prof to set
     */
    public void setQtde_prof(String qtde_prof) {
        this.qtde_prof = qtde_prof;
    }

    /**
     * @return the vl_or
     */
    public String getVl_or() {
        return vl_or;
    }

    /**
     * @param vl_or the vl_or to set
     */
    public void setVl_or(String vl_or) {
        this.vl_or = vl_or;
    }

    /**
     * @return the registroB510
     */
    public List<RegistroB510> getRegistroB510() {
        return registroB510;
    }

    /**
     * @param registroB510 the registroB510 to set
     */
    public void setRegistroB510(List<RegistroB510> registroB510) {
        if (registroB510 == null) {
            registroB510 = new ArrayList<>();
        }
        this.registroB510 = registroB510;
    }

}
