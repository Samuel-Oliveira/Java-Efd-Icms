package br.com.swconsultoria.efd.icms.registros.contadores;

import br.com.swconsultoria.efd.icms.registros.blocoC.BlocoCEnum;
import lombok.EqualsAndHashCode;

/**
 * @author Samuel Oliveira, Sidnei Klein
 */
@EqualsAndHashCode
public class ContadoresBlocoC {

    //Bloco C
    private int contRegistroC001 = 0;
    private int contRegistroC100 = 0;
    private int contRegistroC101 = 0;
    private int contRegistroC105 = 0;
    private int contRegistroC110 = 0;
    private int contRegistroC111 = 0;
    private int contRegistroC112 = 0;
    private int contRegistroC113 = 0;
    private int contRegistroC114 = 0;
    private int contRegistroC115 = 0;
    private int contRegistroC116 = 0;
    private int contRegistroC120 = 0;
    private int contRegistroC130 = 0;
    private int contRegistroC140 = 0;
    private int contRegistroC141 = 0;
    private int contRegistroC160 = 0;
    private int contRegistroC165 = 0;
    private int contRegistroC170 = 0;
    private int contRegistroC171 = 0;
    private int contRegistroC172 = 0;
    private int contRegistroC173 = 0;
    private int contRegistroC174 = 0;
    private int contRegistroC175 = 0;
    private int contRegistroC176 = 0;
    private int contRegistroC177 = 0;
    private int contRegistroC178 = 0;
    private int contRegistroC179 = 0;
    private int contRegistroC180 = 0;
    private int contRegistroC181 = 0;
    private int contRegistroC185 = 0;
    private int contRegistroC186 = 0;
    private int contRegistroC190 = 0;
    private int contRegistroC191 = 0;
    private int contRegistroC195 = 0;
    private int contRegistroC198 = 0;
    private int contRegistroC197 = 0;
    private int contRegistroC300 = 0;
    private int contRegistroC310 = 0;
    private int contRegistroC320 = 0;
    private int contRegistroC330 = 0;
    private int contRegistroC321 = 0;
    private int contRegistroC350 = 0;
    private int contRegistroC370 = 0;
    private int contRegistroC380 = 0;
    private int contRegistroC390 = 0;
    private int contRegistroC400 = 0;
    private int contRegistroC405 = 0;
    private int contRegistroC410 = 0;
    private int contRegistroC420 = 0;
    private int contRegistroC425 = 0;
    private int contRegistroC430 = 0;
    private int contRegistroC460 = 0;
    private int contRegistroC465 = 0;
    private int contRegistroC470 = 0;
    private int contRegistroC480 = 0;
    private int contRegistroC490 = 0;
    private int contRegistroC495 = 0;
    private int contRegistroC500 = 0;
    private int contRegistroC510 = 0;
    private int contRegistroC590 = 0;
    private int contRegistroC591 = 0;
    private int contRegistroC595 = 0;
    private int contRegistroC597 = 0;
    private int contRegistroC600 = 0;
    private int contRegistroC601 = 0;
    private int contRegistroC610 = 0;
    private int contRegistroC690 = 0;
    private int contRegistroC700 = 0;
    private int contRegistroC790 = 0;
    private int contRegistroC791 = 0;
    private int contRegistroC800 = 0;
    private int contRegistroC810 = 0;
    private int contRegistroC815 = 0;
    private int contRegistroC850 = 0;
    private int contRegistroC860 = 0;
    private int contRegistroC870 = 0;
    private int contRegistroC880 = 0;
    private int contRegistroC890 = 0;
    private int contRegistroC990 = 0;

