package br.com.swconsultoria.efd.icms.bo.bloco0;

import br.com.swconsultoria.efd.icms.registros.bloco0.Registro0450;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistro0450 {

    public static StringBuilder gerar(Registro0450 registro0450, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro0450.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro0450.getCod_inf()));
        sb.append("|").append(Util.preencheRegistro(registro0450.getTxt()));
        sb.append("|").append('\n');

        return sb;
    }
}
