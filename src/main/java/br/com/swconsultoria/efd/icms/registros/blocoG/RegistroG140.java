/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoG;

/**
 * @author Samuel Oliveira
 */
public class RegistroG140 {

    private final String reg = "G140";
    private String num_item;
    private String cod_item;
    private String qtde;
    private String unid;
    private String vl_icms_op_aplicado;
    private String vl_icms_st_aplicado;
    private String vl_icms_frt_aplicado;
    private String vl_icms_dif_aplicado;

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

    public String getQtde() {
        return qtde;
    }

    public void setQtde(String qtde) {
        this.qtde = qtde;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public String getVl_icms_op_aplicado() {
        return vl_icms_op_aplicado;
    }

    public void setVl_icms_op_aplicado(String vl_icms_op_aplicado) {
        this.vl_icms_op_aplicado = vl_icms_op_aplicado;
    }

    public String getVl_icms_st_aplicado() {
        return vl_icms_st_aplicado;
    }

    public void setVl_icms_st_aplicado(String vl_icms_st_aplicado) {
        this.vl_icms_st_aplicado = vl_icms_st_aplicado;
    }

    public String getVl_icms_frt_aplicado() {
        return vl_icms_frt_aplicado;
    }

    public void setVl_icms_frt_aplicado(String vl_icms_frt_aplicado) {
        this.vl_icms_frt_aplicado = vl_icms_frt_aplicado;
    }

    public String getVl_icms_dif_aplicado() {
        return vl_icms_dif_aplicado;
    }

    public void setVl_icms_dif_aplicado(String vl_icms_dif_aplicado) {
        this.vl_icms_dif_aplicado = vl_icms_dif_aplicado;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
