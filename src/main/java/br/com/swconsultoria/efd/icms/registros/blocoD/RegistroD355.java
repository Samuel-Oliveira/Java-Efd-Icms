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
public class RegistroD355 {

    private final String reg = "D355";
    private String dt_doc;
    private String cro;
    private String crz;
    private String num_coo_fin;
    private String gt_fin;
    private String vl_brt;
    private RegistroD360 registroD360;
    private List<RegistroD365> registroD365;
    private List<RegistroD390> registroD390;

    /**
     * @return the dt_doc
     */
    public String getDt_doc() {
        return dt_doc;
    }

    /**
     * @param dt_doc the dt_doc to set
     */
    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    /**
     * @return the cro
     */
    public String getCro() {
        return cro;
    }

    /**
     * @param cro the cro to set
     */
    public void setCro(String cro) {
        this.cro = cro;
    }

    /**
     * @return the crz
     */
    public String getCrz() {
        return crz;
    }

    /**
     * @param crz the crz to set
     */
    public void setCrz(String crz) {
        this.crz = crz;
    }

    /**
     * @return the num_coo_fin
     */
    public String getNum_coo_fin() {
        return num_coo_fin;
    }

    /**
     * @param num_coo_fin the num_coo_fin to set
     */
    public void setNum_coo_fin(String num_coo_fin) {
        this.num_coo_fin = num_coo_fin;
    }

    /**
     * @return the gt_fin
     */
    public String getGt_fin() {
        return gt_fin;
    }

    /**
     * @param gt_fin the gt_fin to set
     */
    public void setGt_fin(String gt_fin) {
        this.gt_fin = gt_fin;
    }

    /**
     * @return the vl_brt
     */
    public String getVl_brt() {
        return vl_brt;
    }

    /**
     * @param vl_brt the vl_brt to set
     */
    public void setVl_brt(String vl_brt) {
        this.vl_brt = vl_brt;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroD360
     */
    public RegistroD360 getRegistroD360() {
        return registroD360;
    }

    /**
     * @param registroD360 the registroD360 to set
     */
    public void setRegistroD360(RegistroD360 registroD360) {
        this.registroD360 = registroD360;
    }

    /**
     * @return the registroD365
     */
    public List<RegistroD365> getRegistroD365() {
        if (registroD365 == null) {
            registroD365 = new ArrayList<RegistroD365>();
        }
        return registroD365;
    }

    /**
     * @return the registroD390
     */
    public List<RegistroD390> getRegistroD390() {
        if (registroD390 == null) {
            registroD390 = new ArrayList<RegistroD390>();
        }
        return registroD390;
    }

}
