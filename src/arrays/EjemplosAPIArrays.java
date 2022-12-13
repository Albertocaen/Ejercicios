package arrays;

import java.util.Arrays;

public class EjemplosAPIArrays {
    public static void main(String[] args) {
        // Arrays.toString
        byte[] nums = { 0, 1, 2, 4, 8, 16, 32, 64 };
        String cadenas = Arrays.toString(nums); // [0, 1, 2, 4, 8, 16, 32, 64]
        System.out.println(cadenas);

        // Arrays.sort(nombre)
        int[] enteros = {5, -23, 22, 102, 37105, -44};
        // quiero ordenarlo
        Arrays.sort(enteros);
        // lo imprimimos
        System.out.println(Arrays.toString(enteros));

        // Comparar arrays
        int[] num1 = {1, 2, 5, 8};
        int[] num2 = {1, 2, 5};
        int[] num3 = {1, 2, 5, 8};
        System.out.println(Arrays.equals(num1, num2)); // imprime "false"
        System.out.println(Arrays.equals(num1, num3)); // imprime "true"
    }
}
