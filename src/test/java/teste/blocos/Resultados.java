/**
 * 
 */
package teste.blocos;

/**
 * @author Samuel Oliveira
 *
 */
public class Resultados {
	
	public static String resultadoBlocos(){
		String resultado;
		resultado = resultadoBloco0();
		resultado = resultado.concat(resultadoBlocoC());
		resultado = resultado.concat(resultadoBlocoD());
		resultado = resultado.concat(resultadoBlocoE());
		return resultado;
	}
	
	private static String resultadoBloco0(){
		String resultado;
		resultado = "|0000|2|3|4|5|6|7||9|10|11|||14|15|".concat("\n");
		resultado = resultado.concat("|0001|0|").concat("\n");
		resultado = resultado.concat("|0005|2|3|4|5|6|7|8||10|").concat("\n");
		resultado = resultado.concat("|0015|2||").concat("\n");
		resultado = resultado.concat("|0015||3|").concat("\n");
		resultado = resultado.concat("|0100|2|3|4||6|7|8||10|11|12|13|14|").concat("\n");
		resultado = resultado.concat("|0150|2|3|4||6||8||10|11||13|").concat("\n");
		resultado = resultado.concat("|0175|2|3|4|").concat("\n");
		resultado = resultado.concat("|0150|2|3|4|5||7|8||10|11||13|").concat("\n");
		resultado = resultado.concat("|0175|2|3|4|").concat("\n");
		resultado = resultado.concat("|0175|2|3|4|").concat("\n");
		resultado = resultado.concat("|0190|2|3|").concat("\n");
		resultado = resultado.concat("|0200|2|3|||6|7|8||||12|13|").concat("\n");
		resultado = resultado.concat("|0205|2|3|4|5|").concat("\n");
		resultado = resultado.concat("|0206|2|").concat("\n");
		resultado = resultado.concat("|0210|2|3|4|").concat("\n");
		resultado = resultado.concat("|0220|2|3|").concat("\n");
		resultado = resultado.concat("|0300|2|3|4|5|6|7|").concat("\n");
		resultado = resultado.concat("|0305|2|3|4|").concat("\n");
		resultado = resultado.concat("|0400|2|3|").concat("\n");
		resultado = resultado.concat("|0400|2|3|").concat("\n");
		resultado = resultado.concat("|0450|2|Relacao ECF(S):|").concat("\n");
		resultado = resultado.concat("|0990|23|").concat("\n");
//		resultado = resultado.concat("").concat("\n");
		return resultado;
	}
	
	private static String resultadoBlocoC(){
		String resultado;
		resultado = "|C001|0|".concat("\n");
		resultado = resultado.concat("|C100|2|3||5|6||8|9|||||14|15|16||18|19|||22||24|||||29|").concat("\n");
		resultado = resultado.concat("|C101|2|3|4|").concat("\n");
		resultado = resultado.concat("|C110|2|3|").concat("\n");
		resultado = resultado.concat("|C111|2|3|").concat("\n");
		resultado = resultado.concat("|C990|6|").concat("\n");
		return resultado;
	}
	
	private static String resultadoBlocoD(){
		String resultado;
		
		resultado = "|D001|0|".concat("\n");
		resultado = resultado.concat("|D990|2|").concat("\n");
		
		return resultado;
	}
	
	private static String resultadoBlocoE(){
		String resultado;
		
		resultado = "|E001|0|".concat("\n");
		
		return resultado;
	}

}

