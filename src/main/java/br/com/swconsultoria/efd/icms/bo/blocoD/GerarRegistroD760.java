package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.blocoD.RegistroD760;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroD760 {

    public static StringBuilder gerar(RegistroD760 registroD760, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD760.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD760.getCst_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD760.getCfop()));
        sb.append("|").append(Util.preencheRegistro(registroD760.getAliq_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD760.getVl_opr()));
        sb.append("|").append(Util.preencheRegistro(registroD760.getVl_bc_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD760.getVl_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD760.getCod_obs()));
        sb.append("|").append('\n');

        return sb;
    }
}
