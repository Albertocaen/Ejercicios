package arrays;

import java.util.ArrayList;

public class Ejercicio12ConArrayList {
    public static void main(String[] args) {
               /*
        //        12. Rellenar aleatoriamente dos arrays (A y B) de 10 números enteros entre 1 y 10 y
        //mezclarlos en un tercero de la forma: el 1o de A, el 1o de B, el 2o de A, el 2o de B, etc.
               */
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();
        // rellenamos A y B
        for (int i = 0; i < 10; i++) {
            int numeroA = (int) (Math.random() * 10 + 1);
            A.add(numeroA);
            int numeroB = (int) (Math.random() * 10 + 1);
            B.add(numeroB);
        }
        System.out.println(A);
        System.out.println(B);
        // rellenamos C
        for (int i = 0; i < 10; i++) {
            C.add(A.get(i)); // añadimos en C lo que tenga en la posición i de A
            C.add(B.get(i)); // añadimos en C lo que tenga en la posición i de
        }
        System.out.println(C);

    }
}
