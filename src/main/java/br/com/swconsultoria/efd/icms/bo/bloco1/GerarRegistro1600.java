/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.bloco1;

import br.com.swconsultoria.efd.icms.registros.bloco1.Registro1600;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1600 {

    public static StringBuilder gerar(Registro1600 registro1600, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro1600.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro1600.getCod_part()));
        sb.append("|").append(Util.preencheRegistro(registro1600.getTot_credito()));
        sb.append("|").append(Util.preencheRegistro(registro1600.getTot_debito()));
        sb.append("|").append('\n');

        return sb;
    }
}
