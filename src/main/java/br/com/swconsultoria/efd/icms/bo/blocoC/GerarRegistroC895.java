package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC895;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC895 {

    public static StringBuilder gerar(RegistroC895 registroC895, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC895.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC895.getCod_obs()));
        sb.append("|").append(Util.preencheRegistro(registroC895.getTxt_compl()));
        sb.append("|").append('\n');

        return sb;
    }
}
