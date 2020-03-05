package sumador;

/**
 * @author Jaime Sansano García
 * @version 1.0
 * Clase con métodos para la práctica de Diseño Ágil TDD
 */
public class ASumar {
	private String total;

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
	 * @param cadena2
	 * @return
	 */
	public String sumarVariosDigitos(String cadena2) {
		return null;
	}

}
