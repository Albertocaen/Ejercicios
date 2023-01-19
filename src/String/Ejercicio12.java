package String;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*
        Ejercicio 12
Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos
cadenas se introducen por teclado.
         */
        //String cadena1 = pideCadena();
        //String cadena2 = pideCadena();
        //
        boolean resultado = contieneSubcadena(pideCadena(), pideCadena());
        if (resultado) { // resultado == true
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }
    }

    public static String pideCadena() {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        return cadena;
    }

    public static boolean contieneSubcadena(String cadena1, String cadena2) {
        // tengo que ver si cadena2 está dentro de cadena1
        if (cadena1.contains(cadena2)) {
            return true;
        }
        return false;
    }
}
