package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC690;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC690 {

    public static StringBuilder gerar(RegistroC690 registroC690, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC690.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC690.getCst_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC690.getCfop()));
        sb.append("|").append(Util.preencheRegistro(registroC690.getAliq_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC690.getVl_opr()));
        sb.append("|").append(Util.preencheRegistro(registroC690.getVl_bc_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC690.getVl_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC690.getVl_red_bc()));
        sb.append("|").append(Util.preencheRegistro(registroC690.getVl_bc_icms_st()));
        sb.append("|").append(Util.preencheRegistro(registroC690.getVl_icms_st()));
        sb.append("|").append(Util.preencheRegistro(registroC690.getCod_obs()));
        sb.append("|").append('\n');

        return sb;
    }
}
