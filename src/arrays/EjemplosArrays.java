package arrays;

import java.util.Arrays;

public class EjemplosArrays {
    public static void main(String[] args) {
        // Declarar un array
        //tipo[] nombre;
        double[] elementos;

        // Inicializar -> instanciar = crear un objeto de tipo array
        elementos = new double[5]; // aquí estoy guardando espacio en memoria

        // lo rellenamos
        elementos[0] = 10.8;
        elementos[1] = 14.3;
        elementos[2] = 13.5;
        elementos[3] = 12.1;
        elementos[4] = 9.7;

        // normalmente declaramos e incializamos a la vez
        String[] diasLaborables = new String[5];
        diasLaborables[0] = "Lunes";
        diasLaborables[1] = "Martes";
        diasLaborables[2] = "Miércoles";
        diasLaborables[3] = "Jueves";
        diasLaborables[4] = "Viernes";
        //diasLaborables[5] = "Sábado"; // esto dará error en tiempo de ejecución -> excepción
        //diasLaborables[6] = "Domingo"; // esto dará error en tiempo de ejecución -> excepción
        //System.out.println(diasLaborables[6]); //esto dará error en tiempo de ejecución -> excepción


        // hay un caso en que puedo no decir el tamaño,
        // si lo relleno directamente
        String[] meses = {"Ene" ,"Feb", "Mar", "Abr", "May", "Jun",
        "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"}; // en vez de new y tal pongo las llaves y dentro los valores separados por comas

        // para imprimirlos
        // a) Con un for
        for (int i = 0; i < elementos.length; i++) { // ojo; en String era length()
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
        // b) con el método toString() de la clase Arrays
        System.out.println(Arrays.toString(diasLaborables));

        // c) Con foreach -> es una variante simplificada del bucle for
        for (String elemento: meses) {
            System.out.print(elemento + " ");
        }


        // no funciona -> System.out.println(elementos);
        // no funciona -> System.out.println(diasLaborables);
        // no funciona -> System.out.println(meses);
    }
}
