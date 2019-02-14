/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.bloco1;

import br.com.swconsultoria.efd.icms.registros.bloco1.Registro1320;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes - yurilemes2@gmail.com
 *
 */
public class GerarRegistro1320 {

    public static StringBuilder gerar(Registro1320 registro1320, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro1320.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro1320.getNum_bico()));
        sb.append("|").append(Util.preencheRegistro(registro1320.getNr_interv()));
        sb.append("|").append(Util.preencheRegistro(registro1320.getMot_interv()));
        sb.append("|").append(Util.preencheRegistro(registro1320.getNom_interv()));
        sb.append("|").append(Util.preencheRegistro(registro1320.getCnpj_interv()));
        sb.append("|").append(Util.preencheRegistro(registro1320.getCpf_interv()));
        sb.append("|").append(Util.preencheRegistro(registro1320.getVal_fecha()));
        sb.append("|").append(Util.preencheRegistro(registro1320.getVal_abert()));
        sb.append("|").append(Util.preencheRegistro(registro1320.getVol_aferi()));
        sb.append("|").append(Util.preencheRegistro(registro1320.getVol_vendas()));
        sb.append("|").append('\n');

        return sb;
    }
}
