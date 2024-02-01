package es.juana.cola;

public interface Cola<T> {
	
    // Método para insertar un elemento en la cola
    void enqueue(T elemento);

    // Método que elimna y devuelve el primer elemento de la cola
    T dequeue();

    // Método para obtener el primer elemento de la cola sin quitarlo
    T head();

    // Método para verificar si la cola está vacía
    boolean isEmpty();

    // Método para obtener el tamaño de la cola
    int size();

    // Método para vaciar la cola
    void clear();

    // Método para comprobar si un elemento está presente en la cola
    boolean contains(T elemento);

    // Método para obtener una representación en cadena de la cola
    String toString();

    // Método para obtener un array con los elementos de la cola
    Object[] toArray();
    
    //Método que ordena utilizando el método de la burbuja
    void bubbleSort();
    /*ordenar de mayor a menor*/

}
