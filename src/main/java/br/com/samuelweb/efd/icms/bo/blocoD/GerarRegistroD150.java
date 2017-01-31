/**
 * Complemento do Conhecimento Aéreo (Código 10)
 * 
 */
package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD150;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD150 {

	public static StringBuilder gerar(RegistroD150 registroD150, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD150.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD150.getCod_mun_orig()));
		sb.append("|").append(Util.preencheRegistro(registroD150.getCod_mun_dest()));
		sb.append("|").append(Util.preencheRegistro(registroD150.getVeic_id()));
		sb.append("|").append(Util.preencheRegistro(registroD150.getViagem()));
		sb.append("|").append(Util.preencheRegistro(registroD150.getInd_tfa()));
		sb.append("|").append(Util.preencheRegistro(registroD150.getVl_peso_tx()));
		sb.append("|").append(Util.preencheRegistro(registroD150.getVl_tx_terr()));
		sb.append("|").append(Util.preencheRegistro(registroD150.getVl_tx_red()));
		sb.append("|").append(Util.preencheRegistro(registroD150.getVl_out()));
		sb.append("|").append(Util.preencheRegistro(registroD150.getVl_tx_adv()));
		sb.append("|").append('\n');

		return sb;
	}
}
