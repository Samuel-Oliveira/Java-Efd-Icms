package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC595;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC595 {

    public static StringBuilder gerar(RegistroC595 registroC595, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC595.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC595.getCod_obs()));
        sb.append("|").append(Util.preencheRegistro(registroC595.getTxt_compl()));
        sb.append("|").append('\n');

        return sb;
    }
}
