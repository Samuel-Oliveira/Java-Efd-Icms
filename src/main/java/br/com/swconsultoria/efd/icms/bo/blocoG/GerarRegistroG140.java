/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoG;

import br.com.swconsultoria.efd.icms.registros.EfdIcms;
import br.com.swconsultoria.efd.icms.registros.blocoG.RegistroG140;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroG140 {

    public static StringBuilder gerar(EfdIcms efdIcms, RegistroG140 registroG140, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroG140.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroG140.getNum_item()));
        sb.append("|").append(Util.preencheRegistro(registroG140.getCod_item()));
        if (Util.versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
            sb.append("|").append(Util.preencheRegistro(registroG140.getQtde()));
            sb.append("|").append(Util.preencheRegistro(registroG140.getUnid()));
            sb.append("|").append(Util.preencheRegistro(registroG140.getVl_icms_op_aplicado()));
            sb.append("|").append(Util.preencheRegistro(registroG140.getVl_icms_st_aplicado()));
            sb.append("|").append(Util.preencheRegistro(registroG140.getVl_icms_frt_aplicado()));
            sb.append("|").append(Util.preencheRegistro(registroG140.getVl_icms_dif_aplicado()));
        }
        sb.append("|").append('\n');

        return sb;
    }
}
