/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoD;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroD160 {

    private final String reg = "D160";
    private String despacho;
    private String cnpj_cpf_rem;
    private String ie_rem;
    private String cod_mun_ori;
    private String cnpj_cpf_dest;
    private String ie_dest;
    private String cod_mun_dest;
    private RegistroD161 registroD161;
    private List<RegistroD162> registroD162;

    /**
     * @return the despacho
     */
    public String getDespacho() {
        return despacho;
    }

    /**
     * @param despacho the despacho to set
     */
    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    /**
     * @return the cnpj_cpf_rem
     */
    public String getCnpj_cpf_rem() {
        return cnpj_cpf_rem;
    }

    /**
     * @param cnpj_cpf_rem the cnpj_cpf_rem to set
     */
    public void setCnpj_cpf_rem(String cnpj_cpf_rem) {
        this.cnpj_cpf_rem = cnpj_cpf_rem;
    }

    /**
     * @return the ie_rem
     */
    public String getIe_rem() {
        return ie_rem;
    }

    /**
     * @param ie_rem the ie_rem to set
     */
    public void setIe_rem(String ie_rem) {
        this.ie_rem = ie_rem;
    }

    /**
     * @return the cod_mun_ori
     */
    public String getCod_mun_ori() {
        return cod_mun_ori;
    }

    /**
     * @param cod_mun_ori the cod_mun_ori to set
     */
    public void setCod_mun_ori(String cod_mun_ori) {
        this.cod_mun_ori = cod_mun_ori;
    }

    /**
     * @return the cnpj_cpf_dest
     */
    public String getCnpj_cpf_dest() {
        return cnpj_cpf_dest;
    }

    /**
     * @param cnpj_cpf_dest the cnpj_cpf_dest to set
     */
    public void setCnpj_cpf_dest(String cnpj_cpf_dest) {
        this.cnpj_cpf_dest = cnpj_cpf_dest;
    }

    /**
     * @return the ie_dest
     */
    public String getIe_dest() {
        return ie_dest;
    }

    /**
     * @param ie_dest the ie_dest to set
     */
    public void setIe_dest(String ie_dest) {
        this.ie_dest = ie_dest;
    }

    /**
     * @return the cod_mun_dest
     */
    public String getCod_mun_dest() {
        return cod_mun_dest;
    }

    /**
     * @param cod_mun_dest the cod_mun_dest to set
     */
    public void setCod_mun_dest(String cod_mun_dest) {
        this.cod_mun_dest = cod_mun_dest;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroD161
     */
    public RegistroD161 getRegistroD161() {
        return registroD161;
    }

    /**
     * @param registroD161 the registroD161 to set
     */
    public void setRegistroD161(RegistroD161 registroD161) {
        this.registroD161 = registroD161;
    }

    /**
     * @return the registroD162
     */
    public List<RegistroD162> getRegistroD162() {
        if (registroD162 == null) {
            registroD162 = new ArrayList<RegistroD162>();
        }
        return registroD162;
    }

}
