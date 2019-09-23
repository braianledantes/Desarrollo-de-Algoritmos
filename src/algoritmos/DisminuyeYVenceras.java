package algoritmos;

/**
 * <p>Los algoritmos
 * disminuye-y-venceras corresponden a la reduccion
 * recursiva del problema dado a una instancia mas
 * pequena para luego extender la solucion obtenida
 * y asi alcanzar la solucion de la instancia
 * original.</p>
 *
 * <p>Es considerado por algunos autores
 * como un caso especial de
 * divide-y-venceras. La diferencia
 * fundamental entre los dos radica en
 * el numero de subproblemas mas
 * pequenos que necesitan ser resueltos:
 * varios (por lo general, dos) en
 * algoritmos divide-y-venceras y solo
 * uno en los algoritmos de
 * disminuye-y-venceras.</p>
 */
public class DisminuyeYVenceras {

    static class DisminuyePorUnaConstante {
        /**
         * <p>El algoritmo Insertion-Sort se considera una buena
         * tecnica cuando son pocos los elementos a ordenar,
         * ya que el algoritmo en cuestion es muy sencillo. Sin
         * embargo, consume demasiado tiempo, y si  queremos
         * ordenar una gran cantidad de elementos, la ordenacion
         * por insercion es una pobre eleccion.
         * Tiempo de ejecucion: Requiere O(n^2) operaciones para
         * ordenar una lista de n elementos.
         * </p>
         *
         * @param arr
         */
        public static void insertionSort(int[] arr) {
            int j, temp;
            for (int p = 1; p < arr.length; p++) {
                temp = arr[p];
                j = p;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }
    }

    static class DisminuyePorUnFactorConstante {
        /**
         * <p>Por el principio de divisiones sucesivas
         * por la mitad, sabemos que el numero de
         * iteraciones posibles de una busqueda
         * binaria sera O(log N). En una busqueda
         * sin exito, el numero de iteraciones del
         * bucle es blog Nc + 1. Esto se debe a que
         * el rango de busqueda se divide por la
         * mitad (redondeando hacia abajo si tiene
         * un numero par de elementos) en cada
         * iteracion. Anadimos 1 porque el ultimo
         * rango abarca cero elementos. En una
         * busqueda con exito, el caso peor consiste
         * en blog Nc iteraciones, porque en el caso
         * peor reducimos la parte de vector hasta
         * un unico elemento.
         * </p>
         *
         * @param arr
         * @return
         */
        public static int binarySearch(int[] arr, int elem) {
            int result = -1;
            int start = 0;
            int end = arr.length - 1;
            int half;
            while (start <= end) {
                half = (start + end) / 2;
                if (arr[half] == elem) {
                    result = half;
                    start = end + 1;
                } else {
                    if (elem < arr[half]) {
                        end = half - 1;
                    } else {
                        start = half + 1;
                    }
                }
            }
            return result;
        }

        public static int recursiveBinarySearch(int[] arr, int elem) {
            return recursiveBinarySearchAux(arr, elem, 0, arr.length - 1);
        }

        private static int recursiveBinarySearchAux(int[] arr, int elem, int primero, int ultimo) {
            int medio;
            if (primero > ultimo)
                return -1;
            medio = (primero + ultimo) / 2;
            if (arr[medio] == elem)
                return medio;
            if (arr[medio] < elem) return recursiveBinarySearchAux(arr, elem, medio + 1, ultimo);
            else return recursiveBinarySearchAux(arr, elem, primero, medio - 1);
        }

        static boolean busqBinaria(int[] v, int primero, int ultimo, int valor) {
            boolean rta;
            int medio = (primero + ultimo) / 2;
            if (primero > ultimo)
                rta = false;
            else if (v[medio] == valor) rta = true;
            else if (v[medio] < valor)
                rta = busqBinaria(v, medio + 1, ultimo, valor);
            else
                rta = busqBinaria(v, primero, medio - 1, valor);
            return rta;
        }
    }

}
