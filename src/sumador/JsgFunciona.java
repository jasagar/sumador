package sumador;

/**
 * @author Jaime Sansano Garc�a
 * @version 1.0
 * Clase con el main que llama al m�todo sumarVariosDigitos() de la clase ASumar
 */
public class JsgFunciona {
	static String arg = "";

	/**
	 * M�todo main que entrega valores como argumentos al m�todo sumarVariosDigitos()
	 * @param args array String con argumentos
	 */
	public static void main(String[] args) {
		System.out.print("RESULTADOS AL PASAR VALORES COMO ARGUMENTOS\n\n");
		
		for(int i=0; i<args.length; i++) {
			arg = args[i];
			if(0 > Integer.parseInt(arg)) {
				System.out.print(arg + " es un n�mero negativo no v�lido");
			}
			System.out.println(ASumar.sumarVariosDigitos(arg));
		}

	}

}
