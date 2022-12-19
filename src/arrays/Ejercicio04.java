package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
//        4. Haz un programa en el que se cree un array que lea por teclado la longitud que tiene que tener 
// controla que el número introducido para el tamaño no sea 0 ni negativo con while o do-while
        
        Scanner sc = new Scanner(System.in);
        // pedimos el tamaño
        int longitud = 0;
        do {
            System.out.print("Tamaño: ");
            longitud = sc.nextInt();
            // si el tamaño que acabo de introducir es negativo o 0, indico el error
            if(longitud <= 0) {
                System.out.println("Tamaño incorrecto.");
            }
        } while (longitud <= 0); // si el tamaño es negativo o 0, sigo preguntando


// y a continuación lo inicialice con números aleatorios comprendidos entre 1 y 10.
    int[] numeros = new int[longitud];
        for (int i = 0; i < numeros.length; i++) {
            //numeros[i] = (int) (Math.random() * (max - min + 1) + (min));
            numeros[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(numeros));
    
// Mostrar la suma de todos los números que se guardan en el array.
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        System.out.println("Suma = " + suma);
      
    }
}
