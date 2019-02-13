/**
 *
 */
package br.com.samuelweb.efd.icms.bo.blocoG;

import br.com.samuelweb.efd.icms.registros.blocoG.RegistroG140;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroG140 {

    public static StringBuilder gerar(RegistroG140 registroG140, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroG140.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroG140.getNum_item()));
        sb.append("|").append(Util.preencheRegistro(registroG140.getCod_item()));
        sb.append("|").append('\n');

        return sb;
    }
}
