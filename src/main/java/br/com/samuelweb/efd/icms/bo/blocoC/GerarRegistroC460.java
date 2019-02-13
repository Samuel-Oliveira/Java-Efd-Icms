package br.com.samuelweb.efd.icms.bo.blocoC;

import br.com.samuelweb.efd.icms.registros.blocoC.RegistroC460;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC460 {

    public static StringBuilder gerar(RegistroC460 registroC460, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC460.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC460.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(registroC460.getCod_sit()));
        sb.append("|").append(Util.preencheRegistro(registroC460.getNum_doc()));
        sb.append("|").append(Util.preencheRegistro(registroC460.getDt_doc()));
        sb.append("|").append(Util.preencheRegistro(registroC460.getVl_doc()));
        sb.append("|").append(Util.preencheRegistro(registroC460.getVl_pis()));
        sb.append("|").append(Util.preencheRegistro(registroC460.getVl_cofins()));
        sb.append("|").append(Util.preencheRegistro(registroC460.getCpf_cnpj()));
        sb.append("|").append(Util.preencheRegistro(registroC460.getNom_adq()));
        sb.append("|").append('\n');

        return sb;
    }
}
