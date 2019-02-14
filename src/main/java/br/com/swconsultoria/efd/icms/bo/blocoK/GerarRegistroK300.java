/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoK;

import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK300;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Sidnei Klein
 *
 */
public class GerarRegistroK300 {

    public static StringBuilder gerar(RegistroK300 registroK300, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroK300.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroK300.getDt_prod()));
        sb.append("|").append('\n');

        return sb;
    }
}
