package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC810;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC810 {

    public static StringBuilder gerar(RegistroC810 registroC810, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC810.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC810.getNum_item()));
        sb.append("|").append(Util.preencheRegistro(registroC810.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroC810.getQtd()));
        sb.append("|").append(Util.preencheRegistro(registroC810.getUnid()));
        sb.append("|").append(Util.preencheRegistro(registroC810.getVl_item()));
        sb.append("|").append(Util.preencheRegistro(registroC810.getCst_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC810.getCfop()));
        sb.append("|").append('\n');

        return sb;
    }
}
