/**
 *
 */
package br.com.swconsultoria.efd.icms.registros.blocoC;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira
 *
 */
public class RegistroC100 {

    private final String reg = "C100";
    private String ind_oper;
    private String ind_emit;
    private String cod_part;
    private String cod_mod;
    private String cod_sit;
    private String ser;
    private String num_doc;
    private String chv_nfe;
    private String dt_doc;
    private String dt_e_s;
    private String vl_doc;
    private String ind_pagto;
    private String vl_desc;
    private String vl_abat_nt;
    private String vl_merc;
    private String ind_frt;
    private String vl_frt;
    private String vl_seg;
    private String vl_out_da;
    private String vl_bc_icms;
    private String vl_icms;
    private String vl_bc_icms_st;
    private String vl_icms_st;
    private String vl_ipi;
    private String vl_pis;
    private String vl_cofins;
    private String vl_pis_st;
    private String vl_cofins_st;
    private RegistroC101 registroC101;
    private RegistroC105 registroC105;
    private RegistroC130 registroC130;
    private RegistroC140 registroC140;
    private RegistroC160 registroC160;
    private List<RegistroC110> registroC110;
    private List<RegistroC120> registroC120;
    private List<RegistroC165> registroC165;
    private List<RegistroC170> registroC170;
    private List<RegistroC185> registroC185;
    private List<RegistroC190> registroC190;
    private List<RegistroC195> registroC195;

    private String uf;

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * @return the ind_oper
     */
    public String getInd_oper() {
        return ind_oper;
    }

    /**
     * @param ind_oper the ind_oper to set
     */
    public void setInd_oper(String ind_oper) {
        this.ind_oper = ind_oper;
    }

    /**
     * @return the ind_emit
     */
    public String getInd_emit() {
        return ind_emit;
    }

    /**
     * @param ind_emit the ind_emit to set
     */
    public void setInd_emit(String ind_emit) {
        this.ind_emit = ind_emit;
    }

    /**
     * @return the cod_part
     */
    public String getCod_part() {
        return cod_part;
    }

    /**
     * @param cod_part the cod_part to set
     */
    public void setCod_part(String cod_part) {
        this.cod_part = cod_part;
    }

    /**
     * @return the cod_mod
     */
    public String getCod_mod() {
        return cod_mod;
    }

    /**
     * @param cod_mod the cod_mod to set
     */
    public void setCod_mod(String cod_mod) {
        this.cod_mod = cod_mod;
    }

    /**
     * @return the cod_sit
     */
    public String getCod_sit() {
        return cod_sit;
    }

    /**
     * @param cod_sit the cod_sit to set
     */
    public void setCod_sit(String cod_sit) {
        this.cod_sit = cod_sit;
    }

    /**
     * @return the ser
     */
    public String getSer() {
        return ser;
    }

    /**
     * @param ser the ser to set
     */
    public void setSer(String ser) {
        this.ser = ser;
    }

    /**
     * @return the num_doc
     */
    public String getNum_doc() {
        return num_doc;
    }

    /**
     * @param num_doc the num_doc to set
     */
    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    /**
     * @return the chv_nfe
     */
    public String getChv_nfe() {
        return chv_nfe;
    }

    /**
     * @param chv_nfe the chv_nfe to set
     */
    public void setChv_nfe(String chv_nfe) {
        this.chv_nfe = chv_nfe;
    }

    /**
     * @return the dt_doc
     */
    public String getDt_doc() {
        return dt_doc;
    }

    /**
     * @param dt_doc the dt_doc to set
     */
    public void setDt_doc(String dt_doc) {
        this.dt_doc = dt_doc;
    }

    /**
     * @return the dt_e_s
     */
    public String getDt_e_s() {
        return dt_e_s;
    }

    /**
     * @param dt_e_s the dt_e_s to set
     */
    public void setDt_e_s(String dt_e_s) {
        this.dt_e_s = dt_e_s;
    }

    /**
     * @return the vl_doc
     */
    public String getVl_doc() {
        return vl_doc;
    }

