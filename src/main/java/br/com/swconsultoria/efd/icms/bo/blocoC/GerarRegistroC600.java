package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC600;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC600 {

    public static StringBuilder gerar(RegistroC600 registroC600, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC600.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC600.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(registroC600.getCod_mun()));
        sb.append("|").append(Util.preencheRegistro(registroC600.getSer()));
        sb.append("|").append(Util.preencheRegistro(registroC600.getSub()));
        sb.append("|").append(Util.preencheRegistro(registroC600.getCod_cons()));
        sb.append("|").append(Util.preencheRegistro(registroC600.getQtd_cons()));
        sb.append("|").append(Util.preencheRegistro(registroC600.getQtd_canc()));
        sb.append("|").append(Util.preencheRegistro(registroC600.getDt_doc()));
        sb.append("|").append(Util.preencheRegistro(registroC600.getVl_doc()));
        sb.append("|").append(Util.preencheRegistro(registroC600.getVl_desc()));
        sb.append("|").append(Util.preencheRegistro(registroC600.getCons()));
        sb.append("|").append(Util.preencheRegistro(registroC600.getVl_forn()));
        sb.append("|").append(Util.preencheRegistro(registroC600.getVl_serv_nt()));
        sb.append("|").append(Util.preencheRegistro(registroC600.getVl_terc()));
        sb.append("|").append(Util.preencheRegistro(registroC600.getVl_da()));
        sb.append("|").append(Util.preencheRegistro(registroC600.getVl_bc_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC600.getVl_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC600.getVl_bc_icms_st()));
        sb.append("|").append(Util.preencheRegistro(registroC600.getVl_icms_st()));
        sb.append("|").append(Util.preencheRegistro(registroC600.getVl_pis()));
        sb.append("|").append(Util.preencheRegistro(registroC600.getVl_cofins()));
        sb.append("|").append('\n');

        return sb;
    }
}
