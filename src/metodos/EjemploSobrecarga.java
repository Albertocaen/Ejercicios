package metodos;

public class EjemploSobrecarga {
    public static void main(String[] args) {
        System.out.println("Segundo: ");
        imprimir("Hola", 5); // llamo al segundo método
        System.out.println("Cuarto: ");
        imprimir(5); // llamo al último de los métodos
        System.out.println("Primero: ");
        imprimir("Hola");
        System.out.println("Tercero: ");
        imprimir(5, "Lo que sea");
    }

    public static void imprimir(String s) {
        System.out.println(s);
    }
    public static void imprimir(String s, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println(s);
        }
    }
    public static void imprimir(int veces, String s) {
        for (int i = 0; i < veces; i++) {
            System.out.println(s);
        }
    }
    public static void imprimir(int val) {
        System.out.println(val);
    }
}
