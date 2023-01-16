package String;

import java.util.Scanner;

public class Ejercicio14ConMétodos {
    public static void main(String[] args) {
        /*
        Ejercicio 14
Suponiendo que hemos introducido una cadena por teclado que representa una frase
(palabras separadas por espacios), realiza un programa que cuente cuántas palabras tiene.
         */
        String frase = pedirFrase();
        // tenemos que contar las palabras
        int numeroPalabras = contarPalabras(frase);
        imprimeResultado(numeroPalabras);
    }

    // un método que pida la frase (no recibe nada, devuelve un String)
    public static String pedirFrase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        return frase;
    }

    // otro método que calcule las palabras que contiene (recibe un String, devuelve un int)
    public static int contarPalabras(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                contador++; // si encontramos un espacio es que hay una palabra nueva -> incrementamos el contador
            }
        }
        return contador + 1; // añadimos el 1 porque siempre habrá una palabra más que espacios
    }

    // otro método que imprima el resultado (recibe un int y no devuelve nada)
    public static void imprimeResultado(int palabras) {
        System.out.println("Hay " + (palabras) + " palabras.");
    }

}
