/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.bloco1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class Registro1310 {
	
	private final String reg = "1310";
	private String num_tanque;
	private String estq_abert;
	private String vol_entr;
	private String vol_disp;
	private String vol_saidas;
	private String estoq_escr;
	private String val_aj_perda;
	private String val_aj_ganho;
	private String fech_fisico;
	private List<Registro1920> registro1920;
	/**
	 * @return the num_tanque
	 */
	public String getNum_tanque() {
		return num_tanque;
	}
	/**
	 * @param num_tanque the num_tanque to set
	 */
	public void setNum_tanque(String num_tanque) {
		this.num_tanque = num_tanque;
	}
	/**
	 * @return the estq_abert
	 */
	public String getEstq_abert() {
		return estq_abert;
	}
	/**
	 * @param estq_abert the estq_abert to set
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
	 * @param vol_entr the vol_entr to set
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
	 * @param vol_disp the vol_disp to set
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
	 * @param vol_saidas the vol_saidas to set
	 */
	public void setVol_saidas(String vol_saidas) {
		this.vol_saidas = vol_saidas;
	}
	/**
	 * @return the estoq_escr
	 */
	public String getEstoq_escr() {
		return estoq_escr;
	}
	/**
	 * @param estoq_escr the estoq_escr to set
	 */
	public void setEstoq_escr(String estoq_escr) {
		this.estoq_escr = estoq_escr;
	}
	/**
	 * @return the val_aj_perda
	 */
	public String getVal_aj_perda() {
		return val_aj_perda;
	}
	/**
	 * @param val_aj_perda the val_aj_perda to set
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
	 * @param val_aj_ganho the val_aj_ganho to set
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
	 * @param fech_fisico the fech_fisico to set
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
	 * @return the registro1920
	 */
	public List<Registro1920> getRegistro1920() {
		if (registro1920 == null) {
			registro1920 = new ArrayList<Registro1920>();
		}
		return registro1920;
	}
	
}
