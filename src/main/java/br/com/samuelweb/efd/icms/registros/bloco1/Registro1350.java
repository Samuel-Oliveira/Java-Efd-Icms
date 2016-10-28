/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.bloco1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class Registro1350 {
	
	private final String reg = "1350";
	private String serie;
	private String fabricante;
	private String modelo;
	private String tipo_medicao;
	private List<Registro1360> registro1360;
	private List<Registro1370> registro1370;
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
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}
	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the tipo_medicao
	 */
	public String getTipo_medicao() {
		return tipo_medicao;
	}
	/**
	 * @param tipo_medicao the tipo_medicao to set
	 */
	public void setTipo_medicao(String tipo_medicao) {
		this.tipo_medicao = tipo_medicao;
	}
	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}
	/**
	 * @return the registro1360
	 */
	public List<Registro1360> getRegistro1360() {
		if (registro1360 == null) {
			registro1360 = new ArrayList<Registro1360>();
		}
		return registro1360;
	}
	/**
	 * @return the registro1370
	 */
	public List<Registro1370> getRegistro1370() {
		if (registro1370 == null) {
			registro1370 = new ArrayList<Registro1370>();
		}
		return registro1370;
	}
	
}
