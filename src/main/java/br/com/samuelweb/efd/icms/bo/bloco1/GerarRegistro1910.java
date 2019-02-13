/**
 *
 */
package br.com.samuelweb.efd.icms.bo.bloco1;

import br.com.samuelweb.efd.icms.registros.bloco1.Registro1910;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1910 {

    public static StringBuilder gerar(Registro1910 registro1910, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro1910.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro1910.getDt_ini()));
        sb.append("|").append(Util.preencheRegistro(registro1910.getDt_fin()));
        sb.append("|").append('\n');

        return sb;
    }
}
