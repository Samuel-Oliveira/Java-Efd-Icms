package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.EfdIcms;
import br.com.swconsultoria.efd.icms.registros.blocoD.RegistroD750;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Samuel Oliveira
 */
public class GerarRegistroD750 {
    public static StringBuilder gerar(EfdIcms efdIcms, RegistroD750 registroD750, StringBuilder sb) {
        sb.append("|").append(Util.preencheRegistro(registroD750.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD750.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(registroD750.getSer()));
        sb.append("|").append(Util.preencheRegistro(registroD750.getDt_doc()));
        sb.append("|").append(Util.preencheRegistro(registroD750.getQtd_cons()));
        sb.append("|").append(Util.preencheRegistro(registroD750.getInd_prepago()));
        sb.append("|").append(Util.preencheRegistro(registroD750.getVl_doc()));
        sb.append("|").append(Util.preencheRegistro(registroD750.getVl_serv()));
        sb.append("|").append(Util.preencheRegistro(registroD750.getVl_serv_nt()));
        sb.append("|").append(Util.preencheRegistro(registroD750.getVl_terc()));
        sb.append("|").append(Util.preencheRegistro(registroD750.getVl_desc()));
        sb.append("|").append(Util.preencheRegistro(registroD750.getVl_da()));
        sb.append("|").append(Util.preencheRegistro(registroD750.getVl_bc_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD750.getVl_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD750.getVl_pis()));
        sb.append("|").append(Util.preencheRegistro(registroD750.getVl_cofins()));
        if (Util.versao2025(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
            sb.append("|").append(Util.preencheRegistro(registroD750.getDed()));
        }
        sb.append("|").append('\n');

        return sb;
    }
}
