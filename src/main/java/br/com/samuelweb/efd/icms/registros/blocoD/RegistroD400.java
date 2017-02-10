/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.blocoD;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira / Yuri Lemes
 */
public class RegistroD400 {

	private final String reg = "D400";
	private String cod_part;
	private String cod_mod;
	private String cod_sit;
	private String ser;
	private String sub;
	private String num_doc;
	private String dt_doc;
	private String vl_doc;
	private String vl_desc;
	private String vl_serv;
	private String vl_bc_icms;
	private String vl_icms;
	private String vl_pis;
	private String vl_cofins;
	private String cod_cta;
	private List<RegistroD410> registroD410;
	private List<RegistroD420> registroD420;

	/**
	 * @return the cod_part
	 */
	public String getCod_part() {
		return cod_part;
	}

	/**
	 * @param cod_part
	 *            the cod_part to set
	 */
	public void setCod_part(String cod_part) {
		this.cod_part = cod_part;
	}

	/**
	 * @return the cod_mod
	 */
	public String getCod_mod() {
		return cod_mod;
	}

	/**
	 * @param cod_mod
	 *            the cod_mod to set
	 */
	public void setCod_mod(String cod_mod) {
		this.cod_mod = cod_mod;
	}

	/**
	 * @return the cod_sit
	 */
	public String getCod_sit() {
		return cod_sit;
	}

	/**
	 * @param cod_sit
	 *            the cod_sit to set
	 */
	public void setCod_sit(String cod_sit) {
		this.cod_sit = cod_sit;
	}

	/**
	 * @return the ser
	 */
	public String getSer() {
		return ser;
	}

	/**
	 * @param ser
	 *            the ser to set
	 */
	public void setSer(String ser) {
		this.ser = ser;
	}

	/**
	 * @return the sub
	 */
	public String getSub() {
		return sub;
	}

	/**
	 * @param sub
	 *            the sub to set
	 */
	public void setSub(String sub) {
		this.sub = sub;
	}

	/**
	 * @return the num_doc
	 */
	public String getNum_doc() {
		return num_doc;
	}

	/**
	 * @param num_doc
	 *            the num_doc to set
	 */
	public void setNum_doc(String num_doc) {
		this.num_doc = num_doc;
	}

	/**
	 * @return the dt_doc
	 */
	public String getDt_doc() {
		return dt_doc;
	}

	/**
	 * @param dt_doc
	 *            the dt_doc to set
	 */
	public void setDt_doc(String dt_doc) {
		this.dt_doc = dt_doc;
	}

	/**
	 * @return the vl_doc
	 */
	public String getVl_doc() {
		return vl_doc;
	}

	/**
	 * @param vl_doc
	 *            the vl_doc to set
	 */
	public void setVl_doc(String vl_doc) {
		this.vl_doc = vl_doc;
	}

	/**
	 * @return the vl_desc
	 */
	public String getVl_desc() {
		return vl_desc;
	}

	/**
	 * @param vl_desc
	 *            the vl_desc to set
	 */
	public void setVl_desc(String vl_desc) {
		this.vl_desc = vl_desc;
	}

	/**
	 * @return the vl_serv
	 */
	public String getVl_serv() {
		return vl_serv;
	}

	/**
	 * @param vl_serv
	 *            the vl_serv to set
	 */
	public void setVl_serv(String vl_serv) {
		this.vl_serv = vl_serv;
	}

	/**
	 * @return the vl_bc_icms
	 */
	public String getVl_bc_icms() {
		return vl_bc_icms;
	}

	/**
	 * @param vl_bc_icms
	 *            the vl_bc_icms to set
	 */
	public void setVl_bc_icms(String vl_bc_icms) {
		this.vl_bc_icms = vl_bc_icms;
	}

	/**
	 * @return the vl_icms
	 */
	public String getVl_icms() {
		return vl_icms;
	}

	/**
	 * @param vl_icms
	 *            the vl_icms to set
	 */
	public void setVl_icms(String vl_icms) {
		this.vl_icms = vl_icms;
	}

	/**
	 * @return the vl_pis
	 */
	public String getVl_pis() {
		return vl_pis;
	}

	/**
	 * @param vl_pis
	 *            the vl_pis to set
	 */
	public void setVl_pis(String vl_pis) {
		this.vl_pis = vl_pis;
	}

	/**
	 * @return the vl_cofins
	 */
	public String getVl_cofins() {
		return vl_cofins;
	}

	/**
	 * @param vl_cofins
	 *            the vl_cofins to set
	 */
	public void setVl_cofins(String vl_cofins) {
		this.vl_cofins = vl_cofins;
	}

	/**
	 * @return the cod_cta
	 */
	public String getCod_cta() {
		return cod_cta;
	}

	/**
	 * @param cod_cta
	 *            the cod_cta to set
	 */
	public void setCod_cta(String cod_cta) {
		this.cod_cta = cod_cta;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroD410
	 */
	public List<RegistroD410> getRegistroD410() {
		if (registroD410 == null) {
			registroD410 = new ArrayList<RegistroD410>();
		}
		return registroD410;
	}

	/**
	 * @return the registroD420
	 */
	public List<RegistroD420> getRegistroD420() {
		if (registroD420 == null) {
			registroD420 = new ArrayList<RegistroD420>();
		}
		return registroD420;
	}

}
