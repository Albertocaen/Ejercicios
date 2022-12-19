package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        /*
        9. Realizar un programa que declare un array y lo vaya llenando de números introducidos
por teclado hasta que introduzcamos un número negativo. --> con un ArrayList porque no sabemos de antemano cuántos elementos va a tener el array
Entonces debe imprimir los
elementos que contiene (el número negativo sólo sirve para finalizar el programa, no
entra en el array).
         */
        //int[] array = new int[?]; --> como no sabemos cuántos, utilizamos arraylist, que es como un chicle
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int numero = 0;

        do {
            System.out.println("Introduce número (negativo para terminar): ");
            numero = sc.nextInt();
            // si es negativo, no entra
            if (numero > 0) {
                // si es positivo, lo metemos en el arraylist
                arrayList.add(numero); // si fuera un array sería array[i] = numero;
            }
        } while (numero >= 0); // mientras no sea negativo, seguimos
        // cuando terminamos, imprimimos
        System.out.println(arrayList);
        System.out.println("Ordenado: ");
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
