package es.juana.pila;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

//objetivo 100% de cobertura de codigo

public class MiPilaTests {
	
	HectorPila<Integer> pila = new HectorPila<Integer>();
	
	@Test
	void testInsertar() {
		pila.push(5);
		assertEquals("[5]", pila.toString());
		pila.push(2);
		assertEquals("[5,2]", pila.toString());
		pila.push(0);
		assertEquals("[5,2,0]", pila.toString());
		pila.push(6);
		assertEquals("[5,2,0,6]", pila.toString());
		pila.push(7);
		assertEquals("[5,2,0,6,7]", pila.toString());
		pila.push(3);
		assertEquals("[5,2,0,6,7,3]", pila.toString());
		
		
		int valor = pila.pop();
		System.out.println(valor);
		assertEquals("[5,2,0,6,7]", pila.toString());
		
		
		int valor1 = pila.top();
		System.out.println(valor1);
		
		
		System.out.println(pila.size());
		
		
		pila.clear();
		System.out.println(pila.size());
		assertEquals("[]", pila.toString());
		
		pila.push(7);
		pila.push(5);
		pila.push(2);
		System.out.println(pila.contains(5));
		System.out.println(pila.toString());
		
		Object[] array = pila.toArray();
		
		System.out.print("[");
		for (int j = 0; j < array.length; j++) {
			
			System.out.print(array[j]); 
			
			if(j != array.length -1) {

				System.out.print(",");

			}
		}
		System.out.print("]");
	}
}
