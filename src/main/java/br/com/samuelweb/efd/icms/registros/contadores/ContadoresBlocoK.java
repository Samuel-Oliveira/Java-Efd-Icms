/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.contadores;

import br.com.samuelweb.efd.icms.registros.blocoK.BlocoKEnum;

/**
 * @author Samuel Oliveira
 *
 */
public class ContadoresBlocoK {
	
	//Bloco K
	private int contRegistroK001 = 0;
	private int contRegistroK100 = 0;
	private int contRegistroK200 = 0;
	private int contRegistroK210 = 0;
	private int contRegistroK215 = 0;
	private int contRegistroK220 = 0;
	private int contRegistroK230 = 0;
	private int contRegistroK235 = 0;
	private int contRegistroK250 = 0;
	private int contRegistroK255 = 0;
	private int contRegistroK260 = 0;
	private int contRegistroK265 = 0;
	private int contRegistroK270 = 0;
	private int contRegistroK275 = 0;
	private int contRegistroK280 = 0;
	private int contRegistroK990 = 0;
	
	public void incrementar(BlocoKEnum bloco){
		
		contRegistroK990++;
		
		switch (bloco) {
			case RegistroK001:
				contRegistroK001++;
				break;
			case RegistroK100:
				contRegistroK100++;
				break;
			case RegistroK200:
				contRegistroK200++;
				break;
			case RegistroK210:
				contRegistroK210++;
				break;
			case RegistroK215:
				contRegistroK215++;
				break;
			case RegistroK220:
				contRegistroK220++;
				break;
			case RegistroK230:
				contRegistroK230++;
				break;
			case RegistroK235:
				contRegistroK235++;
				break;
			case RegistroK250:
				contRegistroK250++;
				break;
			case RegistroK255:
				contRegistroK255++;
				break;
			case RegistroK260:
				contRegistroK260++;
				break;
			case RegistroK265:
				contRegistroK265++;
				break;
			case RegistroK270:
				contRegistroK270++;
				break;
			case RegistroK275:
				contRegistroK275++;
				break;
			case RegistroK280:
				contRegistroK280++;
				break;
		default:
			break;
		}
	}

	/**
	 * @return the contRegistroK001
	 */
	public int getContRegistroK001() {
		return contRegistroK001;
	}

	/**
	 * @return the contRegistroK100
	 */
	public int getContRegistroK100() {
		return contRegistroK100;
	}

	/**
	 * @return the contRegistroK200
	 */
	public int getContRegistroK200() {
		return contRegistroK200;
	}

	/**
	 * @return the contRegistroK210
	 */
	public int getContRegistroK210() {
		return contRegistroK210;
	}

	/**
	 * @return the contRegistroK215
	 */
	public int getContRegistroK215() {
		return contRegistroK215;
	}

	/**
	 * @return the contRegistroK220
	 */
	public int getContRegistroK220() {
		return contRegistroK220;
	}

	/**
	 * @return the contRegistroK230
	 */
	public int getContRegistroK230() {
		return contRegistroK230;
	}

	/**
	 * @return the contRegistroK235
	 */
	public int getContRegistroK235() {
		return contRegistroK235;
	}

	/**
	 * @return the contRegistroK250
	 */
	public int getContRegistroK250() {
		return contRegistroK250;
	}

	/**
	 * @return the contRegistroK255
	 */
	public int getContRegistroK255() {
		return contRegistroK255;
	}

	/**
	 * @return the contRegistroK260
	 */
	public int getContRegistroK260() {
		return contRegistroK260;
	}

	/**
	 * @return the contRegistroK265
	 */
	public int getContRegistroK265() {
		return contRegistroK265;
	}

	/**
	 * @return the contRegistroK270
	 */
	public int getContRegistroK270() {
		return contRegistroK270;
	}

	/**
	 * @return the contRegistroK275
	 */
	public int getContRegistroK275() {
		return contRegistroK275;
	}

	/**
	 * @return the contRegistroK280
	 */
	public int getContRegistroK280() {
		return contRegistroK280;
	}

	/**
	 * @return the contRegistroK990
	 */
	public int getContRegistroK990() {
		return contRegistroK990;
	}
	
}
