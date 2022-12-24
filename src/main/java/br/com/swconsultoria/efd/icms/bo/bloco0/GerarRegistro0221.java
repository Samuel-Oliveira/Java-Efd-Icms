package br.com.swconsultoria.efd.icms.bo.bloco0;

import br.com.swconsultoria.efd.icms.registros.EfdIcms;
import br.com.swconsultoria.efd.icms.registros.bloco0.Registro0221;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistro0221 {

    public static StringBuilder gerar(EfdIcms efdIcms, Registro0221 registro0221, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro0221.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro0221.getCod_item_atomico()));
        sb.append("|").append(Util.preencheRegistro(registro0221.getQtd_contida()));
        sb.append("|").append('\n');

        return sb;
    }
}
