package br.com.swconsultoria.efd.icms.bo.bloco0;

import br.com.swconsultoria.efd.icms.registros.bloco0.Registro0000;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistro0000 {

    public static StringBuilder gerar(Registro0000 registro0000, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro0000.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro0000.getCod_ver()));
        sb.append("|").append(Util.preencheRegistro(registro0000.getCod_fin()));
        sb.append("|").append(Util.preencheRegistro(registro0000.getDt_ini()));
        sb.append("|").append(Util.preencheRegistro(registro0000.getDt_fin()));
        sb.append("|").append(Util.preencheRegistro(registro0000.getNome()));
        sb.append("|").append(Util.preencheRegistro(registro0000.getCnpj()));
        sb.append("|").append(Util.preencheRegistro(registro0000.getCpf()));
        sb.append("|").append(Util.preencheRegistro(registro0000.getUf()));
        sb.append("|").append(Util.preencheRegistro(registro0000.getIe()));
        sb.append("|").append(Util.preencheRegistro(registro0000.getCod_mun()));
        sb.append("|").append(Util.preencheRegistro(registro0000.getIm()));
        sb.append("|").append(Util.preencheRegistro(registro0000.getSuframa()));
        sb.append("|").append(Util.preencheRegistro(registro0000.getInd_perfil()));
        sb.append("|").append(Util.preencheRegistro(registro0000.getInd_ativ()));
        sb.append("|").append('\n');

        return sb;
    }
}
