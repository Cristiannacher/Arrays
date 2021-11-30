public class MoverCeros {

    public static void rellenaArray(int[] array, int min, int max) {

        for (int i = 0; i < array.length; i++) {
            int aleatorio = (int) (Math.random() * (max - min + 1) + min);
            array[i] = aleatorio;
        }
    }

    public static int contaCeros(int[] numeros) {
        int contador = 0;

        for (int i = 0; i < numeros.length; i++)
            if (numeros[i] == 0) {
                contador++;
            }
        return contador;
    }

    public static void mueveCeros(int[] numeros) {

        int ceros = contaCeros(numeros);

        for (int i = 0; i < numeros.length; i++) {
            if (i < numeros.length - 1) {
                if (numeros[i] == 0) {
                for (int j = i; j < numeros.length; j++) {
                        if (numeros[i + 1] != 0) {
                            numeros[i] = numeros[i + 1];
                        } else {
                            if (i <= numeros.length - 2) {
                                numeros[i] = numeros[i + 2];
                            }
                        }
                    }
                }
            }
        }
        for (int i = numeros.length -1; i > numeros.length - (ceros - 1); i--){
            numeros[i] = 0;
        }

    }

    public static void main(String[] args) {

        int[] numeros = new int[10];
        rellenaArray(numeros, 0,3);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        mueveCeros(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
