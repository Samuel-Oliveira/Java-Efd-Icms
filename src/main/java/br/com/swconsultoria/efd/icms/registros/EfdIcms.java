/**
 *
 */
package br.com.swconsultoria.efd.icms.registros;

import br.com.swconsultoria.efd.icms.registros.bloco0.Bloco0;
import br.com.swconsultoria.efd.icms.registros.bloco1.Bloco1;
import br.com.swconsultoria.efd.icms.registros.bloco9.Bloco9;
import br.com.swconsultoria.efd.icms.registros.blocoB.BlocoB;
import br.com.swconsultoria.efd.icms.registros.blocoC.BlocoC;
import br.com.swconsultoria.efd.icms.registros.blocoD.BlocoD;
import br.com.swconsultoria.efd.icms.registros.blocoE.BlocoE;
import br.com.swconsultoria.efd.icms.registros.blocoG.BlocoG;
import br.com.swconsultoria.efd.icms.registros.blocoH.BlocoH;
import br.com.swconsultoria.efd.icms.registros.blocoK.BlocoK;
import br.com.swconsultoria.efd.icms.registros.contadores.*;
import lombok.EqualsAndHashCode;

/**
 * @author Sidnei Klein
 */
@EqualsAndHashCode
public class EfdIcms {

    private Bloco0 bloco0;
    private BlocoB blocoB;
    private Bloco1 bloco1;
    private Bloco9 bloco9;
    private BlocoC blocoC;
    private BlocoD blocoD;
    private BlocoE blocoE;
    private BlocoG blocoG;
    private BlocoH blocoH;
    private BlocoK blocoK;

    private ContadoresBloco0 contadoresBloco0;
    private ContadoresBlocoB contadoresBlocoB;
    private ContadoresBlocoC contadoresBlocoC;
    private ContadoresBlocoD contadoresBlocoD;
    private ContadoresBlocoE contadoresBlocoE;
    private ContadoresBlocoG contadoresBlocoG;
    private ContadoresBlocoH contadoresBlocoH;
    private ContadoresBlocoK contadoresBlocoK;
    private ContadoresBloco1 contadoresBloco1;

    /**
     *
     */
    public EfdIcms() {
        this.contadoresBloco0 = new ContadoresBloco0();
        this.contadoresBlocoB = new ContadoresBlocoB();
        this.contadoresBlocoC = new ContadoresBlocoC();
        this.contadoresBlocoD = new ContadoresBlocoD();
        this.contadoresBlocoE = new ContadoresBlocoE();
        this.contadoresBlocoG = new ContadoresBlocoG();
        this.contadoresBlocoH = new ContadoresBlocoH();
        this.contadoresBlocoK = new ContadoresBlocoK();
        this.contadoresBloco1 = new ContadoresBloco1();
    }

    /**
     * @return the bloco0
     */
    public Bloco0 getBloco0() {
        return bloco0;
    }

    /**
     * @param bloco0 the bloco0 to set
     */
    public void setBloco0(Bloco0 bloco0) {
        this.bloco0 = bloco0;
    }

    /**
     * @return the blocoB
     */
    public BlocoB getBlocoB() {
        return blocoB;
    }

    /**
     * @param blocoB the blocoB to set
     */
    public void setBlocoB(BlocoB blocoB) {
        this.blocoB = blocoB;
    }

    /**
     * @return the bloco1
     */
    public Bloco1 getBloco1() {
        return bloco1;
    }

    /**
     * @param bloco1 the bloco1 to set
     */
    public void setBloco1(Bloco1 bloco1) {
        this.bloco1 = bloco1;
    }

    /**
     * @return the bloco9
     */
    public Bloco9 getBloco9() {
        return bloco9;
    }

    /**
     * @param bloco9 the bloco9 to set
     */
    public void setBloco9(Bloco9 bloco9) {
        this.bloco9 = bloco9;
    }

    /**
     * @return the blocoC
     */
    public BlocoC getBlocoC() {
        return blocoC;
    }

    /**
     * @param blocoC the blocoC to set
     */
    public void setBlocoC(BlocoC blocoC) {
        this.blocoC = blocoC;
    }

    /**
     * @return the blocoD
     */
    public BlocoD getBlocoD() {
        return blocoD;
    }

    /**
     * @param blocoD the blocoD to set
     */
    public void setBlocoD(BlocoD blocoD) {
        this.blocoD = blocoD;
    }

    /**
     * @return the blocoE
     */
    public BlocoE getBlocoE() {
        return blocoE;
    }

