import java.util.Scanner;

public class Sumaigual {

    public static void rellenaArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            int aleatorio = (int) (Math.random() * (max - min + 1) + min);
            array[i] = aleatorio;
        }
    }

    public static int[] quitaNumerosRepetidos(int[] numeros) {
        int[] numerosRpetidos = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    numeros[j] = 0;
                }
            }
        }
        return numerosRpetidos;
    }

    public static void encuentaParesDeSuma(int[] numeros, int numero) {

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] != 0 && numeros[j] != 0) {
                    if (numeros[i] + numeros[j] == numero) {
                        System.out.println(numeros[i] + "+" + numeros[j] + "=" + numero);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce el numero a comprovar menor o igual a 20");
        int numero = reader.nextInt();

        int[] numeros = new int[10];
        rellenaArray(numeros, 1, 10);
        System.out.println("Lista a comprovar");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        quitaNumerosRepetidos(numeros);

        System.out.println("Sumas posibles");
        encuentaParesDeSuma(numeros, numero);
    }
}
