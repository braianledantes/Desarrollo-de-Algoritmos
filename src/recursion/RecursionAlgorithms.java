package recursion;

public class RecursionAlgorithms {

    //------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        System.out.println("itetativeFunc: " + itetativeFunc(4));
        System.out.println("contarDigitos: " + contarDigitos(0));
        System.out.println("contarApariciones: " + contarApariciones(1232213132, 3));
        System.out.println("isInArray: " + isInArray(arr, 6));
        System.out.println("isInArray: " + isInArray(arr, 6));
        System.out.println("isSorted: " + isSorted(arr));
        System.out.println("isSorted: " + isSorted(arrSort));
        System.out.println("contarMultiplos: " + contarMultiplos(secuencia, 4));
        System.out.println("contarMultiplos: " + contarMultiplos(secuencia, 3));
        System.out.println("contarMultiplos: " + contarMultiplos(secuencia, 45));
        System.out.println("maximo: " + maximo(secuencia));
        System.out.println("sumatoria: " + sumatoria(4));
        System.out.println("potencia: " + potencia(10, 4));
        System.out.println("cantidadDigitos: " + cantidadDigitos(1234));
        System.out.println("generarCapicua: " + generarCapicua(12));
    }

    static int[] secuencia = {2, 5, 3, 6, 12, 3, 0};
    static int[] arr = {12, 7, 0, -1, 8, 10};
    static int[] arrSort = {2, 6, 8, 9, 10, 13, 16};

    static int generarCapicua(int n) {
        return generarCapicua(n, (cantidadDigitos(n) * 2) - 2, 0);
    }

    private static int generarCapicua(int n, int izq, int der) {
        if (n < 10) return n * potencia(10, izq);
        return (n % 10) * potencia(10, izq) + generarCapicua(n / 10, izq - 1, der + 1) + (n % 10 * potencia(10, der));
    }

    static int potencia(int b, int e) {
        //if (e < 0) return 1 / potencia(b, -e);
        if (e == 0) return 1;
        return b * potencia(b, e - 1);
    }

    static int cantidadDigitos(int n) {
        if (n < 0) cantidadDigitos(-n);
        if (n < 10) return 1;
        return 1 + cantidadDigitos(n / 10);
    }

    static int sumatoria(int n) {
        if (n == 0) return n;
        return n + (sumatoria(n - 1));
    }

    static boolean isSorted(int[] arr) {
        return isSorted(arr, arr.length - 2, arr[arr.length - 1]);
    }

    static int maximo(int[] arr) {
        return maximo(arr, Integer.MIN_VALUE, 0);
    }

    private static int maximo(int[] arr, int max, int pos) {
        if (arr[pos] == 0) return max;
        if (arr[pos] > max) max = arr[pos];
        return maximo(arr, max, pos + 1);
    }

    static int contarMultiplos(int[] arr, int mul) {
        return contarMultiplos(arr, mul, 0);
    }

    private static int contarMultiplos(int[] arr, int mul, int pos) {
        if (arr[pos] == 0) return 0;
        if (arr[pos] % mul == 0) return contarMultiplos(arr, mul, pos + 1) + 1;
        return contarMultiplos(arr, mul, pos + 1);
    }

    static boolean isSorted(int[] arr, int pos, int ant) {
        if (pos < 0) return true;
        if (arr[pos] < ant) return isSorted(arr, pos - 1, arr[pos]);
        else return false;
    }

    static boolean isInArray(int[] arr, int n) {
        return isInArray(arr, n, arr.length - 1);
    }

    private static boolean isInArray(int[] arr, int n, int pos) {
        if (pos < 0) return false;
        if (arr[pos] == n) return true;
        else return isInArray(arr, n, pos - 1);
    }

    static int contarApariciones(int n, int t) {
        if (n < 10)
            if (n == t) return 1;
            else return 0;
        else
            return contarApariciones(n / 10, t) + contarApariciones(n % 10, t);
    }

    static int contarDigitos(int n) {
        if (n < 0) return contarDigitos(-n);
        if (n < 10) return 1;
        return contarDigitos(n / 10) + 1;
    }

    static int func(int n) {
        if (n == 0) return 0;
        else return n + func(n - 1);
    }

    static int itetativeFunc(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
    //------------------------------------------------------------------------------------------------------------------

    static int factorial(int n) {
        if (n <= 0) return 1;
        else return n * factorial(n - 1);
    }

    static int toBinary(int n) {
        if (n < 0) return -toBinary(-n);
        if (n < 2) return n;
        else return (toBinary(n / 2) * 10) + (n % 2);
    }

    static boolean contieneMellizos(int n) {
        if (n <= 9) return false;
        else return dosMenosSigIguales(n) || contieneMellizos(n / 10);
    }

    private static boolean dosMenosSigIguales(int x) {
        return ((x % 10) == ((x % 100) % 10));
    }

    static int potenciaMejorado(int m, int n) {
        if (n == 0) return 1;
        if ((n % 2) == 0) return potenciaMejorado(m, n / 2) * potenciaMejorado(m, n / 2);
        else return m * potenciaMejorado(m, n - 1);
    }

    static int cantidadCeros(int n) {
        if (n == 0) return 1;
        if (n > 0 && n < 10) return 0;
        else return cantidadCeros(n / 10) + cantidadCeros(n % 10);
    }

    static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        else return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static class TorresDeHanoi {
        public static void main(String[] args) {
            int discos = 8;
            System.out.println("Torres de hanoi\n");
            System.out.println("Cantidad de discos" + discos);
            char origen = 'A', auxiliar = 'B', destino = 'C';
            mover(discos, origen, destino, auxiliar);
        }

        private static void moverDisco(int n, char origen, char destino) {
            System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
        }

        private static void mover(int disco, char fuente, char destino, char auxiliar) {
            if (disco == 1)
                moverDisco(disco, fuente, destino);
            else {
                mover(disco - 1, fuente, auxiliar, destino);
                moverDisco(disco, fuente, destino);
                mover(disco - 1, auxiliar, destino, fuente);
            }
        }
    }
}
