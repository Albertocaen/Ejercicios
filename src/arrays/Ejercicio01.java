package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        /* FACIL
        1. Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los
muestre en el mismo orden introducido.
         */
        Scanner sc = new Scanner(System.in);
        double[] decimales = new double[5];
        for (int i = 0; i < decimales.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            decimales[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(decimales));
    }
}
