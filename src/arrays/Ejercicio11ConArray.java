package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11ConArray {
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
        int[] enteros = new int[10];
        // lo rellenamos de números aleatoriamente entre 1 y 20
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = (int) (Math.random() * 20 + 1);
        }
        // lo ordenamos
        Arrays.sort(enteros);
        // lo imprimimos
        System.out.println(Arrays.toString(enteros));

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

        // lo buscamos en el array
        boolean encontrado = false; // si recorremos todo el array y no cambia este valor, es que no está
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] == numero) {
                //Se debe mostrar la posición en que se encuentra.
                System.out.println("El número " + numero + " está en la posición " + (i + 1) + " (índice " + i + ").");
                // cambiamos el flag a true para que no nos imprima luego que no lo hemos encontrado
                encontrado = true;
                break;
            }
        }
        // si salimos del for y econtrado sigue como false, es que el número no está en el array
        if (encontrado == false) {
            System.out.println("El número no está en el array.");
        }


        //Si no está, indicarlo con un mensaje.

    }
}
