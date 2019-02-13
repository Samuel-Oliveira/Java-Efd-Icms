/**
 *
 */
package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD161;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD161 {

    public static StringBuilder gerar(RegistroD161 registroD161, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD161.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD161.getInd_carga()));
        sb.append("|").append(Util.preencheRegistro(registroD161.getCnpj_cpf_col()));
        sb.append("|").append(Util.preencheRegistro(registroD161.getIe_col()));
        sb.append("|").append(Util.preencheRegistro(registroD161.getCod_mun_col()));
        sb.append("|").append(Util.preencheRegistro(registroD161.getCnpj_cpf_entg()));
        sb.append("|").append(Util.preencheRegistro(registroD161.getIe_entg()));
        sb.append("|").append(Util.preencheRegistro(registroD161.getCod_mun_entg()));
        sb.append("|").append('\n');

        return sb;
    }
}
