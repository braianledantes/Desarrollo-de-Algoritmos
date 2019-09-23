package algoritmos;

public class DivideYVenceras {

    public static void quickSort(int arr[]) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void MiQuickSort(int arr[], int izq, int der) {
        int pivote, i, j, aux;
        pivote = arr[(izq + der) / 2];
        i = izq;
        j = der;

        while (i < j) {
            if (arr[i] < pivote) {
                i++;
            } else if (arr[j] > pivote) {
                j++;
            } else {
                aux = arr[i];
                arr[i] = arr[j];
                arr[j] = aux;
            }
        }

    }

    private static void quickSort(int arr[], int izq, int der) {
        int pivote = arr[izq]; // tomamos primer elemento como pivote
        int i = izq; // i realiza la búsqueda de izquierda a derecha
        int j = der; // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j) {            // mientras no se crucen las búsquedas
            while (arr[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
            while (arr[j] > pivote) j--;         // busca elemento menor que pivote
            if (i < j) {                      // si no se han cruzado
                aux = arr[i];                  // los intercambia
                arr[i] = arr[j];
                arr[j] = aux;
            }
        }
        arr[izq] = arr[j]; // se coloca el pivote en su lugar de forma que tendremos
        arr[j] = pivote; // los menores a su izquierda y los mayores a su derecha
        Test.showArray(arr);
        if (izq < j - 1) {
            quickSort(arr, izq, j - 1); // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            quickSort(arr, j + 1, der); // ordenamos subarray derecho
        }
    }

    static void mergeSort(int[] arr) {
        int[] arrTemp = new int[arr.length];
        mergeSort(arr, arrTemp, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] arrTemp, int ini, int fin) {
        if (ini < fin) {
            int mitad = (ini + fin) / 2;
            mergeSort(arr, arrTemp, ini, mitad);
            mergeSort(arr, arrTemp, mitad + 1, fin);
            merge(arr, arrTemp, ini, mitad, fin);
        }
    }

    private static void merge(int[] arr, int[] arrTemp, int ini, int centro, int fin) {
        int posAux, finIni, iniFin, i, cantElem;
        finIni = centro;
        iniFin = centro + 1;
        posAux = ini;
        cantElem = fin - ini + 1;
        while (ini <= finIni && iniFin <= fin) {
            if (arr[ini] < arr[iniFin]) {
                arrTemp[posAux++] = arr[ini++];
            } else {
                arrTemp[posAux++] = arr[iniFin++];
            }
        }
        while (ini <= finIni) {
            arrTemp[posAux++] = arr[ini++];
        }
        while (iniFin <= fin) {
            arrTemp[posAux++] = arr[iniFin++];
        }

        i = 0;
        while (i < cantElem) {
            arr[fin] = arrTemp[fin];
            fin--;
            i++;
        }
    }
}
