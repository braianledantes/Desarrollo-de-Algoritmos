package recursion;

public class RecursionTest {

    public static void main(String[] args) {
        factorial(1,-1);
        factorial(1,0);
        factorial(1,1);
        factorial(2,2);
        factorial(6,3);
        factorial(24,4);
        factorial(120,5);

        toBinary(-10,-2);
        toBinary(-1,-1);
        toBinary(1,1);
        toBinary(0,0);
        toBinary(1,1);
        toBinary(10,2);
        toBinary(11,3);
        toBinary(100,4);
        toBinary(1100,12);
        toBinary(10100,20);

        contieneMellizos(true, 23445);
        contieneMellizos(false, 1234);

        cantidadCeros(0, 1);
        cantidadCeros(1, 0);
        cantidadCeros(1, 10);
        cantidadCeros(1, 105);
        cantidadCeros(2, 1010);
    }

    public static void factorial(int result, int value) {
        long iniTime = System.currentTimeMillis();
        boolean r = result == RecursiveAlgorithms.factorial(value);
        long endTime = System.currentTimeMillis() - iniTime;
        System.out.println("factorial: " + r + ", Time: " + endTime);
    }

    public static void toBinary(int result, int value) {
        long iniTime = System.currentTimeMillis();
        boolean r = result == RecursiveAlgorithms.toBinary(value);
        long endTime = System.currentTimeMillis() - iniTime;
        System.out.println("toBinary: " + r + ", Time: " + endTime);
    }

    public static void contieneMellizos(boolean result, int value) {
        long iniTime = System.currentTimeMillis();
        boolean r = (result == RecursiveAlgorithms.contieneMellizos(value));
        long endTime = System.currentTimeMillis() - iniTime;
        System.out.println("contieneMellizos: " + r + ", Time: " + endTime);
    }

    public static void cantidadCeros(int result, int value) {
        long iniTime = System.currentTimeMillis();
        boolean r = (result == RecursiveAlgorithms.cantidadCeros(value));
        long endTime = System.currentTimeMillis() - iniTime;
        System.out.println("cantidadCeros: " + r + ", Time: " + endTime);
    }
}
