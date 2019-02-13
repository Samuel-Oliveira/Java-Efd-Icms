/**
 *
 */
package br.com.samuelweb.efd.icms.registros.contadores;

import br.com.samuelweb.efd.icms.registros.blocoH.BlocoHEnum;

/**
 * @author Samuel Oliveira
 *
 */
public class ContadoresBlocoH {

    //Bloco H
    private int contRegistroH001 = 0;
    private int contRegistroH005 = 0;
    private int contRegistroH010 = 0;
    private int contRegistroH020 = 0;
    private int contRegistroH990 = 0;

    public void incrementar(BlocoHEnum bloco) {

        contRegistroH990++;

        switch (bloco) {
            case RegistroH001:
                contRegistroH001++;
                break;
            case RegistroH005:
                contRegistroH005++;
                break;
            case RegistroH010:
                contRegistroH010++;
                break;
            case RegistroH020:
                contRegistroH020++;
                break;
            default:
                break;
        }
    }

    /**
     * @return the contRegistroH001
     */
    public int getContRegistroH001() {
        return contRegistroH001;
    }

    /**
     * @return the contRegistroH005
     */
    public int getContRegistroH005() {
        return contRegistroH005;
    }

    /**
     * @return the contRegistroH010
     */
    public int getContRegistroH010() {
        return contRegistroH010;
    }

    /**
     * @return the contRegistroH020
     */
    public int getContRegistroH020() {
        return contRegistroH020;
    }

    /**
     * @return the contRegistroH990
     */
    public int getContRegistroH990() {
        return contRegistroH990;
    }

}
