package String;
/*
    dificultad: difícil
 */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        /*
        Ejercicio 11
Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a
minúsculas y viceversa.
         */

        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        String cambiada = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isLowerCase(cadena.charAt(i))) { // si es mayúscula tenemos que convertirlo en minúscula
                cambiada = cambiada + Character.toUpperCase(cadena.charAt(i));
            } else { // si entra aquí es que va a ser mayúscula, hay que pasarlo a minúscula
                cambiada = cambiada + Character.toLowerCase(cadena.charAt(i));
            }
        }
        System.out.println(cambiada);
    }
}
