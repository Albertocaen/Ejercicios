package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14conArrayList {
    public static void main(String[] args) {
        /*
        14. Diseñar una aplicación que declare un array de 10 elementos enteros. Leer mediante el teclado 8 números. Después se debe pedir un número y una posición, insertarlo en la
posición indicada, desplazando los que estén detrás.
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> enteros = new ArrayList<>();

        // lo rellenamos con Math.random() en vez de leer por teclado
        for (int i = 0; i < 10; i++) {
            int numAleatorio = (int) (Math.random() * 10 + 1);
            enteros.add(numAleatorio);
        }

        System.out.println(enteros);

        // pedimos un número y una posición
        System.out.print("Número a insertar: ");
        int n = sc.nextInt(); sc.nextLine();

        // controlamos que la posición que nos dan esté dentro del array
        int pos = 0;
        do {
            System.out.println("En qué posición lo quieres insertar: ");
            pos = sc.nextInt() -1;
        } while (pos > enteros.size());

        // insertamos el número en la posición que nos dicen
        enteros.add(pos, n);
        // quitamos el último elemento para que se mantenga con 10 elementos
        enteros.remove(enteros.size() - 1);

        System.out.println(enteros);
    }
}
