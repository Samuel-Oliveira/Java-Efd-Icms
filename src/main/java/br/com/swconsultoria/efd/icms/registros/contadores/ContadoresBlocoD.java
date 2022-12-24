/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.contadores;

import br.com.swconsultoria.efd.icms.registros.blocoD.BlocoDEnum;
import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira
 *
 */
@EqualsAndHashCode
public class ContadoresBlocoD {

    //Bloco D
    private int contRegistroD001 = 0;
    private int contRegistroD100 = 0;
    private int contRegistroD101 = 0;
    private int contRegistroD110 = 0;
    private int contRegistroD120 = 0;
    private int contRegistroD130 = 0;
    private int contRegistroD140 = 0;
    private int contRegistroD150 = 0;
    private int contRegistroD160 = 0;
    private int contRegistroD161 = 0;
    private int contRegistroD162 = 0;
    private int contRegistroD170 = 0;
    private int contRegistroD180 = 0;
    private int contRegistroD190 = 0;
    private int contRegistroD195 = 0;
    private int contRegistroD197 = 0;
    private int contRegistroD300 = 0;
    private int contRegistroD301 = 0;
    private int contRegistroD310 = 0;
    private int contRegistroD350 = 0;
    private int contRegistroD355 = 0;
    private int contRegistroD360 = 0;
    private int contRegistroD365 = 0;
    private int contRegistroD370 = 0;
    private int contRegistroD390 = 0;
    private int contRegistroD400 = 0;
    private int contRegistroD410 = 0;
    private int contRegistroD411 = 0;
    private int contRegistroD420 = 0;
    private int contRegistroD500 = 0;
    private int contRegistroD510 = 0;
    private int contRegistroD530 = 0;
    private int contRegistroD590 = 0;
    private int contRegistroD600 = 0;
    private int contRegistroD610 = 0;
    private int contRegistroD690 = 0;
    private int contRegistroD695 = 0;
    private int contRegistroD696 = 0;
    private int contRegistroD697 = 0;
    private int contRegistroD700 = 0;
    private int contRegistroD730 = 0;
    private int contRegistroD731 = 0;
    private int contRegistroD735 = 0;
    private int contRegistroD737 = 0;
    private int contRegistroD750 = 0;
    private int contRegistroD760 = 0;
    private int contRegistroD761 = 0;
    private int contRegistroD990 = 0;

    public void incrementar(BlocoDEnum bloco) {

        contRegistroD990++;

        switch (bloco) {
            case RegistroD001:
                contRegistroD001++;
                break;
            case RegistroD100:
                contRegistroD100++;
                break;
            case RegistroD101:
                contRegistroD101++;
                break;
            case RegistroD110:
                contRegistroD110++;
                break;
            case RegistroD120:
                contRegistroD120++;
                break;
            case RegistroD130:
                contRegistroD130++;
                break;
            case RegistroD140:
                contRegistroD140++;
                break;
            case RegistroD150:
                contRegistroD150++;
                break;
            case RegistroD160:
                contRegistroD160++;
                break;
            case RegistroD161:
                contRegistroD161++;
                break;
            case RegistroD162:
                contRegistroD162++;
                break;
            case RegistroD170:
                contRegistroD170++;
                break;
            case RegistroD180:
                contRegistroD180++;
                break;
            case RegistroD190:
                contRegistroD190++;
                break;
            case RegistroD195:
                contRegistroD195++;
                break;
            case RegistroD197:
                contRegistroD197++;
                break;
            case RegistroD300:
                contRegistroD300++;
                break;
            case RegistroD301:
                contRegistroD301++;
                break;
            case RegistroD310:
                contRegistroD310++;
                break;
            case RegistroD350:
                contRegistroD350++;
                break;
            case RegistroD355:
                contRegistroD355++;
                break;
            case RegistroD360:
                contRegistroD360++;
                break;
            case RegistroD365:
                contRegistroD365++;
                break;
            case RegistroD370:
                contRegistroD370++;
                break;
            case RegistroD390:
                contRegistroD390++;
                break;
            case RegistroD400:
                contRegistroD400++;
                break;
            case RegistroD410:
                contRegistroD410++;
                break;
            case RegistroD411:
                contRegistroD411++;
                break;
            case RegistroD420:
                contRegistroD420++;
                break;
            case RegistroD500:
                contRegistroD500++;
                break;
            case RegistroD510:
                contRegistroD510++;
                break;
            case RegistroD530:
                contRegistroD530++;
                break;
            case RegistroD590:
                contRegistroD590++;
                break;
            case RegistroD600:
                contRegistroD600++;
                break;
            case RegistroD610:
                contRegistroD610++;
                break;
            case RegistroD690:
                contRegistroD690++;
                break;
            case RegistroD695:
                contRegistroD695++;
                break;
            case RegistroD696:
                contRegistroD696++;
                break;
            case RegistroD697:
                contRegistroD697++;
                break;
            case RegistroD700:
                contRegistroD700++;
                break;
            case RegistroD730:
                contRegistroD730++;
                break;
            case RegistroD731:
                contRegistroD731++;
                break;
            case RegistroD735:
                contRegistroD735++;
                break;
            case RegistroD737:
                contRegistroD737++;
                break;
            case RegistroD750:
                contRegistroD750++;
                break;
            case RegistroD760:
                contRegistroD760++;
                break;
            case RegistroD761:
                contRegistroD761++;
                break;
            default:
                break;
        }
    }

