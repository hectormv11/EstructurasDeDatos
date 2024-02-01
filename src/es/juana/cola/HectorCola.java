package es.juana.cola;

public class HectorCola<T> implements Cola<T>{

	private Object[] cola;
	private int head;
	int numeros = 0;

	public HectorCola() {

		cola = new Object[0];
		head = 0;

	}

	@Override
	public void enqueue(T elemento) {

		Object[] nuevaCola = new Object[cola.length +1];		
		for (int i = 0; i < cola.length; i++) {
			nuevaCola[i] = cola[i];
		}
		nuevaCola[nuevaCola.length-1] = elemento;
		cola = nuevaCola;
		numeros++;

	}

	@SuppressWarnings("unchecked")
	@Override
	public T dequeue() {
		T valor = (T) "No se ha podido encontrar objetos";
		
		if(numeros > 0) {

			if(cola[head] != null) {
				valor = (T) cola[head];
				cola[head] = null;
			}

			Object[] nuevaCola = new Object[cola.length -1];		
			for (int i = 0; i < nuevaCola.length; i++) {
				nuevaCola[i] = cola[i+1];
			}

			cola = nuevaCola;
			numeros--;
		}
		return valor;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T head() {
		
		T valor = (T) "No hay";
		
		if(!isEmpty()) {
			valor = (T) cola[head];
		}
		return valor;
	}

	@Override
	public boolean isEmpty() {

		if(numeros != 0) {
			return false;
		}
		return true;
	}

	@Override
	public int size() {

		return cola.length;
		
	}

	@Override
	public void clear() {

		
		
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

	@Override
	public void bubbleSort() {
		// TODO Auto-generated method stub

	}

	public String toString() {

		StringBuffer str = new StringBuffer();

		str.append("[");

		for (int i = 0; i < cola.length; i++) {
			if(cola[i] != null) {
				str.append(cola[i]);

				if(i != cola.length -1) {

					str.append(",");

				}
			}
		}

		str.append("]");
		return str.toString();
	}

}
