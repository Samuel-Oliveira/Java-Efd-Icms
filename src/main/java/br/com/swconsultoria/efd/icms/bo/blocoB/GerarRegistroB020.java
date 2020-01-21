package br.com.swconsultoria.efd.icms.bo.blocoB;

import br.com.swconsultoria.efd.icms.registros.blocoB.RegistroB020;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Sidnei Klein
 */
public class GerarRegistroB020 {

    public static StringBuilder gerar(RegistroB020 reg, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(reg.getReg()));
        sb.append("|").append(Util.preencheRegistro(reg.getInd_oper()));
        sb.append("|").append(Util.preencheRegistro(reg.getInd_emit()));
        sb.append("|").append(Util.preencheRegistro(reg.getCod_part()));
        sb.append("|").append(Util.preencheRegistro(reg.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(reg.getCod_sit()));
        sb.append("|").append(Util.preencheRegistro(reg.getSer()));
        sb.append("|").append(Util.preencheRegistro(reg.getNum_doc()));
        sb.append("|").append(Util.preencheRegistro(reg.getChv_nfe()));
        sb.append("|").append(Util.preencheRegistro(reg.getDt_doc()));
        sb.append("|").append(Util.preencheRegistro(reg.getCod_mun_serv()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_cont()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_mat_terc()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_sub()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_isnt_iss()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_ded_bc()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_bc_iss()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_bc_iss_rt()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_iss_rt()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_iss()));
        sb.append("|").append(Util.preencheRegistro(reg.getCod_inf_obs()));
        sb.append("|").append('\n');

        return sb;
    }
}
