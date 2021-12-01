public class Tablero2 {
    public static void tableroACruzXMAs(int[][] numeros) {
        for (int i = 0; i < numeros.length; i++) {
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
            for (int j = 0; j < numeros[0].length; j++) {
                switch (numeros[i][j]) {
                    case 0:
                        System.out.print(". ");
                        break;
                    case 1:
                        System.out.print("+ ");
                        break;
                    case 2:
                        System.out.print("0 ");
                        break;
                    case 3:
                        System.out.print("X ");
                        break;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] numeros = new int[8][8];
        Utilidades.rellenaMatriz(numeros, 0, 3);
        System.out.print("  "+1+" "+2+" "+3+" "+4+" "+5+" "+6+" "+7+" "+8+" ");
        System.out.println();
        tableroACruzXMAs(numeros);

    }
}
