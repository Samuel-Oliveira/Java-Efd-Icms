/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.blocoG;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroG130 {

	private final String reg = "G130";
	private String ind_emit;
	private String cod_part;
	private String cod_mod;
	private String serie;
	private String num_doc;
	private String chv_nfe_cte;
	private String dt_doc;
	private List<RegistroG140> registroG140;

	/**
	 * @return the ind_emit
	 */
	public String getInd_emit() {
		return ind_emit;
	}

	/**
	 * @param ind_emit
	 *            the ind_emit to set
	 */
	public void setInd_emit(String ind_emit) {
		this.ind_emit = ind_emit;
	}

	/**
	 * @return the cod_part
	 */
	public String getCod_part() {
		return cod_part;
	}

	/**
	 * @param cod_part
	 *            the cod_part to set
	 */
	public void setCod_part(String cod_part) {
		this.cod_part = cod_part;
	}

	/**
	 * @return the cod_mod
	 */
	public String getCod_mod() {
		return cod_mod;
	}

	/**
	 * @param cod_mod
	 *            the cod_mod to set
	 */
	public void setCod_mod(String cod_mod) {
		this.cod_mod = cod_mod;
	}

	/**
	 * @return the serie
	 */
	public String getSerie() {
		return serie;
	}

	/**
	 * @param serie
	 *            the serie to set
	 */
	public void setSerie(String serie) {
		this.serie = serie;
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
	 * @return the chv_nfe_cte
	 */
	public String getChv_nfe_cte() {
		return chv_nfe_cte;
	}

	/**
	 * @param chv_nfe_cte
	 *            the chv_nfe_cte to set
	 */
	public void setChv_nfe_cte(String chv_nfe_cte) {
		this.chv_nfe_cte = chv_nfe_cte;
	}

	/**
	 * @return the dt_doc
	 */
	public String getDt_doc() {
		return dt_doc;
	}

	/**
	 * @param dt_doc
	 *            the dt_doc to set
	 */
	public void setDt_doc(String dt_doc) {
		this.dt_doc = dt_doc;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroG140
	 */
	public List<RegistroG140> getRegistroG140() {
		if (registroG140 == null) {
			registroG140 = new ArrayList<RegistroG140>();
		}
		return registroG140;
	}

}
