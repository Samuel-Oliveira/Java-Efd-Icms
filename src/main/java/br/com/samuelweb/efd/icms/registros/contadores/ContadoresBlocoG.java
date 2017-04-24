/**
 * 
 */
package br.com.samuelweb.efd.icms.registros.contadores;

import br.com.samuelweb.efd.icms.registros.blocoG.BlocoGEnum;

/**
 * @author Samuel Oliveira
 *
 */
public class ContadoresBlocoG {
	
	//Bloco G
	private int contRegistroG001 = 0;
	private int contRegistroG110 = 0;
	private int contRegistroG125 = 0;
	private int contRegistroG126 = 0;
	private int contRegistroG130 = 0;
	private int contRegistroG140 = 0;
	private int contRegistroG990 = 0;
	
	public void incrementar(BlocoGEnum bloco){
		
		contRegistroG990++;
		
		switch (bloco) {
			case RegistroG001:
				contRegistroG001++;
				break;
			case RegistroG110:
				contRegistroG110++;
				break;
			case RegistroG125:
				contRegistroG125++;
				break;
			case RegistroG126:
				contRegistroG126++;
				break;
			case RegistroG130:
				contRegistroG130++;
				break;
			case RegistroG140:
				contRegistroG140++;
				break;
		default:
			break;
		}
	}

	/**
	 * @return the contRegistroG001
	 */
	public int getContRegistroG001() {
		return contRegistroG001;
	}

	/**
	 * @return the contRegistroG110
	 */
	public int getContRegistroG110() {
		return contRegistroG110;
	}

	/**
	 * @return the contRegistroG125
	 */
	public int getContRegistroG125() {
		return contRegistroG125;
	}

	/**
	 * @return the contRegistroG126
	 */
	public int getContRegistroG126() {
		return contRegistroG126;
	}

	/**
	 * @return the contRegistroG130
	 */
	public int getContRegistroG130() {
		return contRegistroG130;
	}

	/**
	 * @return the contRegistroG140
	 */
	public int getContRegistroG140() {
		return contRegistroG140;
	}

	/**
	 * @return the contRegistroG990
	 */
	public int getContRegistroG990() {
		return contRegistroG990;
	}
	
}
