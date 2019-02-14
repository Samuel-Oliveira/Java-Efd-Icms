/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoE;

import br.com.swconsultoria.efd.icms.registros.blocoE.RegistroE250;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroE250 {

    public static StringBuilder gerar(RegistroE250 registroE250, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroE250.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroE250.getCod_or()));
        sb.append("|").append(Util.preencheRegistro(registroE250.getVl_or()));
        sb.append("|").append(Util.preencheRegistro(registroE250.getDt_vcto()));
        sb.append("|").append(Util.preencheRegistro(registroE250.getCod_rec()));
        sb.append("|").append(Util.preencheRegistro(registroE250.getNum_proc()));
        sb.append("|").append(Util.preencheRegistro(registroE250.getInd_proc()));
        sb.append("|").append(Util.preencheRegistro(registroE250.getProc()));
        sb.append("|").append(Util.preencheRegistro(registroE250.getTxt_compl()));
        sb.append("|").append(Util.preencheRegistro(registroE250.getMes_ref()));
        sb.append("|").append('\n');

        return sb;
    }
}
