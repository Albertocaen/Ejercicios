package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /* FACIL
        2. Haz un programa que lea 5 números decimales por teclado,
        los guarde en un array y los muestre en el orden inverso al introducido.
         */
        Scanner sc = new Scanner(System.in);
        double[] decimales = new double[5];
        for (int i = 0; i < decimales.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            decimales[i] = sc.nextDouble();
        }
        // hasta aquí igual que el ejercicio 1
       // para imprimirlo al revés, un for que vaya de la última posición a la primera
        for (int i = decimales.length -1; i >= 0 ; i--) {
            System.out.print(decimales[i] + " ");
        }
    }
}
