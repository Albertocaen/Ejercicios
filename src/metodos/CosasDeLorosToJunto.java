package metodos;

import java.util.Scanner;

public class CosasDeLorosToJunto {
    // mejor con un Scanner estático
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        imprimirRación(calcularRacion(pedirPeso(), pedirEdad()));

    }

    // crear cuatro métodos:

    // pide el peso del loro y lo devuelve (no recibe nada)
    public static double pedirPeso() {
        System.out.println("¿Cuántos gramos pesa el loro?");
        double peso = sc.nextDouble();
        return peso;
    }
    // pide la edad del loro y la devuelve (no recibe nada)
    public static int pedirEdad() {
        System.out.println("¿Cuántos años tiene el loro?");
        int años = sc.nextInt();
        return años;
    }

    // calcula los gramos de semillas que hay que darle, con esta fórmula:
    // (peso del loro / 5) + edad del loro (recibe tanto el peso como la edad)
    // y devuelve el resultado de la fórmula
    public static double calcularRacion(double peso, int edad) {
        // con el peso y la edad que recibimos, calculamos la ración
        double ración = (peso / 5) + edad;
        return ración;
    }


    // imprime lla ración que tenemos que darle diarialmente al loro
    // (recibe la cantidad de semillas y a continuación las imprime el resultado con algún texto adicional)
    public static void imprimirRación(double racion) {
        System.out.println("Teniendo en cuenta el peso y la edad del loro, deberá darle " + racion + " gramos de semillas diariamente.");
    }

}
