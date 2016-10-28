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
public class RegistroC300 {
	
private final String reg = "C300";
	private String cod_mod;
	private String ser;
	private String sub;
	private String num_doc_ini;
	private String num_doc_fin;
	private String dt_doc;
	private String vl_doc;
	private String vl_pis;
	private String vl_cofins;
	private String cod_cta;
	private List<RegistroC310> registroC310;
	private List<RegistroC320> registroC320;
	
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
	 * @return the sub
	 */
	public String getSub() {
		return sub;
	}
	/**
	 * @param sub the sub to set
	 */
	public void setSub(String sub) {
		this.sub = sub;
	}
	/**
	 * @return the num_doc_ini
	 */
	public String getNum_doc_ini() {
		return num_doc_ini;
	}
	/**
	 * @param num_doc_ini the num_doc_ini to set
	 */
	public void setNum_doc_ini(String num_doc_ini) {
		this.num_doc_ini = num_doc_ini;
	}
	/**
	 * @return the num_doc_fin
	 */
	public String getNum_doc_fin() {
		return num_doc_fin;
	}
	/**
	 * @param num_doc_fin the num_doc_fin to set
	 */
	public void setNum_doc_fin(String num_doc_fin) {
		this.num_doc_fin = num_doc_fin;
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
	 * @return the registroC310
	 */
	public List<RegistroC310> getRegistroC310() {
		if (registroC310 == null) {
			registroC310 = new ArrayList<RegistroC310>();
        }
		return registroC310;
	}
	/**
	 * @return the registroC320
	 */
	public List<RegistroC320> getRegistroC320() {
		if (registroC320 == null) {
			registroC320 = new ArrayList<RegistroC320>();
        }
		return registroC320;
	}
	
}
