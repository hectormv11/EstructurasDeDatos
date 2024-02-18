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

		int vueltas = 1;

		Nodo<T> nuevoNodo = new Nodo<T>(elemento);
		if (head == null) {
			head = nuevoNodo;
			tail = nuevoNodo;
		} else {
			Nodo<T> actual = head;
			if(index !=  0) {
				while (vueltas != size()) {
					if(vueltas == index) {

						nuevoNodo.siguiente = actual.siguiente;
						actual.siguiente = nuevoNodo;

						break;

					}
					actual = actual.siguiente;
					vueltas++;
				}
			}else {

				nuevoNodo.siguiente = head;
				head = nuevoNodo;
				nuevoNodo.siguiente.anterior = nuevoNodo;

			}
		}
	}

	@Override
	public T get(int index) {

		int vueltas = 0;
		Nodo<T> actual = head;
		while (vueltas != size()) {
			if(vueltas == index) {

				return actual.getValor();

			}
			actual = actual.siguiente;
			vueltas++;
		}

		return null;
	}

	@Override
	public T remove(int index) {

		int vueltas = 0;
		T devolver = null;

		if (head == null) {

			return null;

		}
		Nodo<T> actual = head;
		if(index ==  0) {

			devolver = actual.getValor();
			head = actual.siguiente;

		}else if(index == size()-1){

			devolver = tail.getValor();
			actual = tail.anterior;
			actual.siguiente = null;
			tail = actual;


		}else {
			while (vueltas != size()) {
				if(vueltas == index-1) {

					devolver = actual.getValor();
					actual.siguiente = actual.siguiente.siguiente;
					actual.siguiente.siguiente.anterior = actual;

				}
				actual = actual.siguiente;
				vueltas++;
			}
		}
		return devolver;
	}

	@Override
	public void remove(T elemento) {
		
		int vueltas = 0;

		if (head.getValor() == elemento) {
			head = head.siguiente;
		}else if(tail.getValor() == elemento) {
			tail.anterior.siguiente = null;
			tail = tail.anterior;
		}else {
		
			Nodo<T> actual = head;

			while (vueltas != size()-1) {
				if(actual.siguiente.getValor() == elemento) {

					actual.siguiente = actual.siguiente.siguiente;
					actual.siguiente.anterior = actual;
					break;

				}
				actual = actual.siguiente;
				vueltas++;
			}
		}

	}

	@Override
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
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
		
		head = null;
		tail = null;

	}

	@Override
	public boolean contains(T elemento) {
		int vueltas = 0;
		Nodo<T> actual = head;
		while (vueltas != size()) {
			if(actual.getValor() == elemento) {

				return true;

			}
			actual = actual.siguiente;
			vueltas++;
		}

		return false;
	}

	@Override
	public Object[] toArray() {
		
		Object[] array = new Object[size()];

		int vuelta = 0;

		Nodo<T> actual = head;
		array[vuelta] = actual.getValor();
		while (actual.siguiente != null) {

			array[vuelta] = actual.getValor();
			actual = actual.siguiente;
			vuelta++;

		}
		array[vuelta] = actual.getValor();
		return array;
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
