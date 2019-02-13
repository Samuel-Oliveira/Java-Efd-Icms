/**
 *
 */
package br.com.samuelweb.efd.icms.bo.blocoE;

import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE240;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroE240 {

    public static StringBuilder gerar(RegistroE240 registroE240, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroE240.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroE240.getCod_part()));
        sb.append("|").append(Util.preencheRegistro(registroE240.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(registroE240.getSer()));
        sb.append("|").append(Util.preencheRegistro(registroE240.getSub()));
        sb.append("|").append(Util.preencheRegistro(registroE240.getNum_doc()));
        sb.append("|").append(Util.preencheRegistro(registroE240.getDt_doc()));
        sb.append("|").append(Util.preencheRegistro(registroE240.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroE240.getVl_aj_item()));
        sb.append("|").append(Util.preencheRegistro(registroE240.getChv_doc_e()));
        sb.append("|").append('\n');

        return sb;
    }
}
