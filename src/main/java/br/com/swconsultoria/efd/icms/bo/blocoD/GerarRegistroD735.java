package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.blocoD.RegistroD735;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroD735 {

    public static StringBuilder gerar(RegistroD735 registroD735, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD735.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD735.getCod_obs()));
        sb.append("|").append(Util.preencheRegistro(registroD735.getCod_obs()));
        sb.append("|").append('\n');

        return sb;
    }
}
