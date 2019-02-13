/**
 *
 */
package br.com.samuelweb.efd.icms.registros.blocoC;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Oliveira, Sidnei Klein
 *
 */
public class RegistroC170 {

    private final String reg = "C170";
    private String num_item;
    private String cod_item;
    private String descr_compl;
    private String qtd;
    private String unid;
    private String vl_item;
    private String vl_desc;
    private String ind_mov;
    private String cst_icms;
    private String cfop;
    private String cod_nat;
    private String vl_bc_icms;
    private String aliq_icms;
    private String vl_icms;
    private String vl_bc_icms_st;
    private String aliq_st;
    private String vl_icms_st;
    private String ind_apur;
    private String cst_ipi;
    private String cod_enq;
    private String vl_bc_ipi;
    private String aliq_ipi;
    private String vl_ipi;
    private String cst_pis;
    private String vl_bc_pis;
    private String aliq_pis_percentual;
    private String quant_bc_pis;
    private String aliq_pis_reais;
    private String vl_pis;
    private String cst_cofins;
    private String vl_bc_cofins;
    private String aliq_cofins_percentual;
    private String quant_bc_cofins;
    private String aliq_cofins_reais;
    private String vl_cofins;
    private String cod_cta;
    private String vl_abat_nt;

    private RegistroC172 registroC172;
    private RegistroC177 registroC177;
    private RegistroC178 registroC178;
    private RegistroC179 registroC179;
    private List<RegistroC171> registroC171;
    private List<RegistroC173> registroC173;
    private List<RegistroC174> registroC174;
    private List<RegistroC175> registroC175;
    private List<RegistroC176> registroC176;

    /**
     * @return the num_item
     */
    public String getNum_item() {
        return num_item;
    }

    /**
     * @param num_item the num_item to set
     */
    public void setNum_item(String num_item) {
        this.num_item = num_item;
    }

    /**
     * @return the cod_item
     */
    public String getCod_item() {
        return cod_item;
    }

    /**
     * @param cod_item the cod_item to set
     */
    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    /**
     * @return the descr_compl
     */
    public String getDescr_compl() {
        return descr_compl;
    }

    /**
     * @param descr_compl the descr_compl to set
     */
    public void setDescr_compl(String descr_compl) {
        this.descr_compl = descr_compl;
    }

    /**
     * @return the qtd
     */
    public String getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

    /**
     * @return the unid
     */
    public String getUnid() {
        return unid;
    }

    /**
     * @param unid the unid to set
     */
    public void setUnid(String unid) {
        this.unid = unid;
    }

    /**
     * @return the vl_item
     */
    public String getVl_item() {
        return vl_item;
    }

