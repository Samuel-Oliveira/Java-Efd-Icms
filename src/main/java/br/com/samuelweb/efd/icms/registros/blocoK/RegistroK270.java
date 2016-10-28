/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.blocoK;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroK270 {
	
private final String reg = "K270";
	private String dt_ini_ap;
	private String dt_fin_ap;
	private String cod_op_os;
	private String cod_item;
	private String qtd_cor_pos;
	private String qtd_cor_neg;
	private String origem;
	private List<RegistroK275> registroK275;
	/**
	 * @return the dt_ini_ap
	 */
	public String getDt_ini_ap() {
		return dt_ini_ap;
	}
	/**
	 * @param dt_ini_ap the dt_ini_ap to set
	 */
	public void setDt_ini_ap(String dt_ini_ap) {
		this.dt_ini_ap = dt_ini_ap;
	}
	/**
	 * @return the dt_fin_ap
	 */
	public String getDt_fin_ap() {
		return dt_fin_ap;
	}
	/**
	 * @param dt_fin_ap the dt_fin_ap to set
	 */
	public void setDt_fin_ap(String dt_fin_ap) {
		this.dt_fin_ap = dt_fin_ap;
	}
	/**
	 * @return the cod_op_os
	 */
	public String getCod_op_os() {
		return cod_op_os;
	}
	/**
	 * @param cod_op_os the cod_op_os to set
	 */
	public void setCod_op_os(String cod_op_os) {
		this.cod_op_os = cod_op_os;
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
	 * @return the qtd_cor_pos
	 */
	public String getQtd_cor_pos() {
		return qtd_cor_pos;
	}
	/**
	 * @param qtd_cor_pos the qtd_cor_pos to set
	 */
	public void setQtd_cor_pos(String qtd_cor_pos) {
		this.qtd_cor_pos = qtd_cor_pos;
	}
	/**
	 * @return the qtd_cor_neg
	 */
	public String getQtd_cor_neg() {
		return qtd_cor_neg;
	}
	/**
	 * @param qtd_cor_neg the qtd_cor_neg to set
	 */
	public void setQtd_cor_neg(String qtd_cor_neg) {
		this.qtd_cor_neg = qtd_cor_neg;
	}
	/**
	 * @return the origem
	 */
	public String getOrigem() {
		return origem;
	}
	/**
	 * @param origem the origem to set
	 */
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}
	/**
	 * @return the registroK275
	 */
	public List<RegistroK275> getRegistroK275() {
		if (registroK275 == null) {
			registroK275 = new ArrayList<RegistroK275>();
		}
		return registroK275;
	}
	
}
