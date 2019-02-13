/**
 *
 */
package br.com.samuelweb.efd.icms.bo.blocoE;

import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE116;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroE116 {

    public static StringBuilder gerar(RegistroE116 registroE116, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroE116.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroE116.getCod_or()));
        sb.append("|").append(Util.preencheRegistro(registroE116.getVl_or()));
        sb.append("|").append(Util.preencheRegistro(registroE116.getDt_vcto()));
        sb.append("|").append(Util.preencheRegistro(registroE116.getCod_rec()));
        sb.append("|").append(Util.preencheRegistro(registroE116.getNum_proc()));
        sb.append("|").append(Util.preencheRegistro(registroE116.getInd_proc()));
        sb.append("|").append(Util.preencheRegistro(registroE116.getProc()));
        sb.append("|").append(Util.preencheRegistro(registroE116.getTxt_compl()));
        sb.append("|").append(Util.preencheRegistro(registroE116.getMes_ref()));
        sb.append("|").append('\n');

        return sb;
    }
}
