/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoC;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 *
 */
public class RegistroC405 {

    private final String reg = "C405";
    private String dt_doc;
    private String cro;
    private String crz;
    private String num_coo_fin;
    private String gt_fin;
    private String vl_brt;
    private RegistroC410 registroC410;
    private List<RegistroC420> registroC420;
    private List<RegistroC460> registroC460;
    private List<RegistroC490> registroC490;

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
     * @return the registroC410
     */
    public RegistroC410 getRegistroC410() {
        return registroC410;
    }

    /**
     * @param registroC410 the registroC410 to set
     */
    public void setRegistroC410(RegistroC410 registroC410) {
        this.registroC410 = registroC410;
    }

    /**
     * @return the registroC490
     */
    public List<RegistroC490> getRegistroC490() {
        if (registroC490 == null) {
            registroC490 = new ArrayList<RegistroC490>();
        }
        return registroC490;
    }

    /**
     * @return the registroC460
     */
    public List<RegistroC460> getRegistroC460() {
        if (registroC460 == null) {
            registroC460 = new ArrayList<RegistroC460>();
        }
        return registroC460;
    }

    /**
     * @return the registroC420
     */
    public List<RegistroC420> getRegistroC420() {
        if (registroC420 == null) {
            registroC420 = new ArrayList<RegistroC420>();
        }
        return registroC420;
    }

}
