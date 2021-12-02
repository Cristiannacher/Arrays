import java.util.Scanner;

public class HundirLaFlota {

    public static void createShips(int numShips, int[][] shipPlaces) {
        int r1, r2;
        int cont = 0;

        while (cont < numShips) {
            r1 = (int) (Math.random() * 8);
            r2 = (int) (Math.random() * 8);
            if (shipPlaces[r1][r2] != 1) {
                shipPlaces[r1][r2] = 1;
                cont++;
            }
        }
    }

    public static void imprimeEstadisticas(int[][] tablero, int shots, int sunk) {
        System.out.println("SHOTS:" + shots);
        System.out.println("SUNK SHIPS:" + sunk);
        System.out.println();

        System.out.print("  " + 1 + " " + 2 + " " + 3 + " " + 4 + " " + 5 + " " + 6 + " " + 7 + " " + 8 + " ");
        System.out.println();
        for (int i = 0; i < tablero.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("A ");
                    break;
                case 1:
                    System.out.print("B ");
                    break;
                case 2:
                    System.out.print("C ");
                    break;
                case 3:
                    System.out.print("D ");
                    break;
                case 4:
                    System.out.print("E ");
                    break;
                case 5:
                    System.out.print("F ");
                    break;
                case 6:
                    System.out.print("G ");
                    break;
                case 7:
                    System.out.print("H ");
                    break;
            }
            for (int j = 0; j < tablero[0].length; j++) {
                switch (tablero[i][j]) {
                    case 0:
                        System.out.print("♒ ");
                        break;
                    case 1:
                        System.out.print("\uD83D\uDEA4 ");
                        break;
                    case 2:
                        System.out.print("✔ ");
                        break;
                    case 3:
                        System.out.print("✖ ");
                        break;
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean disparaTablero(int[][] tablero, int filas, int columna) {
        boolean undido = true;
        if (tablero[filas][columna] != 2 && tablero[filas][columna] != 3) {
            if (tablero[filas][columna] == 1) {
                tablero[filas][columna] = 2;
            } else {
                tablero[filas][columna] = 3;
                undido = false;
            }
        }
        return undido;
    }

    public static int convierteFila(String letra) {
        int fila = 0;
        switch (letra) {
            case "A":
                fila = 0;
                break;
            case "B":
                fila = 1;
                break;
            case "C":
                fila = 2;
                break;
            case "D":
                fila = 3;
                break;
            case "E":
                fila = 4;
                break;
            case "F":
                fila = 5;
                break;
            case "G":
                fila = 6;
                break;
            case "H":
                fila = 7;
                break;
        }
        return fila;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[][] shipPlaces = new int[8][8];
        createShips(10, shipPlaces);

        int shots = 0;
        int sunk = 0;
        String fila = "";
        int columna = 0;

        do {
            imprimeEstadisticas(shipPlaces, shots, sunk);

            System.out.println("Elige la fila");
            fila = reader.next();
            System.out.println("Elige la columna");
            columna = reader.nextInt() - 1;

            if (disparaTablero(shipPlaces, convierteFila(fila), columna)) {
                sunk++;
            }
            shots++;

        } while (sunk < 10);

        imprimeEstadisticas(shipPlaces, shots, sunk);
        System.out.println("HAS GANADO");

    }
}
