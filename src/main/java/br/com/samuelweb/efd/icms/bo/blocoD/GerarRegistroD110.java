package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD110;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD110 {

    public static StringBuilder gerar(RegistroD110 registroD110, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD110.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD110.getNum_item()));
        sb.append("|").append(Util.preencheRegistro(registroD110.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registroD110.getVl_serv()));
        sb.append("|").append(Util.preencheRegistro(registroD110.getVl_out()));
        sb.append("|").append('\n');

        return sb;
    }
}
