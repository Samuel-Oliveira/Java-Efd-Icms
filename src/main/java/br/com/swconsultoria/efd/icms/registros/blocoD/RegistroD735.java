/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoD;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class RegistroD735 {

    private final String reg = "D735";
    private String cod_obs;
    private String txt_compl;

    private List<RegistroD737> registroD737;

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

    public List<RegistroD737> getRegistroD737() {
        if (registroD737 == null) {
            registroD737 = new ArrayList<>();
        }
        return registroD737;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
