package es.juana.cola;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MiColaTest {

	HectorCola<Integer> cola = new HectorCola<Integer>();
	
	//-------------------------------------//Tests//-------------------------------------//
	
	@BeforeEach
	public void antesDe() {
		
		cola.enqueue(1);
		cola.enqueue(7);
		cola.enqueue(5);
		
	}
	
	
	@Test
	void añadirTest() {

		cola.dequeue();
		assertEquals("[7,5]", cola.toString());
		
	}	
	
	@Test
	void borrarUnoTest() {

		cola.dequeue();
		cola.dequeue();
		assertEquals("[5]", cola.toString());
		
	}
	
	@Test
	void contieneTest() {
			
		assertTrue(cola.contains(7));
	}	
	
	@Test	
	void borrarTest() {	
		
		cola.clear();
		assertEquals("[]", cola.toString());
	}	
		
	@Test	
	void tamañoTest() {	
		
		assertEquals(3, cola.size());
	}
		
	@Test	
	void primerElementoTest() {	
		
		Object obj = 1;
		assertEquals(obj, cola.head());
	}
		
	@Test	
	void estaVaciaTest() {	
		
		cola.clear();
		assertTrue(cola.isEmpty());
	}	
		
	@Test	
	void toArrayTest() {
		
		Object[] aux = cola.toArray();
		String str = devolverArray(aux);
		
		assertEquals("[1,7,5]", str);
		
	}
	
	//-------------------------------------//Metodos//-------------------------------------//

	public String devolverArray(Object[] otra) {

		StringBuffer str = new StringBuffer();

		str.append("[");

		for (int i = 0; i < otra.length; i++) {
			if(otra[i] != null) {
				str.append(otra[i]);

				if(i != otra.length -1) {

					str.append(",");

				}
			}
		}
		str.append("]");
		return str.toString(); 
	}

}
