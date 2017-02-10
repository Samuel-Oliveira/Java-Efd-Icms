/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.blocoD;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroD410 {

	private final String reg = "D410";
	private String cod_mod;
	private String ser;
	private String sub;
	private String num_doc_ini;
	private String num_doc_fin;
	private String dt_doc;
	private String cst_icms;
	private String cfop;
	private String aliq_icms;
	private String vl_opr;
	private String vl_desc;
	private String vl_serv;
	private String vl_bc_icms;
	private String vl_icms;
	private List<RegistroD411> registroD411;

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
	 * @return the num_doc_ini
	 */
	public String getNum_doc_ini() {
		return num_doc_ini;
	}

	/**
	 * @param num_doc_ini
	 *            the num_doc_ini to set
	 */
	public void setNum_doc_ini(String num_doc_ini) {
		this.num_doc_ini = num_doc_ini;
	}

	/**
	 * @return the num_doc_fin
	 */
	public String getNum_doc_fin() {
		return num_doc_fin;
	}

	/**
	 * @param num_doc_fin
	 *            the num_doc_fin to set
	 */
	public void setNum_doc_fin(String num_doc_fin) {
		this.num_doc_fin = num_doc_fin;
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
	 * @return the cst_icms
	 */
	public String getCst_icms() {
		return cst_icms;
	}

	/**
	 * @param cst_icms
	 *            the cst_icms to set
	 */
	public void setCst_icms(String cst_icms) {
		this.cst_icms = cst_icms;
	}

	/**
	 * @return the cfop
	 */
	public String getCfop() {
		return cfop;
	}

	/**
	 * @param cfop
	 *            the cfop to set
	 */
	public void setCfop(String cfop) {
		this.cfop = cfop;
	}

	/**
	 * @return the aliq_icms
	 */
	public String getAliq_icms() {
		return aliq_icms;
	}

	/**
	 * @param aliq_icms
	 *            the aliq_icms to set
	 */
	public void setAliq_icms(String aliq_icms) {
		this.aliq_icms = aliq_icms;
	}

	/**
	 * @return the vl_opr
	 */
	public String getVl_opr() {
		return vl_opr;
	}

	/**
	 * @param vl_opr
	 *            the vl_opr to set
	 */
	public void setVl_opr(String vl_opr) {
		this.vl_opr = vl_opr;
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
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroD411
	 */
	public List<RegistroD411> getRegistroD411() {
		if (registroD411 == null) {
			registroD411 = new ArrayList<RegistroD411>();
		}
		return registroD411;
	}

}
