package sumador;

/**
 * @author Jaime Sansano García
 * @version 1.0
 * Clase con métodos para la práctica de Diseño Ágil TDD
 */
public class ASumar {
	private String total;
	private int sumaTotal = 0;

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
	 * Extrae los valores númericos de un String y devuelve la suma de éstos
	 * @param cadena2
	 * @return suma de los valores numéricos de los caracteres
	 */
	public int sumarVariosDigitos(String cadena2) {
		for(int i=0; i<cadena2.length(); i++) {
			sumaTotal += Character.getNumericValue(cadena2.charAt(i));
		}
		return sumaTotal;
	}

}
