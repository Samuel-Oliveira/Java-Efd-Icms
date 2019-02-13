package br.com.samuelweb.efd.icms.bo.blocoG;

import br.com.samuelweb.efd.icms.registros.blocoG.RegistroG001;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroG001 {

    public static StringBuilder gerar(RegistroG001 registroG001, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroG001.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroG001.getInd_mov()));
        sb.append("|").append('\n');

        return sb;
    }
}
