/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.blocoK;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira / Yuri
 *
 */
public class BlocoK {
	
	private RegistroK001 registroK001;
	private List<RegistroK100> registroK100;
	private RegistroK990 registroK990;
	/**
	 * @return the registroK001
	 */
	public RegistroK001 getRegistroK001() {
		return registroK001;
	}
	/**
	 * @param registroK001 the registroK001 to set
	 */
	public void setRegistroK001(RegistroK001 registroK001) {
		this.registroK001 = registroK001;
	}
	/**
	 * @return the registroK990
	 */
	public RegistroK990 getRegistroK990() {
		return registroK990;
	}
	/**
	 * @param registroK990 the registroK990 to set
	 */
	public void setRegistroK990(RegistroK990 registroK990) {
		this.registroK990 = registroK990;
	}
	/**
	 * @return the registroK100
	 */
	public List<RegistroK100> getRegistroK100() {
		if (registroK100 == null) {
			registroK100 = new ArrayList<RegistroK100>();
		}
		return registroK100;
	}
}
