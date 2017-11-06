/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.blocoK;

/**
 * @author Samuel Oliveira
 */
public class RegistroK220 {

	private final String reg = "K220";
	private String dt_mov;
	private String cod_item_ori;
	private String cod_item_dest;
	private String qtd_ori;
	private String qtd_dest;

	/**
	 * @return the dt_mov
	 */
	public String getDt_mov() {
		return dt_mov;
	}

	/**
	 * @param dt_mov
	 *            the dt_mov to set
	 */
	public void setDt_mov(String dt_mov) {
		this.dt_mov = dt_mov;
	}

	/**
	 * @return the cod_item_ori
	 */
	public String getCod_item_ori() {
		return cod_item_ori;
	}

	/**
	 * @param cod_item_ori
	 *            the cod_item_ori to set
	 */
	public void setCod_item_ori(String cod_item_ori) {
		this.cod_item_ori = cod_item_ori;
	}

	/**
	 * @return the cod_item_dest
	 */
	public String getCod_item_dest() {
		return cod_item_dest;
	}

	/**
	 * @param cod_item_dest
	 *            the cod_item_dest to set
	 */
	public void setCod_item_dest(String cod_item_dest) {
		this.cod_item_dest = cod_item_dest;
	}

	/**
	 * @return the qtd_ori
	 */
	public String getQtd_ori() {
		return qtd_ori;
	}

	/**
	 * @param qtd_ori
	 *            the qtd_ori to set
	 */
	public void setQtd_ori(String qtd_ori) {
		this.qtd_ori = qtd_ori;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	public String getQtd_dest() {
		return qtd_dest;
	}

	public void setQtd_dest(String qtd_dest) {
		this.qtd_dest = qtd_dest;
	}
}
