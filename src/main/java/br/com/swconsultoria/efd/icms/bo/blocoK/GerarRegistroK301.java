/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoK;

import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK301;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Sidnei Klein
 *
 */
public class GerarRegistroK301 {

    public static StringBuilder gerar(RegistroK301 registroK301, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroK301.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroK301.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroK301.getQtd()));
        sb.append("|").append('\n');

        return sb;
    }
}
