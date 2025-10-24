package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicios ejercicios = new Ejercicios();

        int opcion;
        do {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("1. Invertir texto (Pila)");
            System.out.println("2. Simular cola de clientes");
            System.out.println("3. Verificar palíndromo (Pila y Cola)");
            System.out.println("4. Convertir decimal a binario (Pila)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    ejercicios.invertirTexto();
                    break;
                case 2:
                    ejercicios.simularColaClientes();
                    break;
                case 3:
                    ejercicios.verificarPalindromo();
                    break;
                case 4:
                    ejercicios.convertirDecimalABinario();
                    break;
                case 5:
                    System.out.println("Has salido del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();

        } while (opcion != 5);
    }
}
