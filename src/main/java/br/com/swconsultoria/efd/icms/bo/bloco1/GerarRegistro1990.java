/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.bloco1;

import br.com.swconsultoria.efd.icms.registros.bloco1.Registro1990;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarRegistro1990 {

    public static StringBuilder gerar(Registro1990 registro1990, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro1990.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro1990.getQtd_lin_1()));
        sb.append("|").append('\n');

        return sb;
    }

}
