package String;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
    /*
    Ejercicio 7
Escribe un programa que lea una cadena y dos números enteros para indicar los límites
inferior y superior respectivamente de un rango dentro de las posiciones de los caracteres de
la cadena. Imprime la subcadena indicada por el rango:
a) suponiendo que ambos números siempre son mayores o iguales a 0 y menores que la
longitud de la cadena;
b) Validando que sucede a).
     */
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        int inf = sc.nextInt();
        int sup = sc.nextInt();
        // a)
        //String subcadena = cadena.substring(inf, sup);
        //System.out.println(subcadena);

        //b)
        if (inf >= 0 && sup >= 0 && inf < cadena.length() && sup < cadena.length() && inf != sup) {
            String subcadena = cadena.substring(inf, sup);
            System.out.println(subcadena);
        } else {
            System.out.println("Mal");
        }

    }
}
