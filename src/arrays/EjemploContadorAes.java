package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploContadorAes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // crear un programa que pida 10 letras por teclado,
        // las vaya guardando en un array de caracteres
        char[] caracteres = new char[10];
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = sc.next().charAt(0); // guarda en la posición del índice i el caracter que introducimos por teclado
        }
        //  vamos a ver qué tenemos
        System.out.println(Arrays.toString(caracteres));

        // luego pide un carácter
        System.out.print("¿Qué carácter quieres que cuente?:");
        char c = sc.next().charAt(0);

        // y al final muestra cuantas veces aparece ese carácter
        int contador = 0;
        for (int i = 0; i < caracteres.length; i++) {
            if(caracteres[i] == c) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}
