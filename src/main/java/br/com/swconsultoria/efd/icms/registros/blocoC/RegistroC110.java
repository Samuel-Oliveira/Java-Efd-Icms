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
public class RegistroC110 {

    private final String reg = "C110";
    private String cod_inf;
    private String txt_compl;
    private List<RegistroC111> registroC111;
    private List<RegistroC112> registroC112;
    private List<RegistroC113> registroC113;
    private List<RegistroC114> registroC114;
    private List<RegistroC115> registroC115;
    private List<RegistroC116> registroC116;

    /**
     * @return the cod_inf
     */
    public String getCod_inf() {
        return cod_inf;
    }

    /**
     * @param cod_inf the cod_inf to set
     */
    public void setCod_inf(String cod_inf) {
        this.cod_inf = cod_inf;
    }

    /**
     * @return the txt_compl
     */
    public String getTxt_compl() {
        return txt_compl;
    }

    /**
     * @param txt_compl the txt_compl to set
     */
    public void setTxt_compl(String txt_compl) {
        this.txt_compl = txt_compl;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroC111
     */
    public List<RegistroC111> getRegistroC111() {
        if (registroC111 == null) {
            registroC111 = new ArrayList<RegistroC111>();
        }
        return registroC111;
    }

    /**
     * @return the registroC112
     */
    public List<RegistroC112> getRegistroC112() {
        if (registroC112 == null) {
            registroC112 = new ArrayList<RegistroC112>();
        }
        return registroC112;
    }

    /**
     * @return the registroC113
     */
    public List<RegistroC113> getRegistroC113() {
        if (registroC113 == null) {
            registroC113 = new ArrayList<RegistroC113>();
        }
        return registroC113;
    }

    /**
     * @return the registroC114
     */
    public List<RegistroC114> getRegistroC114() {
        if (registroC114 == null) {
            registroC114 = new ArrayList<RegistroC114>();
        }
        return registroC114;
    }

    /**
     * @return the registroC115
     */
    public List<RegistroC115> getRegistroC115() {
        if (registroC115 == null) {
            registroC115 = new ArrayList<RegistroC115>();
        }
        return registroC115;
    }

    /**
     * @return the registroC116
     */
    public List<RegistroC116> getRegistroC116() {
        if (registroC116 == null) {
            registroC116 = new ArrayList<RegistroC116>();
        }
        return registroC116;
    }

}
