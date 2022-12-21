package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio19 {

    static Scanner sc = new Scanner(System.in); // este Scanner me vale para toda la clase
    static ArrayList<Integer> arrayList = new ArrayList<>(); // este ArrayList me vale para toda la clase
    public static void main(String[] args) {
//        19. Vamos a crear un programa que cree un array de números enteros (tamaño introducido por teclado), -> lo vamos a hacer con ArrayList -> no pedimos tamaño


//        muestre el siguiente menú y realice lo que en las opciones se indica:
//        1. Añadir número al final: pide un número y lo añade al final del array.
//        2. Añadir número en una posición: pide un número y una posición, y si la posición
//        existe en el array lo añade en esa posición (la posición se pide a partir de 1).
//        3. Longitud del array: muestra el tamaño del array.
//        4. Eliminar el último número: muestra el último número del array y lo borra.
//        5. Eliminar un número: pide una posición, y si la posición existe en el array borra el
//        elemento que contiene (lo reemplaza con un 0).
//        6. Contar números: pide un número y te dice cuántas veces aparece en el array.
//        7. Posiciones de un número: pide un número y te dice en que posiciones está.
//        8. Mostrar números: Muestra los números que contiene.
//        9. Salir
        int opcion = 0;
        do {
            System.out.println("1. Añadir número al final\n" +
                    "2. Añadir número en una posición\n" +
                    "3. Longitud del array.\n" +
                    "4. Eliminar el último número.\n" +
                    "5. Eliminar un número\n" +
                    "6. Contar números\n" +
                    "7. Posiciones de un número\n" +
                    "8. Mostrar números\n" +
                    "9. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> añadirNumeroAlFinal();
                case 2 -> añadirNumeroEnPosicion();
                case 3 -> mostrarLongitud();
                case 4 -> eliminarUltimo();
                case 5 -> eliminarNumeroPorPosicion();
                case 6 -> contarNumero();
                case 7 -> posicionesDeUnNumero();
                case 8 -> mostrarNumeros();
            }




        } while (opcion != 9);



    }

    private static void posicionesDeUnNumero() {
        System.out.println("Número del cual quieres saber las posiciones: ");
        int numero = sc.nextInt();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == numero) {
                System.out.print(i + 1 + " ");
            }
        }
    }

    private static void contarNumero() {
        System.out.println("Número a contar: ");
        int numero = sc.nextInt();
        int contador = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == numero) {
                contador++;
            }
        }
    }

    private static void eliminarNumeroPorPosicion() {
        System.out.println("Posición a eliminar:");
        int posicion = sc.nextInt();
        arrayList.remove(posicion - 1);
    }

    private static void eliminarUltimo() {
        arrayList.remove(arrayList.get(arrayList.size() - 1));
    }

    private static void mostrarLongitud() {
        System.out.println(arrayList.size());
    }

    private static void añadirNumeroEnPosicion() {
        // pido el número
        System.out.println("Número a añadir: ");
        int numero = sc.nextInt();
        System.out.println("Posición en la que lo quieres añadir");
        int posicion = sc.nextInt();
        arrayList.add((posicion - 1), numero);
    }

    static void añadirNumeroAlFinal() {
        // aquí meto el código
        System.out.println("Introduce número a añadir: ");
        int numero = sc.nextInt();
        arrayList.add(numero);
    }

    public static void mostrarNumeros() {
        // aquí mostramos los números
        System.out.println(arrayList);
    }


}
