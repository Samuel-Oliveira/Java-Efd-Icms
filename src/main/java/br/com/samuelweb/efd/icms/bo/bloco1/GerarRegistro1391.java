/**
 *
 */
package br.com.samuelweb.efd.icms.bo.bloco1;

import br.com.samuelweb.efd.icms.registros.bloco1.Registro1391;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1391 {

    public static StringBuilder gerar(Registro1391 registro1391, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro1391.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro1391.getDt_registro()));
        sb.append("|").append(Util.preencheRegistro(registro1391.getQtd_moid()));
        sb.append("|").append(Util.preencheRegistro(registro1391.getEstq_ini()));
        sb.append("|").append(Util.preencheRegistro(registro1391.getQtd_produz()));
        sb.append("|").append(Util.preencheRegistro(registro1391.getEnt_anid_hid()));
        sb.append("|").append(Util.preencheRegistro(registro1391.getOutr_entr()));
        sb.append("|").append(Util.preencheRegistro(registro1391.getPerda()));
        sb.append("|").append(Util.preencheRegistro(registro1391.getCons()));
        sb.append("|").append(Util.preencheRegistro(registro1391.getSai_ani_hid()));
        sb.append("|").append(Util.preencheRegistro(registro1391.getSaidas()));
        sb.append("|").append(Util.preencheRegistro(registro1391.getEstq_fin()));
        sb.append("|").append(Util.preencheRegistro(registro1391.getEstq_ini_mel()));
        sb.append("|").append(Util.preencheRegistro(registro1391.getProd_dia_mel()));
        sb.append("|").append(Util.preencheRegistro(registro1391.getUtil_mel()));
        sb.append("|").append(Util.preencheRegistro(registro1391.getProd_alc_mel()));
        sb.append("|").append(Util.preencheRegistro(registro1391.getObs()));
        sb.append("|").append('\n');

        return sb;
    }
}