    public void incrementar(BlocoCEnum bloco) {

        setContRegistroC990(getContRegistroC990() + 1);

        switch (bloco) {
            case RegistroC001:
                setContRegistroC001(getContRegistroC001() + 1);
                break;
            case RegistroC100:
                setContRegistroC100(getContRegistroC100() + 1);
                break;
            case RegistroC101:
                setContRegistroC101(getContRegistroC101() + 1);
                break;
            case RegistroC105:
                setContRegistroC105(getContRegistroC105() + 1);
                break;
            case RegistroC110:
                setContRegistroC110(getContRegistroC110() + 1);
                break;
            case RegistroC111:
                setContRegistroC111(getContRegistroC111() + 1);
                break;
            case RegistroC112:
                setContRegistroC112(getContRegistroC112() + 1);
                break;
            case RegistroC113:
                setContRegistroC113(getContRegistroC113() + 1);
                break;
            case RegistroC114:
                setContRegistroC114(getContRegistroC114() + 1);
                break;
            case RegistroC115:
                setContRegistroC115(getContRegistroC115() + 1);
                break;
            case RegistroC116:
                setContRegistroC116(getContRegistroC116() + 1);
                break;
            case RegistroC120:
                setContRegistroC120(getContRegistroC120() + 1);
                break;
            case RegistroC130:
                setContRegistroC130(getContRegistroC130() + 1);
                break;
            case RegistroC140:
                setContRegistroC140(getContRegistroC140() + 1);
                break;
            case RegistroC141:
                setContRegistroC141(getContRegistroC141() + 1);
                break;
            case RegistroC160:
                setContRegistroC160(getContRegistroC160() + 1);
                break;
            case RegistroC165:
                setContRegistroC165(getContRegistroC165() + 1);
                break;
            case RegistroC170:
                setContRegistroC170(getContRegistroC170() + 1);
                break;
            case RegistroC171:
                setContRegistroC171(getContRegistroC171() + 1);
                break;
            case RegistroC172:
                setContRegistroC172(getContRegistroC172() + 1);
                break;
            case RegistroC173:
                setContRegistroC173(getContRegistroC173() + 1);
                break;
            case RegistroC174:
                setContRegistroC174(getContRegistroC174() + 1);
                break;
            case RegistroC175:
                setContRegistroC175(getContRegistroC175() + 1);
                break;
            case RegistroC176:
                setContRegistroC176(getContRegistroC176() + 1);
                break;
            case RegistroC177:
                setContRegistroC177(getContRegistroC177() + 1);
                break;
            case RegistroC178:
                setContRegistroC178(getContRegistroC178() + 1);
                break;
            case RegistroC179:
                setContRegistroC179(getContRegistroC179() + 1);
                break;
            case RegistroC180:
                setContRegistroC180(getContRegistroC180() + 1);
                break;
            case RegistroC181:
                setContRegistroC181(getContRegistroC181() + 1);
                break;
            case RegistroC185:
                setContRegistroC185(getContRegistroC185() + 1);
                break;
            case RegistroC186:
                setContRegistroC186(getContRegistroC186() + 1);
                break;
            case RegistroC190:
                setContRegistroC190(getContRegistroC190() + 1);
                break;
            case RegistroC191:
                setContRegistroC191(getContRegistroC191() + 1);
                break;
            case RegistroC195:
                setContRegistroC195(getContRegistroC195() + 1);
                break;
            case RegistroC197:
                setContRegistroC197(getContRegistroC197() + 1);
                break;
            case RegistroC198:
                setContRegistroC198(getContRegistroC198() + 1);
                break;
            case RegistroC300:
                setContRegistroC300(getContRegistroC300() + 1);
                break;
            case RegistroC310:
                setContRegistroC310(getContRegistroC310() + 1);
                break;
            case RegistroC320:
                setContRegistroC320(getContRegistroC320() + 1);
                break;
            case RegistroC330:
                setContRegistroC330(getContRegistroC330() + 1);
                break;
            case RegistroC321:
                setContRegistroC321(getContRegistroC321() + 1);
                break;
            case RegistroC350:
                setContRegistroC350(getContRegistroC350() + 1);
                break;
            case RegistroC370:
                setContRegistroC370(getContRegistroC370() + 1);
                break;
            case RegistroC380:
                setContRegistroC380(getContRegistroC380() + 1);
                break;
            case RegistroC390:
                setContRegistroC390(getContRegistroC390() + 1);
                break;
            case RegistroC400:
                setContRegistroC400(getContRegistroC400() + 1);
                break;
            case RegistroC405:
                setContRegistroC405(getContRegistroC405() + 1);
                break;
            case RegistroC410:
                setContRegistroC410(getContRegistroC410() + 1);
                break;
            case RegistroC420:
                setContRegistroC420(getContRegistroC420() + 1);
                break;
            case RegistroC430:
                setContRegistroC430(getContRegistroC430() + 1);
                break;
            case RegistroC425:
                setContRegistroC425(getContRegistroC425() + 1);
                break;
            case RegistroC460:
                setContRegistroC460(getContRegistroC460() + 1);
                break;
            case RegistroC465:
                setContRegistroC465(getContRegistroC465() + 1);
                break;
            case RegistroC470:
                setContRegistroC470(getContRegistroC470() + 1);
                break;
            case RegistroC480:
                setContRegistroC480(getContRegistroC480() + 1);
                break;
            case RegistroC490:
                setContRegistroC490(getContRegistroC490() + 1);
                break;
            case RegistroC495:
                setContRegistroC495(getContRegistroC495() + 1);
                break;
            case RegistroC500:
                setContRegistroC500(getContRegistroC500() + 1);
                break;
            case RegistroC510:
                setContRegistroC510(getContRegistroC510() + 1);
                break;
            case RegistroC590:
                setContRegistroC590(getContRegistroC590() + 1);
                break;
            case RegistroC591:
                setContRegistroC591(getContRegistroC591() + 1);
                break;
            case RegistroC595:
                setContRegistroC595(getContRegistroC595() + 1);
                break;
            case RegistroC597:
                setContRegistroC597(getContRegistroC597() + 1);
                break;
            case RegistroC600:
                setContRegistroC600(getContRegistroC600() + 1);
                break;
            case RegistroC601:
                setContRegistroC601(getContRegistroC601() + 1);
                break;
            case RegistroC610:
                setContRegistroC610(getContRegistroC610() + 1);
                break;
            case RegistroC690:
                setContRegistroC690(getContRegistroC690() + 1);
                break;
            case RegistroC700:
                setContRegistroC700(getContRegistroC700() + 1);
                break;
            case RegistroC790:
                setContRegistroC790(getContRegistroC790() + 1);
                break;
            case RegistroC800:
                setContRegistroC800(getContRegistroC800() + 1);
                break;
            case RegistroC810:
                setContRegistroC810(getContRegistroC810() + 1);
                break;
            case RegistroC815:
                setContRegistroC815(getContRegistroC815() + 1);
                break;
            case RegistroC850:
                setContRegistroC850(getContRegistroC850() + 1);
                break;
            case RegistroC791:
                setContRegistroC791(getContRegistroC791() + 1);
                break;
            case RegistroC860:
                setContRegistroC860(getContRegistroC860() + 1);
                break;
            case RegistroC870:
                setContRegistroC870(getContRegistroC870() + 1);
                break;
            case RegistroC880:
                setContRegistroC880(getContRegistroC880() + 1);
                break;
            case RegistroC890:
                setContRegistroC890(getContRegistroC890() + 1);
                break;
            default:
                break;
        }
    }

