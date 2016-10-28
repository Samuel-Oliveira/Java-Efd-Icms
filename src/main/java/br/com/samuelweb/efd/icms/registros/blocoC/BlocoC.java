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
public class BlocoC {
	
	private RegistroC001 registroC001;
	private List<RegistroC100> registroC100;
	private List<RegistroC300> registroC300;
	private List<RegistroC350> registroC350;
	private List<RegistroC400> registroC400;
	private List<RegistroC495> registroC495;
	private List<RegistroC500> registroC500;
	private List<RegistroC600> registroC600;
	private List<RegistroC700> registroC700;
	private List<RegistroC800> registroC800;
	private List<RegistroC860> registroC860;
	private RegistroC990 registroC990;
	/**
	 * @return the registroC001
	 */
	public RegistroC001 getRegistroC001() {
		return registroC001;
	}
	/**
	 * @param registroC001 the registroC001 to set
	 */
	public void setRegistroC001(RegistroC001 registroC001) {
		this.registroC001 = registroC001;
	}
	/**
	 * @return the registroC990
	 */
	public RegistroC990 getRegistroC990() {
		return registroC990;
	}
	/**
	 * @param registroC990 the registroC990 to set
	 */
	public void setRegistroC990(RegistroC990 registroC990) {
		this.registroC990 = registroC990;
	}
	/**
	 * @return the registroC100
	 */
	public List<RegistroC100> getRegistroC100() {
		if (registroC100 == null) {
			registroC100 = new ArrayList<RegistroC100>();
        }
		return registroC100;
	}
	/**
	 * @return the registroC300
	 */
	public List<RegistroC300> getRegistroC300() {
		if (registroC300 == null) {
			registroC300 = new ArrayList<RegistroC300>();
        }
		return registroC300;
	}
	/**
	 * @return the registroC350
	 */
	public List<RegistroC350> getRegistroC350() {
		if (registroC350 == null) {
			registroC350 = new ArrayList<RegistroC350>();
        }
		return registroC350;
	}
	/**
	 * @return the registroC400
	 */
	public List<RegistroC400> getRegistroC400() {
		if (registroC400 == null) {
			registroC400 = new ArrayList<RegistroC400>();
        }
		return registroC400;
	}
	/**
	 * @return the registroC495
	 */
	public List<RegistroC495> getRegistroC495() {
		if (registroC495 == null) {
			registroC495 = new ArrayList<RegistroC495>();
        }
		return registroC495;
	}
	/**
	 * @return the registroC500
	 */
	public List<RegistroC500> getRegistroC500() {
		if (registroC500 == null) {
			registroC500 = new ArrayList<RegistroC500>();
        }
		return registroC500;
	}
	/**
	 * @return the registroC600
	 */
	public List<RegistroC600> getRegistroC600() {
		if (registroC600 == null) {
			registroC600 = new ArrayList<RegistroC600>();
        }
		return registroC600;
	}
	/**
	 * @return the registroC700
	 */
	public List<RegistroC700> getRegistroC700() {
		if (registroC700 == null) {
			registroC700 = new ArrayList<RegistroC700>();
        }
		return registroC700;
	}
	/**
	 * @return the registroC800
	 */
	public List<RegistroC800> getRegistroC800() {
		if (registroC800 == null) {
			registroC800 = new ArrayList<RegistroC800>();
        }
		return registroC800;
	}
	/**
	 * @return the registroC860
	 */
	public List<RegistroC860> getRegistroC860() {
		if (registroC860 == null) {
			registroC860 = new ArrayList<RegistroC860>();
        }
		return registroC860;
	}

}
