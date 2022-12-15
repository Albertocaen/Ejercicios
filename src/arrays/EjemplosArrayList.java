package arrays;

import java.util.ArrayList;

public class EjemplosArrayList {
    public static void main(String[] args) {
        //int[] numeros = new int[10];
        ArrayList<String> nombres = new ArrayList<>();
        System.out.println(nombres.size());
        // añado elementos en la última posición
        nombres.add("Valentin"); // índex 0
        nombres.add("JavierA"); // índex 1
        nombres.add("Claudia"); // indez 2
        System.out.println(nombres.size());
        System.out.println(nombres);
        // podemos añadir un elemento en una posición determinada
        nombres.add(1, "Rebeca");
        // para imprimirlo:
        System.out.println(nombres);
        // Quiero imprimir el último nombre
        System.out.println(nombres.get(nombres.size() - 1));
        // Quiero imprimir el primer nombre
        System.out.println(nombres.get(0));
        // Quiero reemplazar a JavierA por Javier Arreaza
        nombres.set(2, "Javier Arreaza");
        System.out.println(nombres);
        System.out.println(nombres.size());
        // quiero quitar un elemento
        nombres.remove("Valentin");
        System.out.println(nombres.size());
        System.out.println(nombres);

        // Recorremos el arraylist
        for (int i = 0; i < nombres.size(); i++) {
            nombres.set(i, "s" + nombres.get(i) + "s");
        }
        System.out.println(nombres);
    }
}
