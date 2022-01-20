/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.contadores;

import br.com.swconsultoria.efd.icms.registros.bloco1.Bloco1Enum;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * @author Samuel Oliveira, Sidnei Klein
 *
 */
@EqualsAndHashCode
@Getter
public class ContadoresBloco1 {

    //Bloco 1
    private int contRegistro1001 = 0;
    private int contRegistro1010 = 0;
    private int contRegistro1100 = 0;
    private int contRegistro1105 = 0;
    private int contRegistro1110 = 0;
    private int contRegistro1200 = 0;
    private int contRegistro1210 = 0;
    private int contRegistro1250 = 0;
    private int contRegistro1255 = 0;
    private int contRegistro1300 = 0;
    private int contRegistro1310 = 0;
    private int contRegistro1320 = 0;
    private int contRegistro1350 = 0;
    private int contRegistro1360 = 0;
    private int contRegistro1370 = 0;
    private int contRegistro1390 = 0;
    private int contRegistro1391 = 0;
    private int contRegistro1400 = 0;
    private int contRegistro1500 = 0;
    private int contRegistro1510 = 0;
    private int contRegistro1600 = 0;
    private int contRegistro1601 = 0;
    private int contRegistro1700 = 0;
    private int contRegistro1710 = 0;
    private int contRegistro1800 = 0;
    private int contRegistro1900 = 0;
    private int contRegistro1910 = 0;
    private int contRegistro1920 = 0;
    private int contRegistro1921 = 0;
    private int contRegistro1922 = 0;
    private int contRegistro1923 = 0;
    private int contRegistro1925 = 0;
    private int contRegistro1926 = 0;
    private int contRegistro1960 = 0;
    private int contRegistro1970 = 0;
    private int contRegistro1975 = 0;
    private int contRegistro1980 = 0;
    private int contRegistro1990 = 0;

    public void incrementar(Bloco1Enum bloco) {

        contRegistro1990++;

        switch (bloco) {
            case Registro1001:
                contRegistro1001++;
                break;
            case Registro1010:
                contRegistro1010++;
                break;
            case Registro1100:
                contRegistro1100++;
                break;
            case Registro1105:
                contRegistro1105++;
                break;
            case Registro1110:
                contRegistro1110++;
                break;
            case Registro1200:
                contRegistro1200++;
                break;
            case Registro1210:
                contRegistro1210++;
                break;
            case Registro1250:
                contRegistro1250++;
                break;
            case Registro1255:
                contRegistro1255++;
                break;
            case Registro1300:
                contRegistro1300++;
                break;
            case Registro1310:
                contRegistro1310++;
                break;
            case Registro1320:
                contRegistro1320++;
                break;
            case Registro1350:
                contRegistro1350++;
                break;
            case Registro1360:
                contRegistro1360++;
                break;
            case Registro1370:
                contRegistro1370++;
                break;
            case Registro1390:
                contRegistro1390++;
                break;
            case Registro1391:
                contRegistro1391++;
                break;
            case Registro1400:
                contRegistro1400++;
                break;
            case Registro1500:
                contRegistro1500++;
                break;
            case Registro1510:
                contRegistro1510++;
                break;
            case Registro1600:
                contRegistro1600++;
                break;
            case Registro1601:
                contRegistro1601++;
                break;
            case Registro1700:
                contRegistro1700++;
                break;
            case Registro1710:
                contRegistro1710++;
                break;
            case Registro1800:
                contRegistro1800++;
                break;
            case Registro1900:
                contRegistro1900++;
                break;
            case Registro1910:
                contRegistro1910++;
                break;
            case Registro1920:
                contRegistro1920++;
                break;
            case Registro1921:
                contRegistro1921++;
                break;
            case Registro1922:
                contRegistro1922++;
                break;
            case Registro1923:
                contRegistro1923++;
                break;
            case Registro1925:
                contRegistro1925++;
                break;
            case Registro1926:
                contRegistro1926++;
                break;
            case Registro1960:
                contRegistro1960++;
                break;
            case Registro1970:
                contRegistro1970++;
                break;
            case Registro1975:
                contRegistro1975++;
                break;
            case Registro1980:
                contRegistro1980++;
                break;
            default:
                break;
        }
    }

}
