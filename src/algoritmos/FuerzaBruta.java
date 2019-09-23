package algoritmos;

/**
 * @author chutebnl
 * @since 06/14/2019
 */

/**
 * La busqueda por fuerza bruta,
 * busqueda combinatoria,
 * busqueda exhaustiva, o
 * simplemente fuerza bruta, es
 * una tecnica trivial pero a
 * menudo usada, que consiste en
 * procesar sistematicamente todos
 * los posibles candidatos para la
 * solucion de un problema, con el
 * fin de chequear si dicho
 * candidato satisface la solucion
 * al mismo.
 */
public class FuerzaBruta {

    /**
     * La Ordenacion de burbuja (Bubble Sort en ingles) es un sencillo algoritmo
     * de ordenamiento. Funciona revisando cada elemento de la lista que va a ser
     * ordenada con el siguiente, intercambiandolos de posicion si estan en el orden
     * equivocado. Es necesario revisar varias veces toda la lista hasta que no se necesiten
     * mas intercambios, lo cual significa que la lista esta ordenada. Este algoritmo
     * obtiene su nombre de la forma con la que suben por la lista los elementos durante
     * los intercambios, como si fueran pequenas burbujas
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        int aux;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }

    /**
     * El algoritmo de Ordenacion por Seleccion (Selection-Sort) es
     * un algoritmo de ordenamiento que requiere O(n^2) operaciones para
     * ordenar una lista de n elementos.
     * @param arr
     */
    public static void selectionSort(int[] arr) {
        int min, aux;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            aux = arr[i];
            arr[i] = arr[min];
            arr[min] = aux;
        }
    }

    /**
     * Una busqueda sin exito requiere
     * examinar cada uno de los elementos
     * del arreglo, el tiempo sera O(N). En
     * el peor caso, una busqueda con exito
     * tambien requiere examinar cada
     * elemento porque podrıamos no
     * encontrar el elemento hasta la
     * ultima posicion. Luego, el caso peor
     * es tambien lineal. En promedio, solo
     * buscamos en la mitad del vector. Sin
     * embargo, N/2 sigue siendo O(N).
     * @param arr
     * @param elem
     * @return
     */
    public static int sequentialSearch(int[] arr, int elem) {
        int r = -1;
        int pos = 0;

        while (r == -1 && pos < arr.length) {
            if (arr[pos] == elem) {
                r = pos;
            } else {
                pos++;
            }
        }
        return r;
    }
}
