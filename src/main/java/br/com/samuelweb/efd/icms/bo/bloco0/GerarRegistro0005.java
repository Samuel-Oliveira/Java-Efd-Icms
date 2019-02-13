package br.com.samuelweb.efd.icms.bo.bloco0;

import br.com.samuelweb.efd.icms.registros.bloco0.Registro0005;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistro0005 {

    public static StringBuilder gerar(Registro0005 registro0005, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro0005.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro0005.getFantasia()));
        sb.append("|").append(Util.preencheRegistro(registro0005.getCep()));
        sb.append("|").append(Util.preencheRegistro(registro0005.getEnd()));
        sb.append("|").append(Util.preencheRegistro(registro0005.getNum()));
        sb.append("|").append(Util.preencheRegistro(registro0005.getCompl()));
        sb.append("|").append(Util.preencheRegistro(registro0005.getBairro()));
        sb.append("|").append(Util.preencheRegistro(registro0005.getFone()));
        sb.append("|").append(Util.preencheRegistro(registro0005.getFax()));
        sb.append("|").append(Util.preencheRegistro(registro0005.getEmail()));
        sb.append("|").append('\n');

        return sb;
    }
}
