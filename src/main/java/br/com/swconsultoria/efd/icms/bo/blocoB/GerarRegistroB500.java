package br.com.swconsultoria.efd.icms.bo.blocoB;

import br.com.swconsultoria.efd.icms.registros.blocoB.RegistroB500;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Sidnei Klein
 */
public class GerarRegistroB500 {

    public static StringBuilder gerar(RegistroB500 reg, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(reg.getReg()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_rec()));
        sb.append("|").append(Util.preencheRegistro(reg.getQtde_prof()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_or()));
        sb.append("|").append('\n');

        return sb;
    }
}
