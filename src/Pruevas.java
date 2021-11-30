public class Pruevas {

    public static void rellenaArray(int[] array, int min, int max) {

        for (int i = 0; i < array.length; i++) {
            int aleatorio = (int) (Math.random() * (max - min + 1) + min);
            array[i] = aleatorio;
        }
    }

    public static void mueveCeros(int[] numeros) {

        for (int i = numeros.length-1; i >= 0; i--) {
            if(numeros[i] == 0){
                Eliminar.mueveNumero(numeros, i);
            }
        }
    }

    public static void main(String[] args) {

        int[] numeros = new int[10];
        rellenaArray(numeros, 0, 3);

        System.out.println("Lista inicial");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        mueveCeros(numeros);

        System.out.println("Lista modificada");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

    }
}