    /**
     * @return the contRegistroC001
     */
    public int getContRegistroC001() {
        return contRegistroC001;
    }

    /**
     * @param contRegistroC001 the contRegistroC001 to set
     */
    public void setContRegistroC001(int contRegistroC001) {
        this.contRegistroC001 = contRegistroC001;
    }

    /**
     * @return the contRegistroC100
     */
    public int getContRegistroC100() {
        return contRegistroC100;
    }

    /**
     * @param contRegistroC100 the contRegistroC100 to set
     */
    public void setContRegistroC100(int contRegistroC100) {
        this.contRegistroC100 = contRegistroC100;
    }

    /**
     * @return the contRegistroC101
     */
    public int getContRegistroC101() {
        return contRegistroC101;
    }

    /**
     * @param contRegistroC101 the contRegistroC101 to set
     */
    public void setContRegistroC101(int contRegistroC101) {
        this.contRegistroC101 = contRegistroC101;
    }

    public int getContRegistroC810() {
        return contRegistroC810;
    }

    public void setContRegistroC810(int contRegistroC810) {
        this.contRegistroC810 = contRegistroC810;
    }

    public int getContRegistroC815() {
        return contRegistroC815;
    }

    public void setContRegistroC815(int contRegistroC815) {
        this.contRegistroC815 = contRegistroC815;
    }

    public int getContRegistroC870() {
        return contRegistroC870;
    }

    public void setContRegistroC870(int contRegistroC870) {
        this.contRegistroC870 = contRegistroC870;
    }

    public int getContRegistroC880() {
        return contRegistroC880;
    }

    public void setContRegistroC880(int contRegistroC880) {
        this.contRegistroC880 = contRegistroC880;
    }

