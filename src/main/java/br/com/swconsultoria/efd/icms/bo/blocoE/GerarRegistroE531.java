/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoE;

import br.com.swconsultoria.efd.icms.registros.blocoE.RegistroE531;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira, Sidnei Klein
 *
 */
public class GerarRegistroE531 {

    public static StringBuilder gerar(RegistroE531 registroE531, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroE531.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroE531.getCod_part()));
        sb.append("|").append(Util.preencheRegistro(registroE531.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(registroE531.getSer()));
        sb.append("|").append(Util.preencheRegistro(registroE531.getSub()));
        sb.append("|").append(Util.preencheRegistro(registroE531.getNum_doc()));
        sb.append("|").append(Util.preencheRegistro(registroE531.getDt_doc()));
        sb.append("|").append(Util.preencheRegistro(registroE531.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroE531.getVl_aj_item()));
        sb.append("|").append(Util.preencheRegistro(registroE531.getChv_nfe()));
        sb.append("|").append('\n');

        return sb;
    }
}
