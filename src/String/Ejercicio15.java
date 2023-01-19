package String;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
        Ejercicio 15
Pide una cadena y un carácter por teclado y muestra cuantas veces aparece el carácter en la
cadena.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Cadena: ");
        String cadena = sc.nextLine();
        System.out.print("Carácter: ");
        char c = sc.nextLine().charAt(0);
        // cuántas veces aparece el carácter
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            // si el carácter que miro
            if (cadena.charAt(i) == c) {
                contador++;
            }
        }
        System.out.println(c + " aparece " + contador + " veces en " + cadena);
    }
    // método/s para pedir los datos

    // sacar parte del código al método contarCaracter, que recibe un String y un char y devuelve un int

    // método para imprimir el resultado
}
