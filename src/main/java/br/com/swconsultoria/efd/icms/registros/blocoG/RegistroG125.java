/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoG;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class RegistroG125 {

    private final String reg = "G125";
    private String cod_ind_bem;
    private String dt_mov;
    private String tipo_mov;
    private String vl_imob_icms_op;
    private String vl_imob_icms_st;
    private String vl_imob_icms_frt;
    private String vl_imob_icms_dif;
    private String num_parc;
    private String vl_parc_pass;
    private List<RegistroG126> registroG126;
    private List<RegistroG130> registroG130;

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
     * @return the dt_mov
     */
    public String getDt_mov() {
        return dt_mov;
    }

    /**
     * @param dt_mov the dt_mov to set
     */
    public void setDt_mov(String dt_mov) {
        this.dt_mov = dt_mov;
    }

    /**
     * @return the tipo_mov
     */
    public String getTipo_mov() {
        return tipo_mov;
    }

    /**
     * @param tipo_mov the tipo_mov to set
     */
    public void setTipo_mov(String tipo_mov) {
        this.tipo_mov = tipo_mov;
    }

    /**
     * @return the vl_imob_icms_op
     */
    public String getVl_imob_icms_op() {
        return vl_imob_icms_op;
    }

    /**
     * @param vl_imob_icms_op the vl_imob_icms_op to set
     */
    public void setVl_imob_icms_op(String vl_imob_icms_op) {
        this.vl_imob_icms_op = vl_imob_icms_op;
    }

    /**
     * @return the vl_imob_icms_st
     */
    public String getVl_imob_icms_st() {
        return vl_imob_icms_st;
    }

    /**
     * @param vl_imob_icms_st the vl_imob_icms_st to set
     */
    public void setVl_imob_icms_st(String vl_imob_icms_st) {
        this.vl_imob_icms_st = vl_imob_icms_st;
    }

    /**
     * @return the vl_imob_icms_frt
     */
    public String getVl_imob_icms_frt() {
        return vl_imob_icms_frt;
    }

    /**
     * @param vl_imob_icms_frt the vl_imob_icms_frt to set
     */
    public void setVl_imob_icms_frt(String vl_imob_icms_frt) {
        this.vl_imob_icms_frt = vl_imob_icms_frt;
    }

    /**
     * @return the vl_imob_icms_dif
     */
    public String getVl_imob_icms_dif() {
        return vl_imob_icms_dif;
    }

    /**
     * @param vl_imob_icms_dif the vl_imob_icms_dif to set
     */
    public void setVl_imob_icms_dif(String vl_imob_icms_dif) {
        this.vl_imob_icms_dif = vl_imob_icms_dif;
    }

    /**
     * @return the num_parc
     */
    public String getNum_parc() {
        return num_parc;
    }

    /**
     * @param num_parc the num_parc to set
     */
    public void setNum_parc(String num_parc) {
        this.num_parc = num_parc;
    }

    /**
     * @return the vl_parc_pass
     */
    public String getVl_parc_pass() {
        return vl_parc_pass;
    }

    /**
     * @param vl_parc_pass the vl_parc_pass to set
     */
    public void setVl_parc_pass(String vl_parc_pass) {
        this.vl_parc_pass = vl_parc_pass;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroG126
     */
    public List<RegistroG126> getRegistroG126() {
        if (registroG126 == null) {
            registroG126 = new ArrayList<RegistroG126>();
        }
        return registroG126;
    }

    /**
     * @return the registroG130
     */
    public List<RegistroG130> getRegistroG130() {
        if (registroG130 == null) {
            registroG130 = new ArrayList<RegistroG130>();
        }
        return registroG130;
    }

}
