/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.blocoE;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class RegistroE210 {
	
private final String reg = "E210";
	private String ind_mov_st;
	private String vl_sld_cred_ant_st;
	private String vl_devol_st;
	private String vl_ressarc_st;
	private String vl_out_cred_st;
	private String vl_aj_creditos_st;
	private String vl_retencao_st;
	private String vl_out_deb_st;
	private String vl_aj_debitos_st;
	private String vl_sld_dev_ant_st;
	private String vl_deducoes_st;
	private String vl_icms_recol_st;
	private String vl_sld_cred_st_transportar;
	private String deb_esp_st;
	private List<RegistroE220> registroE220;
	private List<RegistroE250> registroE250;
	
	/**
	 * @return the ind_mov_st
	 */
	public String getInd_mov_st() {
		return ind_mov_st;
	}
	/**
	 * @param ind_mov_st the ind_mov_st to set
	 */
	public void setInd_mov_st(String ind_mov_st) {
		this.ind_mov_st = ind_mov_st;
	}
	/**
	 * @return the vl_sld_cred_ant_st
	 */
	public String getVl_sld_cred_ant_st() {
		return vl_sld_cred_ant_st;
	}
	/**
	 * @param vl_sld_cred_ant_st the vl_sld_cred_ant_st to set
	 */
	public void setVl_sld_cred_ant_st(String vl_sld_cred_ant_st) {
		this.vl_sld_cred_ant_st = vl_sld_cred_ant_st;
	}
	/**
	 * @return the vl_devol_st
	 */
	public String getVl_devol_st() {
		return vl_devol_st;
	}
	/**
	 * @param vl_devol_st the vl_devol_st to set
	 */
	public void setVl_devol_st(String vl_devol_st) {
		this.vl_devol_st = vl_devol_st;
	}
	/**
	 * @return the vl_ressarc_st
	 */
	public String getVl_ressarc_st() {
		return vl_ressarc_st;
	}
	/**
	 * @param vl_ressarc_st the vl_ressarc_st to set
	 */
	public void setVl_ressarc_st(String vl_ressarc_st) {
		this.vl_ressarc_st = vl_ressarc_st;
	}
	/**
	 * @return the vl_out_cred_st
	 */
	public String getVl_out_cred_st() {
		return vl_out_cred_st;
	}
	/**
	 * @param vl_out_cred_st the vl_out_cred_st to set
	 */
	public void setVl_out_cred_st(String vl_out_cred_st) {
		this.vl_out_cred_st = vl_out_cred_st;
	}
	/**
	 * @return the vl_aj_creditos_st
	 */
	public String getVl_aj_creditos_st() {
		return vl_aj_creditos_st;
	}
	/**
	 * @param vl_aj_creditos_st the vl_aj_creditos_st to set
	 */
	public void setVl_aj_creditos_st(String vl_aj_creditos_st) {
		this.vl_aj_creditos_st = vl_aj_creditos_st;
	}
	/**
	 * @return the vl_retencao_st
	 */
	public String getVl_retencao_st() {
		return vl_retencao_st;
	}
	/**
	 * @param vl_retencao_st the vl_retencao_st to set
	 */
	public void setVl_retencao_st(String vl_retencao_st) {
		this.vl_retencao_st = vl_retencao_st;
	}
	/**
	 * @return the vl_out_deb_st
	 */
	public String getVl_out_deb_st() {
		return vl_out_deb_st;
	}
	/**
	 * @param vl_out_deb_st the vl_out_deb_st to set
	 */
	public void setVl_out_deb_st(String vl_out_deb_st) {
		this.vl_out_deb_st = vl_out_deb_st;
	}
	/**
	 * @return the vl_aj_debitos_st
	 */
	public String getVl_aj_debitos_st() {
		return vl_aj_debitos_st;
	}
	/**
	 * @param vl_aj_debitos_st the vl_aj_debitos_st to set
	 */
	public void setVl_aj_debitos_st(String vl_aj_debitos_st) {
		this.vl_aj_debitos_st = vl_aj_debitos_st;
	}
	/**
	 * @return the vl_sld_dev_ant_st
	 */
	public String getVl_sld_dev_ant_st() {
		return vl_sld_dev_ant_st;
	}
	/**
	 * @param vl_sld_dev_ant_st the vl_sld_dev_ant_st to set
	 */
	public void setVl_sld_dev_ant_st(String vl_sld_dev_ant_st) {
		this.vl_sld_dev_ant_st = vl_sld_dev_ant_st;
	}
	/**
	 * @return the vl_deducoes_st
	 */
	public String getVl_deducoes_st() {
		return vl_deducoes_st;
	}
	/**
	 * @param vl_deducoes_st the vl_deducoes_st to set
	 */
	public void setVl_deducoes_st(String vl_deducoes_st) {
		this.vl_deducoes_st = vl_deducoes_st;
	}
	/**
	 * @return the vl_icms_recol_st
	 */
	public String getVl_icms_recol_st() {
		return vl_icms_recol_st;
	}
	/**
	 * @param vl_icms_recol_st the vl_icms_recol_st to set
	 */
	public void setVl_icms_recol_st(String vl_icms_recol_st) {
		this.vl_icms_recol_st = vl_icms_recol_st;
	}
	/**
	 * @return the vl_sld_cred_st_transportar
	 */
	public String getVl_sld_cred_st_transportar() {
		return vl_sld_cred_st_transportar;
	}
	/**
	 * @param vl_sld_cred_st_transportar the vl_sld_cred_st_transportar to set
	 */
	public void setVl_sld_cred_st_transportar(String vl_sld_cred_st_transportar) {
		this.vl_sld_cred_st_transportar = vl_sld_cred_st_transportar;
	}
	/**
	 * @return the deb_esp_st
	 */
	public String getDeb_esp_st() {
		return deb_esp_st;
	}
	/**
	 * @param deb_esp_st the deb_esp_st to set
	 */
	public void setDeb_esp_st(String deb_esp_st) {
		this.deb_esp_st = deb_esp_st;
	}
	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}
	/**
	 * @return the registroE220
	 */
	public List<RegistroE220> getRegistroE220() {
		if (registroE220 == null) {
			registroE220 = new ArrayList<RegistroE220>();
		}
		return registroE220;
	}
	/**
	 * @return the registroE250
	 */
	public List<RegistroE250> getRegistroE250() {
		if (registroE250 == null) {
			registroE250 = new ArrayList<RegistroE250>();
		}
		return registroE250;
	}
	
}
