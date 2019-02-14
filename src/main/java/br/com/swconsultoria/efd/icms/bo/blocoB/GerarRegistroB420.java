package br.com.swconsultoria.efd.icms.bo.blocoB;

import br.com.swconsultoria.efd.icms.registros.blocoB.RegistroB420;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Sidnei Klein
 */
public class GerarRegistroB420 {

    public static StringBuilder gerar(RegistroB420 reg, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(reg.getReg()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_cont()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_bc_iss()));
        sb.append("|").append(Util.preencheRegistro(reg.getAliq_iss()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_isnt_iss()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_iss()));
        sb.append("|").append(Util.preencheRegistro(reg.getCod_serv()));
        sb.append("|").append('\n');

        return sb;
    }
}
