/**
 *
 */
package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD162;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD162 {

    public static StringBuilder gerar(RegistroD162 registroD162, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD162.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD162.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(registroD162.getSer()));
        sb.append("|").append(Util.preencheRegistro(registroD162.getNum_doc()));
        sb.append("|").append(Util.preencheRegistro(registroD162.getDt_doc()));
        sb.append("|").append(Util.preencheRegistro(registroD162.getVl_doc()));
        sb.append("|").append(Util.preencheRegistro(registroD162.getVl_merc()));
        sb.append("|").append(Util.preencheRegistro(registroD162.getQtd_vol()));
        sb.append("|").append(Util.preencheRegistro(registroD162.getPeso_brt()));
        sb.append("|").append(Util.preencheRegistro(registroD162.getPeso_liq()));
        sb.append("|").append('\n');

        return sb;
    }
}
