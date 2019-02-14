/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoB;

import br.com.swconsultoria.efd.icms.registros.blocoB.RegistroB001;
import br.com.swconsultoria.efd.icms.registros.blocoB.RegistroB990;

/**
 * @author Sidnei Klein
 *
 */
public class BlocoB {

    private RegistroB001 registroB001;
    private RegistroB990 registroB990;

    /**
     * @return the registroB001
     */
    public RegistroB001 getRegistroB001() {
        return registroB001;
    }

    /**
     * @param registroB001 the registroB001 to set
     */
    public void setRegistroB001(RegistroB001 registroB001) {
        this.registroB001 = registroB001;
    }

    /**
     * @return the registroB990
     */
    public RegistroB990 getRegistroB990() {
        return registroB990;
    }

    /**
     * @param registroB990 the registroB990 to set
     */
    public void setRegistroB990(RegistroB990 registroB990) {
        this.registroB990 = registroB990;
    }

}
