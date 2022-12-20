package arrays;

import java.util.Arrays;

public class EjemplosArraysBidimensionales2 {
    public static void main(String[] args) {
        // declaramos un array de 5xlo que sea
        String[][] aula = {
                { "", "", "Valentin", "Rebeca"},
                {"Sara", "Gema", "Valeria", "Tatiana", "Claudia", "JavierA"},
                {"Antonio", "Christian"},
                {"Jose Antonio", "Victor", "Daniel", "JavierB", "Jorge", "Aitor"},
                {"Miguel", "Alberto", "Francisco", "Roberto"}
        };

        for (int i = 0; i < aula.length; i++) {
            System.out.println(Arrays.toString(aula[i]));
        }

        System.out.println("===========================");
        System.out.println(aula[0][3]);
        System.out.println("===========================");
        for (int i = 0; i < aula.length; i++) {
            for (int j = 0; j < aula[i].length; j++) {
                System.out.print(aula[i][j] + " ");
            }
            System.out.println();
        }

    }
}
