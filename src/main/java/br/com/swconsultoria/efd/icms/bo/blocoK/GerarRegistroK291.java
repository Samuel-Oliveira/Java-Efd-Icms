/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoK;

import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK291;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Sidnei Klein
 *
 */
public class GerarRegistroK291 {

    public static StringBuilder gerar(RegistroK291 registroK291, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroK291.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroK291.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroK291.getQtd()));
        sb.append("|").append('\n');

        return sb;
    }
}
