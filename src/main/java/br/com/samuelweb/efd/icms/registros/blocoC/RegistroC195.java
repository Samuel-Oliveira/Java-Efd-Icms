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
public class RegistroC195 {

	private final String reg = "C195";
	private String cod_obs;
	private String txt_compl;
	private List<RegistroC197> registroC197;

	/**
	 * @return the cod_obs
	 */
	public String getCod_obs() {
		return cod_obs;
	}

	/**
	 * @param cod_obs
	 *            the cod_obs to set
	 */
	public void setCod_obs(String cod_obs) {
		this.cod_obs = cod_obs;
	}

	/**
	 * @return the txt_compl
	 */
	public String getTxt_compl() {
		return txt_compl;
	}

	/**
	 * @param txt_compl
	 *            the txt_compl to set
	 */
	public void setTxt_compl(String txt_compl) {
		this.txt_compl = txt_compl;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroC197
	 */
	public List<RegistroC197> getRegistroC197() {
		if (registroC197 == null) {
			registroC197 = new ArrayList<RegistroC197>();
		}
		return registroC197;
	}

}
