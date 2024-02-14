package es.juana.dbll;

public class Nodo<T>{

	private T valor;
	protected Nodo<T> siguiente;
	protected Nodo<T> anterior;
	
	public Nodo(T valor) {
		this.anterior = null;
		this.siguiente = null;
		this.valor = valor;
	}
	
	public T getValor() {
		return valor;
	}
	
	public void setValor(T valor) {
		this.valor = valor;
	}
	
}
