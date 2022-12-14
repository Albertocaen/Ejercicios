package arrays;

import java.util.Arrays;

public class Ejercicio06 {
    public static void main(String[] args) {
       /*
       6. Realizar un programa en el se inicialice un array de longitud 20
       con números aleatorios comprendidos entre -10 y 10.
       A continuación, mostrar la media de los números positivos,la media de los negativos y contar el número de ceros.
        */

//        6. Realizar un programa en el se inicialice un array de longitud 200
        int[] array = new int[200];
//        con números aleatorios comprendidos entre -10 y 10: max = 10 y min = -11
        for (int i = 0; i < array.length; i++) {
            // numeros[i] = (int) (Math.random() * (max - min + 1) + (min));
            //array[i] = (int) (Math.random() * (10 - (-11) + 1) + (-11));
            array[i] = (int) (Math.random() * 22 - 11);
        }
        System.out.println(Arrays.toString(array));
//        A continuación, mostrar la media de los números positivos,
//        la media de los negativos y
//        contar el número de ceros.

        // los denominadores de las medias:
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;

        // los numeradores de las medias son las sumas
        double sumaPositivos = 0;
        double sumaNegativos = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) { // si el valor en la posición es negativo
                sumaNegativos = sumaNegativos + array[i];
                contadorNegativos++;
            } else if (array[i] > 0) { // si es positivo
                sumaPositivos = sumaPositivos + array[i];
                contadorPositivos++;
            } else {
                contadorCeros++;
            }
        }

        // media
        double mediaPositivos = sumaPositivos / contadorPositivos;
        double mediaNegativos = sumaNegativos / contadorNegativos;

        System.out.printf("Media Positivos: %.2f", mediaPositivos);
        System.out.printf("\nMedia Negativos: %.2f", mediaNegativos);
        System.out.println("\nCeros: " + contadorCeros);
    }
}
