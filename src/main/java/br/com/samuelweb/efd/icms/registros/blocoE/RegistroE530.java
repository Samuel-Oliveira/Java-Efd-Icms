/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.blocoE;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroE530 {

	private final String reg = "E530";
	private String ind_aj;
	private String vl_aj;
	private String cod_aj;
	private String ind_doc;
	private String num_doc;
	private String descr_aj;
	private List<RegistroE531> registroE531;

	/**
	 * @return the ind_aj
	 */
	public String getInd_aj() {
		return ind_aj;
	}

	/**
	 * @param ind_aj
	 *            the ind_aj to set
	 */
	public void setInd_aj(String ind_aj) {
		this.ind_aj = ind_aj;
	}

	/**
	 * @return the vl_aj
	 */
	public String getVl_aj() {
		return vl_aj;
	}

	/**
	 * @param vl_aj
	 *            the vl_aj to set
	 */
	public void setVl_aj(String vl_aj) {
		this.vl_aj = vl_aj;
	}

	/**
	 * @return the cod_aj
	 */
	public String getCod_aj() {
		return cod_aj;
	}

	/**
	 * @param cod_aj
	 *            the cod_aj to set
	 */
	public void setCod_aj(String cod_aj) {
		this.cod_aj = cod_aj;
	}

	/**
	 * @return the ind_doc
	 */
	public String getInd_doc() {
		return ind_doc;
	}

	/**
	 * @param ind_doc
	 *            the ind_doc to set
	 */
	public void setInd_doc(String ind_doc) {
		this.ind_doc = ind_doc;
	}

	/**
	 * @return the num_doc
	 */
	public String getNum_doc() {
		return num_doc;
	}

	/**
	 * @param num_doc
	 *            the num_doc to set
	 */
	public void setNum_doc(String num_doc) {
		this.num_doc = num_doc;
	}

	/**
	 * @return the descr_aj
	 */
	public String getDescr_aj() {
		return descr_aj;
	}

	/**
	 * @param descr_aj
	 *            the descr_aj to set
	 */
	public void setDescr_aj(String descr_aj) {
		this.descr_aj = descr_aj;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroE531
	 */
	public List<RegistroE531> getRegistroE531() {
		if (registroE531 == null) {
			registroE531 = new ArrayList<RegistroE531>();
		}
		return registroE531;
	}


}
