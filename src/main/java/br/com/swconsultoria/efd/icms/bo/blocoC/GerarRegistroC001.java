package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC001;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC001 {

    public static StringBuilder gerar(RegistroC001 registroC001, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC001.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC001.getInd_mov()));
        sb.append("|").append('\n');

        return sb;
    }
}
