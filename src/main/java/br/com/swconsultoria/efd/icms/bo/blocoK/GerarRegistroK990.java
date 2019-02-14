/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoK;

import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK990;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarRegistroK990 {

    public static StringBuilder gerar(RegistroK990 registroK990, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroK990.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroK990.getQtd_lin_k()));
        sb.append("|").append('\n');

        return sb;
    }

}
