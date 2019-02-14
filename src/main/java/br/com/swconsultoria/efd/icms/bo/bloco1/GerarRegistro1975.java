/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.bloco1;

import br.com.swconsultoria.efd.icms.registros.bloco1.Registro1975;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Sidnei Klein
 *
 */
public class GerarRegistro1975 {

    public static StringBuilder gerar(Registro1975 reg, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(reg.getReg()));
        sb.append("|").append(Util.preencheRegistro(reg.getAliq_imp_base()));
        sb.append("|").append(Util.preencheRegistro(reg.getG3_10()));
        sb.append("|").append(Util.preencheRegistro(reg.getG3_11()));
        sb.append("|").append(Util.preencheRegistro(reg.getG3_12()));
        sb.append("|").append('\n');

        return sb;
    }
}
