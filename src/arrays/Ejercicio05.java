package arrays;

import java.util.Arrays;

public class Ejercicio05 {
    public static void main(String[] args) {
//        5. Hacer un programa que inicialice una lista de números con valores aleatorios (10
//        valores), -> entre -5 y 5
//        y los muestre ordenados de menor a mayor.
        int[] lista = new int[10];
        // lo rellenamos aleatoriamente con números entre -5 y 5
        for (int i = 0; i < lista.length; i++) {
            //lista[i] =  (int) (Math.random() * (max - min + 1) + (min)); -> ojo: min es negativo: min = -6
            //lista[i] =  (int) (Math.random() * (5 - (-6) + 1) + (-6));
            lista[i] =  (int) (Math.random() * 12 - 6);
        }
        // aquí muestro el array sin ordenar
        System.out.println(Arrays.toString(lista));
        // lo ordeno
        Arrays.sort(lista);
        System.out.println(Arrays.toString(lista));
    }
}
