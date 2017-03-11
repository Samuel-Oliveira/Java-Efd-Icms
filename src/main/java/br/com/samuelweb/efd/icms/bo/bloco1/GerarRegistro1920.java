/**
 * 
 */
package br.com.samuelweb.efd.icms.bo.bloco1;

import br.com.samuelweb.efd.icms.registros.bloco1.Registro1920;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1920 {

	public static StringBuilder gerar(Registro1920 registro1920, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1920.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1920.getVl_tot_transf_debitos_oa()));
		sb.append("|").append(Util.preencheRegistro(registro1920.getVl_tot_aj_debitos_oa()));
		sb.append("|").append(Util.preencheRegistro(registro1920.getVl_estornos_cred_oa()));
		sb.append("|").append(Util.preencheRegistro(registro1920.getVl_tot_transf_creditos_oa()));
		sb.append("|").append(Util.preencheRegistro(registro1920.getVl_tot_aj_creditos_oa()));
		sb.append("|").append(Util.preencheRegistro(registro1920.getVl_estornos_deb_oa()));
		sb.append("|").append(Util.preencheRegistro(registro1920.getVl_sld_credor_ant_oa()));
		sb.append("|").append(Util.preencheRegistro(registro1920.getVl_sld_apurado_oa()));
		sb.append("|").append(Util.preencheRegistro(registro1920.getVl_tot_ded()));
		sb.append("|").append(Util.preencheRegistro(registro1920.getVl_icms_recolher_oa()));
		sb.append("|").append(Util.preencheRegistro(registro1920.getVl_sld_credor_transp_oa()));
		sb.append("|").append(Util.preencheRegistro(registro1920.getDeb_esp_oa()));
		sb.append("|").append('\n');

		return sb;
	}
}
