package arrays;

public class Ejercicio24 {
    public static void main(String[] args) {
        /*
        24. Crea un progama que :
• Declara una tabla de números, bidimensional, de tamaño 5x15 y nombre ‘marco’.
• Carga la tabla con dos únicos valores: 0 y 1, donde el valor 1 ocupará las
posiciones o elementos que delimitan la tabla, es decir, las más externas, mientras
que el resto de los elementos contendrán el valor 0.
• Visualiza el contenido de la matriz en pantalla.
         */

     //• Declara una tabla de números, bidimensional, de tamaño 5x15 y nombre ‘marco’.
     int[][] marco = new int[5][15];

     // lo rellenamos así:
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 14) { // en la fila 0 y 4, y en la columna 0 y 14 meto 1s
                    marco[i][j] = 1;
                } else {
                    marco[i][j] = 0;
                }
            }
        }

     // lo pintamos
        for (int i = 0; i < 5; i++) { // 5 también lo podría poner así: i < tabla.length
            for (int j = 0; j < 15; j++) { // 15 también lo podría poner así tabla[i].length
                System.out.print(marco[i][j]+ "\t");
            }
            System.out.println();
        }

    }
}
