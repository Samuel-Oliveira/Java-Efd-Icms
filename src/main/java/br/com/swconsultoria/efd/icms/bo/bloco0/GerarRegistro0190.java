package br.com.swconsultoria.efd.icms.bo.bloco0;

import br.com.swconsultoria.efd.icms.registros.bloco0.Registro0190;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistro0190 {

    public static StringBuilder gerar(Registro0190 registro0190, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro0190.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro0190.getUnid()));
        sb.append("|").append(Util.preencheRegistro(registro0190.getDescr()));
        sb.append("|").append('\n');

        return sb;
    }
}
