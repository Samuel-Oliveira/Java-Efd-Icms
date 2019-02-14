package br.com.swconsultoria.efd.icms.bo.bloco0;

import br.com.swconsultoria.efd.icms.registros.bloco0.Registro0305;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistro0305 {

    public static StringBuilder gerar(Registro0305 registro0305, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro0305.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro0305.getCod_ccus()));
        sb.append("|").append(Util.preencheRegistro(registro0305.getFunc()));
        sb.append("|").append(Util.preencheRegistro(registro0305.getVida_util()));
        sb.append("|").append('\n');

        return sb;
    }
}
