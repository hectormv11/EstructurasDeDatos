package es.juana.lista;

public class LinkedListHector<T> implements LinkedList<T> {

	Nodo<T> inicial = null;

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

		int vueltas = 0;

		Nodo<T> nuevoNodo = new Nodo<T>(elemento);
		if (inicial == null) {
			inicial = nuevoNodo;
		} else {
			Nodo<T> actual = inicial;
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
				nuevoNodo.siguiente = inicial.siguiente;
				inicial = nuevoNodo;
			}
		}
	}

	@Override
	public T remove(int index) {

		int vueltas = 0;

		T devolver = null;

		Nodo<T> actual = inicial;
		if(index !=  1) {
			while (vueltas != size()) {
				if(vueltas == index -2) {
					devolver = actual.siguiente.getValor();
					actual.siguiente = actual.siguiente.siguiente;
					break;
				}
				actual = actual.siguiente;
				vueltas++;
			}
		}
		else {
			devolver = actual.getValor();
			inicial = actual.siguiente;
		}
		return devolver;
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

		int tamaño = 1;
		
		if(inicial == null) {
			tamaño = 0;
		}
		

		Nodo<T> actual = inicial;
		while (actual.siguiente != null) {
			actual = actual.siguiente;
			tamaño++;
		}


		return tamaño;
	}

	@Override
	public void clear() {

		inicial = null;

	}

	@Override
	public boolean contains(Object elemento) {


		return false;
	}

	@Override
	public Object[] toArray() {
		
		Object[] array = new Object[size()];
		
		int vuelta = 0;

		Nodo<T> actual = inicial;
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

		Nodo<T> actual = inicial;
		while (actual.siguiente != null) {

			str.append(actual.getValor());
			str.append(",");
			actual = actual.siguiente;

		}
		str.append(actual.getValor());

		str.append("]");
		return str.toString();
	}


}
