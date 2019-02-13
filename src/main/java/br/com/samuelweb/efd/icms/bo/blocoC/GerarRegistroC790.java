package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC790;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC790 {

    public static StringBuilder gerar(RegistroC790 registroC790, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC790.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC790.getCst_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC790.getCfop()));
        sb.append("|").append(Util.preencheRegistro(registroC790.getAliq_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC790.getVl_opr()));
        sb.append("|").append(Util.preencheRegistro(registroC790.getVl_bc_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC790.getVl_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC790.getVl_bc_icms_st()));
        sb.append("|").append(Util.preencheRegistro(registroC790.getVl_icms_st()));
        sb.append("|").append(Util.preencheRegistro(registroC790.getVl_red_bc()));
        sb.append("|").append(Util.preencheRegistro(registroC790.getCod_obs()));
        sb.append("|").append('\n');

        return sb;
    }
}
