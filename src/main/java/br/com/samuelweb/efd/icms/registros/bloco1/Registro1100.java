/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.bloco1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class Registro1100 {

	private final String reg = "1100";
	private String ind_doc;
	private String nro_de;
	private String dt_de;
	private String nat_exp;
	private String nro_re;
	private String dt_re;
	private String chc_emb;
	private String dt_chc;
	private String dt_avb;
	private String tp_chc;
	private String pais;
	private List<Registro1105> registro1105;

	/**
	 * @return the ind_doc
	 */
	public String getInd_doc() {
		return ind_doc;
	}

	/**
	 * @param ind_doc
	 *            the ind_doc to set
	 */
	public void setInd_doc(String ind_doc) {
		this.ind_doc = ind_doc;
	}

	/**
	 * @return the nro_de
	 */
	public String getNro_de() {
		return nro_de;
	}

	/**
	 * @param nro_de
	 *            the nro_de to set
	 */
	public void setNro_de(String nro_de) {
		this.nro_de = nro_de;
	}

	/**
	 * @return the dt_de
	 */
	public String getDt_de() {
		return dt_de;
	}

	/**
	 * @param dt_de
	 *            the dt_de to set
	 */
	public void setDt_de(String dt_de) {
		this.dt_de = dt_de;
	}

	/**
	 * @return the nat_exp
	 */
	public String getNat_exp() {
		return nat_exp;
	}

	/**
	 * @param nat_exp
	 *            the nat_exp to set
	 */
	public void setNat_exp(String nat_exp) {
		this.nat_exp = nat_exp;
	}

	/**
	 * @return the nro_re
	 */
	public String getNro_re() {
		return nro_re;
	}

	/**
	 * @param nro_re
	 *            the nro_re to set
	 */
	public void setNro_re(String nro_re) {
		this.nro_re = nro_re;
	}

	/**
	 * @return the dt_re
	 */
	public String getDt_re() {
		return dt_re;
	}

	/**
	 * @param dt_re
	 *            the dt_re to set
	 */
	public void setDt_re(String dt_re) {
		this.dt_re = dt_re;
	}

	/**
	 * @return the chc_emb
	 */
	public String getChc_emb() {
		return chc_emb;
	}

	/**
	 * @param chc_emb
	 *            the chc_emb to set
	 */
	public void setChc_emb(String chc_emb) {
		this.chc_emb = chc_emb;
	}

	/**
	 * @return the dt_chc
	 */
	public String getDt_chc() {
		return dt_chc;
	}

	/**
	 * @param dt_chc
	 *            the dt_chc to set
	 */
	public void setDt_chc(String dt_chc) {
		this.dt_chc = dt_chc;
	}

	/**
	 * @return the dt_avb
	 */
	public String getDt_avb() {
		return dt_avb;
	}

	/**
	 * @param dt_avb
	 *            the dt_avb to set
	 */
	public void setDt_avb(String dt_avb) {
		this.dt_avb = dt_avb;
	}

	/**
	 * @return the tp_chc
	 */
	public String getTp_chc() {
		return tp_chc;
	}

	/**
	 * @param tp_chc
	 *            the tp_chc to set
	 */
	public void setTp_chc(String tp_chc) {
		this.tp_chc = tp_chc;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais
	 *            the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registro1105
	 */
	public List<Registro1105> getRegistro1105() {
		if (registro1105 == null) {
			registro1105 = new ArrayList<Registro1105>();
		}
		return registro1105;
	}

}