    /**
     * @return the contRegistroC105
     */
    public int getContRegistroC105() {
        return contRegistroC105;
    }

    /**
     * @param contRegistroC105 the contRegistroC105 to set
     */
    public void setContRegistroC105(int contRegistroC105) {
        this.contRegistroC105 = contRegistroC105;
    }

    public int getContRegistroC591() {
        return contRegistroC591;
    }

    public void setContRegistroC591(int contRegistroC591) {
        this.contRegistroC591 = contRegistroC591;
    }

    public int getContRegistroC595() {
        return contRegistroC595;
    }

    public void setContRegistroC595(int contRegistroC595) {
        this.contRegistroC595 = contRegistroC595;
    }

    public int getContRegistroC597() {
        return contRegistroC597;
    }

    public void setContRegistroC597(int contRegistroC597) {
        this.contRegistroC597 = contRegistroC597;
    }

    /**
     * @return the contRegistroC110
     */
    public int getContRegistroC110() {
        return contRegistroC110;
    }

    /**
     * @param contRegistroC110 the contRegistroC110 to set
     */
    public void setContRegistroC110(int contRegistroC110) {
        this.contRegistroC110 = contRegistroC110;
    }

    public int getContRegistroC430() {
        return contRegistroC430;
    }

    public void setContRegistroC430(int contRegistroC430) {
        this.contRegistroC430 = contRegistroC430;
    }

    public int getContRegistroC480() {
        return contRegistroC480;
    }

    public void setContRegistroC480(int contRegistroC480) {
        this.contRegistroC480 = contRegistroC480;
    }

    /**
     * @return the contRegistroC111
     */
    public int getContRegistroC111() {
        return contRegistroC111;
    }

    /**
     * @param contRegistroC111 the contRegistroC111 to set
     */
    public void setContRegistroC111(int contRegistroC111) {
        this.contRegistroC111 = contRegistroC111;
    }

    /**
     * @return the contRegistroC112
     */
    public int getContRegistroC112() {
        return contRegistroC112;
    }

    /**
     * @param contRegistroC112 the contRegistroC112 to set
     */
    public void setContRegistroC112(int contRegistroC112) {
        this.contRegistroC112 = contRegistroC112;
    }

    /**
     * @return the contRegistroC113
     */
    public int getContRegistroC113() {
        return contRegistroC113;
    }

    /**
     * @param contRegistroC113 the contRegistroC113 to set
     */
    public void setContRegistroC113(int contRegistroC113) {
        this.contRegistroC113 = contRegistroC113;
    }

    /**
     * @return the contRegistroC114
     */
    public int getContRegistroC114() {
        return contRegistroC114;
    }

    /**
     * @param contRegistroC114 the contRegistroC114 to set
     */
    public void setContRegistroC114(int contRegistroC114) {
        this.contRegistroC114 = contRegistroC114;
    }

    /**
     * @return the contRegistroC115
     */
    public int getContRegistroC115() {
        return contRegistroC115;
    }

    /**
     * @param contRegistroC115 the contRegistroC115 to set
     */
    public void setContRegistroC115(int contRegistroC115) {
        this.contRegistroC115 = contRegistroC115;
    }

    /**
     * @return the contRegistroC116
     */
    public int getContRegistroC116() {
        return contRegistroC116;
    }

    /**
     * @param contRegistroC116 the contRegistroC116 to set
     */
    public void setContRegistroC116(int contRegistroC116) {
        this.contRegistroC116 = contRegistroC116;
    }

    /**
     * @return the contRegistroC120
     */
    public int getContRegistroC120() {
        return contRegistroC120;
    }

    /**
     * @param contRegistroC120 the contRegistroC120 to set
     */
    public void setContRegistroC120(int contRegistroC120) {
        this.contRegistroC120 = contRegistroC120;
    }

    /**
     * @return the contRegistroC130
     */
    public int getContRegistroC130() {
        return contRegistroC130;
    }

    /**
     * @param contRegistroC130 the contRegistroC130 to set
     */
    public void setContRegistroC130(int contRegistroC130) {
        this.contRegistroC130 = contRegistroC130;
    }

    /**
     * @return the contRegistroC140
     */
    public int getContRegistroC140() {
        return contRegistroC140;
    }

