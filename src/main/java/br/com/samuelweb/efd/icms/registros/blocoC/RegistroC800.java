/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.blocoC;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroC800 {
	
private final String reg = "C800";
	private String cod_mod;
	private String cod_sit;
	private String num_cfe;
	private String dt_doc;
	private String vl_cfe;
	private String vl_pis;
	private String vl_cofins;
	private String cnpj_cpf;
	private String nr_sat;
	private String chv_cfe;
	private String vl_desc;
	private String vl_merc;
	private String vl_out_da;
	private String vl_icms;
	private String vl_pis_st;
	private String vl_cofins_st;
	private List<RegistroC850> registroC850;
	
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
	 * @return the cod_sit
	 */
	public String getCod_sit() {
		return cod_sit;
	}
	/**
	 * @param cod_sit the cod_sit to set
	 */
	public void setCod_sit(String cod_sit) {
		this.cod_sit = cod_sit;
	}
	/**
	 * @return the num_cfe
	 */
	public String getNum_cfe() {
		return num_cfe;
	}
	/**
	 * @param num_cfe the num_cfe to set
	 */
	public void setNum_cfe(String num_cfe) {
		this.num_cfe = num_cfe;
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
	 * @return the vl_cfe
	 */
	public String getVl_cfe() {
		return vl_cfe;
	}
	/**
	 * @param vl_cfe the vl_cfe to set
	 */
	public void setVl_cfe(String vl_cfe) {
		this.vl_cfe = vl_cfe;
	}
	/**
	 * @return the vl_pis
	 */
	public String getVl_pis() {
		return vl_pis;
	}
	/**
	 * @param vl_pis the vl_pis to set
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
	 * @param vl_cofins the vl_cofins to set
	 */
	public void setVl_cofins(String vl_cofins) {
		this.vl_cofins = vl_cofins;
	}
	/**
	 * @return the cnpj_cpf
	 */
	public String getCnpj_cpf() {
		return cnpj_cpf;
	}
	/**
	 * @param cnpj_cpf the cnpj_cpf to set
	 */
	public void setCnpj_cpf(String cnpj_cpf) {
		this.cnpj_cpf = cnpj_cpf;
	}
	/**
	 * @return the nr_sat
	 */
	public String getNr_sat() {
		return nr_sat;
	}
	/**
	 * @param nr_sat the nr_sat to set
	 */
	public void setNr_sat(String nr_sat) {
		this.nr_sat = nr_sat;
	}
	/**
	 * @return the chv_cfe
	 */
	public String getChv_cfe() {
		return chv_cfe;
	}
	/**
	 * @param chv_cfe the chv_cfe to set
	 */
	public void setChv_cfe(String chv_cfe) {
		this.chv_cfe = chv_cfe;
	}
	/**
	 * @return the vl_desc
	 */
	public String getVl_desc() {
		return vl_desc;
	}
	/**
	 * @param vl_desc the vl_desc to set
	 */
	public void setVl_desc(String vl_desc) {
		this.vl_desc = vl_desc;
	}
	/**
	 * @return the vl_merc
	 */
	public String getVl_merc() {
		return vl_merc;
	}
	/**
	 * @param vl_merc the vl_merc to set
	 */
	public void setVl_merc(String vl_merc) {
		this.vl_merc = vl_merc;
	}
	/**
	 * @return the vl_out_da
	 */
	public String getVl_out_da() {
		return vl_out_da;
	}
	/**
	 * @param vl_out_da the vl_out_da to set
	 */
	public void setVl_out_da(String vl_out_da) {
		this.vl_out_da = vl_out_da;
	}
	/**
	 * @return the vl_icms
	 */
	public String getVl_icms() {
		return vl_icms;
	}
	/**
	 * @param vl_icms the vl_icms to set
	 */
	public void setVl_icms(String vl_icms) {
		this.vl_icms = vl_icms;
	}
	/**
	 * @return the vl_pis_st
	 */
	public String getVl_pis_st() {
		return vl_pis_st;
	}
	/**
	 * @param vl_pis_st the vl_pis_st to set
	 */
	public void setVl_pis_st(String vl_pis_st) {
		this.vl_pis_st = vl_pis_st;
	}
	/**
	 * @return the vl_cofins_st
	 */
	public String getVl_cofins_st() {
		return vl_cofins_st;
	}
	/**
	 * @param vl_cofins_st the vl_cofins_st to set
	 */
	public void setVl_cofins_st(String vl_cofins_st) {
		this.vl_cofins_st = vl_cofins_st;
	}
	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}
	/**
	 * @return the registroC850
	 */
	public List<RegistroC850> getRegistroC850() {
		if (registroC850 == null) {
			registroC850 = new ArrayList<RegistroC850>();
        }
		return registroC850;
	}
	
}
