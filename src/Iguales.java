public class Iguales {
    public static boolean comprovarArraysIguales(int[] numeros1, int[] numeros2) {
        boolean iguales = true;

        for (int i = 0; i < numeros1.length; i++) {
            for (int j = 0; j < numeros1.length; j++) {
                if (numeros1[i] != numeros2[j]) {
                  iguales = false;
                }
            }
        }
        return iguales;
    }
    public static void main(String[] args) {

        int[] numeros1 = new int[5];
        int[] numeros2 = new int[5];
        Utilidades.rellenaArray(numeros1,1,5);
        Utilidades.rellenaArray(numeros2,1,5);

        for (int i = 0; i < numeros1.length; i++){
            System.out.print(numeros1[i]);
        }
        System.out.println();
        for (int i = 0; i < numeros2.length; i++){
            System.out.print(numeros2[i]);
        }

        System.out.println();

        if(comprovarArraysIguales(numeros1,numeros2)){
            System.out.println("Son igulaes");
        } else System.out.println("Son diferentes");
    }
}
