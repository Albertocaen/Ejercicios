package arrays;

import java.util.Arrays;

public class EjemplosRandom {
    public static void main(String[] args) {
        int[] numeros = new int[200];
        int max = 10;
        int min = -10;
        if (min < 0) {
            min = min - 1;
        }
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * (max - min + 1) + (min));
        }

        System.out.println(Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}
