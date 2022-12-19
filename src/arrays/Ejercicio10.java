package arrays;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*
        10. Haz un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y
diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar arrays. Para
simplificarlo vamos a suponer que febrero tiene 28 días.
         */


        //   10. Haz un programa que pida un número al usuario un número de mes (por ejemplo, el 4)
        Scanner sc = new Scanner(System.in);
        // vamos a controlar que se introduzca un número válido
        int mes = 0;
        do {
            System.out.println("Di un número de mes (1-12): ");
            mes = sc.nextInt();
        } while (mes < 0 || mes > 12); // si falla, seguimos preguntando

        // array de meses con letras
        String[] nombreMes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        // array de meses con los días de cada mes
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // los dos arrays van correlativos: el mismo índice indica nombre y días que tiene el mes
        // Si meto un 4 -> Abril tiene 30 días (pero ojo, el índice del mes 4 es 3 porque 0-1-2-3)
        System.out.println(nombreMes[mes - 1] + " tiene " + diasMes[mes - 1] + " días.");
    }
}
