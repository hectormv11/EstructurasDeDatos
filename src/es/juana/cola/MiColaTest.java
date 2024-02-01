package es.juana.cola;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class MiColaTest {
	
	HectorCola<Integer> cola = new HectorCola<Integer>();
	
	@Test
	void test() {
		
		cola.enqueue(1);
		cola.enqueue(7);
		cola.enqueue(5);
		cola.dequeue();
		System.out.println(cola.toString());
		System.out.println("Tamaño = " + cola.size());
		System.out.println("Esta vacia = " + cola.isEmpty());
		assertEquals("[7,5]", cola.toString());
		System.out.println("El primer elemento es = " + cola.head());
		cola.dequeue();
		cola.dequeue();
		System.out.println(cola.toString());
		System.out.println("Esta vacia = " + cola.isEmpty());
		System.out.println("Tamaño = " + cola.size());
		System.out.println("El primer elemento es = " + cola.head());
 	}

}
