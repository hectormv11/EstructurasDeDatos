package es.juana.lista;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

public class LinkedListTests {
	
	LinkedListHector<Integer> lista = new LinkedListHector<Integer>();
	
	@Test
	void testAdd() {
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		String slista = lista.toString();
		assertEquals("[1,2,3,4]", slista);
 	}
	
	@Test
	void testRemove() {
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		System.out.println(lista.remove(2));
		System.out.println(lista.remove(2));
		String slista = lista.toString();
		assertEquals("[1,4]", slista);
 	}
	
	@Test
	void testAdd2() {
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(9,3);
		System.out.println("Tamaño: " + lista.size());
		String slista = lista.toString();
		assertEquals("[1,2,9,3,4]", slista);
 	}
	
	/*@Test
	void testRemove2() {
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		String slista = lista.toString();
		assertEquals("[1,2,3,4]", slista);
 	}*/
	
	@Test
	void testToArray() {
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(22);
		String str = arrayToString(lista.toArray());
		assertEquals("[1,2,3,4,22]", str);
 	}
	
	//----------------------//Metodos//----------------------//
	
	public String arrayToString(Object[] otra) {
		
		StringBuffer str = new StringBuffer();
		
		str.append("[");
		for (int i = 0; i < otra.length; i++) {
			
			str.append(otra[i]);
			
			if(i != otra.length -1) {

				str.append(",");

			}
		}
		str.append("]");
		return str.toString(); 
		
	}

}
