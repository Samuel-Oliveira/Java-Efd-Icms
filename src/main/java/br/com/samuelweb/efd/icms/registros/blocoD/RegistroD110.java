/**
 *
 */
package br.com.samuelweb.efd.icms.registros.blocoD;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroD110 {

    private final String reg = "D110";
    private String num_item;
    private String cod_item;
    private String vl_serv;
    private String vl_out;
    private List<RegistroD120> registroD120;

    /**
     * @return the num_item
     */
    public String getNum_item() {
        return num_item;
    }

    /**
     * @param num_item the num_item to set
     */
    public void setNum_item(String num_item) {
        this.num_item = num_item;
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
     * @return the vl_serv
     */
    public String getVl_serv() {
        return vl_serv;
    }

    /**
     * @param vl_serv the vl_serv to set
     */
    public void setVl_serv(String vl_serv) {
        this.vl_serv = vl_serv;
    }

    /**
     * @return the vl_out
     */
    public String getVl_out() {
        return vl_out;
    }

    /**
     * @param vl_out the vl_out to set
     */
    public void setVl_out(String vl_out) {
        this.vl_out = vl_out;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroD120
     */
    public List<RegistroD120> getRegistroD120() {
        if (registroD120 == null) {
            registroD120 = new ArrayList<RegistroD120>();
        }
        return registroD120;
    }

}
