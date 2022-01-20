/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.bloco1;

import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira
 */
@EqualsAndHashCode
public class Registro1601 {

    private final String reg = "1601";
    private String cod_part_ip;
    private String cod_part_it;
    private String tot_vs;
    private String tot_iss;
    private String tot_outros;

    public String getCod_part_ip() {
        return cod_part_ip;
    }

    public void setCod_part_ip(String cod_part_ip) {
        this.cod_part_ip = cod_part_ip;
    }

    public String getCod_part_it() {
        return cod_part_it;
    }

    public void setCod_part_it(String cod_part_it) {
        this.cod_part_it = cod_part_it;
    }

    public String getTot_vs() {
        return tot_vs;
    }

    public void setTot_vs(String tot_vs) {
        this.tot_vs = tot_vs;
    }

    public String getTot_iss() {
        return tot_iss;
    }

    public void setTot_iss(String tot_iss) {
        this.tot_iss = tot_iss;
    }

    public String getTot_outros() {
        return tot_outros;
    }

    public void setTot_outros(String tot_outros) {
        this.tot_outros = tot_outros;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

}
