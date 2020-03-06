package sumador;

/**
 * @author Jaime Sansano Garc�a
 * @version 1.0
 * Clase con m�todos para la pr�ctica de Dise�o �gil TDD
 */
public class ASumar {
	private String total;
	private int sumaTotal = 0;

	/**
	 * Constructor de la clase con un par�metro de entrada
	 * @param total da valor al atributo total
	 */
	public ASumar(String total) {
		this.total = total;
	}

	/**
	 * Constructor sin par�metros
	 */
	public ASumar() {
		
	}

	/**
	 * Plantea igualdad entre el par�metro y el atributo total
	 * @param cadena
	 * @return la igualdad como String 
	 */
	public String mostrarUnDigito(String cadena) {
		return cadena + " = " + total;
	}

	/**
	 * Devuelve como String el sumatorio y el total de los valores n�mericos de un String
	 * @param cadena2
	 * @return factor sumatorio y total de los valores num�ricos del String
	 */
	public String sumarVariosDigitos(String cadena2) {
		String factor = "";
		for(int i=0; i<cadena2.length(); i++) {
			sumaTotal += Character.getNumericValue(cadena2.charAt(i));
			
			if(i != cadena2.length()-1) {
				factor += cadena2.substring(i, i+1) + " " + "+ ";
			}else {
				factor += cadena2.substring(i, i+1) + " " + "= ";
			}
		}
		factor += sumaTotal;
		return factor;
	}

}
