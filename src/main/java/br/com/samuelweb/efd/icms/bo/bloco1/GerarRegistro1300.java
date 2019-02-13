/**
 *
 */
package br.com.samuelweb.efd.icms.bo.bloco1;

import br.com.samuelweb.efd.icms.registros.bloco1.Registro1300;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1300 {

    public static StringBuilder gerar(Registro1300 registro1300, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro1300.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro1300.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registro1300.getDt_fech()));
        sb.append("|").append(Util.preencheRegistro(registro1300.getEstq_abert()));
        sb.append("|").append(Util.preencheRegistro(registro1300.getVol_entr()));
        sb.append("|").append(Util.preencheRegistro(registro1300.getVol_disp()));
        sb.append("|").append(Util.preencheRegistro(registro1300.getVol_saidas()));
        sb.append("|").append(Util.preencheRegistro(registro1300.getEstq_escr()));
        sb.append("|").append(Util.preencheRegistro(registro1300.getVal_aj_perda()));
        sb.append("|").append(Util.preencheRegistro(registro1300.getVal_aj_ganho()));
        sb.append("|").append(Util.preencheRegistro(registro1300.getFech_fisico()));
        sb.append("|").append('\n');

        return sb;
    }
}
