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
public class RegistroC140 {

	private final String reg = "C140";
	private String ind_emit;
	private String ind_tit;
	private String desc_tit;
	private String num_tit;
	private String qtd_parc;
	private String vl_tit;
	private List<RegistroC141> registroC141;

	/**
	 * @return the ind_emit
	 */
	public String getInd_emit() {
		return ind_emit;
	}

	/**
	 * @param ind_emit
	 *            the ind_emit to set
	 */
	public void setInd_emit(String ind_emit) {
		this.ind_emit = ind_emit;
	}

	/**
	 * @return the ind_tit
	 */
	public String getInd_tit() {
		return ind_tit;
	}

	/**
	 * @param ind_tit
	 *            the ind_tit to set
	 */
	public void setInd_tit(String ind_tit) {
		this.ind_tit = ind_tit;
	}

	/**
	 * @return the desc_tit
	 */
	public String getDesc_tit() {
		return desc_tit;
	}

	/**
	 * @param desc_tit
	 *            the desc_tit to set
	 */
	public void setDesc_tit(String desc_tit) {
		this.desc_tit = desc_tit;
	}

	/**
	 * @return the num_tit
	 */
	public String getNum_tit() {
		return num_tit;
	}

	/**
	 * @param num_tit
	 *            the num_tit to set
	 */
	public void setNum_tit(String num_tit) {
		this.num_tit = num_tit;
	}

	/**
	 * @return the qtd_parc
	 */
	public String getQtd_parc() {
		return qtd_parc;
	}

	/**
	 * @param qtd_parc
	 *            the qtd_parc to set
	 */
	public void setQtd_parc(String qtd_parc) {
		this.qtd_parc = qtd_parc;
	}

	/**
	 * @return the vl_tit
	 */
	public String getVl_tit() {
		return vl_tit;
	}

	/**
	 * @param vl_tit
	 *            the vl_tit to set
	 */
	public void setVl_tit(String vl_tit) {
		this.vl_tit = vl_tit;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroC141
	 */
	public List<RegistroC141> getRegistroC141() {
		if (registroC141 == null) {
			registroC141 = new ArrayList<RegistroC141>();
		}
		return registroC141;
	}

}
