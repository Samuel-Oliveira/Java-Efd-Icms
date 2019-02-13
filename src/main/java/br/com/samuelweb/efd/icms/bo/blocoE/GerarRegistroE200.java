/**
 *
 */
package br.com.samuelweb.efd.icms.bo.blocoE;

import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE200;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroE200 {

    public static StringBuilder gerar(RegistroE200 registroE200, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroE200.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroE200.getUf()));
        sb.append("|").append(Util.preencheRegistro(registroE200.getDt_ini()));
        sb.append("|").append(Util.preencheRegistro(registroE200.getDt_fin()));
        sb.append("|").append('\n');

        return sb;
    }
}