    /**
     * @param vl_doc the vl_doc to set
     */
    public void setVl_doc(String vl_doc) {
        this.vl_doc = vl_doc;
    }

    /**
     * @return the ind_pagto
     */
    public String getInd_pagto() {
        return ind_pagto;
    }

    /**
     * @param ind_pagto the ind_pagto to set
     */
    public void setInd_pagto(String ind_pagto) {
        this.ind_pagto = ind_pagto;
    }

    /**
     * @return the vl_desc
     */
    public String getVl_desc() {
        return vl_desc;
    }

    /**
     * @param vl_desc the vl_desc to set
     */
    public void setVl_desc(String vl_desc) {
        this.vl_desc = vl_desc;
    }

    /**
     * @return the vl_abat_nt
     */
    public String getVl_abat_nt() {
        return vl_abat_nt;
    }

    /**
     * @param vl_abat_nt the vl_abat_nt to set
     */
    public void setVl_abat_nt(String vl_abat_nt) {
        this.vl_abat_nt = vl_abat_nt;
    }

    /**
     * @return the vl_merc
     */
    public String getVl_merc() {
        return vl_merc;
    }

    /**
     * @param vl_merc the vl_merc to set
     */
    public void setVl_merc(String vl_merc) {
        this.vl_merc = vl_merc;
    }

    /**
     * @return the ind_frt
     */
    public String getInd_frt() {
        return ind_frt;
    }

    /**
     * @param ind_frt the ind_frt to set
     */
    public void setInd_frt(String ind_frt) {
        this.ind_frt = ind_frt;
    }

    /**
     * @return the vl_frt
     */
    public String getVl_frt() {
        return vl_frt;
    }

    /**
     * @param vl_frt the vl_frt to set
     */
    public void setVl_frt(String vl_frt) {
        this.vl_frt = vl_frt;
    }

    /**
     * @return the vl_seg
     */
    public String getVl_seg() {
        return vl_seg;
    }

    /**
     * @param vl_seg the vl_seg to set
     */
    public void setVl_seg(String vl_seg) {
        this.vl_seg = vl_seg;
    }

    /**
     * @return the vl_out_da
     */
    public String getVl_out_da() {
        return vl_out_da;
    }

    /**
     * @param vl_out_da the vl_out_da to set
     */
    public void setVl_out_da(String vl_out_da) {
        this.vl_out_da = vl_out_da;
    }

    /**
     * @return the vl_bc_icms
     */
    public String getVl_bc_icms() {
        return vl_bc_icms;
    }

    /**
     * @param vl_bc_icms the vl_bc_icms to set
     */
    public void setVl_bc_icms(String vl_bc_icms) {
        this.vl_bc_icms = vl_bc_icms;
    }

    /**
     * @return the vl_icms
     */
    public String getVl_icms() {
        return vl_icms;
    }

    /**
     * @param vc_icms the vl_icms to set
     */
    public void setVl_icms(String vl_icms) {
        this.vl_icms = vl_icms;
    }

    /**
     * @return the vl_bc_icms_st
     */
    public String getVl_bc_icms_st() {
        return vl_bc_icms_st;
    }

    /**
     * @param vl_bc_icms_st the vl_bc_icms_st to set
     */
    public void setVl_bc_icms_st(String vl_bc_icms_st) {
        this.vl_bc_icms_st = vl_bc_icms_st;
    }

    /**
     * @return the vl_icms_st
     */
    public String getVl_icms_st() {
        return vl_icms_st;
    }

    /**
     * @param vl_icms_st the vl_icms_st to set
     */
    public void setVl_icms_st(String vl_icms_st) {
        this.vl_icms_st = vl_icms_st;
    }

    /**
     * @return the vl_ipi
     */
    public String getVl_ipi() {
        return vl_ipi;
    }

    /**
     * @param vl_ipi the vl_ipi to set
     */
    public void setVl_ipi(String vl_ipi) {
        this.vl_ipi = vl_ipi;
    }

    /**
     * @return the vl_pis
     */
    public String getVl_pis() {
        return vl_pis;
    }

