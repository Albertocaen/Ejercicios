package arrays;

public class Ejemplo03 {
    public static void main(String[] args) {
        /* DIFICULTAD MEDIA
        El siguiente programa comprueba si el array
        dado está ordenado en orden ascendente
e imprime "ORDENADO", de lo contrario imprime "DESORDENADO".
         */
        int[] nums = { 1, 2, 3, 4, 5, 10, 6, 11 };
        // declaramos una variable para indicar si está ordenado (flag)
        boolean ordenado = true;
        for (int i = 0; i <= nums.length - 2; i++) { // me quedo en la penúltima posición
            if (nums[i] <= nums[i + 1]) {
                // si el que estoy mirando es menor o igual que el siguiente, vamos bien; no hago nada
            } else { // si se mete aquí es que nums[i] es mayor que la siguiente -> está desordenado
                ordenado = false; // basta con que haya un caso que no se cumpla para que esté desordenado
                break;
            }
        }
        // Al finalizar el for es cuando

        if (ordenado) {
            System.out.println("Ordenado");
        } else {
            System.out.println("Desordenado");
        }
    }
}
