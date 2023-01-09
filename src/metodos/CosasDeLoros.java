package metodos;

import java.util.Scanner;

public class CosasDeLoros {
    // mejor con un Scanner estático
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double peso = pedirPeso();
        int edad2 = pedirEdad();

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
    // y la devuelve


    // imprime los gramos de semillas tenemos que darle diarialmente al loro
    // (recibe la cantidad de semillas y a continuación las imprime el resultado con algún texto adicional)

}
