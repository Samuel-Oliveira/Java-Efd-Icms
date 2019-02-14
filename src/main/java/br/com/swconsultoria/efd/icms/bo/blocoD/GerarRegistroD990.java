package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.blocoD.RegistroD990;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroD990 {

    public static StringBuilder gerar(RegistroD990 registroD990, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD990.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD990.getQtd_lin_d()));
        sb.append("|").append('\n');

        return sb;
    }
}
