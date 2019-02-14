/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoD;

import br.com.swconsultoria.efd.icms.registros.blocoD.RegistroD160;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD160 {

    public static StringBuilder gerar(RegistroD160 registroD160, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD160.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD160.getDespacho()));
        sb.append("|").append(Util.preencheRegistro(registroD160.getCnpj_cpf_rem()));
        sb.append("|").append(Util.preencheRegistro(registroD160.getIe_rem()));
        sb.append("|").append(Util.preencheRegistro(registroD160.getCod_mun_ori()));
        sb.append("|").append(Util.preencheRegistro(registroD160.getCnpj_cpf_dest()));
        sb.append("|").append(Util.preencheRegistro(registroD160.getIe_dest()));
        sb.append("|").append(Util.preencheRegistro(registroD160.getCod_mun_dest()));
        sb.append("|").append('\n');

        return sb;
    }
}
