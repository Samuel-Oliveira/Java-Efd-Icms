/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.bloco1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class Registro1105 {
	
	private final String reg = "1105";
	private String cod_mod;
	private String serie;
	private String num_doc;
	private String chv_nfe;
	private String dt_doc;
	private String cod_item;
	private List<Registro1110> registro1110;
	/**
	 * @return the cod_mod
	 */
	public String getCod_mod() {
		return cod_mod;
	}
	/**
	 * @param cod_mod the cod_mod to set
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
	 * @param serie the serie to set
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
	 * @param num_doc the num_doc to set
	 */
	public void setNum_doc(String num_doc) {
		this.num_doc = num_doc;
	}
	/**
	 * @return the chv_nfe
	 */
	public String getChv_nfe() {
		return chv_nfe;
	}
	/**
	 * @param chv_nfe the chv_nfe to set
	 */
	public void setChv_nfe(String chv_nfe) {
		this.chv_nfe = chv_nfe;
	}
	/**
	 * @return the dt_doc
	 */
	public String getDt_doc() {
		return dt_doc;
	}
	/**
	 * @param dt_doc the dt_doc to set
	 */
	public void setDt_doc(String dt_doc) {
		this.dt_doc = dt_doc;
	}
	/**
	 * @return the cod_item
	 */
	public String getCod_item() {
		return cod_item;
	}
	/**
	 * @param cod_item the cod_item to set
	 */
	public void setCod_item(String cod_item) {
		this.cod_item = cod_item;
	}
	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}
	/**
	 * @return the registro1110
	 */
	public List<Registro1110> getRegistro1110() {
		if (registro1110 == null) {
			registro1110 = new ArrayList<Registro1110>();
		}
		return registro1110;
	}
	
}
