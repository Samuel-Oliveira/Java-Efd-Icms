/**
 *
 */
package br.com.swconsultoria.efd.icms.bo;

import br.com.swconsultoria.efd.icms.bo.bloco0.GerarBloco0;
import br.com.swconsultoria.efd.icms.bo.bloco0.GerarContadoresBloco0;
import br.com.swconsultoria.efd.icms.bo.bloco1.GerarBloco1;
import br.com.swconsultoria.efd.icms.bo.bloco1.GerarContadoresBloco1;
import br.com.swconsultoria.efd.icms.bo.bloco9.GerarBloco9;
import br.com.swconsultoria.efd.icms.bo.blocoB.GerarBlocoB;
import br.com.swconsultoria.efd.icms.bo.blocoB.GerarContadoresBlocoB;
import br.com.swconsultoria.efd.icms.bo.blocoC.GerarBlocoC;
import br.com.swconsultoria.efd.icms.bo.blocoC.GerarContadoresBlocoC;
import br.com.swconsultoria.efd.icms.bo.blocoD.GerarBlocoD;
import br.com.swconsultoria.efd.icms.bo.blocoD.GerarContadoresBlocoD;
import br.com.swconsultoria.efd.icms.bo.blocoE.GerarBlocoE;
import br.com.swconsultoria.efd.icms.bo.blocoE.GerarContadoresBlocoE;
import br.com.swconsultoria.efd.icms.bo.blocoG.GerarBlocoG;
import br.com.swconsultoria.efd.icms.bo.blocoG.GerarContadoresBlocoG;
import br.com.swconsultoria.efd.icms.bo.blocoH.GerarBlocoH;
import br.com.swconsultoria.efd.icms.bo.blocoH.GerarContadoresBlocoH;
import br.com.swconsultoria.efd.icms.bo.blocoK.GerarBlocoK;
import br.com.swconsultoria.efd.icms.bo.blocoK.GerarContadoresBlocoK;
import br.com.swconsultoria.efd.icms.registros.EfdIcms;
import br.com.swconsultoria.efd.icms.registros.bloco9.Registro9001;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Sameul Oliveira
 */
public class GerarEfdIcms {

    public static StringBuilder gerar(EfdIcms efdIcms, StringBuilder sb) {

        //BLOCO0
        if (!Util.isEmpty(efdIcms.getBloco0())) {
            GerarBloco0.gerar(efdIcms, sb);
            GerarContadoresBloco0.gerar(efdIcms);
        }

        //BLOCOB
        if (!Util.isEmpty(efdIcms.getBlocoB())) {
            GerarBlocoB.gerar(efdIcms, sb);
            GerarContadoresBlocoB.gerar(efdIcms);
        }

        //BLOCOC
        if (!Util.isEmpty(efdIcms.getBlocoC())) {
            GerarBlocoC.gerar(efdIcms, sb);
            GerarContadoresBlocoC.gerar(efdIcms);
        }

        //BLOCOD
        if (!Util.isEmpty(efdIcms.getBlocoD())) {
            GerarBlocoD.gerar(efdIcms, sb);
            GerarContadoresBlocoD.gerar(efdIcms);
        }

        //BLOCOE
        if (!Util.isEmpty(efdIcms.getBlocoE())) {
            GerarBlocoE.gerar(efdIcms, sb);
            GerarContadoresBlocoE.gerar(efdIcms);
        }

        //BLOCOG
        if (!Util.isEmpty(efdIcms.getBlocoG())) {
            GerarBlocoG.gerar(efdIcms, sb);
            GerarContadoresBlocoG.gerar(efdIcms);
        }

        //BLOCOH
        if (!Util.isEmpty(efdIcms.getBlocoH())) {
            GerarBlocoH.gerar(efdIcms, sb);
            GerarContadoresBlocoH.gerar(efdIcms);
        }

        //BLOCOK
        if (!Util.isEmpty(efdIcms.getBlocoK())) {
            GerarBlocoK.gerar(efdIcms, sb);
            GerarContadoresBlocoK.gerar(efdIcms);
        }

        //BLOCO1
        if (!Util.isEmpty(efdIcms.getBloco1())) {
            GerarBloco1.gerar(efdIcms, sb);
            GerarContadoresBloco1.gerar(efdIcms);
        }

        //BLOCO9
        Registro9001 registro9001 = new Registro9001();
        registro9001.setInd_mov("0");
        efdIcms.getBloco9().setRegistro9001(registro9001);
        GerarBloco9.gerar(efdIcms.getBloco9(), sb);

        //Nova Linha ao Final do Arquivo:
        sb.append(System.lineSeparator());
        //
        return sb;
    }
}
