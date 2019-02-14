package br.com.swconsultoria.efd.icms.bo.blocoB;

import br.com.swconsultoria.efd.icms.registros.blocoB.RegistroB030;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Sidnei Klein
 */
public class GerarRegistroB030 {

    public static StringBuilder gerar(RegistroB030 reg, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(reg.getReg()));
        sb.append("|").append(Util.preencheRegistro(reg.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(reg.getSer()));
        sb.append("|").append(Util.preencheRegistro(reg.getNum_doc_ini()));
        sb.append("|").append(Util.preencheRegistro(reg.getNum_doc_fin()));
        sb.append("|").append(Util.preencheRegistro(reg.getDt_doc()));
        sb.append("|").append(Util.preencheRegistro(reg.getQtde_canc()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_cont()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_isnt_iss()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_bc_iss()));
        sb.append("|").append(Util.preencheRegistro(reg.getVl_iss()));
        sb.append("|").append(Util.preencheRegistro(reg.getCod_inf_obs()));
        sb.append("|").append('\n');

        return sb;
    }
}