    /**
     * @return the contRegistroD001
     */
    public int getContRegistroD001() {
        return contRegistroD001;
    }

    /**
     * @return the contRegistroD100
     */
    public int getContRegistroD100() {
        return contRegistroD100;
    }

    /**
     * @return the contRegistroD101
     */
    public int getContRegistroD101() {
        return contRegistroD101;
    }

    /**
     * @return the contRegistroD110
     */
    public int getContRegistroD110() {
        return contRegistroD110;
    }

    /**
     * @return the contRegistroD120
     */
    public int getContRegistroD120() {
        return contRegistroD120;
    }

    /**
     * @return the contRegistroD130
     */
    public int getContRegistroD130() {
        return contRegistroD130;
    }

    /**
     * @return the contRegistroD140
     */
    public int getContRegistroD140() {
        return contRegistroD140;
    }

    /**
     * @return the contRegistroD150
     */
    public int getContRegistroD150() {
        return contRegistroD150;
    }

    /**
     * @return the contRegistroD160
     */
    public int getContRegistroD160() {
        return contRegistroD160;
    }

    /**
     * @return the contRegistroD161
     */
    public int getContRegistroD161() {
        return contRegistroD161;
    }

    /**
     * @return the contRegistroD162
     */
    public int getContRegistroD162() {
        return contRegistroD162;
    }

    /**
     * @return the contRegistroD170
     */
    public int getContRegistroD170() {
        return contRegistroD170;
    }

    /**
     * @return the contRegistroD180
     */
    public int getContRegistroD180() {
        return contRegistroD180;
    }

    /**
     * @return the contRegistroD190
     */
    public int getContRegistroD190() {
        return contRegistroD190;
    }

    /**
     * @return the contRegistroD195
     */
    public int getContRegistroD195() {
        return contRegistroD195;
    }

    /**
     * @return the contRegistroD197
     */
    public int getContRegistroD197() {
        return contRegistroD197;
    }

    /**
     * @return the contRegistroD300
     */
    public int getContRegistroD300() {
        return contRegistroD300;
    }

    /**
     * @return the contRegistroD301
     */
    public int getContRegistroD301() {
        return contRegistroD301;
    }

    /**
     * @return the contRegistroD310
     */
    public int getContRegistroD310() {
        return contRegistroD310;
    }

    /**
     * @return the contRegistroD350
     */
    public int getContRegistroD350() {
        return contRegistroD350;
    }

    /**
     * @return the contRegistroD355
     */
    public int getContRegistroD355() {
        return contRegistroD355;
    }

    /**
     * @return the contRegistroD360
     */
    public int getContRegistroD360() {
        return contRegistroD360;
    }

    /**
     * @return the contRegistroD365
     */
    public int getContRegistroD365() {
        return contRegistroD365;
    }

    /**
     * @return the contRegistroD370
     */
    public int getContRegistroD370() {
        return contRegistroD370;
    }

    /**
     * @return the contRegistroD390
     */
    public int getContRegistroD390() {
        return contRegistroD390;
    }

    /**
     * @return the contRegistroD400
     */
    public int getContRegistroD400() {
        return contRegistroD400;
    }

    /**
     * @return the contRegistroD410
     */
    public int getContRegistroD410() {
        return contRegistroD410;
    }

    /**
     * @return the contRegistroD411
     */
    public int getContRegistroD411() {
        return contRegistroD411;
    }

    /**
     * @return the contRegistroD420
     */
    public int getContRegistroD420() {
        return contRegistroD420;
    }

    /**
     * @return the contRegistroD500
     */
    public int getContRegistroD500() {
        return contRegistroD500;
    }

    /**
     * @return the contRegistroD510
     */
    public int getContRegistroD510() {
        return contRegistroD510;
    }

    /**
     * @return the contRegistroD530
     */
    public int getContRegistroD530() {
        return contRegistroD530;
    }

    /**
     * @return the contRegistroD590
     */
    public int getContRegistroD590() {
        return contRegistroD590;
    }

    /**
     * @return the contRegistroD600
     */
    public int getContRegistroD600() {
        return contRegistroD600;
    }

    /**
     * @return the contRegistroD610
     */
    public int getContRegistroD610() {
        return contRegistroD610;
    }

    /**
     * @return the contRegistroD690
     */
    public int getContRegistroD690() {
        return contRegistroD690;
    }

    /**
     * @return the contRegistroD695
     */
    public int getContRegistroD695() {
        return contRegistroD695;
    }

    /**
     * @return the contRegistroD696
     */
    public int getContRegistroD696() {
        return contRegistroD696;
    }

    /**
     * @return the contRegistroD697
     */
    public int getContRegistroD697() {
        return contRegistroD697;
    }

    /**
     * @return the contRegistroD990
     */
    public int getContRegistroD990() {
        return contRegistroD990;
    }

    public int getContRegistroD700() {
        return contRegistroD700;
    }

    public int getContRegistroD730() {
        return contRegistroD730;
    }

    public int getContRegistroD731() {
        return contRegistroD731;
    }

    public int getContRegistroD735() {
        return contRegistroD735;
    }

    public int getContRegistroD737() {
        return contRegistroD737;
    }

    public int getContRegistroD750() {
        return contRegistroD750;
    }

    public int getContRegistroD760() {
        return contRegistroD760;
    }

    public int getContRegistroD761() {
        return contRegistroD761;
    }
}
