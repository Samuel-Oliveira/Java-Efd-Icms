/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.blocoD.RegistroD360;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD360 {

    public static StringBuilder gerar(RegistroD360 registroD360, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD360.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD360.getVl_pis()));
        sb.append("|").append(Util.preencheRegistro(registroD360.getVl_cofins()));
        sb.append("|").append('\n');

        return sb;
    }
}
