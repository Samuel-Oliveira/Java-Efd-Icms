/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.blocoK;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroK300 {

	private final String reg = "K300";
	private String dt_prod;
	private List<RegistroK301> registroK301;
	private List<RegistroK302> registroK302;

	public String getDt_prod() {
		return dt_prod;
	}

	public void setDt_prod(String dt_prod) {
		this.dt_prod = dt_prod;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroK301
	 */
	public List<RegistroK301> getRegistroK301() {
		if (registroK301 == null) {
			registroK301 = new ArrayList<RegistroK301>();
		}
		return registroK301;
	}

	/**
	 * @return the registroK302
	 */
	public List<RegistroK302> getRegistroK302() {
		if (registroK302 == null) {
			registroK302 = new ArrayList<RegistroK302>();
		}
		return registroK302;
	}


}
