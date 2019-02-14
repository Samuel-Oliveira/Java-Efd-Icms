package br.com.swconsultoria.efd.icms.bo.bloco1;

import br.com.swconsultoria.efd.icms.registros.bloco1.Registro1001;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistro1001 {

    public static StringBuilder gerar(Registro1001 registro1001, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro1001.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro1001.getInd_mov()));
        sb.append("|").append('\n');

        return sb;
    }
}
