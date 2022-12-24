package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.blocoD.RegistroD761;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroD761 {

    public static StringBuilder gerar(RegistroD761 registroD761, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD761.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD761.getVl_fcp_op()));
        sb.append("|").append('\n');

        return sb;
    }
}
