/**
 * 
 */
package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Jaime Sansano García
 * @version 1.0
 * Clase con pruebas para la práctica de Diseño Ágil TDD
 */
public class TestASumar {

	/**
	 * Método de prueba para un solo dígito
	 * Compara el resultado del método mostrarUnDigito() con un String pre-establecido
	 */
	@Test
    public void testUnDigito() {
        ASumar sum = new ASumar("4");
        String resultado = sum.mostrarUnDigito("4");
        assertEquals("4 = 4", resultado);
    }
	
	/**
	 * Método de prueba para suma con varios dígitos
	 * Compara sumatorio y suma total de los dígitos con un valor pre-establecido
	 */
	@Test
    public void testVariosDigitos() {
		ASumar sum2 = new ASumar();
		String resultado2 = sum2.sumarVariosDigitos("123");
        assertEquals("1 + 2 + 3 = 6", resultado2);
	}

}
