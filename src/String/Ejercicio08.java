package String;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        /*
        Ejercicio 8
Escribe un programa que lea una cadena de texto que consista en un nombre y sus apellidos
y a continuación muestre las iniciales en mayúsculas.
         */
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        //  tengo que extraer las iniciales
        //System.out.print(cadena.charAt(0)); // una forma
        System.out.print(cadena.substring(0,1)); // otra forma de sacar el primer carácter
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == ' ') { // si el carácter que tengo en la posición que estoy mirando es un ' '
                System.out.print(cadena.charAt(i+1)); // imprimo el carácter que tengo en la siguiente posición
            }
        }
    }
}
