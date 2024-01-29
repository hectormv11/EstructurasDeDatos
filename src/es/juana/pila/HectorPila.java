package es.juana.pila;

public class HectorPila <T> implements Pila <T> {

	private Object[] pila;

	int numElementos = 0;
	int valor = 0;

	public HectorPila() {

		pila = new Object[1];

	}

	@Override
	public void push(T elemento) {

		for (int i = 0; i < pila.length; i++) {

			if(numElementos == pila.length) {
				Object[] aux = new Object[pila.length+1];
				for (int j = 0; j < pila.length; j++) {
					aux[j] = pila[j];
				}
				pila = aux;
			}
			if(pila[i] == null) {
				pila[i] = elemento;
				numElementos++;
			}
		}
	}

	@Override
	public T pop() {
		
		T valor = null;
		for (int i = 0 ; i < pila.length; i++) {

			if(i == pila.length-1) {
				valor = (T) pila[i];
				pila[i] = null;
				
				Object[] aux = new Object[pila.length-1];
				for (int j = 0; j < pila.length-1; j++) {
					aux[j] = pila[j];
				}
				pila = aux;
				
			}

		}

		return valor;

	}

	@Override
	public T top() {
		T valor = null;
		for (int i = 0 ; i < pila.length; i++) {
			if(i == pila.length-1) {
				valor = (T) pila[i];
			}
		}
		return valor;
	}

	@Override
	public boolean isEmpty() {

		for (int i = 0; i < pila.length; i++) {

			if(numElementos == 0) {
				return true;
			}

		}
		return false;

	}

	@Override
	public int size() {

		return numElementos;
	}

	@Override
	public void clear() {
		
		Object[] aux = new Object[1];
		for (int j = 0; j < aux.length; j++) {
			aux[j] = pila[j];
		}
		pila = aux;

		for (int i = 0; i < pila.length; i++) {

			if(pila[i] != null) {
				pila[i] = null;
				numElementos = 0;
			}

		}
		
	}

	@Override
	public boolean contains(T elemento) {

		for (int i = 0; i < pila.length; i++) {

			if(pila[i] != null && pila[i] == elemento) {
				return true;
			}

		}
		return false;
	}

	@Override
	public Object[] toArray() {
		
		Object[] array = new Object[pila.length];
		
		for (int j = 0; j < array.length; j++) {
			array[j] = pila[j];
		}
		
		return array;
	}

	public String toString() {

		StringBuffer str = new StringBuffer();

		str.append("[");

		for (int i = 0; i < pila.length; i++) {
			if(pila[i] != null) {
				str.append(pila[i]);

				if(i != pila.length -1) {

					str.append(",");

				}
			}
		}

		str.append("]");
		return str.toString();
	}

}
