package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.blocoD.RegistroD700;
import br.com.swconsultoria.efd.icms.util.Util;

public class GerarRegistroD700 {

    public static StringBuilder gerar(RegistroD700 registroD700, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD700.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getInd_oper()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getInd_emit()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getCod_part()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getCod_sit()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getSer()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getNum_doc()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getDt_doc()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getDt_e_s()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getVl_doc()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getVl_desc()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getVl_serv()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getVl_serv_nt()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getVl_terc()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getVl_da()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getVl_bc_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getVl_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getCod_inf()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getVl_pis()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getVl_cofins()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getChv_doce()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getFin_doce()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getTip_fat()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getCod_mod_doc_ref()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getChv_doce_ref()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getHash_doc_ref()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getSer_doc_ref()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getNum_doc_ref()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getMes_doc_ref()));
        sb.append("|").append(Util.preencheRegistro(registroD700.getCod_mun_dest()));
        sb.append("|").append('\n');

        return sb;
    }
}
