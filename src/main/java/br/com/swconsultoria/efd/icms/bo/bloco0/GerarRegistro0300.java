package br.com.swconsultoria.efd.icms.bo.bloco0;

import br.com.swconsultoria.efd.icms.registros.bloco0.Registro0300;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistro0300 {

    public static StringBuilder gerar(Registro0300 registro0300, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro0300.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro0300.getCod_ind_bem()));
        sb.append("|").append(Util.preencheRegistro(registro0300.getIdent_merc()));
        sb.append("|").append(Util.preencheRegistro(registro0300.getDescr_item()));
        sb.append("|").append(Util.preencheRegistro(registro0300.getCod_prnc()));
        sb.append("|").append(Util.preencheRegistro(registro0300.getCod_cta()));
        sb.append("|").append(Util.preencheRegistro(registro0300.getNr_parc()));
        sb.append("|").append('\n');

        return sb;
    }
}
