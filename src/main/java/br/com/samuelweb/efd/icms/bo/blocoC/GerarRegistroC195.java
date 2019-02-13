package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC195;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC195 {

    public static StringBuilder gerar(RegistroC195 registroC195, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC195.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC195.getCod_obs()));
        sb.append("|").append(Util.preencheRegistro(registroC195.getTxt_compl()));
        sb.append("|").append('\n');

        return sb;
    }
}
