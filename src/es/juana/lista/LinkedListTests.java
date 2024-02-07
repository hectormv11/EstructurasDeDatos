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
		System.out.println(lista.remove(1));
		String slista = lista.toString();
		assertEquals("[1,4]", slista);
 	}

}
