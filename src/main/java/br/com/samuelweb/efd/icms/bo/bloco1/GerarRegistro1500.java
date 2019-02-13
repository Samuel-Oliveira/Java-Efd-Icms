/**
 *
 */
package br.com.samuelweb.efd.icms.bo.bloco1;

import br.com.samuelweb.efd.icms.registros.bloco1.Registro1500;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1500 {

    public static StringBuilder gerar(Registro1500 registro1500, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro1500.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getInd_oper()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getInd_emit()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getCod_part()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getCod_sit()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getSer()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getSub()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getCod_cons()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getNum_doc()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getDt_doc()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getDt_e_s()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getVl_doc()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getVl_desc()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getVl_forn()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getVl_serv_nt()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getVl_terc()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getVl_da()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getVl_bc_icms()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getVl_icms()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getVl_bc_icms_st()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getVl_icms_st()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getCod_inf()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getVl_pis()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getVl_cofins()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getTp_ligacao()));
        sb.append("|").append(Util.preencheRegistro(registro1500.getCod_grupo_tensao()));
        sb.append("|").append('\n');

        return sb;
    }
}
