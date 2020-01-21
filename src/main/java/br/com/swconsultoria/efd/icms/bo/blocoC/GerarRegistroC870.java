package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC870;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC870 {

    public static StringBuilder gerar(RegistroC870 registroC870, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC870.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC870.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroC870.getQtd()));
        sb.append("|").append(Util.preencheRegistro(registroC870.getUnid()));
        sb.append("|").append(Util.preencheRegistro(registroC870.getCst_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC870.getCfop()));
        sb.append("|").append('\n');

        return sb;
    }
}
