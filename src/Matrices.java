public class Matrices {
    static int[][] matriz =
            {
                    {1, 2, 3, 4},
                    {0, 1, 2, 5},
                    {9, 8, 7, 6}
            };

    static int[][] matriz2 =
            {
                    {1, 2, 3},
                    {8, 9, 4},
                    {7, 6, 5}
            };

    static int[][] matriz3 =
            {
                    {1, 2, 3},
                    {2, 3, 4},
                    {1, 4, 5},
                    {0, 5, 6},
                    {9, 8, 7}
            };


    public static void main(String[] args) {
        mostrar();
        System.out.println();
        espiral();
    }

    public static void mostrar() {
        System.out.println("M(" + matriz.length + "X" + matriz[0].length + ")");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void espiral() {
        int iniciofila = 0, finFila = matriz.length - 1;
        int inicioCol = 0, finCol = matriz[0].length - 1;

        while (iniciofila <= finFila && inicioCol <= finCol) {
            for (int i = inicioCol; i <= finCol; i++) {
                System.out.print(matriz[iniciofila][i] + " ");
            }
            iniciofila++;
            for (int i = iniciofila; i <= finFila; i++) {
                System.out.print(matriz[i][finCol] + " ");
            }
            finCol--;
            for (int i = finCol; i >= inicioCol; i--) {
                System.out.print(matriz[finFila][i] + " ");
            }
            finFila--;
            for (int i = finFila; i >= iniciofila; i--) {
                System.out.print(matriz[i][inicioCol] + " ");
            }
            inicioCol++;
        }
    }

}
