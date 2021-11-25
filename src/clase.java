import java.util.Scanner;



public class clase {

    public static void rellenarMatriz (int[][] matriz){
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz[0].length; j++){
                matriz[i][j] = i + j;
            }
        }
    }
    public static void imprimeMatriz (int[][] matriz){
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j] +" ");
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrizEnteros = new int[5][3];
        rellenarMatriz(matrizEnteros);
        imprimeMatriz(matrizEnteros);
    }

    /*public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce las filas del tablero");
        int filas = reader.nextInt();
        System.out.println("Introduce las columnas del tablero");
        int columnas = reader.nextInt();

        int[][] tablero = new int[filas][columnas];

        for( int i = 0; i< tablero.length; i++){
            for( int j = 0; j< tablero[i].length; j++){
                if()
            }
        }*/
}