    /**
     * @param vl_item the vl_item to set
     */
    public void setVl_item(String vl_item) {
        this.vl_item = vl_item;
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
     * @return the ind_mov
     */
    public String getInd_mov() {
        return ind_mov;
    }

    /**
     * @param ind_mov the ind_mov to set
     */
    public void setInd_mov(String ind_mov) {
        this.ind_mov = ind_mov;
    }

    /**
     * @return the cst_icms
     */
    public String getCst_icms() {
        return cst_icms;
    }

    /**
     * @param cst_icms the cst_icms to set
     */
    public void setCst_icms(String cst_icms) {
        this.cst_icms = cst_icms;
    }

    /**
     * @return the cfop
     */
    public String getCfop() {
        return cfop;
    }

    /**
     * @param cfop the cfop to set
     */
    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    /**
     * @return the cod_nat
     */
    public String getCod_nat() {
        return cod_nat;
    }

    /**
     * @param cod_nat the cod_nat to set
     */
    public void setCod_nat(String cod_nat) {
        this.cod_nat = cod_nat;
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
     * @return the aliq_icms
     */
    public String getAliq_icms() {
        return aliq_icms;
    }

    /**
     * @param aliq_icms the aliq_icms to set
     */
    public void setAliq_icms(String aliq_icms) {
        this.aliq_icms = aliq_icms;
    }

    /**
     * @return the vl_icms
     */
    public String getVl_icms() {
        return vl_icms;
    }

    /**
     * @param vl_icms the vl_icms to set
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
     * @return the aliq_st
     */
    public String getAliq_st() {
        return aliq_st;
    }

    /**
     * @param aliq_st the aliq_st to set
     */
    public void setAliq_st(String aliq_st) {
        this.aliq_st = aliq_st;
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
     * @return the ind_apur
     */
    public String getInd_apur() {
        return ind_apur;
    }

    /**
     * @param ind_apur the ind_apur to set
     */
    public void setInd_apur(String ind_apur) {
        this.ind_apur = ind_apur;
    }

    /**
     * @return the cst_ipi
     */
    public String getCst_ipi() {
        return cst_ipi;
    }

    /**
     * @param cst_ipi the cst_ipi to set
     */
    public void setCst_ipi(String cst_ipi) {
        this.cst_ipi = cst_ipi;
    }

    /**
     * @return the cod_enq
     */
    public String getCod_enq() {
        return cod_enq;
    }

    /**
     * @param cod_enq the cod_enq to set
     */
    public void setCod_enq(String cod_enq) {
        this.cod_enq = cod_enq;
    }

    /**
     * @return the vl_bc_ipi
     */
    public String getVl_bc_ipi() {
        return vl_bc_ipi;
    }

    /**
     * @param vl_bc_ipi the vl_bc_ipi to set
     */
    public void setVl_bc_ipi(String vl_bc_ipi) {
        this.vl_bc_ipi = vl_bc_ipi;
    }

    /**
     * @return the aliq_ipi
     */
    public String getAliq_ipi() {
        return aliq_ipi;
    }

    /**
     * @param aliq_ipi the aliq_ipi to set
     */
    public void setAliq_ipi(String aliq_ipi) {
        this.aliq_ipi = aliq_ipi;
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
     * @return the cst_pis
     */
    public String getCst_pis() {
        return cst_pis;
    }

    /**
     * @param cst_pis the cst_pis to set
     */
    public void setCst_pis(String cst_pis) {
        this.cst_pis = cst_pis;
    }

    /**
     * @return the vl_bc_pis
     */
    public String getVl_bc_pis() {
        return vl_bc_pis;
    }

    /**
     * @param vl_bc_pis the vl_bc_pis to set
     */
    public void setVl_bc_pis(String vl_bc_pis) {
        this.vl_bc_pis = vl_bc_pis;
    }

    /**
     * @return the aliq_pis_percentual
     */
    public String getAliq_pis_percentual() {
        return aliq_pis_percentual;
    }

    /**
     * @param aliq_pis_percentual the aliq_pis_percentual to set
     */
    public void setAliq_pis_percentual(String aliq_pis_percentual) {
        this.aliq_pis_percentual = aliq_pis_percentual;
    }

    /**
     * @return the quant_bc_pis
     */
    public String getQuant_bc_pis() {
        return quant_bc_pis;
    }

    /**
     * @param quant_bc_pis the quant_bc_pis to set
     */
    public void setQuant_bc_pis(String quant_bc_pis) {
        this.quant_bc_pis = quant_bc_pis;
    }

    /**
     * @return the aliq_pis_reais
     */
    public String getAliq_pis_reais() {
        return aliq_pis_reais;
    }

    /**
     * @param aliq_pis_reais the aliq_pis_reais to set
     */
    public void setAliq_pis_reais(String aliq_pis_reais) {
        this.aliq_pis_reais = aliq_pis_reais;
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
     * @return the cst_cofins
     */
    public String getCst_cofins() {
        return cst_cofins;
    }

    /**
     * @param cst_cofins the cst_cofins to set
     */
    public void setCst_cofins(String cst_cofins) {
        this.cst_cofins = cst_cofins;
    }

    /**
     * @return the vl_bc_cofins
     */
    public String getVl_bc_cofins() {
        return vl_bc_cofins;
    }

    /**
     * @param vl_bc_cofins the vl_bc_cofins to set
     */
    public void setVl_bc_cofins(String vl_bc_cofins) {
        this.vl_bc_cofins = vl_bc_cofins;
    }

    /**
     * @return the aliq_cofins_percentual
     */
    public String getAliq_cofins_percentual() {
        return aliq_cofins_percentual;
    }

    /**
     * @param aliq_cofins_percentual the aliq_cofins_percentual to set
     */
    public void setAliq_cofins_percentual(String aliq_cofins_percentual) {
        this.aliq_cofins_percentual = aliq_cofins_percentual;
    }

    /**
     * @return the quant_bc_cofins
     */
    public String getQuant_bc_cofins() {
        return quant_bc_cofins;
    }

    /**
     * @param quant_bc_cofins the quant_bc_cofins to set
     */
    public void setQuant_bc_cofins(String quant_bc_cofins) {
        this.quant_bc_cofins = quant_bc_cofins;
    }

    /**
     * @return the aliq_cofins_reais
     */
    public String getAliq_cofins_reais() {
        return aliq_cofins_reais;
    }

    /**
     * @param aliq_cofins_reais the aliq_cofins_reais to set
     */
    public void setAliq_cofins_reais(String aliq_cofins_reais) {
        this.aliq_cofins_reais = aliq_cofins_reais;
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
     * @return the cod_cta
     */
    public String getcod_cta() {
        return cod_cta;
    }

    /**
     * @param cod_cta the cod_cta to set
     */
    public void setcod_cta(String cod_cta) {
        this.cod_cta = cod_cta;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registroC172
     */
    public RegistroC172 getRegistroC172() {
        return registroC172;
    }

    /**
     * @param registroC172 the registroC172 to set
     */
    public void setRegistroC172(RegistroC172 registroC172) {
        this.registroC172 = registroC172;
    }

    /**
     * @return the registroC177
     */
    public RegistroC177 getRegistroC177() {
        return registroC177;
    }

    /**
     * @param registroC177 the registroC177 to set
     */
    public void setRegistroC177(RegistroC177 registroC177) {
        this.registroC177 = registroC177;
    }

    /**
     * @return the registroC178
     */
    public RegistroC178 getRegistroC178() {
        return registroC178;
    }

    /**
     * @param registroC178 the registroC178 to set
     */
    public void setRegistroC178(RegistroC178 registroC178) {
        this.registroC178 = registroC178;
    }

    /**
     * @return the registroC179
     */
    public RegistroC179 getRegistroC179() {
        return registroC179;
    }

    /**
     * @param registroC179 the registroC179 to set
     */
    public void setRegistroC179(RegistroC179 registroC179) {
        this.registroC179 = registroC179;
    }

    /**
     * @return the registroC171
     */
    public List<RegistroC171> getRegistroC171() {
        if (registroC171 == null) {
            registroC171 = new ArrayList<RegistroC171>();
        }
        return registroC171;
    }

    /**
     * @return the registroC173
     */
    public List<RegistroC173> getRegistroC173() {
        if (registroC173 == null) {
            registroC173 = new ArrayList<RegistroC173>();
        }
        return registroC173;
    }

    /**
     * @return the registroC174
     */
    public List<RegistroC174> getRegistroC174() {
        if (registroC174 == null) {
            registroC174 = new ArrayList<RegistroC174>();
        }
        return registroC174;
    }

    /**
     * @return the registroC175
     */
    public List<RegistroC175> getRegistroC175() {
        if (registroC175 == null) {
            registroC175 = new ArrayList<RegistroC175>();
        }
        return registroC175;
    }

    /**
     * @return the registroC176
     */
    public List<RegistroC176> getRegistroC176() {
        if (registroC176 == null) {
            registroC176 = new ArrayList<RegistroC176>();
        }
        return registroC176;
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

}
