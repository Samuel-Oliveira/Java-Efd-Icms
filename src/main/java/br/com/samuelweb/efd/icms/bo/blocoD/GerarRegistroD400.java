/**
 *
 */
package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD400;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes - yurilemes2@gmail.com
 *
 */
public class GerarRegistroD400 {

    public static StringBuilder gerar(RegistroD400 registroD400, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD400.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD400.getCod_part()));
        sb.append("|").append(Util.preencheRegistro(registroD400.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(registroD400.getCod_sit()));
        sb.append("|").append(Util.preencheRegistro(registroD400.getSer()));
        sb.append("|").append(Util.preencheRegistro(registroD400.getSub()));
        sb.append("|").append(Util.preencheRegistro(registroD400.getNum_doc()));
        sb.append("|").append(Util.preencheRegistro(registroD400.getDt_doc()));
        sb.append("|").append(Util.preencheRegistro(registroD400.getVl_doc()));
        sb.append("|").append(Util.preencheRegistro(registroD400.getVl_desc()));
        sb.append("|").append(Util.preencheRegistro(registroD400.getVl_serv()));
        sb.append("|").append(Util.preencheRegistro(registroD400.getVl_bc_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD400.getVl_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD400.getVl_pis()));
        sb.append("|").append(Util.preencheRegistro(registroD400.getVl_cofins()));
        sb.append("|").append(Util.preencheRegistro(registroD400.getCod_cta()));
        sb.append("|").append('\n');

        return sb;
    }
}
