/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.bloco1;

import br.com.swconsultoria.efd.icms.registros.bloco1.Registro1601;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarRegistro1601 {

    public static StringBuilder gerar(Registro1601 registro1601, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro1601.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro1601.getCod_part_ip()));
        sb.append("|").append(Util.preencheRegistro(registro1601.getCod_part_it()));
        sb.append("|").append(Util.preencheRegistro(registro1601.getTot_vs()));
        sb.append("|").append(Util.preencheRegistro(registro1601.getTot_iss()));
        sb.append("|").append(Util.preencheRegistro(registro1601.getTot_outros()));
        sb.append("|").append('\n');

        return sb;
    }
}
