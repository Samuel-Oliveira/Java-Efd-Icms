/**
 *
 */
package br.com.samuelweb.efd.icms.bo.bloco1;

import br.com.samuelweb.efd.icms.registros.bloco1.Registro1900;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1900 {

    public static StringBuilder gerar(Registro1900 registro1900, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro1900.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro1900.getInd_apur_icms()));
        sb.append("|").append(Util.preencheRegistro(registro1900.getDescr_compl_out_apur()));
        sb.append("|").append('\n');

        return sb;
    }
}
