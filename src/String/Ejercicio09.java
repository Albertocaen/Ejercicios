package String;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        /*
        Ejercicio 9
Realizar un programa que pida por teclado una cadena de caracteres y genere otra cadena
resultado de invertir la primera.
         */
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        String invertida = "";

        for (int i = cadena.length()-1; i >= 0; i--){
            invertida = invertida + cadena.charAt(i);
        }
        System.out.print(invertida);
    }
}
