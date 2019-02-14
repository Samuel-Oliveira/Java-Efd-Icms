package br.com.swconsultoria.efd.icms.bo.blocoB;

import br.com.swconsultoria.efd.icms.registros.blocoB.RegistroB440;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Sidnei Klein
 */
public class GerarRegistroB440 {

    public static StringBuilder gerar(RegistroB440 reg, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(reg.getReg()));
        sb.append("|").append(Util.preencheRegistro(reg.getInd_oper()));
        sb.append("|").append(Util.preencheRegistro(reg.getCod_part()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_cont_rt()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_bc_iss_rt()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_iss_rt()));
        sb.append("|").append('\n');

        return sb;
    }
}
