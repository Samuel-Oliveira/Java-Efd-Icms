/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.bloco1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class Registro1300 {

	private final String reg = "1300";
	private String cod_item;
	private String dt_fech;
	private String estq_abert;
	private String vol_entr;
	private String vol_disp;
	private String vol_saidas;
	private String estq_escr;
	private String val_aj_perda;
	private String val_aj_ganho;
	private String fech_fisico;
	private List<Registro1310> registro1310;

	/**
	 * @return the cod_item
	 */
	public String getCod_item() {
		return cod_item;
	}

	/**
	 * @param cod_item
	 *            the cod_item to set
	 */
	public void setCod_item(String cod_item) {
		this.cod_item = cod_item;
	}

	/**
	 * @return the dt_fech
	 */
	public String getDt_fech() {
		return dt_fech;
	}

	/**
	 * @param dt_fech
	 *            the dt_fech to set
	 */
	public void setDt_fech(String dt_fech) {
		this.dt_fech = dt_fech;
	}

	/**
	 * @return the estq_abert
	 */
	public String getEstq_abert() {
		return estq_abert;
	}

	/**
	 * @param estq_abert
	 *            the estq_abert to set
	 */
	public void setEstq_abert(String estq_abert) {
		this.estq_abert = estq_abert;
	}

	/**
	 * @return the vol_entr
	 */
	public String getVol_entr() {
		return vol_entr;
	}

	/**
	 * @param vol_entr
	 *            the vol_entr to set
	 */
	public void setVol_entr(String vol_entr) {
		this.vol_entr = vol_entr;
	}

	/**
	 * @return the vol_disp
	 */
	public String getVol_disp() {
		return vol_disp;
	}

	/**
	 * @param vol_disp
	 *            the vol_disp to set
	 */
	public void setVol_disp(String vol_disp) {
		this.vol_disp = vol_disp;
	}

	/**
	 * @return the vol_saidas
	 */
	public String getVol_saidas() {
		return vol_saidas;
	}

	/**
	 * @param vol_saidas
	 *            the vol_saidas to set
	 */
	public void setVol_saidas(String vol_saidas) {
		this.vol_saidas = vol_saidas;
	}

	/**
	 * @return the estq_escr
	 */
	public String getEstq_escr() {
		return estq_escr;
	}

	/**
	 * @param estq_escr
	 *            the estq_escr to set
	 */
	public void setEstq_escr(String estq_escr) {
		this.estq_escr = estq_escr;
	}

	/**
	 * @return the val_aj_perda
	 */
	public String getVal_aj_perda() {
		return val_aj_perda;
	}

	/**
	 * @param val_aj_perda
	 *            the val_aj_perda to set
	 */
	public void setVal_aj_perda(String val_aj_perda) {
		this.val_aj_perda = val_aj_perda;
	}

	/**
	 * @return the val_aj_ganho
	 */
	public String getVal_aj_ganho() {
		return val_aj_ganho;
	}

	/**
	 * @param val_aj_ganho
	 *            the val_aj_ganho to set
	 */
	public void setVal_aj_ganho(String val_aj_ganho) {
		this.val_aj_ganho = val_aj_ganho;
	}

	/**
	 * @return the fech_fisico
	 */
	public String getFech_fisico() {
		return fech_fisico;
	}

	/**
	 * @param fech_fisico
	 *            the fech_fisico to set
	 */
	public void setFech_fisico(String fech_fisico) {
		this.fech_fisico = fech_fisico;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registro1310
	 */
	public List<Registro1310> getRegistro1310() {
		if (registro1310 == null) {
			registro1310 = new ArrayList<Registro1310>();
		}
		return registro1310;
	}

}
