package arrays;

import java.util.Arrays;

public class Ejercicio22 {
    public static void main(String[] args) {
/*
22. Haz un programa que realice lo siguiente:
• Crea una tabla de 5x5 enteros.
• Carga la tabla con valores numéricos enteros.
• Suma todos los elementos de cada fila y todos los elementos de cada columna
visualizando los resultados en pantalla.
 */
        //• Crea una tabla de 5x5 enteros.
        int[][] tabla = new int[5][5];
        // • Carga la tabla con valores numéricos enteros.
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = (int) (Math.random() * 11); // rellena con valores entre 0 y 10
            }
        }

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();
        }

        // vamos a sumar las filas
        int[] sumaFila = new int[5];
        for (int i = 0; i < tabla.length; i++) {
            int suma = 0;
            for (int j = 0; j < tabla[i].length; j++) {
                suma = suma + tabla[i][j];
            }
            // cada vez que termino de recorrer (sumar) una fila, guardo el resultado en el array sumaFila en la posición de esa fila
            sumaFila[i] = suma;
        }
        System.out.println(Arrays.toString(sumaFila));

        // ahora con las columnas
        int[] sumaColumna = new int[5];
        for (int i = 0; i < tabla.length; i++) {
            int suma = 0;
            for (int j = 0; j < tabla[i].length; j++) {
                suma = suma + tabla[j][i];
            }
            // cada vez que termino de recorrer (sumar) una fila, guardo el resultado en el array sumaFila en la posición de esa fila
            sumaColumna[i] = suma;
        }
        System.out.println(Arrays.toString(sumaColumna));

    }
}
