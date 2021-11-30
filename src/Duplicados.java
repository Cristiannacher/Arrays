public class Duplicados {

    public static void rellenaArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            int aleatorio = (int) (Math.random() * (max - min + 1) + min);
            array[i] = aleatorio;
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

    public static int[] encuentraNumerosRepetidos(int[] numeros) {
        int[] numerosRpetidos = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    if (siNumeroEnArray(numerosRpetidos, numeros[i])) {
                        numerosRpetidos[i] = numeros[i];
                    }
                }
            }
        }
        return numerosRpetidos;
    }

    public static void imprimeArraySinCeros(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != 0) {
                System.out.print(numeros[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[] numeros = new int[10];
        rellenaArray(numeros, 1, 10);

        int[] numerosRepetidos = encuentraNumerosRepetidos(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
        System.out.println("Se reptien los sigueientes numeros  ");

        imprimeArraySinCeros(numerosRepetidos);
    }
}