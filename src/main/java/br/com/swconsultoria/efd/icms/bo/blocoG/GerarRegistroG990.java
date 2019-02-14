/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoG;

import br.com.swconsultoria.efd.icms.registros.blocoG.RegistroG990;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarRegistroG990 {

    public static StringBuilder gerar(RegistroG990 registroG990, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroG990.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroG990.getQtd_lin_g()));
        sb.append("|").append('\n');

        return sb;
    }

}
