/**
 * 
 */
package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Jaime Sansano Garc�a
 * @version 1.0
 * Clase con pruebas para la pr�ctica de Dise�o �gil TDD
 */
public class TestASumar {

	/**
	 * M�todo de prueba para un solo d�gito
	 * Compara el resultado del m�todo mostrarUnDigito() con un String pre-establecido
	 */
	@Test
    public void testUnDigito() {
        ASumar sum = new ASumar("4");
        String resultado = sum.mostrarUnDigito("4");
        assertEquals("4 = 4", resultado);
    }
	
	/**
	 * M�todo de prueba para varios d�gitos
	 * Compara el valor de la suma de los d�gitos con un valor pre-establecido
	 */
	@Test
    public void testVariosDigitos() {
		ASumar sum2 = new ASumar();
		int resultado2 = sum2.sumarVariosDigitos("123");
        assertEquals(6, resultado2);
	}

}