    /**
     * @param contRegistroC140 the contRegistroC140 to set
     */
    public void setContRegistroC140(int contRegistroC140) {
        this.contRegistroC140 = contRegistroC140;
    }

    /**
     * @return the contRegistroC141
     */
    public int getContRegistroC141() {
        return contRegistroC141;
    }

    /**
     * @param contRegistroC141 the contRegistroC141 to set
     */
    public void setContRegistroC141(int contRegistroC141) {
        this.contRegistroC141 = contRegistroC141;
    }

    /**
     * @return the contRegistroC160
     */
    public int getContRegistroC160() {
        return contRegistroC160;
    }

    /**
     * @param contRegistroC160 the contRegistroC160 to set
     */
    public void setContRegistroC160(int contRegistroC160) {
        this.contRegistroC160 = contRegistroC160;
    }

    public int getContRegistroC330() {
        return contRegistroC330;
    }

    public void setContRegistroC330(int contRegistroC330) {
        this.contRegistroC330 = contRegistroC330;
    }

    public int getContRegistroC380() {
        return contRegistroC380;
    }

    public void setContRegistroC380(int contRegistroC380) {
        this.contRegistroC380 = contRegistroC380;
    }

    /**
     * @return the contRegistroC165
     */
    public int getContRegistroC165() {
        return contRegistroC165;
    }

    /**
     * @param contRegistroC165 the contRegistroC165 to set
     */
    public void setContRegistroC165(int contRegistroC165) {
        this.contRegistroC165 = contRegistroC165;
    }

    /**
     * @return the contRegistroC170
     */
    public int getContRegistroC170() {
        return contRegistroC170;
    }

    /**
     * @param contRegistroC170 the contRegistroC170 to set
     */
    public void setContRegistroC170(int contRegistroC170) {
        this.contRegistroC170 = contRegistroC170;
    }

    /**
     * @return the contRegistroC171
     */
    public int getContRegistroC171() {
        return contRegistroC171;
    }

    /**
     * @param contRegistroC171 the contRegistroC171 to set
     */
    public void setContRegistroC171(int contRegistroC171) {
        this.contRegistroC171 = contRegistroC171;
    }

    /**
     * @return the contRegistroC172
     */
    public int getContRegistroC172() {
        return contRegistroC172;
    }

    /**
     * @param contRegistroC172 the contRegistroC172 to set
     */
    public void setContRegistroC172(int contRegistroC172) {
        this.contRegistroC172 = contRegistroC172;
    }

    /**
     * @return the contRegistroC173
     */
    public int getContRegistroC173() {
        return contRegistroC173;
    }

    /**
     * @param contRegistroC173 the contRegistroC173 to set
     */
    public void setContRegistroC173(int contRegistroC173) {
        this.contRegistroC173 = contRegistroC173;
    }

    /**
     * @return the contRegistroC174
     */
    public int getContRegistroC174() {
        return contRegistroC174;
    }

    /**
     * @param contRegistroC174 the contRegistroC174 to set
     */
    public void setContRegistroC174(int contRegistroC174) {
        this.contRegistroC174 = contRegistroC174;
    }

    /**
     * @return the contRegistroC175
     */
    public int getContRegistroC175() {
        return contRegistroC175;
    }

    /**
     * @param contRegistroC175 the contRegistroC175 to set
     */
    public void setContRegistroC175(int contRegistroC175) {
        this.contRegistroC175 = contRegistroC175;
    }

    /**
     * @return the contRegistroC176
     */
    public int getContRegistroC176() {
        return contRegistroC176;
    }

    /**
     * @param contRegistroC176 the contRegistroC176 to set
     */
    public void setContRegistroC176(int contRegistroC176) {
        this.contRegistroC176 = contRegistroC176;
    }

    /**
     * @return the contRegistroC177
     */
    public int getContRegistroC177() {
        return contRegistroC177;
    }

    /**
     * @param contRegistroC177 the contRegistroC177 to set
     */
    public void setContRegistroC177(int contRegistroC177) {
        this.contRegistroC177 = contRegistroC177;
    }

    /**
     * @return the contRegistroC178
     */
    public int getContRegistroC178() {
        return contRegistroC178;
    }

    /**
     * @param contRegistroC178 the contRegistroC178 to set
     */
    public void setContRegistroC178(int contRegistroC178) {
        this.contRegistroC178 = contRegistroC178;
    }

