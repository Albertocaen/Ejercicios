package arrays;

import java.util.Scanner;

public class EjercicioExamen {
    public static void main(String[] args) {
/*
Pedir un día y un mes, y comprobar que es correcto. Consideramos que febrero tiene siempre 28 días.
 */
        Scanner sc = new Scanner(System.in);

        int dia = 0;
        int mes = 0;
        // creamos un array con los días de cada mes
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean fechaCorrecta = false;
        do {
            //Pido día y mes
            System.out.println("Dia:");
            dia = sc.nextInt(); sc.nextLine();
            System.out.println("Mes:");
            mes = sc.nextInt(); sc.nextLine();
            // Compruebo si la fecha es correcta
            if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasMes[mes -1]) {
                System.out.println("Fecha correcta");
                //System.out.println(diasMes[mes - 1]);
                // cambiamos la fecha a correcta para salir del bucle
                fechaCorrecta = true;
            } else {
                System.out.println("Fecha incorrecta. Por favor, vuelve a introducir la fecha.");
                fechaCorrecta = false; // redundante
            }
        } while (!fechaCorrecta); // fechaCorreta == false

        // A continuación, se muestra un mensaje como el siguiente, en el que se indica el mes con letras:
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        System.out.println("Asientos disponibles para el día " + dia + " de " +
                meses[mes - 1]);
        System.out.println("==================================================");

        /*
        Los asientos están representados por un array bidimensional de caracteres, de tamaño 4x4, donde una L indica que el asiento está libre, y una X indica que está ocupado. Inicialmente, algunos asientos están libres y otros ocupados:
         */
        char[][] asientos = new char[4][4];
        // ponemos todos los asientos libres
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = 'L';
            }
        }

        // ponemos algunos ocupados
        asientos[0][1] = 'X';
        asientos[1][1] = 'X';
        asientos[1][2] = 'X';

        // imprimimos los asientos
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j] + "\t");
            }
            System.out.println();
        }

        /*
        Se pide al usuario que indique fila y asiento, controlando que la respuesta esté dentro del rango:
         */
        int fila = 0;
        do {
            System.out.println("Elige fila (0-3):");
            fila = sc.nextInt();
            if (fila < 0 || fila > 3) {
                System.out.println("Fuera de rango. Por favor, introduce un valor entre 0 y 4.");
            }
        } while (fila < 0 || fila > 3);

        int asiento = 0;
        do {
            System.out.println("Elige asiento (0-3):");
            asiento = sc.nextInt();
            if (asiento < 0 || asiento > 3) {
                System.out.println("Fuera de rango. Por favor, introduce un valor entre 0 y 4.");
            }
        } while (asiento < 0 || asiento > 3);

        // Una vez seleccionados fila y asiento, se comprueba si en esa posición el asiento está ocupado.
        if (asientos[fila][asiento] == 'L') {
            asientos[fila][asiento] = 'X';
            System.out.println("Se te ha asignado el asiento solicitado.");
            // imprimimos los asientos
            for (int i = 0; i < asientos.length; i++) {
                for (int j = 0; j < asientos[i].length; j++) {
                    System.out.print(asientos[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("El asiento está ocupado. Tendrás que empezar de nuevo.");
        }
    }
}
