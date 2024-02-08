package es.juana.lista;

public interface LinkedList<T> {
	
    // Método para insertar un elemento en la lista
    void add(T elemento);
    
    // Método para insertar un elemento en la lista en una posición determinada (la primera es la 0)
    void add(T elemento, int index);

    // Método que elimna y devuelve el elemento que ocupe una posición determinada
    T remove(int index);

    // Método que busca y elimina un elemento concreto
    void removeElemento(T elemento);

    // Método para verificar si la lista está vacía
    boolean isEmpty();

    // Método para obtener el tamaño de la lista
    int size();

    // Método para vaciar la lista
    void clear();

    // Método para comprobar si un elemento está presente en la lista
    boolean contains(T elemento);

    // Método para obtener una representación en cadena de la lista
    String toString();

    // Método para obtener un array con los elementos de la lista
    Object[] toArray();
    

}
