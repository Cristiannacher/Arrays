import java.util.Scanner;

public class Tablero {

    public static void leeMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce las filas del tablero");
        int filas = reader.nextInt();
        System.out.println("Introduce las columnas del tablero");
        int columnas = reader.nextInt();

        char[][] tablero = new char[filas][columnas];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if(i%2 == 0) {
                    if (j % 2 == 0) {
                        tablero[i][j] = 'X';
                    } else tablero[i][j] = '0';
                }
                if(i%2 != 0) {
                    if (j % 2 != 0) {
                        tablero[i][j] = 'X';
                    } else tablero[i][j] = '0';
                }

            }
        }
        leeMatriz(tablero);
    }
}
