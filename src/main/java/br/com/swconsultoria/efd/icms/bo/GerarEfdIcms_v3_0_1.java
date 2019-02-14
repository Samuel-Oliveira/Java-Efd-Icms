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
import br.com.swconsultoria.efd.icms.registros.EfdIcms_v3_0_1;
import br.com.swconsultoria.efd.icms.registros.bloco9.Registro9001;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Sidnei Klein
 *
 */
public class GerarEfdIcms_v3_0_1 {

    public static StringBuilder gerar(EfdIcms_v3_0_1 efdIcms, StringBuilder sb) {

        //BLOCO0
        if (!Util.isEmpty(efdIcms.getBloco0())) {
            sb = GerarBloco0.gerar(efdIcms, sb);
            efdIcms = GerarContadoresBloco0.gerar(efdIcms);
        }

        //BLOCOB
        if (!Util.isEmpty(efdIcms.getBlocoB())) {
            sb = GerarBlocoB.gerar(efdIcms, sb);
            efdIcms = GerarContadoresBlocoB.gerar(efdIcms);
        }

        //BLOCOC
        if (!Util.isEmpty(efdIcms.getBlocoC())) {
            sb = GerarBlocoC.gerar(efdIcms, sb);
            efdIcms = GerarContadoresBlocoC.gerar(efdIcms);
        }

        //BLOCOD
        if (!Util.isEmpty(efdIcms.getBlocoD())) {
            sb = GerarBlocoD.gerar(efdIcms, sb);
            efdIcms = GerarContadoresBlocoD.gerar(efdIcms);
        }

        //BLOCOE
        if (!Util.isEmpty(efdIcms.getBlocoE())) {
            sb = GerarBlocoE.gerar(efdIcms, sb);
            efdIcms = GerarContadoresBlocoE.gerar(efdIcms);
        }

        //BLOCOG
        if (!Util.isEmpty(efdIcms.getBlocoG())) {
            sb = GerarBlocoG.gerar(efdIcms, sb);
            efdIcms = GerarContadoresBlocoG.gerar(efdIcms);
        }

        //BLOCOH
        if (!Util.isEmpty(efdIcms.getBlocoH())) {
            sb = GerarBlocoH.gerar(efdIcms, sb);
            efdIcms = GerarContadoresBlocoH.gerar(efdIcms);
        }

        //BLOCOK
        if (!Util.isEmpty(efdIcms.getBlocoK())) {
            sb = GerarBlocoK.gerar(efdIcms, sb);
            efdIcms = GerarContadoresBlocoK.gerar(efdIcms);
        }

        //BLOCO1
        if (!Util.isEmpty(efdIcms.getBloco1())) {
            sb = GerarBloco1.gerar(efdIcms, sb);
            efdIcms = GerarContadoresBloco1.gerar(efdIcms);
        }

        //BLOCO9
        Registro9001 registro9001 = new Registro9001();
        registro9001.setInd_mov("0");
        efdIcms.getBloco9().setRegistro9001(registro9001);
        sb = GerarBloco9.gerar(efdIcms.getBloco9(), sb);

        //Nova Linha ao Final do Arquivo:
        sb.append(System.lineSeparator());
        //
        return sb;
    }
}
