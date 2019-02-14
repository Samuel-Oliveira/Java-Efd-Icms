package br.com.swconsultoria.efd.icms.bo.blocoB;

import br.com.swconsultoria.efd.icms.registros.blocoB.RegistroB470;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Sidnei Klein
 */
public class GerarRegistroB470 {

    public static StringBuilder gerar(RegistroB470 reg, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(reg.getReg()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_cont()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_mat_terc()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_mat_prop()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_sub()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_isnt()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_ded_bc()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_bc_iss()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_bc_iss_rt()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_iss()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_iss_rt()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_ded()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_iss_rec()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_iss_st()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_iss_rec_uni()));
        sb.append("|").append('\n');

        return sb;
    }
}
