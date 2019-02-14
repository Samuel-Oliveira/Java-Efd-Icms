/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoK;

import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK100;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroK100 {

    public static StringBuilder gerar(RegistroK100 registroK100, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroK100.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroK100.getDt_ini()));
        sb.append("|").append(Util.preencheRegistro(registroK100.getDt_fin()));
        sb.append("|").append('\n');

        return sb;
    }
}
