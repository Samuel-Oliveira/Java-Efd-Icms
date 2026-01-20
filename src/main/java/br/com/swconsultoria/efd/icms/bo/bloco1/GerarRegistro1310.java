package br.com.swconsultoria.efd.icms.bo.bloco1;

import br.com.swconsultoria.efd.icms.registros.EfdIcms;
import br.com.swconsultoria.efd.icms.registros.bloco1.Registro1310;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1310 {

    private GerarRegistro1310() {}

    public static StringBuilder gerar(EfdIcms efdIcms, Registro1310 registro1310, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro1310.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro1310.getNum_tanque()));
        sb.append("|").append(Util.preencheRegistro(registro1310.getEstq_abert()));
        sb.append("|").append(Util.preencheRegistro(registro1310.getVol_entr()));
        sb.append("|").append(Util.preencheRegistro(registro1310.getVol_disp()));
        sb.append("|").append(Util.preencheRegistro(registro1310.getVol_saidas()));
        sb.append("|").append(Util.preencheRegistro(registro1310.getEstq_escr()));
        sb.append("|").append(Util.preencheRegistro(registro1310.getVal_aj_perda()));
        sb.append("|").append(Util.preencheRegistro(registro1310.getVal_aj_ganho()));
        sb.append("|").append(Util.preencheRegistro(registro1310.getFech_fisico()));
        if (Util.versao2026(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
            sb.append("|").append(Util.preencheRegistro(registro1310.getCap_tanque()));
        }
        sb.append("|").append('\n');

        return sb;
    }
}
