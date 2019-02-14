/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.blocoD.RegistroD600;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD600 {

    public static StringBuilder gerar(RegistroD600 registroD600, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD600.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD600.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(registroD600.getCod_mun()));
        sb.append("|").append(Util.preencheRegistro(registroD600.getSer()));
        sb.append("|").append(Util.preencheRegistro(registroD600.getSub()));
        sb.append("|").append(Util.preencheRegistro(registroD600.getCod_cons()));
        sb.append("|").append(Util.preencheRegistro(registroD600.getQtd_cons()));
        sb.append("|").append(Util.preencheRegistro(registroD600.getDt_doc()));
        sb.append("|").append(Util.preencheRegistro(registroD600.getVl_doc()));
        sb.append("|").append(Util.preencheRegistro(registroD600.getVl_desc()));
        sb.append("|").append(Util.preencheRegistro(registroD600.getVl_serv()));
        sb.append("|").append(Util.preencheRegistro(registroD600.getVl_serv_nt()));
        sb.append("|").append(Util.preencheRegistro(registroD600.getVl_terc()));
        sb.append("|").append(Util.preencheRegistro(registroD600.getVl_da()));
        sb.append("|").append(Util.preencheRegistro(registroD600.getVl_bc_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD600.getVl_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD600.getVl_pis()));
        sb.append("|").append(Util.preencheRegistro(registroD600.getVl_cofins()));
        sb.append("|").append('\n');

        return sb;
    }
}
