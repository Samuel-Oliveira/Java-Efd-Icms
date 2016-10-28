/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.blocoE;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroE220 {
	
private final String reg = "E220";
	private String cod_aj_apur;
	private String descr_compl_aj;
	private String vl_aj_apur;
	private List<RegistroE230> registroE230;
	private List<RegistroE240> registroE240;
	
	/**
	 * @return the cod_aj_apur
	 */
	public String getCod_aj_apur() {
		return cod_aj_apur;
	}
	/**
	 * @param cod_aj_apur the cod_aj_apur to set
	 */
	public void setCod_aj_apur(String cod_aj_apur) {
		this.cod_aj_apur = cod_aj_apur;
	}
	/**
	 * @return the descr_compl_aj
	 */
	public String getDescr_compl_aj() {
		return descr_compl_aj;
	}
	/**
	 * @param descr_compl_aj the descr_compl_aj to set
	 */
	public void setDescr_compl_aj(String descr_compl_aj) {
		this.descr_compl_aj = descr_compl_aj;
	}
	/**
	 * @return the vl_aj_apur
	 */
	public String getVl_aj_apur() {
		return vl_aj_apur;
	}
	/**
	 * @param vl_aj_apur the vl_aj_apur to set
	 */
	public void setVl_aj_apur(String vl_aj_apur) {
		this.vl_aj_apur = vl_aj_apur;
	}
	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}
	/**
	 * @return the registroE230
	 */
	public List<RegistroE230> getRegistroE230() {
		if (registroE230 == null) {
			registroE230 = new ArrayList<RegistroE230>();
		}
		return registroE230;
	}
	/**
	 * @return the registroE240
	 */
	public List<RegistroE240> getRegistroE240() {
		if (registroE240 == null) {
			registroE240 = new ArrayList<RegistroE240>();
		}
		return registroE240;
	}
	
}
