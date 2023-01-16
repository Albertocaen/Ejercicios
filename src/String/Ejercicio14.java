package String;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        /*
        Ejercicio 14
Suponiendo que hemos introducido una cadena por teclado que representa una frase
(palabras separadas por espacios), realiza un programa que cuente cuántas palabras tiene.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        // tenemos que contar las palabras
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++; // si encontramos un espacio es que hay una palabra nueva -> incrementamos el contador
            }
        }
        System.out.println("Hay " + (contador+1) + " palabras."); // añadimos el 1 porque siempre habrá una palabra más que espacios
    }


}
