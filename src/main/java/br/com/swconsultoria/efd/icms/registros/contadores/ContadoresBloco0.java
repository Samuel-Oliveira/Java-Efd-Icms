/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.contadores;

import br.com.swconsultoria.efd.icms.registros.bloco0.Bloco0Enum;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
@Getter
public class ContadoresBloco0 {

    //Bloco 0
    private int contRegistro0000 = 0;
    private int contRegistro0001 = 0;
    private int contRegistro0002 = 0;
    private int contRegistro0005 = 0;
    private int contRegistro0015 = 0;
    private int contRegistro0100 = 0;
    private int contRegistro0150 = 0;
    private int contRegistro0175 = 0;
    private int contRegistro0190 = 0;
    private int contRegistro0200 = 0;
    private int contRegistro0205 = 0;
    private int contRegistro0206 = 0;
    private int contRegistro0210 = 0;
    private int contRegistro0220 = 0;
    private int contRegistro0221 = 0;
    private int contRegistro0300 = 0;
    private int contRegistro0305 = 0;
    private int contRegistro0400 = 0;
    private int contRegistro0450 = 0;
    private int contRegistro0460 = 0;
    private int contRegistro0500 = 0;
    private int contRegistro0600 = 0;
    private int contRegistro0990 = 0;

    public void incrementar(Bloco0Enum bloco0) {

        contRegistro0990++;

        switch (bloco0) {
            case Registro0000:
                contRegistro0000++;
                break;
            case Registro0001:
                contRegistro0001++;
                break;
            case Registro0002:
                contRegistro0002++;
                break;
            case Registro0005:
                contRegistro0005++;
                break;
            case Registro0015:
                contRegistro0015++;
                break;
            case Registro0100:
                contRegistro0100++;
                break;
            case Registro0150:
                contRegistro0150++;
                break;
            case Registro0175:
                contRegistro0175++;
                break;
            case Registro0190:
                contRegistro0190++;
                break;
            case Registro0200:
                contRegistro0200++;
                break;
            case Registro0205:
                contRegistro0205++;
                break;
            case Registro0206:
                contRegistro0206++;
                break;
            case Registro0210:
                contRegistro0210++;
                break;
            case Registro0220:
                contRegistro0220++;
                break;
            case Registro0221:
                contRegistro0221++;
                break;
            case Registro0300:
                contRegistro0300++;
                break;
            case Registro0305:
                contRegistro0305++;
                break;
            case Registro0400:
                contRegistro0400++;
                break;
            case Registro0450:
                contRegistro0450++;
                break;
            case Registro0460:
                contRegistro0460++;
                break;
            case Registro0500:
                contRegistro0500++;
                break;
            case Registro0600:
                contRegistro0600++;
                break;
            default:
                break;
        }
    }

}
