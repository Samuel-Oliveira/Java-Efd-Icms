package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC591;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC591 {

    public static StringBuilder gerar(RegistroC591 registroC591, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC591.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC591.getVl_fcp_op()));
        sb.append("|").append(Util.preencheRegistro(registroC591.getVl_fcp_st()));
        sb.append("|").append('\n');

        return sb;
    }
}
