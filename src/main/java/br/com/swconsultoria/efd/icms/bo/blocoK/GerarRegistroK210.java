/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoK;

import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK210;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroK210 {

    public static StringBuilder gerar(RegistroK210 registroK210, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroK210.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroK210.getDt_ini_os()));
        sb.append("|").append(Util.preencheRegistro(registroK210.getDt_fin_os()));
        sb.append("|").append(Util.preencheRegistro(registroK210.getCod_doc_os()));
        sb.append("|").append(Util.preencheRegistro(registroK210.getCod_item_ori()));
        sb.append("|").append(Util.preencheRegistro(registroK210.getQtd_ori()));
        sb.append("|").append('\n');

        return sb;
    }
}
