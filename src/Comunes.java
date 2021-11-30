public class Comunes {

    public static void rellenaArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            int aleatorio = (int) (Math.random() * (max - min + 1) + min);
            array[i] = aleatorio;
        }
    }

    public static void imprimeArraySinCeros(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != 0) {
                System.out.print(numeros[i] + " ");
            }
        }
    }

    public static boolean siNumeroEnArray(int[] numeros, int numero) {

        boolean comprovar1 = true;

        for (int i = 0; i < numeros.length; i++) {
            comprovar1 = true;
            if (numeros[i] == numero) {
                comprovar1 = false;
                break;
            }
        }
        return comprovar1;
    }

    public static int[] numerosComunesEntreArrays(int[] numeros1, int[] numeros2) {
        int[] numerosComunes = new int[numeros1.length];

        for (int i = 0; i < numeros1.length; i++) {
            for (int j = 0; j < numeros1.length; j++) {
                if (numeros1[i] == numeros2[j]) {
                    if (siNumeroEnArray(numerosComunes, numeros1[i])) {
                        numerosComunes[i] = numeros1[i];
                    }
                }
            }
        }
        return numerosComunes;
    }

    public static void main(String[] args) {

        int[] numeros1 = new int[10];
        int[] numeros2 = new int[10];
        rellenaArray(numeros1, 1, 10);
        rellenaArray(numeros2, 1, 10);

        System.out.println("Primera lista");
        imprimeArraySinCeros(numeros1);
        System.out.println();

        System.out.println("Segunda lista");
        imprimeArraySinCeros(numeros2);
        System.out.println();

        int[] comunes = numerosComunesEntreArrays(numeros1, numeros2);
        System.out.println("Los numeros en comun son  ");
        imprimeArraySinCeros(comunes);
    }
}