    /**
     * @return the contRegistroC179
     */
    public int getContRegistroC179() {
        return contRegistroC179;
    }

    /**
     * @param contRegistroC179 the contRegistroC179 to set
     */
    public void setContRegistroC179(int contRegistroC179) {
        this.contRegistroC179 = contRegistroC179;
    }

    public int getContRegistroC180() {
        return contRegistroC180;
    }

    public void setContRegistroC180(int contRegistroC180) {
        this.contRegistroC180 = contRegistroC180;
    }

    public int getContRegistroC181() {
        return contRegistroC181;
    }

    public void setContRegistroC181(int contRegistroC181) {
        this.contRegistroC181 = contRegistroC181;
    }

    public int getContRegistroC186() {
        return contRegistroC186;
    }

    public void setContRegistroC186(int contRegistroC186) {
        this.contRegistroC186 = contRegistroC186;
    }

    public int getContRegistroC185() {
        return contRegistroC185;
    }

    public void setContRegistroC185(int contRegistroC185) {
        this.contRegistroC185 = contRegistroC185;
    }

    /**
     * @return the contRegistroC190
     */
    public int getContRegistroC190() {
        return contRegistroC190;
    }

    /**
     * @param contRegistroC190 the contRegistroC190 to set
     */
    public void setContRegistroC190(int contRegistroC190) {
        this.contRegistroC190 = contRegistroC190;
    }

    /**
     * @return the contRegistroC191
     */
    public int getContRegistroC191() {
        return contRegistroC191;
    }

    /**
     * @param contRegistroC191 the contRegistroC191 to set
     */
    public void setContRegistroC191(int contRegistroC191) {
        this.contRegistroC191 = contRegistroC191;
    }

    /**
     * @return the contRegistroC195
     */
    public int getContRegistroC195() {
        return contRegistroC195;
    }

    /**
     * @param contRegistroC195 the contRegistroC195 to set
     */
    public void setContRegistroC195(int contRegistroC195) {
        this.contRegistroC195 = contRegistroC195;
    }

    /**
     * @return the contRegistroC198
     */
    public int getContRegistroC198() {
        return contRegistroC198;
    }

    /**
     * @param contRegistroC198 the contRegistroC198 to set
     */
    public void setContRegistroC198(int contRegistroC198) {
        this.contRegistroC198 = contRegistroC198;
    }

    /**
     * @return the contRegistroC197
     */
    public int getContRegistroC197() {
        return contRegistroC197;
    }

    /**
     * @param contRegistroC197 the contRegistroC197 to set
     */
    public void setContRegistroC197(int contRegistroC197) {
        this.contRegistroC197 = contRegistroC197;
    }

    /**
     * @return the contRegistroC300
     */
    public int getContRegistroC300() {
        return contRegistroC300;
    }

    /**
     * @param contRegistroC300 the contRegistroC300 to set
     */
    public void setContRegistroC300(int contRegistroC300) {
        this.contRegistroC300 = contRegistroC300;
    }

    /**
     * @return the contRegistroC310
     */
    public int getContRegistroC310() {
        return contRegistroC310;
    }

    /**
     * @param contRegistroC310 the contRegistroC310 to set
     */
    public void setContRegistroC310(int contRegistroC310) {
        this.contRegistroC310 = contRegistroC310;
    }

    /**
     * @return the contRegistroC320
     */
    public int getContRegistroC320() {
        return contRegistroC320;
    }

    /**
     * @param contRegistroC320 the contRegistroC320 to set
     */
    public void setContRegistroC320(int contRegistroC320) {
        this.contRegistroC320 = contRegistroC320;
    }

    /**
     * @return the contRegistroC321
     */
    public int getContRegistroC321() {
        return contRegistroC321;
    }

    /**
     * @param contRegistroC321 the contRegistroC321 to set
     */
    public void setContRegistroC321(int contRegistroC321) {
        this.contRegistroC321 = contRegistroC321;
    }

    /**
     * @return the contRegistroC350
     */
    public int getContRegistroC350() {
        return contRegistroC350;
    }

    /**
     * @param contRegistroC350 the contRegistroC350 to set
     */
    public void setContRegistroC350(int contRegistroC350) {
        this.contRegistroC350 = contRegistroC350;
    }

