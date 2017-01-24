/**
 * 
 */
package teste.blocos;

/**
 * @author Samuel Oliveira
 *
 */
public class Resultados {
	
	public static String resultadoBloco0(){
		String resultado;
		resultado = "|0000|2|3|4|5|6|7||9|10|11|||14|15|".concat("\n");
		resultado = resultado.concat("|0001|0|").concat("\n");
		resultado = resultado.concat("|0005|2|3|4|5|6|7|8||10|").concat("\n");
		resultado = resultado.concat("|0100|2|3|4||6|7|8||10|11|12|13|14|").concat("\n");
		resultado = resultado.concat("|0150|2|3|4||6||8||10|11||13|").concat("\n");
		resultado = resultado.concat("|0175|2|3|4|").concat("\n");
		resultado = resultado.concat("|0150|2|3|4|5||7|8||10|11||13|").concat("\n");
		resultado = resultado.concat("|0175|2|3|4|").concat("\n");
		resultado = resultado.concat("|0175|2|3|4|").concat("\n");
		resultado = resultado.concat("|0190|2|3|").concat("\n");
		resultado = resultado.concat("|0200|2|3|||6|7|8||||12|13|").concat("\n");
		resultado = resultado.concat("|0206|2|").concat("\n");
		resultado = resultado.concat("|0450|2|Relacao ECF(S):|").concat("\n");
		resultado = resultado.concat("|0990|2|").concat("\n");
//		resultado = resultado.concat("").concat("\n");
		return resultado;
	}

}

