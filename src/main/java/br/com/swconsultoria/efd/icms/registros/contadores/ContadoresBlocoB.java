package br.com.swconsultoria.efd.icms.registros.contadores;

import br.com.swconsultoria.efd.icms.registros.blocoB.BlocoBEnum;

/**
 * @author Sidnei Klein
 */
public class ContadoresBlocoB {

    //Bloco B
    private int contRegistroB001 = 0;
    private int contRegistroB020 = 0;
    private int contRegistroB025 = 0;
    private int contRegistroB030 = 0;
    private int contRegistroB035 = 0;
    private int contRegistroB350 = 0;
    private int contRegistroB420 = 0;
    private int contRegistroB440 = 0;
    private int contRegistroB460 = 0;
    private int contRegistroB470 = 0;
    private int contRegistroB500 = 0;
    private int contRegistroB510 = 0;
    private int contRegistroB990 = 0;

    public void incrementar(BlocoBEnum bloco) {

        contRegistroB990++;

        switch (bloco) {

            case RegistroB001:
                contRegistroB001++;
                break;
            case RegistroB020:
                contRegistroB020++;
                break;
            case RegistroB025:
                contRegistroB025++;
                break;
            case RegistroB030:
                contRegistroB030++;
                break;
            case RegistroB035:
                contRegistroB035++;
                break;
            case RegistroB350:
                contRegistroB350++;
                break;
            case RegistroB420:
                contRegistroB420++;
                break;
            case RegistroB440:
                contRegistroB440++;
                break;
            case RegistroB460:
                contRegistroB460++;
                break;
            case RegistroB470:
                contRegistroB470++;
                break;
            case RegistroB500:
                contRegistroB500++;
                break;
            case RegistroB510:
                contRegistroB510++;
                break;
            case RegistroB990:
                contRegistroB990++;
                break;
            default:
                break;
        }
    }

    /**
     * @return the contRegistroB001
     */
    public int getContRegistroB001() {
        return contRegistroB001;
    }

    /**
     * @return the contRegistroB020
     */
    public int getContRegistroB020() {
        return contRegistroB020;
    }

    /**
     * @return the contRegistroB025
     */
    public int getContRegistroB025() {
        return contRegistroB025;
    }

    /**
     * @return the contRegistroB030
     */
    public int getContRegistroB030() {
        return contRegistroB030;
    }

    /**
     * @return the contRegistroB035
     */
    public int getContRegistroB035() {
        return contRegistroB035;
    }

    /**
     * @return the contRegistroB350
     */
    public int getContRegistroB350() {
        return contRegistroB350;
    }

    /**
     * @return the contRegistroB420
     */
    public int getContRegistroB420() {
        return contRegistroB420;
    }

    /**
     * @return the contRegistroB440
     */
    public int getContRegistroB440() {
        return contRegistroB440;
    }

    /**
     * @return the contRegistroB460
     */
    public int getContRegistroB460() {
        return contRegistroB460;
    }

    /**
     * @return the contRegistroB470
     */
    public int getContRegistroB470() {
        return contRegistroB470;
    }

    /**
     * @return the contRegistroB500
     */
    public int getContRegistroB500() {
        return contRegistroB500;
    }

    /**
     * @return the contRegistroB510
     */
    public int getContRegistroB510() {
        return contRegistroB510;
    }

    /**
     * @return the contRegistroB990
     */
    public int getContRegistroB990() {
        return contRegistroB990;
    }

}
