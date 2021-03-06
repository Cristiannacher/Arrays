import java.util.Scanner;

public class Eliminar {

    public static void rellenaArray(int[] array, int min, int max) {

        for (int i = 0; i < array.length; i++) {
            int aleatorio = (int) (Math.random() * (max - min + 1) + min);
            array[i] = aleatorio;
        }
    }

    public static void mueveNumero(int[] numeros, int posicion) {

        int valorAmover = numeros[posicion];

        for (int i = posicion; i < numeros.length; i++) {
            if (i < numeros.length - 1) {
                numeros[i] = numeros[i + 1];
            }
        }
        numeros[numeros.length - 1] = valorAmover;
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Que posicion de la array quieres mover");
        int movernum = reader.nextInt();

        int[] numeros = new int[6];
        rellenaArray(numeros, 1, 9);

        if (movernum > numeros.length - 1) {
            do {
                System.out.println("tine que ser un numero entre 0 y 5");
                movernum = reader.nextInt();
            } while (movernum > numeros.length - 1);
        }
        System.out.println("Lista inicial");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        mueveNumero(numeros, movernum);

        System.out.println("Lista movida");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}