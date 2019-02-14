/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.bloco1;

import br.com.swconsultoria.efd.icms.registros.bloco1.Registro1960;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Sidnei Klein
 *
 */
public class GerarRegistro1960 {

    public static StringBuilder gerar(Registro1960 reg, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(reg.getReg()));
        sb.append("|").append(Util.preencheRegistro(reg.getInd_ap()));
        sb.append("|").append(Util.preencheRegistro(reg.getG1_01()));
        sb.append("|").append(Util.preencheRegistro(reg.getG1_02()));
        sb.append("|").append(Util.preencheRegistro(reg.getG1_03()));
        sb.append("|").append(Util.preencheRegistro(reg.getG1_04()));
        sb.append("|").append(Util.preencheRegistro(reg.getG1_05()));
        sb.append("|").append(Util.preencheRegistro(reg.getG1_06()));
        sb.append("|").append(Util.preencheRegistro(reg.getG1_07()));
        sb.append("|").append(Util.preencheRegistro(reg.getG1_08()));
        sb.append("|").append(Util.preencheRegistro(reg.getG1_09()));
        sb.append("|").append(Util.preencheRegistro(reg.getG1_10()));
        sb.append("|").append(Util.preencheRegistro(reg.getG1_11()));
        sb.append("|").append('\n');

        return sb;
    }
}
