/**
 *
 */
package br.com.samuelweb.efd.icms.bo.bloco1;

import br.com.samuelweb.efd.icms.registros.bloco1.Registro1010;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes, Sidnei Klein
 *
 */
public class GerarRegistro1010 {

    public static StringBuilder gerar(Registro1010 registro1010, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro1010.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro1010.getInd_exp()));
        sb.append("|").append(Util.preencheRegistro(registro1010.getInd_ccrf()));
        sb.append("|").append(Util.preencheRegistro(registro1010.getInd_comb()));
        sb.append("|").append(Util.preencheRegistro(registro1010.getInd_usina()));
        sb.append("|").append(Util.preencheRegistro(registro1010.getInd_va()));
        sb.append("|").append(Util.preencheRegistro(registro1010.getInd_ee()));
        sb.append("|").append(Util.preencheRegistro(registro1010.getInd_cart()));
        sb.append("|").append(Util.preencheRegistro(registro1010.getInd_form()));
        sb.append("|").append(Util.preencheRegistro(registro1010.getInd_aer()));
        sb.append("|").append(Util.preencheRegistro(registro1010.getInd_giaf1()));
        sb.append("|").append(Util.preencheRegistro(registro1010.getInd_giaf3()));
        sb.append("|").append(Util.preencheRegistro(registro1010.getInd_giaf4()));

        sb.append("|").append('\n');

        return sb;
    }
}
