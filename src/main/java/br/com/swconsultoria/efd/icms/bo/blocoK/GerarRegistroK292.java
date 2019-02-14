/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoK;

import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK292;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Sidnei Klein
 *
 */
public class GerarRegistroK292 {

    public static StringBuilder gerar(RegistroK292 registroK292, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroK292.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroK292.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroK292.getQtd()));
        sb.append("|").append('\n');

        return sb;
    }
}
