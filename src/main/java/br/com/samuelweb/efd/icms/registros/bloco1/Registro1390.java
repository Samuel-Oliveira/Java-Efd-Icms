/**
 *
 */
package br.com.samuelweb.efd.icms.registros.bloco1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 */
public class Registro1390 {

    private final String reg = "1390";
    private String cod_prod;
    private List<Registro1391> registro1391;

    /**
     * @return the cod_prod
     */
    public String getCod_prod() {
        return cod_prod;
    }

    /**
     * @param cod_prod the cod_prod to set
     */
    public void setCod_prod(String cod_prod) {
        this.cod_prod = cod_prod;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registro1391
     */
    public List<Registro1391> getRegistro1391() {
        if (registro1391 == null) {
            registro1391 = new ArrayList<Registro1391>();
        }
        return registro1391;
    }

}
