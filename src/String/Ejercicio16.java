package String;

import java.util.Scanner;

public class Ejercicio16 {

    static Scanner sc = new Scanner(System.in); // Scanner estático para que valga en todos los métodos

    public static void main(String[] args) {
        /*
        Ejercicio 16
Escribe un programa que pida una lista de palabras (la guardas como una cadena de texto)
*/

        String palabra = "";
        String cadena = "";
        do {
            System.out.print("Introduce palabra (0 para salir):");
            palabra = sc.nextLine();
            // si la palabra no es 0, la concatenamos
            if(!palabra.equals("0")) {
                cadena = cadena + palabra + " ";
            }
        } while (!palabra.equals("0"));
        //System.out.println(cadena);
/*
y, a continuación dé opciones:
• Contar: pide una palabra, y me dice cuantas veces aparece en la lista
• Modificar: pide una palabra, y a continuación otra, y modifica todas las apariciones
de la primera por la segunda.
• Eliminar: pide una , y la elimina de la lista.
• Mostrar: muestra la lista de cadenas
• Salir
         */

        int op;

        do {
            System.out.println("Elige una opción:\n1. Contar: pide una palabra, y me dice cuantas veces aparece en la lista\n" +
                    "2. Modificar: pide una palabra, y a continuación otra, y modifica todas las apariciones " +
                    "de la primera por la segunda.\n" +
                    "3. Eliminar: pide una palabra, y la elimina de la lista.\n" +
                    "4. Mostrar: muestra la lista de cadenas\n" +
                    "5. Salir");
            op = sc.nextInt();sc.nextLine();
            switch (op) {
                case 1:
                    contar(cadena);
                    break;
                case 2:
                    modificar(cadena);
                    break;
                case 3:
                    eliminar(cadena);
                    break;
                case 4:
                    mostrar(cadena);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (op != 5);


    }

    public static void mostrar(String cadena) {
        //Mostrar: muestra la lista de cadenas
        System.out.println(cadena);
    }

    public static void eliminar(String cadena) {
        //  Eliminar: pide una palabra, y la elimina de la lista.
        System.out.println("Esta es la cadena: " + cadena);
        System.out.print("Palabra a eliminar: ");
        String palabra = sc.nextLine();
        if (cadena.contains(palabra)) {
            cadena = cadena.replaceAll(palabra, ""); // sustituye todas las apariciones de la palabra por ""
        }

    }

    public static void modificar(String cadena) {
        // Modificar: pide una palabra, y a continuación otra, y modifica todas las apariciones " +
        //                    "de la primera por la segunda.
    }

    public static void contar(String cadena) {
// Contar: pide una palabra, y me dice cuantas veces aparece en la lista
    }
}
