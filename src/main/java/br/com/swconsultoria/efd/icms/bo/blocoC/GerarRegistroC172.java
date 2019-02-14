package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC172;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC172 {

    public static StringBuilder gerar(RegistroC172 registroC172, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC172.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC172.getVl_bc_issqn()));
        sb.append("|").append(Util.preencheRegistro(registroC172.getAliq_issqn()));
        sb.append("|").append(Util.preencheRegistro(registroC172.getVl_issqn()));
        sb.append("|").append('\n');

        return sb;
    }
}