    /**
     * @return the contRegistroC370
     */
    public int getContRegistroC370() {
        return contRegistroC370;
    }

    /**
     * @param contRegistroC370 the contRegistroC370 to set
     */
    public void setContRegistroC370(int contRegistroC370) {
        this.contRegistroC370 = contRegistroC370;
    }

    /**
     * @return the contRegistroC390
     */
    public int getContRegistroC390() {
        return contRegistroC390;
    }

    /**
     * @param contRegistroC390 the contRegistroC390 to set
     */
    public void setContRegistroC390(int contRegistroC390) {
        this.contRegistroC390 = contRegistroC390;
    }

    /**
     * @return the contRegistroC400
     */
    public int getContRegistroC400() {
        return contRegistroC400;
    }

    /**
     * @param contRegistroC400 the contRegistroC400 to set
     */
    public void setContRegistroC400(int contRegistroC400) {
        this.contRegistroC400 = contRegistroC400;
    }

    /**
     * @return the contRegistroC405
     */
    public int getContRegistroC405() {
        return contRegistroC405;
    }

    /**
     * @param contRegistroC405 the contRegistroC405 to set
     */
    public void setContRegistroC405(int contRegistroC405) {
        this.contRegistroC405 = contRegistroC405;
    }

    /**
     * @return the contRegistroC410
     */
    public int getContRegistroC410() {
        return contRegistroC410;
    }

    /**
     * @param contRegistroC410 the contRegistroC410 to set
     */
    public void setContRegistroC410(int contRegistroC410) {
        this.contRegistroC410 = contRegistroC410;
    }

    /**
     * @return the contRegistroC420
     */
    public int getContRegistroC420() {
        return contRegistroC420;
    }

    /**
     * @param contRegistroC420 the contRegistroC420 to set
     */
    public void setContRegistroC420(int contRegistroC420) {
        this.contRegistroC420 = contRegistroC420;
    }

    /**
     * @return the contRegistroC425
     */
    public int getContRegistroC425() {
        return contRegistroC425;
    }

    /**
     * @param contRegistroC425 the contRegistroC425 to set
     */
    public void setContRegistroC425(int contRegistroC425) {
        this.contRegistroC425 = contRegistroC425;
    }

    /**
     * @return the contRegistroC460
     */
    public int getContRegistroC460() {
        return contRegistroC460;
    }

    /**
     * @param contRegistroC460 the contRegistroC460 to set
     */
    public void setContRegistroC460(int contRegistroC460) {
        this.contRegistroC460 = contRegistroC460;
    }

    /**
     * @return the contRegistroC465
     */
    public int getContRegistroC465() {
        return contRegistroC465;
    }

    /**
     * @param contRegistroC465 the contRegistroC465 to set
     */
    public void setContRegistroC465(int contRegistroC465) {
        this.contRegistroC465 = contRegistroC465;
    }

    /**
     * @return the contRegistroC470
     */
    public int getContRegistroC470() {
        return contRegistroC470;
    }

    /**
     * @param contRegistroC470 the contRegistroC470 to set
     */
    public void setContRegistroC470(int contRegistroC470) {
        this.contRegistroC470 = contRegistroC470;
    }

    /**
     * @return the contRegistroC490
     */
    public int getContRegistroC490() {
        return contRegistroC490;
    }

    /**
     * @param contRegistroC490 the contRegistroC490 to set
     */
    public void setContRegistroC490(int contRegistroC490) {
        this.contRegistroC490 = contRegistroC490;
    }

    /**
     * @return the contRegistroC495
     */
    public int getContRegistroC495() {
        return contRegistroC495;
    }

    /**
     * @param contRegistroC495 the contRegistroC495 to set
     */
    public void setContRegistroC495(int contRegistroC495) {
        this.contRegistroC495 = contRegistroC495;
    }

    /**
     * @return the contRegistroC500
     */
    public int getContRegistroC500() {
        return contRegistroC500;
    }

    /**
     * @param contRegistroC500 the contRegistroC500 to set
     */
    public void setContRegistroC500(int contRegistroC500) {
        this.contRegistroC500 = contRegistroC500;
    }

    /**
     * @return the contRegistroC510
     */
    public int getContRegistroC510() {
        return contRegistroC510;
    }

