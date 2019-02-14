/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.blocoD.RegistroD355;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD355 {

    public static StringBuilder gerar(RegistroD355 registroD355, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD355.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD355.getDt_doc()));
        sb.append("|").append(Util.preencheRegistro(registroD355.getCro()));
        sb.append("|").append(Util.preencheRegistro(registroD355.getCrz()));
        sb.append("|").append(Util.preencheRegistro(registroD355.getNum_coo_fin()));
        sb.append("|").append(Util.preencheRegistro(registroD355.getGt_fin()));
        sb.append("|").append(Util.preencheRegistro(registroD355.getVl_brt()));
        sb.append("|").append('\n');

        return sb;
    }
}
