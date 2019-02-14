package br.com.swconsultoria.efd.icms.bo.blocoB;

import br.com.swconsultoria.efd.icms.registros.blocoB.RegistroB350;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Sidnei Klein
 */
public class GerarRegistroB350 {

    public static StringBuilder gerar(RegistroB350 reg, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(reg.getReg()));
        sb.append("|").append(Util.preencheRegistro(reg.getCod_ctd()));
        sb.append("|").append(Util.preencheRegistro(reg.getCta_iss()));
        sb.append("|").append(Util.preencheRegistro(reg.getCta_cosif()));
        sb.append("|").append(Util.preencheRegistro(reg.getQtde_ocor()));
        sb.append("|").append(Util.preencheRegistro(reg.getCod_serv()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_cont()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_bc_iss()));
        sb.append("|").append(Util.preencheRegistro(reg.getAliq_iss()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_iss()));
        sb.append("|").append(Util.preencheRegistro(reg.getCod_inf_obs()));
        sb.append("|").append('\n');

        return sb;
    }
}
