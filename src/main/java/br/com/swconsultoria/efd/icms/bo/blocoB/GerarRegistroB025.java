package br.com.swconsultoria.efd.icms.bo.blocoB;

import br.com.swconsultoria.efd.icms.registros.blocoB.RegistroB025;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Sidnei Klein
 */
public class GerarRegistroB025 {

    public static StringBuilder gerar(RegistroB025 reg, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(reg.getReg()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_cont_p()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_bc_iss_p()));
        sb.append("|").append(Util.preencheRegistro(reg.getAliq_iss()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_iss_p()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_isnt_iss_p()));
        sb.append("|").append(Util.preencheRegistro(reg.getCod_serv()));
        sb.append("|").append('\n');

        return sb;
    }
}
