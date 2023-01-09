package metodos;

import java.util.Scanner;

public class EjemplosMetodos {

    // cuando utilizo métodos estáticos
    // podemos declarar un Scanner estático para utilizarlo en toda la clase
    // y así no tengo que declarar un Scanner en cada método
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // a los otros métodos los llamamos desde aquí
        String nombre =  pideNombre(); // pideNombre() devuelve un String; ese String lo guardo en una variable
       // quiero utilizar el método imprimeNombre para imprimir la variable nombre
        // llamo al método imprimeNombre
        imprimeNombre(nombre);

        // esto es llamar o invocar al método imprimeLongitud()
        imprimeLongitud(nombre);

        

    }

    // aquí, dentro de la clase pero fuera del main
    // escribimos los otros métodos

    // public static tipoDeLoQueDevuelve nombreDelMétodo(parámetros -o no-) {
    //      instrucciones que se ejecutan al llamar o invocar al método
    //}

    // declaración del método :
    // declara un método que no reciba nada, pregunta un nombre y
    // lo devuelve
    public static String pideNombre() {
        System.out.print("Introduce nombre: ");
        String nombre = sc.nextLine();
        // cuando devuelve algo el método hay que poner return
        return nombre;
    }
    public static void imprimeNombre(String n){ // del parámetro tengo que poner el tipo y el nombre que yo quiera
        System.out.println("Nombre: " + n);
    }

    // declara un método que reciba un String e imprima su longitud
    public static void imprimeLongitud(String s) {
        // imprimo la longitud de s
        System.out.println("Longitud de " + s + ": " + s.length());
    }



}
