/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.blocoC;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 *
 */
public class RegistroC350 {
	
private final String reg = "C350";
	private String ser;
	private String sub_ser;
	private String num_doc;
	private String dt_doc;
	private String cnpj_cpf;
	private String vl_merc;
	private String vl_doc;
	private String vl_desc;
	private String vl_pis;
	private String vl_cofins;
	private String cod_cta;
	private List<RegistroC370> registroC370;
	private List<RegistroC390> registroC390;
	
	/**
	 * @return the ser
	 */
	public String getSer() {
		return ser;
	}
	/**
	 * @param ser the ser to set
	 */
	public void setSer(String ser) {
		this.ser = ser;
	}
	/**
	 * @return the sub_ser
	 */
	public String getSub_ser() {
		return sub_ser;
	}
	/**
	 * @param sub_ser the sub_ser to set
	 */
	public void setSub_ser(String sub_ser) {
		this.sub_ser = sub_ser;
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
	 * @return the cnpj_cpf
	 */
	public String getCnpj_cpf() {
		return cnpj_cpf;
	}
	/**
	 * @param cnpj_cpf the cnpj_cpf to set
	 */
	public void setCnpj_cpf(String cnpj_cpf) {
		this.cnpj_cpf = cnpj_cpf;
	}
	/**
	 * @return the vl_merc
	 */
	public String getVl_merc() {
		return vl_merc;
	}
	/**
	 * @param vl_merc the vl_merc to set
	 */
	public void setVl_merc(String vl_merc) {
		this.vl_merc = vl_merc;
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
	 * @return the vl_desc
	 */
	public String getVl_desc() {
		return vl_desc;
	}
	/**
	 * @param vl_desc the vl_desc to set
	 */
	public void setVl_desc(String vl_desc) {
		this.vl_desc = vl_desc;
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
	 * @return the cod_cta
	 */
	public String getCod_cta() {
		return cod_cta;
	}
	/**
	 * @param cod_cta the cod_cta to set
	 */
	public void setCod_cta(String cod_cta) {
		this.cod_cta = cod_cta;
	}
	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}
	/**
	 * @return the registroC370
	 */
	public List<RegistroC370> getRegistroC370() {
		if (registroC370 == null) {
			registroC370 = new ArrayList<RegistroC370>();
        }
		return registroC370;
	}
	/**
	 * @return the registroC390
	 */
	public List<RegistroC390> getRegistroC390() {
		if (registroC390 == null) {
			registroC390 = new ArrayList<RegistroC390>();
        }
		return registroC390;
	}
	
}
