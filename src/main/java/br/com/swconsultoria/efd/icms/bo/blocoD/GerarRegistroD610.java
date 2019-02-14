/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.blocoD.RegistroD610;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD610 {

    public static StringBuilder gerar(RegistroD610 registroD610, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD610.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD610.getCod_class()));
        sb.append("|").append(Util.preencheRegistro(registroD610.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroD610.getQtd()));
        sb.append("|").append(Util.preencheRegistro(registroD610.getUnid()));
        sb.append("|").append(Util.preencheRegistro(registroD610.getVl_item()));
        sb.append("|").append(Util.preencheRegistro(registroD610.getVl_desc()));
        sb.append("|").append(Util.preencheRegistro(registroD610.getCst_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD610.getCfop()));
        sb.append("|").append(Util.preencheRegistro(registroD610.getAliq_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD610.getVl_bc_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD610.getVl_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD610.getVl_bc_icms_uf()));
        sb.append("|").append(Util.preencheRegistro(registroD610.getVl_icms_uf()));
        sb.append("|").append(Util.preencheRegistro(registroD610.getVl_red_bc()));
        sb.append("|").append(Util.preencheRegistro(registroD610.getVl_pis()));
        sb.append("|").append(Util.preencheRegistro(registroD610.getVl_cofins()));
        sb.append("|").append(Util.preencheRegistro(registroD610.getCod_cta()));
        sb.append("|").append('\n');

        return sb;
    }
}
