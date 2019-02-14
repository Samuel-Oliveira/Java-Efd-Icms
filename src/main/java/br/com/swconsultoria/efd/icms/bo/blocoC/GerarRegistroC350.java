package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC350;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC350 {

    public static StringBuilder gerar(RegistroC350 registroC350, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC350.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC350.getSer()));
        sb.append("|").append(Util.preencheRegistro(registroC350.getSub_ser()));
        sb.append("|").append(Util.preencheRegistro(registroC350.getNum_doc()));
        sb.append("|").append(Util.preencheRegistro(registroC350.getDt_doc()));
        sb.append("|").append(Util.preencheRegistro(registroC350.getCnpj_cpf()));
        sb.append("|").append(Util.preencheRegistro(registroC350.getVl_merc()));
        sb.append("|").append(Util.preencheRegistro(registroC350.getVl_doc()));
        sb.append("|").append(Util.preencheRegistro(registroC350.getVl_desc()));
        sb.append("|").append(Util.preencheRegistro(registroC350.getVl_pis()));
        sb.append("|").append(Util.preencheRegistro(registroC350.getVl_cofins()));
        sb.append("|").append(Util.preencheRegistro(registroC350.getCod_cta()));
        sb.append("|").append('\n');

        return sb;
    }
}
