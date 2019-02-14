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
public class RegistroC460 {

    private final String reg = "C460";
    private String cod_mod;
    private String cod_sit;
    private String num_doc;
    private String dt_doc;
    private String vl_doc;
    private String vl_pis;
    private String vl_cofins;
    private String cpf_cnpj;
    private String nom_adq;
    private RegistroC465 registroC465;
    private List<RegistroC470> registroC470;

    /**
     * @return the cod_mod
     */
    public String getCod_mod() {
        return cod_mod;
    }

    /**
     * @param cod_mod the cod_mod to set
     */
    public void setCod_mod(String cod_mod) {
        this.cod_mod = cod_mod;
    }

    /**
     * @return the cod_sit
     */
    public String getCod_sit() {
        return cod_sit;
    }

    /**
     * @param cod_sit the cod_sit to set
     */
    public void setCod_sit(String cod_sit) {
        this.cod_sit = cod_sit;
    }

    /**
     * @return the num_doc
     */
    public String getNum_doc() {
        return num_doc;
    }

    /**
     * @param num_doc the num_doc to set
     */
    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

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
     * @return the vl_doc
     */
    public String getVl_doc() {
        return vl_doc;
    }

    /**
     * @param vl_doc the vl_doc to set
     */
    public void setVl_doc(String vl_doc) {
        this.vl_doc = vl_doc;
    }

    /**
     * @return the vl_pis
     */
    public String getVl_pis() {
        return vl_pis;
    }

    /**
     * @param vl_pis the vl_pis to set
     */
    public void setVl_pis(String vl_pis) {
        this.vl_pis = vl_pis;
    }

    /**
     * @return the vl_cofins
     */
    public String getVl_cofins() {
        return vl_cofins;
    }

    /**
     * @param vl_cofins the vl_cofins to set
     */
    public void setVl_cofins(String vl_cofins) {
        this.vl_cofins = vl_cofins;
    }

    /**
     * @return the cpf_cnpj
     */
    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    /**
     * @param cpf_cnpj the cpf_cnpj to set
     */
    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    /**
     * @return the nom_adq
     */
    public String getNom_adq() {
        return nom_adq;
    }

    /**
     * @param nom_adq the nom_adq to set
     */
    public void setNom_adq(String nom_adq) {
        this.nom_adq = nom_adq;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroC465
     */
    public RegistroC465 getRegistroC465() {
        return registroC465;
    }

    /**
     * @param registroC465 the registroC465 to set
     */
    public void setRegistroC465(RegistroC465 registroC465) {
        this.registroC465 = registroC465;
    }

    /**
     * @return the registroC470
     */
    public List<RegistroC470> getRegistroC470() {
        if (registroC470 == null) {
            registroC470 = new ArrayList<RegistroC470>();
        }
        return registroC470;
    }

}
