package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC100;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC100 {

    public static StringBuilder gerar(RegistroC100 registroC100, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC100.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getInd_oper()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getInd_emit()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getCod_part()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getCod_sit()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getSer()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getNum_doc()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getChv_nfe()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getDt_doc()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getDt_e_s()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getVl_doc()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getInd_pagto()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getVl_desc()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getVl_abat_nt()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getVl_merc()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getInd_frt()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getVl_frt()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getVl_seg()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getVl_out_da()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getVl_bc_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getVl_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getVl_bc_icms_st()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getVl_icms_st()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getVl_ipi()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getVl_pis()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getVl_cofins()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getVl_pis_st()));
        sb.append("|").append(Util.preencheRegistro(registroC100.getVl_cofins_st()));
        sb.append("|").append('\n');

        return sb;
    }
}
