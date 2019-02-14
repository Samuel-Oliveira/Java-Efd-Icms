package br.com.swconsultoria.efd.icms.util;

import br.com.swconsultoria.efd.icms.exception.EfdException;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Collection;

public final class Util {

    private final static LocalDate dataVersao2018 = LocalDate.of(2018, 01, 31);
    private final static LocalDate dataVersao2019 = LocalDate.of(2019, 01, 31);

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
			return ((Collection<?>) obj).size() == 0;

		final String s = String.valueOf(obj).trim();

		return s.length() == 0 || s.equalsIgnoreCase("null");
	}
    
    /**
	 * Preenche o Registro
	 * 
	 * @param String
	 */
    public static String preencheRegistro(String string) {
    	return Util.isEmpty(string)? "" : string;
	}

    public static boolean versao2018() {
        return LocalDate.now().isAfter(dataVersao2018);
    }

    public static boolean versao2019() {
        return LocalDate.now().isAfter(dataVersao2019);
    }

    /**
     * Cria um arquivo com os dados passados 
     * @throws Exception 
     */
    public static void criarPastaArquivo(String pasta, String arquivo , String conteudo ) throws EfdException {
    	
    	File folder = new File(pasta);
    	if(!folder.exists()){
    		folder.mkdirs();
    	}
    	
    	FileWriter fileWriter;
    	try {
    		fileWriter = new FileWriter(new File(pasta+"/"+arquivo));
    		fileWriter.write(conteudo);
    		fileWriter.close();
    	} catch (Exception e) {
    		throw new EfdException("Erro ao Criar Arquivo "+e.getMessage());    		
    	}
    }


}