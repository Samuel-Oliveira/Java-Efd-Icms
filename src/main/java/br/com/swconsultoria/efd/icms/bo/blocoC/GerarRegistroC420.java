package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC420;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC420 {

    public static StringBuilder gerar(RegistroC420 registroC420, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC420.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC420.getCod_tot_par()));
        sb.append("|").append(Util.preencheRegistro(registroC420.getVlr_acum_tot()));
        sb.append("|").append(Util.preencheRegistro(registroC420.getNr_tot()));
        sb.append("|").append(Util.preencheRegistro(registroC420.getDescr_nr_tot()));
        sb.append("|").append('\n');

        return sb;
    }
}
