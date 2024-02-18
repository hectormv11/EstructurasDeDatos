package es.juana.dbll;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
		assertEquals("[1,22,2,3,4]", sDlista);

	}

	@Test
	void testRemove() {

		System.out.println(listaDoble.remove(3));
		String sDlista = listaDoble.toString();
		assertEquals("[1,2,3]", sDlista);

	}
	
	@Test
	void testRemoveT() {

		Integer i = 2;
		listaDoble.remove(i);
		String sDlista = listaDoble.toString();
		assertEquals("[1,3,4]", sDlista);

	}
	
	@Test
	void testContains() {

		assertTrue(listaDoble.contains(2));
		
	}
	
	@Test
	void testClearAndIsEmpty() {
		
		listaDoble.clear();
		assertTrue(listaDoble.isEmpty());
		
	}
	
	@Test
	void testToArray() {
		
		String str = arrayToString(listaDoble.toArray());
		assertEquals("[1,2,3,4]", str);
		
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
