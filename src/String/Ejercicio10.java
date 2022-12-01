package String;

import java.util.Scanner;

/**
 * dificultad: fácil
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        /*
        Ejercicio 10
Pide una cadena y dos caracteres por teclado y sustituye la aparición del primer carácter en
la cadena por el segundo carácter.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una cadena: ");
        String cadena = sc.nextLine();
        System.out.print("Dime un carácter: ");
        char c1 = sc.next().charAt(0);
        // también puede ser: String c1 = sc.nextLine().substring(0, 1);
        System.out.print("Dime otro carácter: ");
        char c2 = sc.next().charAt(0);

        // sustituimos c1 por c2
        cadena = cadena.replace(c1, c2);
        System.out.println(cadena);
    }
}
