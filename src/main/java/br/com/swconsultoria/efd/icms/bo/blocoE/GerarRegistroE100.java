/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoE;

import br.com.swconsultoria.efd.icms.registros.blocoE.RegistroE100;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroE100 {

    public static StringBuilder gerar(RegistroE100 registroE100, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroE100.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroE100.getDt_ini()));
        sb.append("|").append(Util.preencheRegistro(registroE100.getDt_fin()));
        sb.append("|").append('\n');

        return sb;
    }
}
