package String;

import java.util.Scanner;

/*
    dificultad: media
 */

public class Ejercicio13 {
    public static void main(String[] args) {
        /*
        Ejercicio 13
Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma
es aquella que se lee igual adelante que atrás.
         */

        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();

        // para poder comparar la cadena al derecho y al revés tenemos que eliminar los espacios
        cadena = cadena.replace(" ", "");
        //System.out.println(cadena);

        // se parece al 9 -> invertir una cadena
        String invertida = "";
        for (int i = cadena.length() -1 ; i >= 0 ; i--) { // empezamos en la última posición y vamos recorriendo la cadena hasta llegar a la primera posición (índice 0)
            invertida = invertida + cadena.charAt(i);
            //System.out.println(invertida);
        }

        // si es un palíndomo tienen que ser iguales cadena e invertida
        if (cadena.equals(invertida)) { // EQUIVALE A HACER == PERO CON STRING
            System.out.println("ES UN PALÍNDROMO");
        } else {
            System.out.println("PUES NO");
        }
    }
}
