package org.example.estructuras;

public class Cola {
    private Nodo frente, fin;

    public boolean isEmpty() {
        return frente == null;
    }

    public void enqueue(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (isEmpty()) {
            frente = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public Object dequeue() {
        if (isEmpty()) return null;
        Object dato = frente.dato;
        frente = frente.siguiente;
        if (frente == null) fin = null;
        return dato;
    }

    public void mostrar() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }
        Nodo actual = frente;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
