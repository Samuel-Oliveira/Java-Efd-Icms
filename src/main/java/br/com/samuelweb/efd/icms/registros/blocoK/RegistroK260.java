/**
 *
 */
package br.com.samuelweb.efd.icms.registros.blocoK;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroK260 {

    private final String reg = "K260";
    private String cod_op_os;
    private String cod_item;
    private String dt_saida;
    private String qtd_saida;
    private String dt_ret;
    private String qtd_ret;
    private List<RegistroK265> registroK265;

    /**
     * @return the cod_op_os
     */
    public String getCod_op_os() {
        return cod_op_os;
    }

    /**
     * @param cod_op_os the cod_op_os to set
     */
    public void setCod_op_os(String cod_op_os) {
        this.cod_op_os = cod_op_os;
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
     * @return the dt_saida
     */
    public String getDt_saida() {
        return dt_saida;
    }

    /**
     * @param dt_saida the dt_saida to set
     */
    public void setDt_saida(String dt_saida) {
        this.dt_saida = dt_saida;
    }

    /**
     * @return the qtd_saida
     */
    public String getQtd_saida() {
        return qtd_saida;
    }

    /**
     * @param qtd_saida the qtd_saida to set
     */
    public void setQtd_saida(String qtd_saida) {
        this.qtd_saida = qtd_saida;
    }

    /**
     * @return the dt_ret
     */
    public String getDt_ret() {
        return dt_ret;
    }

    /**
     * @param dt_ret the dt_ret to set
     */
    public void setDt_ret(String dt_ret) {
        this.dt_ret = dt_ret;
    }

    /**
     * @return the qtd_ret
     */
    public String getQtd_ret() {
        return qtd_ret;
    }

    /**
     * @param qtd_ret the qtd_ret to set
     */
    public void setQtd_ret(String qtd_ret) {
        this.qtd_ret = qtd_ret;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroK265
     */
    public List<RegistroK265> getRegistroK265() {
        if (registroK265 == null) {
            registroK265 = new ArrayList<RegistroK265>();
        }
        return registroK265;
    }

}
