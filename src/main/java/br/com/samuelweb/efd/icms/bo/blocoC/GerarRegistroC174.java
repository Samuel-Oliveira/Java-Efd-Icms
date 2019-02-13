package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC174;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC174 {

    public static StringBuilder gerar(RegistroC174 registroC174, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC174.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC174.getInd_arm()));
        sb.append("|").append(Util.preencheRegistro(registroC174.getNum_arm()));
        sb.append("|").append(Util.preencheRegistro(registroC174.getDescr_compl()));
        sb.append("|").append('\n');

        return sb;
    }
}
