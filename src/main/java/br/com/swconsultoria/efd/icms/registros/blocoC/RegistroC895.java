/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoC;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroC895 {

    private final String reg = "C895";
    private String cod_obs;
    private String txt_compl;
    private List<RegistroC897> registroC897;

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
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    public List<RegistroC897> getRegistroC897() {
        if (registroC897 == null) {
            registroC897 = new ArrayList<>();
        }
        return this.registroC897;
    }

}
