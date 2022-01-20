package br.com.swconsultoria.efd.icms.util;

import br.com.swconsultoria.efd.icms.exception.EfdException;
import br.com.swconsultoria.efd.icms.registros.EfdIcms;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Collection;

public final class Util {

    private static final LocalDate dataVersao2018 = LocalDate.of(2017, 12, 31);
    private static final LocalDate dataVersao2019 = LocalDate.of(2018, 12, 31);
    private static final LocalDate dataVersao2020 = LocalDate.of(2019, 12, 31);
    private static final LocalDate dataVersao2021 = LocalDate.of(2020, 12, 31);
    private static final LocalDate dataVersao2022 = LocalDate.of(2021, 12, 31);

    /**
     * Construtor privado para garantir o Singleton.
     */
    private Util() {

    }

    /**
     * Verifica se um objeto está vazio.
     *
     * @param obj
     * @return <b>true</b> se o objeto for vazio(empty).
     */
    public static boolean isEmpty(Object obj) {
        if (obj == null)
            return true;
        if (obj instanceof Collection)
            return ((Collection<?>) obj).isEmpty();

        final String s = String.valueOf(obj).trim();

        return s.length() == 0 || s.equalsIgnoreCase("null");
    }

    /**
     * Preenche o Registro
     *
     * @param String
     */
    public static String preencheRegistro(String string) {
        return Util.isEmpty(string) ? "" : string;
    }

    public static boolean versao2018(String dataStr) {
        return strToDate(dataStr).isAfter(dataVersao2018);
    }

    public static boolean versao2019(String dataStr) {
        return strToDate(dataStr).isAfter(dataVersao2019);
    }

    public static boolean versao2020(String dataStr) {
        return strToDate(dataStr).isAfter(dataVersao2020);
    }

    public static boolean versao2021(String dataStr) {
        return strToDate(dataStr).isAfter(dataVersao2021);
    }

    public static boolean versao2022(String dataStr) {
        return strToDate(dataStr).isAfter(dataVersao2022);
    }

    private static LocalDate strToDate(String dataStr) {
        return LocalDate.of(Integer.parseInt(dataStr.substring(4, 8)), Integer.parseInt(dataStr.substring(2, 4)), Integer.parseInt(dataStr.substring(0, 2)));
    }

    /**
     * Cria um arquivo com os dados passados
     *
     * @throws Exception
     */
    public static void criarPastaArquivo(String pasta, String arquivo, String conteudo) throws EfdException {

        File folder = new File(pasta);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(new File(pasta + "/" + arquivo));
            fileWriter.write(conteudo);
            fileWriter.close();
        } catch (Exception e) {
            throw new EfdException("Erro ao Criar Arquivo " + e.getMessage());
        }
    }

    public static String getCodVersao(EfdIcms efdIcms) {
        if (versao2022(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
            return "012";
        } else if (versao2021(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
            return "015";
        } else if (versao2020(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
            return "014";
        } else if (versao2019(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
            return "013";
        } else if (versao2018(efdIcms.getBloco0().getRegistro0000().getDt_ini())) {
            return "012";
        } else {
            return "ERRO_COD_VERSAO";
        }
    }
}