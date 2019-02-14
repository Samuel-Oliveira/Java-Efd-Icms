package br.com.swconsultoria.efd.icms.bo.bloco9;

import br.com.swconsultoria.efd.icms.registros.bloco9.Registro9001;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistro9001 {

    public static StringBuilder gerar(Registro9001 registro9001, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro9001.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro9001.getInd_mov()));
        sb.append("|").append('\n');

        return sb;
    }
}
