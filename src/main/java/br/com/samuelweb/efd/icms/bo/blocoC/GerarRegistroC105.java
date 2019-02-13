package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC105;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC105 {

    public static StringBuilder gerar(RegistroC105 registroC105, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC105.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC105.getOper()));
        sb.append("|").append(Util.preencheRegistro(registroC105.getUf()));
        sb.append("|").append('\n');

        return sb;
    }
}
