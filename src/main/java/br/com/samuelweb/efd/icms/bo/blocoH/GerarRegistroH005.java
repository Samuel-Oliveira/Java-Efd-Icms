/**
 *
 */
package br.com.samuelweb.efd.icms.bo.blocoH;

import br.com.samuelweb.efd.icms.registros.blocoH.RegistroH005;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroH005 {

    public static StringBuilder gerar(RegistroH005 registroH005, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroH005.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroH005.getDt_inv()));
        sb.append("|").append(Util.preencheRegistro(registroH005.getVl_inv()));
        sb.append("|").append(Util.preencheRegistro(registroH005.getMot_inv()));
        sb.append("|").append('\n');

        return sb;
    }
}
