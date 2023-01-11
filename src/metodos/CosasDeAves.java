package metodos;

import java.util.Scanner;

public class CosasDeAves {
    // mejor con un Scanner estático
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String ave = pedirAve();
        // pido el peso
        double peso = pedirPeso(ave);
        // pido la edado
        int edad = pedirEdad(ave);
        // calculo la ración que hay que darle
        double ración1 = calcularRacion(peso, edad);
        // imprimir ración
        imprimirRación(ración1, ave);

    }

    // crear cuatro métodos:

    // pide el peso y lo devuelve (no recibe nada)
    public static double pedirPeso(String ave) {
        System.out.println("¿Cuántos gramos pesa el + " + ave + "?");
        double peso = sc.nextDouble();
        return peso;
    }
    // pide la edad y la devuelve (no recibe nada)
    public static int pedirEdad(String ave) {
        System.out.println("¿Cuántos años tiene el " + ave + "?");
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
    public static void imprimirRación(double racion, String ave) {
        System.out.println("Teniendo en cuenta el peso y la edad del " + ave + ", deberá darle " + racion + " gramos de semillas diariamente.");
    }

    public static String pedirAve() {
        System.out.println("¿De qué ave se trata?");
        return sc.nextLine();
    }

}
