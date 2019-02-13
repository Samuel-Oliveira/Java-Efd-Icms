/**
 *
 */
package br.com.samuelweb.efd.icms.bo.bloco1;

import br.com.samuelweb.efd.icms.registros.bloco1.Registro1350;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes - yurilemes2@gmail.com
 *
 */
public class GerarRegistro1350 {

    public static StringBuilder gerar(Registro1350 registro1350, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro1350.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro1350.getSerie()));
        sb.append("|").append(Util.preencheRegistro(registro1350.getFabricante()));
        sb.append("|").append(Util.preencheRegistro(registro1350.getModelo()));
        sb.append("|").append(Util.preencheRegistro(registro1350.getTipo_medicao()));
        sb.append("|").append('\n');

        return sb;
    }
}
