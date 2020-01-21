/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.bloco0;

import br.com.swconsultoria.efd.icms.registros.bloco0.Registro0002;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarRegistro0002 {

    public static StringBuilder gerar(Registro0002 registro0002, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro0002.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro0002.getClass_estab_ind()));
        sb.append("|").append('\n');

        return sb;
    }
}
