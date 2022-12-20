package arrays;

import java.util.Arrays;

public class EjemplosArraysBidimensionales {
    public static void main(String[] args) {
        // declaramos un array de 3x4 de números enteros
        int[][] tabla = new int[3][4];

        // lo rellenamos con números aleatorios entre 1 y 4
        for (int i = 0; i < tabla.length; i++) { // para cada fila (array) que tenga la tabla, hacer
            for (int j = 0; j < tabla[i].length; j++) { // tabla[i].length es la longitud de la fila i, que es el array que estoy recorriendo en ese momento
                tabla[i][j] = (int) (Math.random() * 4 + 1);
            }
        }

        // lo imprimimos
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(Arrays.toString(tabla[i]));
        }

    }
}
