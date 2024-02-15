package es.juana.dbll;

public class DoubleLinkedListHector<T> implements DoubleLinkedList<T>{
	
	Nodo<T> head = null;
	Nodo<T> tail = null;

	@Override
	public void add(T elemento) {

		Nodo<T> nuevoNodo = new Nodo<T>(elemento);
		if (head == null) {
			head = nuevoNodo;
			tail = nuevoNodo;
		} else {
			Nodo<T> actual = head;
			while (actual.siguiente != null) {
				actual = actual.siguiente;
			}
			actual.siguiente = nuevoNodo;
			nuevoNodo.anterior = actual;
			tail = nuevoNodo;
		}
		
		/*if(head == null && tail == null) {
			head = nuevoNodo;
			tail = nuevoNodo;
		} else {
			tail.siguiente = nuevoNodo;
			nuevoNodo.anterior = tail;
			tail = nuevoNodo;
		}*/
		
	}

	@Override
	public void add(T elemento, int index) {

		int vueltas = 0;

		Nodo<T> nuevoNodo = new Nodo<T>(elemento);
		if (head == null) {
			head = nuevoNodo;
			tail = nuevoNodo;
		} else {
			Nodo<T> actual = head;
			if(index !=  1) {
				while (vueltas != size()) {
					if(vueltas == index -2) {

						nuevoNodo.siguiente = actual.siguiente;
						actual.siguiente = nuevoNodo;
						break;
					}
					actual = actual.siguiente;
					vueltas++;
				}
			}
			else {
				nuevoNodo.siguiente = head.siguiente;
				head = nuevoNodo;
			}
		}
		
	}
	
	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(T elemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		
		int tamaño = 1;

		if(head == null) {
			tamaño = 0;
		}

		Nodo<T> actual = head;
		while (actual.siguiente != null) {
			actual = actual.siguiente;
			tamaño++;
		}

		return tamaño;
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(T elemento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {


		StringBuffer str = new StringBuffer();

		str.append("[");
		if(head != null) {

			Nodo<T> actual = head;
			while (actual.siguiente != null) {

				str.append(actual.getValor());
				str.append(",");
				actual = actual.siguiente;

			}
			str.append(actual.getValor());
		}
		str.append("]");
		return str.toString();
	}

}
