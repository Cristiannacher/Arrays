public class Duplicados {

    public static void rellenaArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            int aleatorio = (int) (Math.random() * (max - min + 1) + min);
            array[i] = aleatorio;
        }
    }

    public static int[] encuentraNumerosRepetidos(int[] numeros) {
        int[] numerosRpetidos = new int[numeros.length / 2];

        boolean comprovar = true;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                comprovar = true;
                if (numeros[i] == numeros[j]) {
                    for (int t = 0; t < numerosRpetidos.length; t++) {
                        if (numerosRpetidos[t] == numeros[i]) {
                            comprovar = false;
                        }
                    }
                    if (comprovar) {
                        numerosRpetidos[i / 2] = numeros[i];
                    }
                }
            }
        }
        return numerosRpetidos;
    }
    /*public static int[] quitaNumerosRepetidos(int[] numeros){
        int[] arrayLimpia = new int[numeros.length];

    }*/

    public static void main(String[] args) {

        int[] numeros = new int[10];
        rellenaArray(numeros, 1, 5);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
        }
        System.out.println();

        System.out.print("Se reptien los sigueientes numeros   ");

        int[] numerosRepetidos = encuentraNumerosRepetidos(numeros);

        for (int i = 0; i < numerosRepetidos.length; i++) {

            if (numeros[i] != 0) {
                System.out.print(numerosRepetidos[i]);
            }
        }
    }
}
