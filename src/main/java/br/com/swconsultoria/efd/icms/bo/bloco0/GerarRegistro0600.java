/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.bloco0;

import br.com.swconsultoria.efd.icms.registros.bloco0.Registro0600;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarRegistro0600 {

    public static StringBuilder gerar(Registro0600 registro0600, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro0600.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro0600.getDt_alt()));
        sb.append("|").append(Util.preencheRegistro(registro0600.getCod_ccus()));
        sb.append("|").append(Util.preencheRegistro(registro0600.getCcus()));
        sb.append("|").append('\n');

        return sb;
    }

}