    /**
     * @param contRegistroC510 the contRegistroC510 to set
     */
    public void setContRegistroC510(int contRegistroC510) {
        this.contRegistroC510 = contRegistroC510;
    }

    /**
     * @return the contRegistroC590
     */
    public int getContRegistroC590() {
        return contRegistroC590;
    }

    /**
     * @param contRegistroC590 the contRegistroC590 to set
     */
    public void setContRegistroC590(int contRegistroC590) {
        this.contRegistroC590 = contRegistroC590;
    }

    /**
     * @return the contRegistroC600
     */
    public int getContRegistroC600() {
        return contRegistroC600;
    }

    /**
     * @param contRegistroC600 the contRegistroC600 to set
     */
    public void setContRegistroC600(int contRegistroC600) {
        this.contRegistroC600 = contRegistroC600;
    }

    /**
     * @return the contRegistroC601
     */
    public int getContRegistroC601() {
        return contRegistroC601;
    }

    /**
     * @param contRegistroC601 the contRegistroC601 to set
     */
    public void setContRegistroC601(int contRegistroC601) {
        this.contRegistroC601 = contRegistroC601;
    }

    /**
     * @return the contRegistroC610
     */
    public int getContRegistroC610() {
        return contRegistroC610;
    }

    /**
     * @param contRegistroC610 the contRegistroC610 to set
     */
    public void setContRegistroC610(int contRegistroC610) {
        this.contRegistroC610 = contRegistroC610;
    }

    /**
     * @return the contRegistroC690
     */
    public int getContRegistroC690() {
        return contRegistroC690;
    }

    /**
     * @param contRegistroC690 the contRegistroC690 to set
     */
    public void setContRegistroC690(int contRegistroC690) {
        this.contRegistroC690 = contRegistroC690;
    }

    /**
     * @return the contRegistroC700
     */
    public int getContRegistroC700() {
        return contRegistroC700;
    }

    /**
     * @param contRegistroC700 the contRegistroC700 to set
     */
    public void setContRegistroC700(int contRegistroC700) {
        this.contRegistroC700 = contRegistroC700;
    }

    /**
     * @return the contRegistroC790
     */
    public int getContRegistroC790() {
        return contRegistroC790;
    }

    /**
     * @param contRegistroC790 the contRegistroC790 to set
     */
    public void setContRegistroC790(int contRegistroC790) {
        this.contRegistroC790 = contRegistroC790;
    }

    /**
     * @return the contRegistroC791
     */
    public int getContRegistroC791() {
        return contRegistroC791;
    }

    /**
     * @param contRegistroC791 the contRegistroC791 to set
     */
    public void setContRegistroC791(int contRegistroC791) {
        this.contRegistroC791 = contRegistroC791;
    }

    /**
     * @return the contRegistroC800
     */
    public int getContRegistroC800() {
        return contRegistroC800;
    }

    /**
     * @param contRegistroC800 the contRegistroC800 to set
     */
    public void setContRegistroC800(int contRegistroC800) {
        this.contRegistroC800 = contRegistroC800;
    }

    /**
     * @return the contRegistroC850
     */
    public int getContRegistroC850() {
        return contRegistroC850;
    }

    /**
     * @param contRegistroC850 the contRegistroC850 to set
     */
    public void setContRegistroC850(int contRegistroC850) {
        this.contRegistroC850 = contRegistroC850;
    }

    /**
     * @return the contRegistroC860
     */
    public int getContRegistroC860() {
        return contRegistroC860;
    }

    /**
     * @param contRegistroC860 the contRegistroC860 to set
     */
    public void setContRegistroC860(int contRegistroC860) {
        this.contRegistroC860 = contRegistroC860;
    }

    /**
     * @return the contRegistroC890
     */
    public int getContRegistroC890() {
        return contRegistroC890;
    }

    /**
     * @param contRegistroC890 the contRegistroC890 to set
     */
    public void setContRegistroC890(int contRegistroC890) {
        this.contRegistroC890 = contRegistroC890;
    }

    /**
     * @return the contRegistroC990
     */
    public int getContRegistroC990() {
        return contRegistroC990;
    }

    /**
     * @param contRegistroC990 the contRegistroC990 to set
     */
    public void setContRegistroC990(int contRegistroC990) {
        this.contRegistroC990 = contRegistroC990;
    }

}
