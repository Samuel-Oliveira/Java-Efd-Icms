/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.blocoD.RegistroD390;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes - yurilemes2@gmail.com
 *
 */
public class GerarRegistroD390 {

    public static StringBuilder gerar(RegistroD390 registroD390, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD390.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD390.getCst_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD390.getCfop()));
        sb.append("|").append(Util.preencheRegistro(registroD390.getAliq_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD390.getVl_opr()));
        sb.append("|").append(Util.preencheRegistro(registroD390.getVl_bc_issqn()));
        sb.append("|").append(Util.preencheRegistro(registroD390.getAliq_issqn()));
        sb.append("|").append(Util.preencheRegistro(registroD390.getVl_issqn()));
        sb.append("|").append(Util.preencheRegistro(registroD390.getVl_bc_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD390.getVl_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD390.getCod_obs()));
        sb.append("|").append('\n');

        return sb;
    }
}
