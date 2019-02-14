/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoK;

import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK302;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Sidnei Klein
 *
 */
public class GerarRegistroK302 {

    public static StringBuilder gerar(RegistroK302 registroK302, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroK302.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroK302.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroK302.getQtd()));
        sb.append("|").append('\n');

        return sb;
    }
}
