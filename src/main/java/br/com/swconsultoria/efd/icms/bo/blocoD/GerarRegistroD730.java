package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.blocoD.RegistroD730;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroD730 {

    public static StringBuilder gerar(RegistroD730 registroD730, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD730.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD730.getCst_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD730.getCfop()));
        sb.append("|").append(Util.preencheRegistro(registroD730.getAliq_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD730.getVl_opr()));
        sb.append("|").append(Util.preencheRegistro(registroD730.getVl_bc_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD730.getVl_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD730.getCod_obs()));
        sb.append("|").append('\n');

        return sb;
    }
}
