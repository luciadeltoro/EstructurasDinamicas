package org.example.estructuras;

public class Pila {
    private Nodo cima;

    public boolean isEmpty() {
        return cima == null;
    }

    public void push(Object dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public Object pop() {
        if (isEmpty()) return null;
        Object dato = cima.dato;
        cima = cima.siguiente;
        return dato;
    }
}
