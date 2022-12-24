package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC857;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC857 {

    public static StringBuilder gerar(RegistroC857 registroC857, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC857.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC857.getCod_aj()));
        sb.append("|").append(Util.preencheRegistro(registroC857.getDescr_compl_aj()));
        sb.append("|").append(Util.preencheRegistro(registroC857.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroC857.getVl_bc_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC857.getAliq_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC857.getVl_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC857.getVl_outros()));
        sb.append("|").append('\n');

        return sb;
    }
}
