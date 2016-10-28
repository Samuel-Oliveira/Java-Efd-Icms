/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.blocoE;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroE500 {
	
private final String reg = "E500";
	private String ind_apur;
	private String dt_ini;
	private String dt_fin;
	private RegistroE520 registroE520;
	private List<RegistroE510> registroE510;
	
	/**
	 * @return the ind_apur
	 */
	public String getInd_apur() {
		return ind_apur;
	}
	/**
	 * @param ind_apur the ind_apur to set
	 */
	public void setInd_apur(String ind_apur) {
		this.ind_apur = ind_apur;
	}
	/**
	 * @return the dt_ini
	 */
	public String getDt_ini() {
		return dt_ini;
	}
	/**
	 * @param dt_ini the dt_ini to set
	 */
	public void setDt_ini(String dt_ini) {
		this.dt_ini = dt_ini;
	}
	/**
	 * @return the dt_fin
	 */
	public String getDt_fin() {
		return dt_fin;
	}
	/**
	 * @param dt_fin the dt_fin to set
	 */
	public void setDt_fin(String dt_fin) {
		this.dt_fin = dt_fin;
	}
	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}
	/**
	 * @return the registroE520
	 */
	public RegistroE520 getRegistroE520() {
		return registroE520;
	}
	/**
	 * @param registroE520 the registroE520 to set
	 */
	public void setRegistroE520(RegistroE520 registroE520) {
		this.registroE520 = registroE520;
	}
	/**
	 * @return the registroE510
	 */
	public List<RegistroE510> getRegistroE510() {
		if (registroE510 == null) {
			registroE510 = new ArrayList<RegistroE510>();
		}
		return registroE510;
	}
	
}
