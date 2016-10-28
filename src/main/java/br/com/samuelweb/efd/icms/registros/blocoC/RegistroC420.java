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
public class RegistroC420 {
	
private final String reg = "C420";
	private String cod_tot_par;
	private String vlr_acum_tot;
	private String nr_tot;
	private String descr_nr_tot;
	private List<RegistroC425> registroC425;
	
	/**
	 * @return the cod_tot_par
	 */
	public String getCod_tot_par() {
		return cod_tot_par;
	}
	/**
	 * @param cod_tot_par the cod_tot_par to set
	 */
	public void setCod_tot_par(String cod_tot_par) {
		this.cod_tot_par = cod_tot_par;
	}
	/**
	 * @return the vlr_acum_tot
	 */
	public String getVlr_acum_tot() {
		return vlr_acum_tot;
	}
	/**
	 * @param vlr_acum_tot the vlr_acum_tot to set
	 */
	public void setVlr_acum_tot(String vlr_acum_tot) {
		this.vlr_acum_tot = vlr_acum_tot;
	}
	/**
	 * @return the nr_tot
	 */
	public String getNr_tot() {
		return nr_tot;
	}
	/**
	 * @param nr_tot the nr_tot to set
	 */
	public void setNr_tot(String nr_tot) {
		this.nr_tot = nr_tot;
	}
	/**
	 * @return the descr_nr_tot
	 */
	public String getDescr_nr_tot() {
		return descr_nr_tot;
	}
	/**
	 * @param descr_nr_tot the descr_nr_tot to set
	 */
	public void setDescr_nr_tot(String descr_nr_tot) {
		this.descr_nr_tot = descr_nr_tot;
	}
	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}
	/**
	 * @return the registroC425
	 */
	public List<RegistroC425> getRegistroC425() {
		if (registroC425 == null) {
			registroC425 = new ArrayList<RegistroC425>();
        }
		return registroC425;
	}
	
}
