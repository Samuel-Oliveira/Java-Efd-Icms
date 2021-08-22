/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoH;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 *
 */
@EqualsAndHashCode
public class BlocoH {

    private RegistroH001 registroH001;
    private List<RegistroH005> registroH005;
    private RegistroH990 registroH990;

    /**
     * @return the registroH001
     */
    public RegistroH001 getRegistroH001() {
        return registroH001;
    }

    /**
     * @param registroH001 the registroH001 to set
     */
    public void setRegistroH001(RegistroH001 registroH001) {
        this.registroH001 = registroH001;
    }

    /**
     * @return the registroH990
     */
    public RegistroH990 getRegistroH990() {
        return registroH990;
    }

    /**
     * @param registroH990 the registroH990 to set
     */
    public void setRegistroH990(RegistroH990 registroH990) {
        this.registroH990 = registroH990;
    }

    /**
     * @return the registroH005
     */
    public List<RegistroH005> getRegistroH005() {
        if (registroH005 == null) {
            registroH005 = new ArrayList<RegistroH005>();
        }
        return registroH005;
    }

}