    /**
     * @param blocoE the blocoE to set
     */
    public void setBlocoE(BlocoE blocoE) {
        this.blocoE = blocoE;
    }

    /**
     * @return the blocoG
     */
    public BlocoG getBlocoG() {
        return blocoG;
    }

    /**
     * @param blocoG the blocoG to set
     */
    public void setBlocoG(BlocoG blocoG) {
        this.blocoG = blocoG;
    }

    /**
     * @return the blocoH
     */
    public BlocoH getBlocoH() {
        return blocoH;
    }

    /**
     * @param blocoH the blocoH to set
     */
    public void setBlocoH(BlocoH blocoH) {
        this.blocoH = blocoH;
    }

    /**
     * @return the blocoK
     */
    public BlocoK getBlocoK() {
        return blocoK;
    }

    /**
     * @param blocoK the blocoK to set
     */
    public void setBlocoK(BlocoK blocoK) {
        this.blocoK = blocoK;
    }

    /**
     * @return the contadoresBloco0
     */
    public ContadoresBloco0 getContadoresBloco0() {
        return contadoresBloco0;
    }

    /**
     * @param contadoresBloco0 the contadoresBloco0 to set
     */
    public void setContadoresBloco0(ContadoresBloco0 contadoresBloco0) {
        this.contadoresBloco0 = contadoresBloco0;
    }

    /**
     * @return the contadoresBlocoB
     */
    public ContadoresBlocoB getContadoresBlocoB() {
        return contadoresBlocoB;
    }

    /**
     * @param contadoresBlocoB the contadoresBlocoB to set
     */
    public void setContadoresBlocoB(ContadoresBlocoB contadoresBlocoB) {
        this.contadoresBlocoB = contadoresBlocoB;
    }

    /**
     * @return the contadoresBlocoC
     */
    public ContadoresBlocoC getContadoresBlocoC() {
        return contadoresBlocoC;
    }

    /**
     * @param contadoresBlocoC the contadoresBlocoC to set
     */
    public void setContadoresBlocoC(ContadoresBlocoC contadoresBlocoC) {
        this.contadoresBlocoC = contadoresBlocoC;
    }

    /**
     * @return the contadoresBlocoD
     */
    public ContadoresBlocoD getContadoresBlocoD() {
        return contadoresBlocoD;
    }

    /**
     * @param contadoresBlocoD the contadoresBlocoD to set
     */
    public void setContadoresBlocoD(ContadoresBlocoD contadoresBlocoD) {
        this.contadoresBlocoD = contadoresBlocoD;
    }

    /**
     * @return the contadoresBlocoE
     */
    public ContadoresBlocoE getContadoresBlocoE() {
        return contadoresBlocoE;
    }

    /**
     * @param contadoresBlocoE the contadoresBlocoE to set
     */
    public void setContadoresBlocoE(ContadoresBlocoE contadoresBlocoE) {
        this.contadoresBlocoE = contadoresBlocoE;
    }

    /**
     * @return the contadoresBlocoG
     */
    public ContadoresBlocoG getContadoresBlocoG() {
        return contadoresBlocoG;
    }

    /**
     * @param contadoresBlocoG the contadoresBlocoG to set
     */
    public void setContadoresBlocoG(ContadoresBlocoG contadoresBlocoG) {
        this.contadoresBlocoG = contadoresBlocoG;
    }

    /**
     * @return the contadoresBlocoH
     */
    public ContadoresBlocoH getContadoresBlocoH() {
        return contadoresBlocoH;
    }

    /**
     * @param contadoresBlocoH the contadoresBlocoH to set
     */
    public void setContadoresBlocoH(ContadoresBlocoH contadoresBlocoH) {
        this.contadoresBlocoH = contadoresBlocoH;
    }

    /**
     * @return the contadoresBlocoK
     */
    public ContadoresBlocoK getContadoresBlocoK() {
        return contadoresBlocoK;
    }

    /**
     * @param contadoresBlocoK the contadoresBlocoK to set
     */
    public void setContadoresBlocoK(ContadoresBlocoK contadoresBlocoK) {
        this.contadoresBlocoK = contadoresBlocoK;
    }

    /**
     * @return the contadoresBloco1
     */
    public ContadoresBloco1 getContadoresBloco1() {
        return contadoresBloco1;
    }

    /**
     * @param contadoresBloco1 the contadoresBloco1 to set
     */
    public void setContadoresBloco1(ContadoresBloco1 contadoresBloco1) {
        this.contadoresBloco1 = contadoresBloco1;
    }

}
