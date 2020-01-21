package br.com.swconsultoria.efd.icms.bo.blocoC;

import br.com.swconsultoria.efd.icms.registros.EfdIcms;
import br.com.swconsultoria.efd.icms.registros.blocoC.RegistroC500;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroC500 {

    public static StringBuilder gerar(EfdIcms efdIcms, RegistroC500 registroC500, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroC500.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getInd_oper()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getInd_emit()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getCod_part()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getCod_sit()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getSer()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getSub()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getCod_cons()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getNum_doc()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getDt_doc()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getDt_e_s()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getVl_doc()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getVl_desc()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getVl_forn()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getVl_serv_nt()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getVl_terc()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getVl_da()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getVl_bc_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getVl_icms()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getVl_bc_icms_st()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getVl_icms_st()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getCod_inf()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getVl_pis()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getVl_cofins()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getTp_ligacao()));
        sb.append("|").append(Util.preencheRegistro(registroC500.getCod_grupo_tensao()));
        if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
            sb.append("|").append(Util.preencheRegistro(registroC500.getChv_doc_e()));
            sb.append("|").append(Util.preencheRegistro(registroC500.getFin_doc_e()));
            sb.append("|").append(Util.preencheRegistro(registroC500.getChv_doc_e_ref()));
            sb.append("|").append(Util.preencheRegistro(registroC500.getInd_dest()));
            sb.append("|").append(Util.preencheRegistro(registroC500.getCod_mun_dest()));
            sb.append("|").append(Util.preencheRegistro(registroC500.getCod_cta()));
        }
        sb.append("|").append('\n');

        return sb;
    }
}
