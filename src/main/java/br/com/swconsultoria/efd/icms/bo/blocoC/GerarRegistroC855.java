package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC855;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC855 {

    public static StringBuilder gerar(RegistroC855 registroC855, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC855.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC855.getCod_obs()));
        sb.append("|").append(Util.preencheRegistro(registroC855.getCod_obs()));
        sb.append("|").append('\n');

        return sb;
    }
}
