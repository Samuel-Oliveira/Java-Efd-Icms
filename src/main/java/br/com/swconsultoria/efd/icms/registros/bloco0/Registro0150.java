/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.bloco0;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 *
 */
public class Registro0150 {

    private final String reg = "0150";
    private String cod_part;
    private String nome;
    private String cod_pais;
    private String cnpj;
    private String cpf;
    private String ie;
    private String cod_mun;
    private String suframa;
    private String end;
    private String num;
    private String compl;
    private String bairro;
    private List<Registro0175> registro0175;

    /**
     * @return the cod_part
     */
    public String getCod_part() {
        return cod_part;
    }

    /**
     * @param cod_part the cod_part to set
     */
    public void setCod_part(String cod_part) {
        this.cod_part = cod_part;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cod_pais
     */
    public String getCod_pais() {
        return cod_pais;
    }

    /**
     * @param cod_pais the cod_pais to set
     */
    public void setCod_pais(String cod_pais) {
        this.cod_pais = cod_pais;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the ie
     */
    public String getIe() {
        return ie;
    }

    /**
     * @param ie the ie to set
     */
    public void setIe(String ie) {
        this.ie = ie;
    }

    /**
     * @return the cod_mun
     */
    public String getCod_mun() {
        return cod_mun;
    }

    /**
     * @param cod_mun the cod_mun to set
     */
    public void setCod_mun(String cod_mun) {
        this.cod_mun = cod_mun;
    }

    /**
     * @return the suframa
     */
    public String getSuframa() {
        return suframa;
    }

    /**
     * @param suframa the suframa to set
     */
    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    /**
     * @return the end
     */
    public String getEnd() {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * @return the num
     */
    public String getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(String num) {
        this.num = num;
    }

    /**
     * @return the compl
     */
    public String getCompl() {
        return compl;
    }

    /**
     * @param compl the compl to set
     */
    public void setCompl(String compl) {
        this.compl = compl;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registro0175
     */
    public List<Registro0175> getRegistro0175() {
        if (registro0175 == null) {
            registro0175 = new ArrayList<Registro0175>();
        }
        return this.registro0175;
    }
}
