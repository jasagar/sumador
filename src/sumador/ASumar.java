package sumador;

/**
 * @author Jaime Sansano García
 * @version 1.0
 * Clase con métodos para la práctica de Diseño Ágil TDD
 */
public class ASumar {
	private String total;
	private static int sumaTotal = 0;

	/**
	 * Constructor de la clase con un parámetro de entrada
	 * @param total da valor al atributo total
	 */
	public ASumar(String total) {
		this.total = total;
	}

	/**
	 * Constructor sin parámetros
	 */
	public ASumar() {
		
	}

	/**
	 * Plantea igualdad entre el parámetro y el atributo total
	 * @param cadena
	 * @return la igualdad como String 
	 */
	public String mostrarUnDigito(String cadena) {
		return cadena + " = " + total;
	}

	/**
	 * Devuelve como String el sumatorio y el total de los valores númericos de un String
	 * o una cadena vacía si el valor del parámetro es negativo
	 * @param cadena2
	 * @return factor sumatorio y total de los valores numéricos del String o cadena vacía
	 */
	public static String sumarVariosDigitos(String cadena2) {
		String factor = "";
		if(0 > Integer.parseInt(cadena2)) {
			return factor;
		}
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

	/**
	 * Devuelve String vacío si el parámetro tiene valor negativo
	 * @param cadena3
	 * @return vacio
	 */
	public String valorNegativo(int cadena3) {
		String result = " ";
		if(cadena3 < 0) {
			return result ="";
		}
		return result;
	}

}
