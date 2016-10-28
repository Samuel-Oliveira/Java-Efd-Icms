/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.blocoC;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroC700 {
	
private final String reg = "C700";
	private String cod_mod;
	private String ser;
	private String nro_ord_ini;
	private String nro_ord_fin;
	private String dt_doc_ini;
	private String dt_doc_fin;
	private String nom_mest;
	private String chv_cod_dig;
	private List<RegistroC790> registroC790;
	
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
	 * @return the nro_ord_ini
	 */
	public String getNro_ord_ini() {
		return nro_ord_ini;
	}
	/**
	 * @param nro_ord_ini the nro_ord_ini to set
	 */
	public void setNro_ord_ini(String nro_ord_ini) {
		this.nro_ord_ini = nro_ord_ini;
	}
	/**
	 * @return the nro_ord_fin
	 */
	public String getNro_ord_fin() {
		return nro_ord_fin;
	}
	/**
	 * @param nro_ord_fin the nro_ord_fin to set
	 */
	public void setNro_ord_fin(String nro_ord_fin) {
		this.nro_ord_fin = nro_ord_fin;
	}
	/**
	 * @return the dt_doc_ini
	 */
	public String getDt_doc_ini() {
		return dt_doc_ini;
	}
	/**
	 * @param dt_doc_ini the dt_doc_ini to set
	 */
	public void setDt_doc_ini(String dt_doc_ini) {
		this.dt_doc_ini = dt_doc_ini;
	}
	/**
	 * @return the dt_doc_fin
	 */
	public String getDt_doc_fin() {
		return dt_doc_fin;
	}
	/**
	 * @param dt_doc_fin the dt_doc_fin to set
	 */
	public void setDt_doc_fin(String dt_doc_fin) {
		this.dt_doc_fin = dt_doc_fin;
	}
	/**
	 * @return the nom_mest
	 */
	public String getNom_mest() {
		return nom_mest;
	}
	/**
	 * @param nom_mest the nom_mest to set
	 */
	public void setNom_mest(String nom_mest) {
		this.nom_mest = nom_mest;
	}
	/**
	 * @return the chv_cod_dig
	 */
	public String getChv_cod_dig() {
		return chv_cod_dig;
	}
	/**
	 * @param chv_cod_dig the chv_cod_dig to set
	 */
	public void setChv_cod_dig(String chv_cod_dig) {
		this.chv_cod_dig = chv_cod_dig;
	}
	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}
	/**
	 * @return the registroC790
	 */
	public List<RegistroC790> getRegistroC790() {
		if (registroC790 == null) {
			registroC790 = new ArrayList<RegistroC790>();
        }
		return registroC790;
	}
	
}
