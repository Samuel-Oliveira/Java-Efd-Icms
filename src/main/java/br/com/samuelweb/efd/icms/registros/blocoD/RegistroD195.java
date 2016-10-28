/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.blocoD;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroD195 {
	
private final String reg = "D195";
	private String cod_obs;
	private String txt_compl;
	private List<RegistroD197> registroD197;
	
	/**
	 * @return the cod_obs
	 */
	public String getCod_obs() {
		return cod_obs;
	}
	/**
	 * @param cod_obs the cod_obs to set
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
	 * @param txt_compl the txt_compl to set
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
	 * @return the registroD197
	 */
	public List<RegistroD197> getRegistroD197() {
		if (registroD197 == null) {
			registroD197 = new ArrayList<RegistroD197>();
		}
		return registroD197;
	}
	
}
