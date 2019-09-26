package algoritmos;

public class Test {

    public static void main(String[] args) {
        int[] sortArray = {1, 2, 3, 4, 5, 6};
        int[] messyArray = {2, 6, 3, 5, 1, 4};
        int[] messyArray2 = {25, 7, 74, 1, 60, 13, 54, 14, 43, 21};
        Test.sequentialSearch(-1, new int[]{}, 123);
        Test.sequentialSearch(-1, messyArray, 123);
        Test.sequentialSearch(5, messyArray, 4);
        Test.sequentialSearch(0, messyArray, 2);
        Test.sequentialSearch(3, messyArray, 5);

        Test.binarySearch(-1, new int[]{}, 123);
        Test.binarySearch(-1, messyArray, 123);
        Test.binarySearch(5, sortArray, 6);
        Test.binarySearch(0, sortArray, 1);
        Test.binarySearch(3, sortArray, 4);

        Test.recursiveBinarySearch(-1, new int[]{}, 123);
        Test.recursiveBinarySearch(-1, messyArray, 123);
        Test.recursiveBinarySearch(5, sortArray, 6);
        Test.recursiveBinarySearch(0, sortArray, 1);
        Test.recursiveBinarySearch(3, sortArray, 4);

        showArray(messyArray2);
        //Test.ordenacionSeleccion(sortArray, messyArray);
        Test.bubbleSort(sortArray, messyArray);
        //Test.insertionSort(sortArray, messyArray);
        //Test.quickSort(sortArray, messyArray2);
        showArray(messyArray2);
        //Test.equals(true, sortArray, sortArray);
        //Test.equals(false, sortArray, messyArray);
    }

    public static void showArray(int[] arr) {
        int l = arr.length - 1;
        System.out.print("[");
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[l] + "]");
    }

    public static void sequentialSearch(int value, int[] arr, int elem) {
        long iniTime = System.currentTimeMillis();
        boolean result = (value == FuerzaBruta.sequentialSearch(arr, elem));
        long endTime = System.currentTimeMillis() - iniTime;
        System.out.println("sequentialSearch: " + result + ", Time: " + endTime);
    }

    public static void binarySearch(int value, int[] arr, int elem) {
        long iniTime = System.currentTimeMillis();
        boolean result = (value == DisminuyeYVenceras.DisminuyePorUnFactorConstante.binarySearch(arr, elem));
        long endTime = System.currentTimeMillis() - iniTime;
        System.out.println("binarySearch: " + result + ", Time: " + endTime);
    }

    public static void recursiveBinarySearch(int value, int[] arr, int elem) {
        long iniTime = System.currentTimeMillis();
        boolean result = (value == DisminuyeYVenceras.DisminuyePorUnFactorConstante.recursiveBinarySearch(arr, elem));
        long endTime = System.currentTimeMillis() - iniTime;
        System.out.println("recursiveBinarySearch: " + result + ", Time: " + endTime);
    }

    public static void selectionSort(int[] value, int[] arr) {
        long iniTime = System.currentTimeMillis();
        FuerzaBruta.selectionSort(arr);
        boolean result = equals(value, arr);
        long endTime = System.currentTimeMillis() - iniTime;
        System.out.println("selectionShort: " + result + ", Time: " + endTime);
    }

    public static void bubbleSort(int[] value, int[] arr) {
        long iniTime = System.currentTimeMillis();
        FuerzaBruta.bubbleSort(arr);
        boolean result = equals(value, arr);
        long endTime = System.currentTimeMillis() - iniTime;
        System.out.println("bubbleShort: " + result + ", Time: " + endTime);
    }

    public static void insertionSort(int[] value, int[] arr) {
        long iniTime = System.currentTimeMillis();
        DisminuyeYVenceras.DisminuyePorUnaConstante.insertionSort(arr);
        boolean result = equals(value, arr);
        long endTime = System.currentTimeMillis() - iniTime;
        System.out.println("insertionShort: " + result + ", Time: " + endTime);
    }

    public static void mergeSort(int[] result, int[] arr) {
        long iniTime = System.currentTimeMillis();
        DivideYVenceras.mergeSort(arr);
        boolean value = equals(result, arr);
        long endTime = System.currentTimeMillis() - iniTime;
        System.out.println("mergeSort: " + value + ", Time: " + endTime);
    }

    public static void quickSort(int[] result, int[] arr) {
        long iniTime = System.currentTimeMillis();
        DivideYVenceras.quickSort(arr);
        boolean value = equals(result, arr);
        long endTime = System.currentTimeMillis() - iniTime;
        System.out.println("quickSort: " + value + ", Time: " + endTime);
    }

    public static void equals(boolean value, int[] arr1, int[] arr2) {
        long iniTime = System.currentTimeMillis();
        boolean result = (value == equals(arr1, arr2));
        long endTime = System.currentTimeMillis() - iniTime;
        System.out.println("equals: " + result + ", Time: " + endTime);
    }

    private static boolean equals(int[] arr1, int[] arr2) {
        boolean result = (arr1.length == arr2.length);
        int i = 0;
        while (result && i < arr1.length) {
            result = (arr1[i] == arr2[i]);
            i++;
        }
        return result;
    }
}
