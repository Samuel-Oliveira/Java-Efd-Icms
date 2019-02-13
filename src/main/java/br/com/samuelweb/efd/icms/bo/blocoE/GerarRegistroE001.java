package br.com.samuelweb.efd.icms.bo.blocoE;

import br.com.samuelweb.efd.icms.registros.blocoE.RegistroE001;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroE001 {

    public static StringBuilder gerar(RegistroE001 registroE001, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroE001.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroE001.getInd_mov()));
        sb.append("|").append('\n');

        return sb;
    }
}
