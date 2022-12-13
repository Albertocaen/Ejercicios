package arrays;

public class Ejemplo03MasCorto {
    public static void main(String[] args) {
        /* DIFICULTAD MEDIA
        El siguiente programa comprueba si el array
        dado está ordenado en orden ascendente
e imprime "ORDENADO", de lo contrario imprime "DESORDENADO".
         */
        int[] nums = { 1, 2, 3, 4, 5, 10, 6 };
        // declaramos una variable para indicar si está ordenado (flag)
        boolean ordenado = true;
        for (int i = 0; i < nums.length - 2; i++) { // me quedo en la penúltima posición
            if (nums[i] > nums[i + 1]) { // comparo un valor con el siguiente
                ordenado = false; // basta con que haya un caso que no se cumpla para que esté desordenado
                break;
            }
        }
        // Al finalizar el for es cuando imprimo si está ordenado o no

        if (ordenado) {
            System.out.println("Ordenado");
        } else {
            System.out.println("Desordenado");
        }
    }
}
