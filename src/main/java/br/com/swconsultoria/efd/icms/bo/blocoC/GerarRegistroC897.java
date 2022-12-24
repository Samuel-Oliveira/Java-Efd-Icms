package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC897;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC897 {

    public static StringBuilder gerar(RegistroC897 registroC897, StringBuilder sb) {
        sb.append("|").append(Util.preencheRegistro(registroC897.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC897.getCod_aj()));
        sb.append("|").append(Util.preencheRegistro(registroC897.getDescr_compl_aj()));
        sb.append("|").append(Util.preencheRegistro(registroC897.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroC897.getVl_bc_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC897.getAliq_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC897.getVl_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC897.getVl_outros()));
        sb.append("|").append('\n');
        return sb;
    }
}
