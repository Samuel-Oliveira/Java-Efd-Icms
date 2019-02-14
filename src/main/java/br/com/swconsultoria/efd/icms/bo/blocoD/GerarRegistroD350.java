/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.blocoD.RegistroD350;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD350 {

    public static StringBuilder gerar(RegistroD350 registroD350, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD350.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD350.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(registroD350.getEcf_mod()));
        sb.append("|").append(Util.preencheRegistro(registroD350.getEcf_fab()));
        sb.append("|").append(Util.preencheRegistro(registroD350.getEcf_cx()));
        sb.append("|").append('\n');

        return sb;
    }
}
