package br.com.swconsultoria.efd.icms.bo.bloco0;

import br.com.swconsultoria.efd.icms.registros.bloco0.Registro0015;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistro0015 {

    public static StringBuilder gerar(Registro0015 registro0015, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro0015.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro0015.getUf_st()));
        sb.append("|").append(Util.preencheRegistro(registro0015.getIe_st()));
        sb.append("|").append('\n');

        return sb;
    }
}
