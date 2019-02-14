package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC179;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC179 {

    public static StringBuilder gerar(RegistroC179 registroC179, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC179.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC179.getBc_st_orig_dest()));
        sb.append("|").append(Util.preencheRegistro(registroC179.getIcms_st_rep()));
        sb.append("|").append(Util.preencheRegistro(registroC179.getIcms_st_compl()));
        sb.append("|").append(Util.preencheRegistro(registroC179.getBc_ret()));
        sb.append("|").append(Util.preencheRegistro(registroC179.getIcms_ret()));
        sb.append("|").append('\n');

        return sb;
    }
}
