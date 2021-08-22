/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoC;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 *
 */
@EqualsAndHashCode
public class RegistroC595 {

    private final String reg = "C595";
    private String cod_obs;
    private String txt_compl;
    private List<RegistroC597> registroC597;

    public String getCod_obs() {
        return cod_obs;
    }

    public void setCod_obs(String cod_obs) {
        this.cod_obs = cod_obs;
    }

    public String getTxt_compl() {
        return txt_compl;
    }

    public void setTxt_compl(String txt_compl) {
        this.txt_compl = txt_compl;
    }

    /**
     * @return the registroC590
     */
    public List<RegistroC597> getRegistroC597() {
        if (registroC597 == null) {
            registroC597 = new ArrayList<RegistroC597>();
        }
        return registroC597;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
