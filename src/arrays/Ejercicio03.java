package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        3. Haz un programa que declare tres arrays (‘a1’, ‘a2’ y ‘a3’)
         de cinco enteros cada uno */
         int[] a1 = new int[5];
         int[] a2 = new int[5];
         int[] a3 = new int[5];


//  pida valores para ‘a1’ y ‘a2’
        for (int i = 0; i < a1.length; i++) {
            System.out.print("Valor " + (i + 1) + " de a1:");
            a1[i] = sc.nextInt();
            System.out.print("Valor " + (i + 1) + " de a2:");
            a2[i] = sc.nextInt();
            //  y calcule los elementos de a3 así: a3=a1+a2.
            a3[i] = a1[i] + a2[i];
        }
        System.out.println("a1: " + Arrays.toString(a1));
        System.out.println("a2: " + Arrays.toString(a2));
        System.out.println("a3: " + Arrays.toString(a3));
    }
}
