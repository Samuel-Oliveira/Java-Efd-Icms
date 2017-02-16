/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.blocoG;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 *
 */
public class BlocoG {

	private RegistroG001 registroG001;
	private List<RegistroG110> registroG110;
	private RegistroG990 registroG990;

	/**
	 * @return the registroG001
	 */
	public RegistroG001 getRegistroG001() {
		return registroG001;
	}

	/**
	 * @param registroG001
	 *            the registroG001 to set
	 */
	public void setRegistroG001(RegistroG001 registroG001) {
		this.registroG001 = registroG001;
	}

	/**
	 * @return the registroG990
	 */
	public RegistroG990 getRegistroG990() {
		return registroG990;
	}

	/**
	 * @param registroG990
	 *            the registroG990 to set
	 */
	public void setRegistroG990(RegistroG990 registroG990) {
		this.registroG990 = registroG990;
	}

	/**
	 * @return the registroG110
	 */
	public List<RegistroG110> getRegistroG110() {
		if (registroG110 == null) {
			registroG110 = new ArrayList<RegistroG110>();
		}
		return registroG110;
	}

}
