package es.juana.lista;

public class LinkedListHector<T> implements LinkedList<T> {

	Nodo<T> inicial;

	@Override
	public void add(T elemento) {

		Nodo<T> nuevoNodo = new Nodo<T>(elemento);
		if (inicial == null) {
			inicial = nuevoNodo;
		} else {
			Nodo<T> actual = inicial;
			while (actual.siguiente != null) {
				actual = actual.siguiente;
			}
			actual.siguiente = nuevoNodo;
		}

	}

	@Override
	public void add(T elemento, int index) {



	}

	@Override
	public T remove(int index) {


		return null;
	}

	@Override
	public void remove(T elemento) {



	}

	@Override
	public boolean isEmpty() {


		return false;
	}

	@Override
	public int size() {


		return 0;
	}

	@Override
	public void clear() {



	}

	@Override
	public boolean contains(Object elemento) {


		return false;
	}

	@Override
	public Object[] toArray() {


		return null;
	}

}
