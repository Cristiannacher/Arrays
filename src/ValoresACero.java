public class ValoresACero {
    public static void encuentraFilasACero(int[][] numeros) {

        boolean comprovar;

        for (int i = 0; i < numeros.length; i++) {
            comprovar = true;
            for (int j = 0; j < numeros[0].length; j++) {
                if (numeros[i][j] != 0) {
                    comprovar = false;
                }
            }
            if (comprovar) {
                System.out.println("La fila " + i + " tine todo ceros");
            } else System.out.println("La fila " + i + " no tine todo ceros");
        }
    }

    public static void encuentraColumnasACero(int[][] numeros) {

        boolean comprovar;

        for (int i = 0; i < numeros.length; i++) {
            comprovar = true;
            for (int j = 0; j < numeros[0].length; j++) {
                if (numeros[j][i] != 0) {
                    comprovar = false;
                }
            }
            if (comprovar) {
                System.out.println("La columna " + i + " tine todo ceros");
            } else System.out.println("La columna " + i + " no tine todo ceros");
        }
    }

    public static void main(String[] args) {

        int[][] numeros = new int[5][5];
        Utilidades.rellenaMatriz(numeros, 0, 1);
        RellenaMatiz.imprimeMatriz(numeros);
        System.out.println();
        encuentraFilasACero(numeros);
        System.out.println();
        encuentraColumnasACero(numeros);
    }
}
