/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoC;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class RegistroC855 {

    private final String reg = "C855";
    private String cod_obs;
    private String txt_compl;

    private List<RegistroC857> registroC857;

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

    public List<RegistroC857> getRegistroC857() {
        if (registroC857 == null) {
            registroC857 = new ArrayList<>();
        }
        return registroC857;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
