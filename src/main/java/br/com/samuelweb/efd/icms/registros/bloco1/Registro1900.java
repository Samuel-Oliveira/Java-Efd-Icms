/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.bloco1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class Registro1900 {

	private final String reg = "1900";
	private String ind_apur_icms;
	private String descr_compl_out_apur;
	private List<Registro1910> registro1910;

	/**
	 * @return the ind_apur_icms
	 */
	public String getInd_apur_icms() {
		return ind_apur_icms;
	}

	/**
	 * @param ind_apur_icms
	 *            the ind_apur_icms to set
	 */
	public void setInd_apur_icms(String ind_apur_icms) {
		this.ind_apur_icms = ind_apur_icms;
	}

	/**
	 * @return the descr_compl_out_apur
	 */
	public String getDescr_compl_out_apur() {
		return descr_compl_out_apur;
	}

	/**
	 * @param descr_compl_out_apur
	 *            the descr_compl_out_apur to set
	 */
	public void setDescr_compl_out_apur(String descr_compl_out_apur) {
		this.descr_compl_out_apur = descr_compl_out_apur;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registro1910
	 */
	public List<Registro1910> getRegistro1910() {
		if (registro1910 == null) {
			registro1910 = new ArrayList<Registro1910>();
		}
		return registro1910;
	}

}
