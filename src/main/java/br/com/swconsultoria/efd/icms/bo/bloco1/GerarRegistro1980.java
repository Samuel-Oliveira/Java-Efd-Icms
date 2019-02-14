/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.bloco1;

import br.com.swconsultoria.efd.icms.registros.bloco1.Registro1980;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Sidnei Klein
 *
 */
public class GerarRegistro1980 {

    public static StringBuilder gerar(Registro1980 reg, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(reg.getReg()));
        sb.append("|").append(Util.preencheRegistro(reg.getInd_ap()));
        sb.append("|").append(Util.preencheRegistro(reg.getG4_01()));
        sb.append("|").append(Util.preencheRegistro(reg.getG4_02()));
        sb.append("|").append(Util.preencheRegistro(reg.getG4_03()));
        sb.append("|").append(Util.preencheRegistro(reg.getG4_04()));
        sb.append("|").append(Util.preencheRegistro(reg.getG4_05()));
        sb.append("|").append(Util.preencheRegistro(reg.getG4_06()));
        sb.append("|").append(Util.preencheRegistro(reg.getG4_07()));
        sb.append("|").append(Util.preencheRegistro(reg.getG4_08()));
        sb.append("|").append(Util.preencheRegistro(reg.getG4_09()));
        sb.append("|").append(Util.preencheRegistro(reg.getG4_10()));
        sb.append("|").append(Util.preencheRegistro(reg.getG4_11()));
        sb.append("|").append(Util.preencheRegistro(reg.getG4_12()));
        sb.append("|").append('\n');

        return sb;
    }
}
