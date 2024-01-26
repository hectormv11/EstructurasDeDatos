package es.juana.pila;

public interface Pila<T> {
	
    // Método para insertar un elemento en la pila
    void push(T elemento);

    // Método para eliminar y devolver el elemento superior de la pila
    void pop();

    // Método para obtener el elemento superior de la pila sin quitarlo
    T top();

    // Método para verificar si la pila está vacía
    boolean isEmpty();

    // Método para obtener el tamaño de la pila
    int size();

    // Método para vaciar la pila
    void clear();

    // Método para comprobar si un elemento está presente en la pila
    boolean contains(T elemento);

    // Método para obtener una representación en cadena de la pila
    String toString();

    // Método para obtener un array con los elementos de la pila
    Object[] toArray();
    
    //Método que asegura que en el array hay sitio suficiente
    void asegurarCapacidad();

}
