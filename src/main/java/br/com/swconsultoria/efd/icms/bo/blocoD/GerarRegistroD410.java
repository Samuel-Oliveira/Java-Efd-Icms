/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.blocoD.RegistroD410;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 */
public class GerarRegistroD410 {

    public static StringBuilder gerar(RegistroD410 registroD410, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD410.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD410.getCod_mod()));
        sb.append("|").append(Util.preencheRegistro(registroD410.getSer()));
        sb.append("|").append(Util.preencheRegistro(registroD410.getSub()));
        sb.append("|").append(Util.preencheRegistro(registroD410.getNum_doc_ini()));
        sb.append("|").append(Util.preencheRegistro(registroD410.getNum_doc_fin()));
        sb.append("|").append(Util.preencheRegistro(registroD410.getDt_doc()));
        sb.append("|").append(Util.preencheRegistro(registroD410.getCst_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD410.getCfop()));
        sb.append("|").append(Util.preencheRegistro(registroD410.getAliq_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD410.getVl_opr()));
        sb.append("|").append(Util.preencheRegistro(registroD410.getVl_desc()));
        sb.append("|").append(Util.preencheRegistro(registroD410.getVl_serv()));
        sb.append("|").append(Util.preencheRegistro(registroD410.getVl_bc_icms()));
        sb.append("|").append(Util.preencheRegistro(registroD410.getVl_icms()));
        sb.append("|").append('\n');

        return sb;
    }
}
