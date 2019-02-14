package br.com.swconsultoria.efd.icms.bo.blocoB;

import br.com.swconsultoria.efd.icms.registros.blocoB.RegistroB460;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Sidnei Klein
 */
public class GerarRegistroB460 {

    public static StringBuilder gerar(RegistroB460 reg, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(reg.getReg()));
        sb.append("|").append(Util.preencheRegistro(reg.getInd_ded()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_ded()));
        sb.append("|").append(Util.preencheRegistro(reg.getNum_proc()));
        sb.append("|").append(Util.preencheRegistro(reg.getInd_proc()));
        sb.append("|").append(Util.preencheRegistro(reg.getProc()));
        sb.append("|").append(Util.preencheRegistro(reg.getCod_inf_obs()));
        sb.append("|").append(Util.preencheRegistro(reg.getInd_obr()));
        sb.append("|").append('\n');

        return sb;
    }
}
