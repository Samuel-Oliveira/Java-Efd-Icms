/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.blocoD.RegistroD411;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD411 {

    public static StringBuilder gerar(RegistroD411 registroD411, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD411.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD411.getNum_doc_canc()));
        sb.append("|").append('\n');

        return sb;
    }
}
