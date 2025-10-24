package org.example;

import org.example.estructuras.Pila;
import org.example.estructuras.Cola;
import java.util.Scanner;

public class Ejercicios {

    private Scanner sc = new Scanner(System.in);

    // 1. Invertir texto con una Pila
    public void invertirTexto() {
        Pila pila = new Pila();

        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();

        // Apilamos cada carácter del texto
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            pila.push(c);
        }

        // Desapilamos para construir el texto invertido
        String invertido = "";
        while (!pila.isEmpty()) {
            invertido += pila.pop();
        }

        System.out.println("Texto invertido: " + invertido);
    }

    // 2. Simular una cola de clientes
    public void simularColaClientes() {
        Cola cola = new Cola();
        int opcion;

        do {
            System.out.println("\n=== GESTIÓN DE COLA DE CLIENTES ===");
            System.out.println("1. Llegada de cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine();
                    cola.enqueue(nombre);
                    System.out.println("Cliente agregado a la cola.");
                    break;
                case 2:
                    Object atendido = cola.dequeue();
                    if (atendido == null) {
                        System.out.println("No hay clientes en la cola.");
                    } else {
                        System.out.println("Atendiendo a: " + atendido);
                    }
                    break;
                case 3:
                    cola.mostrar();
                    break;
                case 4:
                    System.out.println("Saliendo de la simulación de cola...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);
    }

    // 3. Verificar si una palabra o frase es palíndroma
    public void verificarPalindromo() {
        Pila pila = new Pila();
        Cola cola = new Cola();

        System.out.print("Introduce una palabra o frase: ");
        String texto = sc.nextLine();

        texto = texto.toLowerCase().replaceAll(" ", "");

        // Insertamos cada carácter en la pila y en la cola
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            pila.push(c);
            cola.enqueue(c);
        }

        // Comparamos los carácteres
        boolean esPalindromo = true;
        while (!pila.isEmpty() && !cola.isEmpty()) {
            char desdePila = (char) pila.pop();
            char desdeCola = (char) cola.dequeue();

            if (desdePila != desdeCola) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("Es palíndroma.");
        } else {
            System.out.println("No es palíndroma.");
        }
    }

    // 4. Convertir un número decimal a binario usando una Pila
    public void convertirDecimalABinario() {
        Pila pila = new Pila();

        System.out.print("Introduce un número entero positivo: ");
        int numero = sc.nextInt();
        sc.nextLine();

        if (numero < 0) {
            System.out.println("Por favor, introduce un número positivo.");
            return;
        }

        // Guardamos los restos de la división entre 2 en la pila
        if (numero == 0) {
            pila.push(0);
        } else {
            while (numero > 0) {
                int resto = numero % 2;
                pila.push(resto);
                numero = numero / 2;
            }
        }

        // Desapilamos para formar el número binario
        String binario = "";
        while (!pila.isEmpty()) {
            binario += pila.pop();
        }

        System.out.println("Número binario: " + binario);
    }
}
