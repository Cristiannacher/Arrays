public class RellenaMatiz {

    public static void rellenaMatriz(int[][] numeros, int min, float max) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                numeros[i][j] = (int) (Math.random() * (max - min + 1) + min);
            }
        }
    }

    public static void imprimeMatriz(int[][] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                System.out.print(numeros[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] numeros = new int[10][10];
        rellenaMatriz(numeros, 0,1);
        imprimeMatriz(numeros);
    }
}
