/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoH;

import br.com.swconsultoria.efd.icms.registros.blocoH.RegistroH020;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroH020 {

    public static StringBuilder gerar(RegistroH020 registroH020, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroH020.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroH020.getCst_icms()));
        sb.append("|").append(Util.preencheRegistro(registroH020.getBc_icms()));
        sb.append("|").append(Util.preencheRegistro(registroH020.getVl_icms()));
        sb.append("|").append('\n');

        return sb;
    }
}
