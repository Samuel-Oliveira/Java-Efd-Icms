package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.blocoD.RegistroD731;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroD731 {

    public static StringBuilder gerar(RegistroD731 registroD731, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD731.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD731.getVl_fcp_op()));
        sb.append("|").append('\n');

        return sb;
    }
}
