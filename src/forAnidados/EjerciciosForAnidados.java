package forAnidados;

import java.util.Scanner;

/**
 * Estos ejercicios están en la hoja de ejercicios de estructuras de control de la primera evaluación
 */
public class EjerciciosForAnidados {
    // utilizamos un Scanner estático
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // vamos a mostrar el menú y hacer ejercicios hasta que nos cansemos
        String seguir = "";
        do {
            // muestro el menú
            int ejercicio = menu(); // en la variable ejercicio tengo el número
            // con un switch según me hayan indicado un ejercicio u otro ejecuto un ejercicio u otro
            switch (ejercicio) {
                case 27:
                    ejercicio27(); // llamamos al método donde está desarrollado el ejercicio 27
                    break;
                case 28:
                    ejercicio28();
                    break;
                case 29:
                    ejercicio29();
                    break;
                case 35:
                    ejercicio35();
                    break;
                default:
                    System.out.println("Ese ejercicio no entra aquí.");
            }
            System.out.println("¿Quieres hacer otro ejercicio? (S/N)");
            seguir = sc.nextLine(); // cogemos solamente la primera letra, por si alguien pone si o no
            seguir = seguir.substring(0, 1);
        } while (seguir.equalsIgnoreCase(   "S"));
    }

    public static void ejercicio27() {
        String enunciado = "27. Escribe un programa que, dado un número n introducido por teclado, dibuje un\n" +
                "cuadrado de dimensiones n * n, con un carácter también introducido por teclado.";
        System.out.println(enunciado);
        // resolvemos este ejercicio
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        sc.nextLine(); // por precaución
        System.out.print("Introduce un carácter:");
        char c = sc.nextLine().charAt(0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c + "\t");
            }
            // cada vez que finaliza el bucle interno meto un salto de línea
            System.out.println();
        }
    }

    public static void ejercicio28(){
        String enunciado = "28. Escribe un programa que reciba dos valores enteros por teclado, a y b, y dibuje un\n" +
                "rectángulo en que la base sea el número mayor y la altura el número menor, con un\n" +
                "carácter también introducido por teclado.";
        System.out.println(enunciado);
        // resolvemos este ejercicio
        System.out.print("a:");
        int a = sc.nextInt();
        System.out.print("b:");
        int b = sc.nextInt();sc.nextLine();
        System.out.print("Carácter:");
        char c = sc.nextLine().charAt(0);
        // ahora tengo que ver cuál es la base (el número mayor) y cuál la altura (el menor)
        int base, altura = 0;
        if (a > b) {
            base = a;
            altura = b;
        } else {
            base = b;
            altura = a;
        }
        // en base tengo ya el número mayor y en altura el menor
        // ahora pinto el rectángulo:
        // tantas filas como sea altura -> i (for externo)
        for (int i = 0; i < altura; i++) {
            // para cada fila, pinto tantos caracteres como la base
            for (int j = 0; j < base; j++) {
                System.out.print(c + "\t");
            }
            // cada vez que termino de pintar una fila, meto un salto de línea
            System.out.println();
        }
    }

    public static void ejercicio29() {
        String enunciado = "29. Hacer un programa que introduzca un número entero, positivo, y calcule su tabla de\n" +
                "multiplicar, hasta llegar a él. (Nota: para que los números queden alineados en columnas\n" +
                "puedes usar el tabulador \\t).";
        System.out.println(enunciado);
        // resolvemos este ejercicio
        System.out.print("Número:");
        int n = sc.nextInt();sc.nextLine();
        for (int i = 1; i <= n; i++) { // empiezo en 1 porque la tabla de multiplicar no empieza por 0
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " x " + j + " = " + (i*j) +"\t");
            }
            System.out.println();
        }
    }


    public static void ejercicio35() {
        String enunciado = "35. Hacer un programa que dibuje un triángulo rectángulo de n elementos de lado,\n" +
                "siendo n un número introducido por teclado, utilizando asteriscos (*).";
        System.out.println(enunciado);
        // resolvemos este ejercicio
        System.out.print("n = ");
        int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }


    }

    // método menú que pregunta qué ejercicio quieres hacer: 27, 28, 29 o 35
    // y devuelve el número de ejercicio a realizar -> int
    public static int menu() {
        System.out.println("¿Qué ejercicio quieres hacer?\n27\n28\n29\n35");
        int ejercicio = sc.nextInt();
        // ponemos después de sc.nextInt() esto para que no haga el salto de linea puñetero
        sc.nextLine();
        return ejercicio;
    }
}
