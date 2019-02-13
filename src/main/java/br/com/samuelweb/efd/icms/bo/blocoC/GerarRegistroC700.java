package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC700;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC700 {

    public static StringBuilder gerar(RegistroC700 registroC700, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC700.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC700.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(registroC700.getSer()));
        sb.append("|").append(Util.preencheRegistro(registroC700.getNro_ord_ini()));
        sb.append("|").append(Util.preencheRegistro(registroC700.getNro_ord_fin()));
        sb.append("|").append(Util.preencheRegistro(registroC700.getDt_doc_ini()));
        sb.append("|").append(Util.preencheRegistro(registroC700.getDt_doc_fin()));
        sb.append("|").append(Util.preencheRegistro(registroC700.getNom_mest()));
        sb.append("|").append(Util.preencheRegistro(registroC700.getChv_cod_dig()));
        sb.append("|").append('\n');

        return sb;
    }
}
