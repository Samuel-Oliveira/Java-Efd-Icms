package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.blocoD.RegistroD737;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroD737 {

    public static StringBuilder gerar(RegistroD737 registroD737, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD737.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD737.getCod_aj()));
        sb.append("|").append(Util.preencheRegistro(registroD737.getDescr_compl_aj()));
        sb.append("|").append(Util.preencheRegistro(registroD737.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroD737.getVl_bc_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD737.getAliq_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD737.getVl_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD737.getVl_outros()));
        sb.append("|").append('\n');

        return sb;
    }
}
