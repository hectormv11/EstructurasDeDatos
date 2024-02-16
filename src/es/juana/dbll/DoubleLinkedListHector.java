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
				if(vueltas == index) {

					devolver = actual.getValor();
					actual.siguiente = actual.siguiente.siguiente;
					
				}
				actual = actual.siguiente;
				vueltas++;
			}
		}
		return devolver;
	}

	@Override
	public void remove(T elemento) {

		Nodo<T> nuevoNodo = new Nodo<T>(elemento);
		if (head == null) {
			
			System.out.println("Elemento no encontrado");
			
		} else {
			Nodo<T> actual = head;
			while (actual.siguiente != elemento) {
				actual = actual.siguiente;
			}
			actual.siguiente = nuevoNodo;
			nuevoNodo.anterior = actual;
			tail = nuevoNodo;
		}
		
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
