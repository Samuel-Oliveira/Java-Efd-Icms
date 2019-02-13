/**
 *
 */
package br.com.samuelweb.efd.icms.bo.bloco1;

import br.com.samuelweb.efd.icms.registros.bloco1.Registro1710;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1710 {

    public static StringBuilder gerar(Registro1710 registro1710, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro1710.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro1710.getNum_doc_ini()));
        sb.append("|").append(Util.preencheRegistro(registro1710.getNum_doc_fin()));
        sb.append("|").append('\n');

        return sb;
    }
}
