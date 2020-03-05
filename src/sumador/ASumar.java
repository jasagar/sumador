package sumador;

/**
 * @author Jaime Sansano Garc�a
 * @version 1.0
 * Clase con m�todos para la pr�ctica de Dise�o �gil TDD
 */
public class ASumar {
	private String total;

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
	 * @param cadena2
	 * @return
	 */
	public String sumarVariosDigitos(String cadena2) {
		return null;
	}

}
