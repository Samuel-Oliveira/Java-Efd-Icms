/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoE;

import br.com.swconsultoria.efd.icms.registros.blocoE.RegistroE113;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroE113 {

    public static StringBuilder gerar(RegistroE113 registroE113, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroE113.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroE113.getCod_part()));
        sb.append("|").append(Util.preencheRegistro(registroE113.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(registroE113.getSer()));
        sb.append("|").append(Util.preencheRegistro(registroE113.getSub()));
        sb.append("|").append(Util.preencheRegistro(registroE113.getNum_doc()));
        sb.append("|").append(Util.preencheRegistro(registroE113.getDt_doc()));
        sb.append("|").append(Util.preencheRegistro(registroE113.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroE113.getVl_aj_item()));
        sb.append("|").append(Util.preencheRegistro(registroE113.getChv_doc_e()));
        sb.append("|").append('\n');

        return sb;
    }
}