    /**
     * @param vl_pis the vl_pis to set
     */
    public void setVl_pis(String vl_pis) {
        this.vl_pis = vl_pis;
    }

    /**
     * @return the vl_cofins
     */
    public String getVl_cofins() {
        return vl_cofins;
    }

    /**
     * @param vl_cofins the vl_cofins to set
     */
    public void setVl_cofins(String vl_cofins) {
        this.vl_cofins = vl_cofins;
    }

    /**
     * @return the vl_pis_st
     */
    public String getVl_pis_st() {
        return vl_pis_st;
    }

    /**
     * @param vl_pis_st the vl_pis_st to set
     */
    public void setVl_pis_st(String vl_pis_st) {
        this.vl_pis_st = vl_pis_st;
    }

    /**
     * @return the vl_cofins_st
     */
    public String getVl_cofins_st() {
        return vl_cofins_st;
    }

    /**
     * @param vl_cofins_st the vl_cofins_st to set
     */
    public void setVl_cofins_st(String vl_cofins_st) {
        this.vl_cofins_st = vl_cofins_st;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroC160
     */
    public RegistroC160 getRegistroC160() {
        return registroC160;
    }

    /**
     * @param registroC160 the registroC160 to set
     */
    public void setRegistroC160(RegistroC160 registroC160) {
        this.registroC160 = registroC160;
    }

    /**
     * @return the registroC140
     */
    public RegistroC140 getRegistroC140() {
        return registroC140;
    }

    /**
     * @param registroC140 the registroC140 to set
     */
    public void setRegistroC140(RegistroC140 registroC140) {
        this.registroC140 = registroC140;
    }

    /**
     * @return the registroC130
     */
    public RegistroC130 getRegistroC130() {
        return registroC130;
    }

    /**
     * @param registroC130 the registroC130 to set
     */
    public void setRegistroC130(RegistroC130 registroC130) {
        this.registroC130 = registroC130;
    }

    /**
     * @return the registroC105
     */
    public RegistroC105 getRegistroC105() {
        return registroC105;
    }

    /**
     * @param registroC105 the registroC105 to set
     */
    public void setRegistroC105(RegistroC105 registroC105) {
        this.registroC105 = registroC105;
    }

    /**
     * @return the registroC101
     */
    public RegistroC101 getRegistroC101() {
        return registroC101;
    }

    /**
     * @param registroC101 the registroC101 to set
     */
    public void setRegistroC101(RegistroC101 registroC101) {
        this.registroC101 = registroC101;
    }

    /**
     * @return the registroC195
     */
    public List<RegistroC195> getRegistroC195() {
        if (registroC195 == null) {
            registroC195 = new ArrayList<RegistroC195>();
        }
        return registroC195;
    }

    /**
     * @return the registroC190
     */
    public List<RegistroC190> getRegistroC190() {
        if (registroC190 == null) {
            registroC190 = new ArrayList<RegistroC190>();
        }
        return registroC190;
    }

    /**
     * @return the registroC170
     */
    public List<RegistroC170> getRegistroC170() {
        if (registroC170 == null) {
            registroC170 = new ArrayList<RegistroC170>();
        }
        return registroC170;
    }

    /**
     * @return the registroC185
     */
    public List<RegistroC185> getRegistroC185() {
        if (registroC185 == null) {
            registroC185 = new ArrayList<RegistroC185>();
        }
        return registroC185;
    }

    /**
     * @return the registroC165
     */
    public List<RegistroC165> getRegistroC165() {
        if (registroC165 == null) {
            registroC165 = new ArrayList<RegistroC165>();
        }
        return registroC165;
    }

    /**
     * @return the registroC120
     */
    public List<RegistroC120> getRegistroC120() {
        if (registroC120 == null) {
            registroC120 = new ArrayList<RegistroC120>();
        }
        return registroC120;
    }

    /**
     * @return the registroC110
     */
    public List<RegistroC110> getRegistroC110() {
        if (registroC110 == null) {
            registroC110 = new ArrayList<RegistroC110>();
        }
        return registroC110;
    }

}
