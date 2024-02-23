package es.juana.daw;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

class ExcepcionesTest {

	@Test
	void testOutOfBounds() {
		
		int[] numeros = new int[5];
		assertThrows(IndexOutOfBoundsException.class, 
				()-> {
						System.out.println(numeros[6]);
				});
		
	}
	
	@Test
	void testnull() {
		
		assertThrows(NullPointerException.class, 
				()-> {
					Integer numeros = null;
					System.out.println(numeros.equals(3));
				});
		
	}
	
	@Test
	void testDivision() throws HectorException {
		
		assertEquals(2, Preba.division(10, 5));
		
	}

}
