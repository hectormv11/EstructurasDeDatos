package es.juana.dbll;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DoubleLinkedListTests {

	DoubleLinkedListHector<Integer> listaDoble = new DoubleLinkedListHector<Integer>();	

	@BeforeEach
	public void add() {

		listaDoble.add(1);
		listaDoble.add(2);
		listaDoble.add(3);
		listaDoble.add(4);

	}


	@Test
	void testAdd() {

		String sDlista = listaDoble.toString();
		System.out.println(sDlista);
		assertEquals("[1,2,3,4]", sDlista);
		
	}
	
	@Test
	void testGet() {

		int i = listaDoble.get(1);
		String sDlista = listaDoble.toString();
		assertEquals("[1,2,3,4]", sDlista);
		System.out.println(i);
		
	}

	@Test
	void testAddT() {

		listaDoble.add(22,1);
		String sDlista = listaDoble.toString();
		System.out.println(sDlista);
		assertEquals("[1,22,2,3,4]", sDlista);
		
	}

}
