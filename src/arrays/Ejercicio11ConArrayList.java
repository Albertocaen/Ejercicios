package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio11ConArrayList {
    public static void main(String[] args) {
        /*
        11. Generar un array de 10 enteros ordenados crecientemente.
        Pedir un número por teclado y buscarlo en el array.
        Se debe mostrar la posición en que se encuentra.
        Si no está, indicarlo con un mensaje.
         */
        Scanner sc = new Scanner(System.in);
        // generamos el array aleatoriamente con números entre 1 y 20 (por ejemplo)
        // declaramos el array de 10 enteros
        ArrayList<Integer> enteros = new ArrayList<>();
        // lo rellenamos de números aleatoriamente entre 1 y 20
        for (int i = 0; i < 10; i++) {
            int numero = (int) (Math.random() * 20 + 1); // genero el número
            enteros.add(numero);
        }
        // lo ordenamos
        Collections.sort(enteros);
        // lo imprimimos
        System.out.println(enteros);

        // ahora empieza el ejercicio
        //Pedir un número por teclado y buscarlo en el array.
        int numero = 0;
        do {
            System.out.println("Introduce un número entre 1 y 20: ");
            numero = sc.nextInt();
            if (numero < 1 || numero > 20) {
                System.out.println("Fuera de rango.");
            }
        } while (numero < 1 || numero > 20);

        if (enteros.contains(numero)) {
            System.out.println("El número está en la posición " + (enteros.indexOf(numero) + 1) + " (índice " + enteros.indexOf(numero) + ").");
        } else {
            //Si no está, indicarlo con un mensaje.
            System.out.println("El número no está en el ArrayList.");
        }



    }
}
