package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC141;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC141 {

    public static StringBuilder gerar(RegistroC141 registroC141, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC141.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC141.getNum_parc()));
        sb.append("|").append(Util.preencheRegistro(registroC141.getDt_vcto()));
        sb.append("|").append(Util.preencheRegistro(registroC141.getVl_parc()));
        sb.append("|").append('\n');

        return sb;
    }
}
