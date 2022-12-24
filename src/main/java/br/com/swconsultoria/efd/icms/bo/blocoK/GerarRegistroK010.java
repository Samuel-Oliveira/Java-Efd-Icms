/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoK;

import br.com.swconsultoria.efd.icms.registros.blocoK.RegistroK010;
import br.com.swconsultoria.efd.icms.util.Util;

public class GerarRegistroK010 {

    public static StringBuilder gerar(RegistroK010 registroK010, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroK010.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroK010.getInd_tp_leiaute()));
        sb.append("|").append('\n');

        return sb;
    }
}
