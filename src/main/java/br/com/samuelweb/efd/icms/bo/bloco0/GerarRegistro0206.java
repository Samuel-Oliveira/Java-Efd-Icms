package br.com.samuelweb.efd.icms.bo.bloco0;

import br.com.samuelweb.efd.icms.registros.bloco0.Registro0206;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistro0206 {

    public static StringBuilder gerar(Registro0206 registro0206, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro0206.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro0206.getCod_comb()));
        sb.append("|").append('\n');

        return sb;
    }
}
